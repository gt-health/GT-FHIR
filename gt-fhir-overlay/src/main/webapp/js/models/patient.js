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
       
}
