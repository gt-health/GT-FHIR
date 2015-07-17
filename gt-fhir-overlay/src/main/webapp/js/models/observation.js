/**
 * 
 */
function Observation(){
	
	identifier: [{
        use: String,
        label: String,
        system: String,
        value: String
    }];
	
	this.providesSearch = function(searchParam){
		var searchParams = ["_id", "code", "subject", "value-concept", "value-string", "value-quantity"];
		return (searchParams.indexOf(searchParam) != -1);
	}
}