// Copyright (c) 2011-2013, HL7, Inc & Mitre
// All rights reserved.
// 
// Redistribution and use in source and binary forms, with or without modification, 
// are permitted provided that the following conditions are met:
// 
//     * Redistributions of source code must retain the above copyright notice, this 
//       list of conditions and the following disclaimer.
//     * Redistributions in binary form must reproduce the above copyright notice, 
//       this list of conditions and the following disclaimer in the documentation 
//       and/or other materials provided with the distribution.
//     * Neither the name of HL7 nor the names of its contributors may be used to 
//       endorse or promote products derived from this software without specific 
//       prior written permission.
// 
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
// ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
// WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
// IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
// INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
// NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
// PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
// WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
// ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
// POSSIBILITY OF SUCH DAMAGE.

var mongoose = require('mongoose');

var ProfileSchema = new mongoose.Schema({
    identifier: String,
    version: String,
    name: String,
    publisher: String,
    telecom: [{
    }],
    description: String,
    code: [{
        system: String,
        code: String,
        display: String
    }],
    status: String,
    experimental: Boolean,
    date: Date,
    requirements: String,
    fhirVersion: {
    },
    mapping: [{
        identity: {
        },
        uri: String,
        name: String,
        comments: String,
    }],
    structure: [{
        fhirType: String,
        name: String,
        publish: Boolean,
        purpose: String,
        element: [{
            path: String,
            representation: String,
            name: String,
            slicing: {
                discriminator: {
                },
                ordered: Boolean,
                rules: String,
            },
            definition: {
                short: String,
                formal: String,
                comments: String,
                requirements: String,
                synonym: String,
                min: Number,
                max: String,
                fhirType: [{
                    code: String,
                    profile: String,
                    aggregation: String,
                }],
                nameReference: String,
                value: {
                },
                example: {
                },
                maxLength: Number,
                condition: [{
                }],
                constraint: [{
                    key: {
                    },
                    name: String,
                    severity: String,
                    human: String,
                    xpath: String,
                }],
                mustSupport: Boolean,
                isModifier: Boolean,
                binding: {
                    name: String,
                    isExtensible: Boolean,
                    conformance: String,
                    description: String,
                    referenceUri: String,
                    referenceResource: {
                        reference: String,
                        display: String
                    }
                },
                mapping: [{
                    identity: {
                    },
                    map: String,
                }]
            }
        }],
        searchParam: [{
            name: String,
            fhirType: String,
            documentation: String,
            xpath: String,
            target: String,
        }]
    }],
    extensionDefn: [{
        code: String,
        display: String,
        contextType: String,
        context: String,
        definition: {
        }
    }],
    query: [{
        name: String,
        documentation: String,
        parameter: [{
        }]
    }]
});

mongoose.model('Profile', ProfileSchema);
