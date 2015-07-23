function Condition(){
	
	identifier: [{
        use: String,
        label: String,
        system: String,
        value: String
    }];
	
	this.providesSearch = function(searchParam){
		var searchParams = ["_id", "code", "subject", "encounter"];
		return (searchParams.indexOf(searchParam) != -1);
	}
}

function Encounter(){
		
	this.providesSearch = function(searchParam){
		var searchParams = ["_id", "date", "patient", "reason"];
		return (searchParams.indexOf(searchParam) != -1);
	}
}

function Observation(){
	
	this.providesSearch = function(searchParam){
		var searchParams = ["_id", "code", "subject", "value-concept", "value-string", "value-quantity"];
		return (searchParams.indexOf(searchParam) != -1);
	}
}

function Medication(){
	this.providesSearch = function(searchParam){
		var searchParams = ["_id", "name"];
		return (searchParams.indexOf(searchParam) != -1);
	}
}

function MedicationPrescription(){
	this.providesSearch = function(searchParam){
		var searchParams = ["_id", "encounter", "patient", "medication"];
		return (searchParams.indexOf(searchParam) != -1);
	}
}

function MedicationDispense(){
	this.providesSearch = function(searchParam){
		var searchParams = ["_id", "patient", "medication"];
		return (searchParams.indexOf(searchParam) != -1);
	}
}

function Patient(){
    identifier: [{
        use: String,
        label: String,
        system: String,
        value: String
    }];
    name: [{
        use: String,
        text: String,
        family: [String],
        given: [String],
        prefix: [String],
        suffix: [String]
    }];
    gender: {
        coding: [{
            system: String,
            code: String,
            display: String
        }]
    };
    birthDate: Date;
    deceasedBoolean: Boolean;
    deceasedDateTime: Date;
    address: [{
    	use: String,
    	text: String,
    	line:[String],
    	city: String,
    	state: String,
    	postalCode: String,
    	country: String,
    	period: {
    		start: Date,
    		end: Date
    	}
    }];
    maritalStatus: {
        coding: [{
            system: String,
            code: String,
            display: String
        }];
    };
    multipleBirthBoolean: Boolean;
    multipleBirthInteger: Number;
    link: [{
        other: {
            reference: String,
            display: String
        },
        fhirType: String,
    }];
    active: Boolean;
    
    this.providesSearch = function(searchParam){
		var searchParams = ["_id", "name", "family", "given", "gender", "birthdate"];
		return (searchParams.indexOf(searchParam) != -1);
	}   
    
    this.buildFromJSON = function(params) {
	    
	    var names = [];
	    var given = params.given.split(" ");
	    var family = params.family.split(" ");
	    names.push({"given":given,"family":family});
	    this.name = names;
	    var addresses = [];
	    var line = [];
	    line.push(params.address);
	    var address = {"use":params.address_use,
				"line":line,
				"city":params.city,
				"state":params.state,
				"postalCode":params.postal_code,
				"country":params.country};
	    var period = {};
	    if(params.address_period_start != ""){//TODO fix JsonParser 1110 in hapi-fhir-base
	    	period.start = params.address_period_start;
	    }
	    if(params.address_period_end != ""){
	    	period.end = params.address_period_end;
	    }
	    if(!jQuery.isEmptyObject(period)){
	    	address.period = period;
	    }
	    addresses.push(address);
	    this.address = addresses;
	    
	    if(params.birthDate != ""){
	    	this.birthDate = params.birthDate;
	    }
	    this.active = params.active;
	    this.gender = params.gender;
	    
	    return this;
	}
}

var numRows = 0;
function addSearchParamRow() {
	var nextRow = numRows++;
	var select = $('<select/>', {/*style:'margin-left:30px;'*/});
	var plusBtn = $('<button />', {type:'button', 'class':'btn btn-success btn-block'});
	plusBtn.append($('<span />', {'class':'glyphicon glyphicon-plus'}));
	plusBtn.isAdd = true;

	var rowDiv = $('<div />', { 'class': 'row top-buffer', id: 'search-param-row-' + nextRow }).append(
			$('<div />', { 'class': 'col-sm-1' }).append(plusBtn),
			$('<div />', { 'class': 'col-sm-5' }).append(select),
			$('<div />', { id: 'search-param-rowopts-' + nextRow })
	);
	$("#search-param-rows").append(rowDiv);
		
	plusBtn.click(function() {
		plusBtn.hide();
		addSearchParamRow();
	});
	
	var params = new Array();
	var refResource = getResourceStruct(resourceName);
	conformance.rest.forEach(function(rest){
		rest.resource.forEach(function(restResource){
			if (restResource.type == resourceName) {
				if (restResource.searchParam) {
					for (var i = 0; i < restResource.searchParam.length; i++) {
						var searchParam = restResource.searchParam[i];
						if(refResource.providesSearch(searchParam.name)){
							var nextName = searchParam.name + '_' + i; 
							params[nextName] = searchParam;
							select.append(
									$('<option />', { value: nextName }).text(searchParam.name + ' - ' + searchParam.documentation)														
							);
						}
					}
					/*
					restResource.searchParam.forEach(function(searchParam){
						params[searchParam.name] = searchParam;
						select.append(
							$('<option />', { value: searchParam.name }).text(searchParam.name + ' - ' + searchParam.documentation)														
						);
					});
					*/
				}
			}				
		});
	});	
	select.select2();
	handleSearchParamTypeChange(select, params, nextRow, nextRow);
	select.change(function(){ handleSearchParamTypeChange(select, params, nextRow, nextRow); });
}

function updateSearchDateQualifier(qualifierBtn, qualifierInput, qualifier) {
	qualifierBtn.text(qualifier);
	if (qualifier == '=') {
		qualifierInput.val('');
	} else {
		qualifierInput.val(qualifier);
	}
}

function addSearchControls(theConformance, theSearchParamType, theSearchParamName, theSearchParamChain, theSearchParamTarget, theContainerRowNum, theRowNum) {
	
	var addNameAndType = true;
	if (theSearchParamType == 'id') {
		$('#search-param-rowopts-' + theContainerRowNum).append(
			$('<div />', { 'class': 'col-sm-3' }).append(
		    	$('<input />', { id: 'param.' + theRowNum + '.0', placeholder: 'id', type: 'text', 'class': 'form-control' })
		    )
		);
	} else if (theSearchParamType == 'token') {
		$('#search-param-rowopts-' + theContainerRowNum).append(
			$('<div />', { 'class': 'col-sm-3' }).append(
				$('<input />', { id: 'param.' + theRowNum + '.0', placeholder: 'system/namespace', type: 'text', 'class': 'form-control' })
		    ),
			$('<div />', { 'class': 'col-sm-3' }).append(
				$('<input />', { id: 'param.' + theRowNum + '.1', placeholder: 'value', type: 'text', 'class': 'form-control' })
		    )
		);
	} else if (theSearchParamType == 'string') {
		var placeholderText = 'value';
		var qualifiers = new Array();
		qualifiers.push(new Object());
		qualifiers[0].name='Matches';
		qualifiers[0].value='';
		qualifiers.push(new Object());
		qualifiers[1].name='Exactly';
		qualifiers[1].value=':exact';
		
		var qualifierInput = $('<input />', { id: 'param.' + theRowNum + '.qualifier', type: 'hidden' });
		$('#search-param-rowopts-' + theContainerRowNum).append(
			qualifierInput
		);
	
		var matchesLabel = $('<span>' + qualifiers[0].name + '</span>');
		var qualifierDropdown = $('<ul />', {'class':'dropdown-menu', role:'menu'});
		for (var i = 0; i < qualifiers.length; i++) {
			var nextLink = $('<a>' + qualifiers[i].name+'</a>');
			var qualName = qualifiers[i].name;
			var nextValue = qualifiers[i].value;
			qualifierDropdown.append($('<li />').append(nextLink));
			nextLink.click(function(){ 
				qualifierInput.val(nextValue);
				matchesLabel.text(qualName);
			});
		}
	
		$('#search-param-rowopts-' + theContainerRowNum).append(
			$('<div />', { 'class': 'col-sm-5 input-group' }).append(
				$('<div />', {'class':'input-group-btn'}).append(
					$('<button />', {'class':'btn btn-default dropdown-toggle', 'data-toggle':'dropdown'}).append(
						matchesLabel,
						$('<span class="caret" style="margin-left: 5px;"></span>')
					),
					qualifierDropdown
				),
		    	$('<input />', { id: 'param.' + theRowNum + '.0', placeholder: placeholderText, type: 'text', 'class': 'form-control' })
	    	)
	    );
	} else if (theSearchParamType == 'number') {
		var placeholderText = 'Number';
		$('#search-param-rowopts-' + theContainerRowNum).append(
				$('<input />', { id: 'param.' + theRowNum + '.0', placeholder: placeholderText, type: 'hidden' })
		);
		$('#search-param-rowopts-' + theContainerRowNum).append(
			$('<div />', { 'class': 'col-sm-3' }).append(
		    	$('<input />', { id: 'param.' + theRowNum + '.1', placeholder: placeholderText, type: 'text', 'class': 'form-control' })
	    	)
	    );
	} else if (theSearchParamType == 'date') {
		addSearchControlDate(theSearchParamName, theContainerRowNum, theRowNum, true);
		addSearchControlDate(theSearchParamName, theContainerRowNum, theRowNum, false);
	} else if (theSearchParamType == 'quantity') {
		addSearchControlQuantity(theSearchParamName, theContainerRowNum, theRowNum);
	} else if (theSearchParamType == 'reference' && (!theSearchParamChain || theSearchParamChain.length == 0)) {
		/*
		 * This is a reference parameter with no chain options, so just display a simple 
		 * text box for the ID of the referenced resource
		 */
		var placeholderText = 'value';
		if (theSearchParamType == 'number') {
			placeholderText = 'Number';
		} else if (theSearchParamType == 'reference') {
			placeholderText = 'Resource ID';
		}
		$('#search-param-rowopts-' + theContainerRowNum).append(
				$('<input />', { id: 'param.' + theRowNum + '.0', placeholder: placeholderText, type: 'hidden' })
		);
		$('#search-param-rowopts-' + theContainerRowNum).append(
			$('<div />', { 'class': 'col-sm-3' }).append(
				$('<input />', { id: 'param.' + theRowNum + '.1', placeholder: placeholderText, type: 'text', 'class': 'form-control' })
			)
		);
	} else if (theSearchParamType == 'reference' && theSearchParamChain.length > 0) {
		/*
		 * This is a reference parameter with possible chain options, so we need
		 * to display a secondary combobox to let the user choose which chained
		 * parameter they are filling out
		 */
		var select = $('<select/>', {/*style:'margin-left:30px;'*/});
	
		var newContainerRowNum = theContainerRowNum + "-0";
		var newContainer = $('<div />', { id: 'search-param-rowopts-' + newContainerRowNum })
	
		$('#search-param-rowopts-' + theContainerRowNum).append(
			$('<br clear="all" />'), 
			$('<div />', { 'class': 'col-sm-1' }),
			$('<div />', { 'class': 'col-sm-1' }).append(
	        	$('<i class="glyphicon glyphicon-link" style="margin-left: 20px; margin-top: 10px;"/>')
	    	),
			$('<div />', { 'class': 'col-sm-4' }).append(
				select
			),
			newContainer
		);
	
		var params = new Array();
		{
		var param = new Object();
		param.type = 'id';
		param.chain = '';
		param.name = theSearchParamName;
		param.documentation = 'The resource identity';
		param.target = new Array();
		params[theSearchParamName] = param;
		select.append(
			$('<option />', { value: theSearchParamName }).text(param.name + ' - ' + param.documentation)														
		);
		}
		
		for (var chainIdx = 0; chainIdx < theSearchParamChain.length; chainIdx++) {
			var nextChain = theSearchParamChain[chainIdx];
			var found = false;
			for (var resIdx = 0; resIdx < theConformance.rest[0].resource.length && !found; resIdx++) {
				var nextRes = theConformance.rest[0].resource[resIdx];
				if (!(nextRes.searchParam)) {
					continue;
				}
				for (var paramIdx = 0; paramIdx < nextRes.searchParam.length && !found; paramIdx++) {
					var nextParam = nextRes.searchParam[paramIdx];
					if (nextParam.name == nextChain) {
						if (theSearchParamTarget.length == 0 || theSearchParamTarget.indexOf(nextRes.type) != -1) {
							var nextName = nextParam.name + '_' + i;
							nextParam = jQuery.extend({}, nextParam); // clone it so we can add the chain to the name
							nextParam.name = theSearchParamName + '.' + nextParam.name;
							params[nextName] = nextParam;
							select.append(
								$('<option />', { value: nextName }).text(nextParam.name + ' - ' + nextParam.documentation)														
							);
							found = true;
						}
					}
				}
			}
		}
		
		select.select2();
		handleSearchParamTypeChange(select, params, newContainerRowNum, theRowNum);
		select.change(function(){ handleSearchParamTypeChange(select, params, newContainerRowNum, theRowNum); });
		addNameAndType = false;
	}
	
	if (addNameAndType) {
		$('#search-param-rowopts-' + theContainerRowNum).append(
			$('<input />', { id: 'param.' + theRowNum + '.name', type: 'hidden', value: theSearchParamName }),
			$('<input />', { id: 'param.' + theRowNum + '.type', type: 'hidden', value: theSearchParamType })
		);
	}
	
}

function addSearchControlDate(theSearchParamName, theContainerRowNum, theRowNum, theLower) {
	var inputId0 = theRowNum + '.' + (theLower ? 0 : 2);  
	var inputId1 = theRowNum + '.' + (theLower ? 1 : 3);  
	
	var qualifier = $('<input />', {type:'hidden', id:'param.'+inputId0, id:'param.'+inputId0});
	
	if (/date$/.test(theSearchParamName)) {
		var input = $('<div />', { 'class':'input-group date', 'data-date-format':'YYYY-MM-DD' });
	} else {
		var input = $('<div />', { 'class':'input-group date', 'data-date-format':'YYYY-MM-DDTHH:mm:ss' });
	}
	var qualifierDiv = $('<div />');
	
	input.append(
		qualifierDiv,
		$('<input />', { type:'text', 'class':'form-control', id: 'param.' + inputId1 }),
		$('<div />', { 'class':'input-group-addon', 'style':'padding:6px;'} ).append(
			$('<i />', { 'class':'fa fa-chevron-circle-down'})
		)
	);
    input.datetimepicker({
    	pickTime: false,
    	showToday: true
    });
    // Set up the qualifier dropdown after we've initialized the datepicker, since it
    // overrides all addon buttons while it inits..
    qualifierDiv.addClass('input-group-btn');
    var qualifierTooltip = "Set a qualifier and a date to specify a boundary date. Set two qualifiers and dates to specify a range.";
    var qualifierBtn = $('<button />', {type:'button', 'class':'btn btn-default dropdown-toggle', 'data-toggle':'dropdown', 'data-placement':'top', 'title':qualifierTooltip}).text('=');
    qualifierBtn.tooltip({
        'selector': '',
        'placement': 'top',
        'container':'body'
      });
    var qualifierBtnEq = $('<a>=</a>').click(function() { updateSearchDateQualifier(qualifierBtn, qualifier, '='); });
    var qualifierBtnGt = $('<a>&gt;</a>').click(function() { updateSearchDateQualifier(qualifierBtn, qualifier, '>');  });
    var qualifierBtnGe = $('<a>&gt;=</a>').click(function() { updateSearchDateQualifier(qualifierBtn, qualifier, '>=');  });
    var qualifierBtnLt = $('<a>&lt;</a>').click(function() { updateSearchDateQualifier(qualifierBtn, qualifier, '<');  });
    var qualifierBtnLe = $('<a>&lt;=</a>').click(function() { updateSearchDateQualifier(qualifierBtn, qualifier, '<=');  });
    qualifierDiv.append(
		qualifierBtn,
		$('<ul class="dropdown-menu" role="menu">').append(
			$('<li />').append(qualifierBtnEq),
			$('<li />').append(qualifierBtnGt),
			$('<li />').append(qualifierBtnGe),
			$('<li />').append(qualifierBtnLt),
			$('<li />').append(qualifierBtnLe)
		)
	);

	$('#search-param-rowopts-' + theContainerRowNum).append(
		qualifier,
		$('<div />', { 'class': 'col-sm-3' }).append(
	    	input
    	)
    );
}

function addSearchControlQuantity(theSearchParamName, theContainerRowNum, theRowNum) {
	var input = $('<div />', { 'class':'input-group'});
	var qualifier = $('<input />', {type:'hidden', id:'param.' + theRowNum + '.0'});
	var qualifierDiv = $('<div />', {'class':'input-group-btn'});
	
	input.append(
		qualifierDiv,
		$('<input />', { type:'text', 'class':'form-control', id: 'param.' + theRowNum + '.1', placeholder: "value" }),
		$('<div />', { 'class':'input-group-addon', 'style':'padding:6px;'} ).append(
			$('<span>System</span>')
		),
		$('<input />', { type:'text', 'class':'form-control', id: 'param.' + theRowNum + '.2', placeholder: "(opt)" }),
		$('<div />', { 'class':'input-group-addon', 'style':'padding:6px;'} ).append(
			$('<span>Code</span>')
		),
		$('<input />', { type:'text', 'class':'form-control', id: 'param.' + theRowNum + '.3', placeholder: "(opt)" })
	);

    var qualifierTooltip = "Set a qualifier and a date to specify a boundary date. Set two qualifiers and dates to specify a range.";
    var qualifierBtn = $('<button />', {type:'button', 'class':'btn btn-default dropdown-toggle', 'data-toggle':'dropdown', 'data-placement':'top', 'title':qualifierTooltip}).text('=');
    qualifierBtn.tooltip({
        'selector': '',
        'placement': 'top',
        'container':'body'
      });
    var qualifierBtnEq = $('<a>=</a>').click(function() { updateSearchDateQualifier(qualifierBtn, qualifier, '='); });
    var qualifierBtnAp = $('<a>~ (Approx)</a>').click(function() { updateSearchDateQualifier(qualifierBtn, qualifier, '~'); });
    var qualifierBtnGt = $('<a>&gt;</a>').click(function() { updateSearchDateQualifier(qualifierBtn, qualifier, '>');  });
    var qualifierBtnGe = $('<a>&gt;=</a>').click(function() { updateSearchDateQualifier(qualifierBtn, qualifier, '>=');  });
    var qualifierBtnLt = $('<a>&lt;</a>').click(function() { updateSearchDateQualifier(qualifierBtn, qualifier, '<');  });
    var qualifierBtnLe = $('<a>&lt;=</a>').click(function() { updateSearchDateQualifier(qualifierBtn, qualifier, '<=');  });
    qualifierDiv.append(
		qualifierBtn,
		$('<ul class="dropdown-menu" role="menu">').append(
			$('<li />').append(qualifierBtnEq),
			$('<li />').append(qualifierBtnAp),
			$('<li />').append(qualifierBtnGt),
			$('<li />').append(qualifierBtnGe),
			$('<li />').append(qualifierBtnLt),
			$('<li />').append(qualifierBtnLe)
		)
	);

	$('#search-param-rowopts-' + theContainerRowNum).append(
		qualifier,
		$('<div />', { 'class': 'col-sm-5' }).append(
			input
		)
//		$('<div />', { 'class': 'col-sm-2' }).append(
//			$('<div />', { 'class':'input-group'}).append(
//			)
//		)
	);
}

function handleSearchParamTypeChange(select, params, theContainerRowNum, theParamRowNum) {
	var oldVal = select.prevVal;
	var newVal = select.val();
	if (oldVal == newVal) {
		return;
	}
	$('#search-param-rowopts-' + theContainerRowNum).empty();
	var searchParam = params[newVal];
	/*
	$('#search-param-rowopts-' + rowNum).append(
		$('<input />', { name: 'param.' + rowNum + '.type', type: 'hidden', value: searchParam.type })
	);
	*/
	addSearchControls(conformance, searchParam.type, searchParam.name, searchParam.chain, searchParam.target, theContainerRowNum, theParamRowNum);
	
	select.prevVal = newVal;
}

/*
 * Handler for "read" button which appears on each entry in the
 * summary at the top of a Bundle response view 
 */
function readFromEntriesTable(source, type, id, vid) {
	var btn = $(source);
	btn.button('loading');
	var resId = source.resourceid;
	btn.append($('<input />', { type: 'hidden', name: 'id', value: id }));
	var resVid = source.resourcevid;
	if (resVid != '') {
		btn.append($('<input />', { type: 'hidden', name: 'vid', value: vid }));
	}
	setResource(btn, type);
	$("#outerForm").attr("action", "read").submit();
}

$.fn.serializeResourceObject = function()
{
    var o = {};
    var a = this.serializeArray();
    $.each(a, function() {
        if (o[this.name] !== undefined) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
};

//$.getScript('js/models/patient.js');
//$.getScript('js/models/observation.js');
//$.getScript('js/models/location.js');

function buildFromJSON(params) {
	var createResource = getResourceStruct(resourceName);
	createResource.buildFromJSON(params);
    
    return createResource;
}

function getResourceStruct(resourceName){
	if(resourceName == 'Patient'){
		return new Patient();
	} else if (resourceName == 'Observation'){
		return new Observation();
	} else if (resourceName == 'Condition') {
		return new Condition();
	} else if (resourceName == 'Encounter'){
		return new Encounter();
	} else if (resourceName == 'Medication'){
		return new Medication();
	} else if (resourceName == 'MedicationPrescription'){
		return new MedicationPrescription();
	} else if (resourceName == 'MedicationDispense'){
		return new MedicationDispense();
	}
}

/*function updateTableEntry(source, type, id, vid){
			var btn = $(source);
			btn.button('loading');
			var id = $('#resource-update-id').val();
			// Note we're using resource-create-id even though this is an update because
			// the controller expects that...
			if (id != null) btn.append($('<input />', { type: 'hidden', name: 'resource-create-id', value: id }));
			var json = $('#outerForm').serializeResourceObject();
			var myResource = buildFromJSON(json);
			myResource.resourceType = json.resource;
			var body = JSON.stringify(myResource);
			btn.append($('<input />', { type: 'hidden', name: 'resource-create-body', value: body }));
			$("#outerForm").attr("action", "update").attr("method", "POST").submit();
		}*/

function deleteTableEntry(source, type, id){
	
	var btn = $(source);
	btn.button('loading');
	if (id != null) btn.append($('<input />', { type: 'hidden', name: 'resource-delete-id', value: id }));
	$("#outerForm").attr("action", "delete").submit();
}

/**
 * http://stackoverflow.com/a/10997390/11236
 */
function updateURLParameter(url, param, paramVal){
    var newAdditionalURL = "";
    var tempArray = url.split("?");
    var baseURL = tempArray[0];
    var additionalURL = tempArray[1];
    var temp = "";
    if (additionalURL) {
        tempArray = additionalURL.split("&");
        for (i=0; i<tempArray.length; i++){
            if(tempArray[i].split('=')[0] != param){
                newAdditionalURL += temp + tempArray[i];
                temp = "&";
            }
        }
    }

    var rows_txt = temp + "" + param + "=" + paramVal;
    return baseURL + "?" + newAdditionalURL + rows_txt;
}


function selectServer(serverId) {
	$('#serverSelectorFhirIcon').removeClass();
	$('#serverSelectorFhirIcon').addClass('fa fa-spinner fa-spin');
	$('#serverSelectorName').text("Loading...");
	$('#serverId').val(serverId);
	$("#outerForm").attr("action", "home").submit();
}

function setResource(target, resourceName) {
	var resource = $('#resource');
	if (resourceName != null) {
		var input = $('#resource');
		if (resource.length) {
			resource.val(resourceName);
		} else {
			var rbtn = $('<input />', { type: 'hidden', name: 'resource', value: resourceName });
			target.append(rbtn);
		}
	} else {
		if (resource.length) {
			resource.val('');
		}
	}
}

function updateSort(value) {
	$('#sort_by').val(value);
	if (value == '') {
		$('#search_sort_button').text('Default Sort');				
	} else {
		$('#search_sort_button').text(value);
	}
}

function updateSortDirection(value) {
	$('#sort_direction').val(value);
	if (value == '') {
		$('#search_sort_direction_button').text('Default');
	} else {
		$('#search_sort_direction_button').text(value);
	}
}

$( document ).ready(function() {
	addSearchParamRow();
});	