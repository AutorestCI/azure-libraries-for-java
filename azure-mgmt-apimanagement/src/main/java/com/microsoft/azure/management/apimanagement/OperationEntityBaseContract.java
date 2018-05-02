/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Api Operation Entity Base Contract details.
 */
public class OperationEntityBaseContract {
    /**
     * Collection of URL template parameters.
     */
    @JsonProperty(value = "templateParameters")
    private List<ParameterContract> templateParameters;

    /**
     * Description of the operation. May include HTML formatting tags.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * An entity containing request details.
     */
    @JsonProperty(value = "request")
    private RequestContract request;

    /**
     * Array of Operation responses.
     */
    @JsonProperty(value = "responses")
    private List<ResponseContract> responses;

    /**
     * Operation Policies.
     */
    @JsonProperty(value = "policies")
    private String policies;

    /**
     * Get the templateParameters value.
     *
     * @return the templateParameters value
     */
    public List<ParameterContract> templateParameters() {
        return this.templateParameters;
    }

    /**
     * Set the templateParameters value.
     *
     * @param templateParameters the templateParameters value to set
     * @return the OperationEntityBaseContract object itself.
     */
    public OperationEntityBaseContract withTemplateParameters(List<ParameterContract> templateParameters) {
        this.templateParameters = templateParameters;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the OperationEntityBaseContract object itself.
     */
    public OperationEntityBaseContract withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the request value.
     *
     * @return the request value
     */
    public RequestContract request() {
        return this.request;
    }

    /**
     * Set the request value.
     *
     * @param request the request value to set
     * @return the OperationEntityBaseContract object itself.
     */
    public OperationEntityBaseContract withRequest(RequestContract request) {
        this.request = request;
        return this;
    }

    /**
     * Get the responses value.
     *
     * @return the responses value
     */
    public List<ResponseContract> responses() {
        return this.responses;
    }

    /**
     * Set the responses value.
     *
     * @param responses the responses value to set
     * @return the OperationEntityBaseContract object itself.
     */
    public OperationEntityBaseContract withResponses(List<ResponseContract> responses) {
        this.responses = responses;
        return this;
    }

    /**
     * Get the policies value.
     *
     * @return the policies value
     */
    public String policies() {
        return this.policies;
    }

    /**
     * Set the policies value.
     *
     * @param policies the policies value to set
     * @return the OperationEntityBaseContract object itself.
     */
    public OperationEntityBaseContract withPolicies(String policies) {
        this.policies = policies;
        return this;
    }

}