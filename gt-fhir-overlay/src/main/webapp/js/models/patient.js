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
