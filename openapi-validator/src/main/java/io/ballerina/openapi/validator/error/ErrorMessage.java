/*
 * Copyright (c) 2022 WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.ballerina.openapi.validator.error;

/**
 * This enum class stores the all error messages.
 *
 * @since 2201.1.0
 */
public enum ErrorMessage {
    ERROR_001("OpenAPI contract does not exist in the given location: '{0}'"),
    ERROR_002("Invalid file type. Provide either a .yaml or .json file."),
    ERROR_003("Given OpenAPI contract file path is an empty string."),
    ERROR_004("OpenAPI annotation won''t support for non http service."),
    ERROR_005("Implementation type does not match with OAS contract type " +
            "(expected ''{0}'', found ''{1}'') for the field ''{2}'' of type ''{3}''"),
    ERROR_006("Implementation type does not match with OAS contract type (expected ''{0}'',found ''{1}'') for the" +
            " parameter ''{2}'' in http method ''{3}'' that associated with the path ''{4}''."),
    ERROR_007("The ''{0}'' field in the ''{1}'' record is not documented in the OpenAPI contract ''{2}'' schema."),
    ERROR_008("Couldn''t find OpenAPI object schema field ''{0}'' in ''{1}'' the Ballerina record."),
    ERROR_009("''{0}'' parameter for the method ''{1}'' of the resource associated with the path" +
            " ''{2}'' is not documented in the OpenAPI contract."),
    ERROR_010("Missing OpenAPI contract parameter ''{0}'' in the counterpart Ballerina service resource (method: " +
            "''{1}'', path: ''{2}'')"),
    ERROR_011("Unexpected error occur while reading the contract : {0}"),
    ERROR_012("Invalid contract file {0}"),
    ERROR_013("OpenAPI service validator does not support for tags and excludeTags together. Please select one from " +
            "tags and excludeTags"),
    ERROR_014("OpenAPI service validator does not support for operations and excludeOperations together. Please " +
            "select one from operation and excludeOperations"),
    ERROR_015("Could not find Ballerina service resource(s) for HTTP method(s) ''{0}'' for the path ''{1}'' which is " +
            "documented in the OpenAPI contract"),
    ERROR_016("Ballerina service contains  ''{0}'' resource/s with ''{1}'' that is not documented in the " +
            "OpenAPI contract."),
    ERROR_017("Could not find a Ballerina service resource for the path ''{0}'' which is documented in the OpenAPI " +
            "contract."),
    ERROR_018("Ballerina service contains resource/s with ''{0}'' that is not documented in the OpenAPI contract."),
    ERROR_019("Implementation type does not match with OAS contract type (expected ''{0}'',found ''{1}'') for the" +
            " header ''{2}'' in http method ''{3}'' that associated with the path ''{4}''."),
    ERROR_020("''{0}'' header for the method ''{1}'' of the resource associated with the path" +
            " ''{2}'' is not documented in the OpenAPI contract."),
    ERROR_021("Request body for the method ''{0}'' of the resource associated with the path" +
            " ''{1}'' is not documented in the OpenAPI contract."),
    ERROR_022("Implementation payload type does not match with OAS contract content type (expected ''{0}'',found " +
            "''{1}'') for the http method ''{2}'' that associated with the path ''{3}''."),
    ERROR_023("Undocumented resource return status code ''{0}'' for the method ''{1}'' of the resource " +
            "associated with the path ''{2}''."),
    ERROR_024("Undocumented resource return media type ''{0}'' for the method ''{1}'' of the resource " +
            "associated with the path ''{2}''."),
    ERROR_025("Missing OpenAPI contract header ''{0}'' in the counterpart Ballerina service resource" +
            " (method: ''{1}'', path: ''{2}'')"),
    ERROR_026("Missing OpenAPI contract request body media type ''{0}'' in the counterpart Ballerina service resource" +
                      " (method: ''{1}'', path: ''{2}'')"),
    ERROR_027("Missing OpenAPI contract request body implementation in the counterpart Ballerina service resource" +
                      " (method: ''{0}'', path: ''{1}'')"),
    ERROR_028("Could not find the implementation for return code ''{0}'' in the counterpart Ballerina service " +
            "resource (method: ''{1}'', path: ''{2}'')"),
    ERROR_029("Could not find the implementation for return media type ''{0}'' in the counterpart Ballerina service " +
            "resource (method: ''{1}'', path: ''{2}'')"),
    ERROR_030("OpenAPI service validator can not be proceed with all four attributes, Please select few from them.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
