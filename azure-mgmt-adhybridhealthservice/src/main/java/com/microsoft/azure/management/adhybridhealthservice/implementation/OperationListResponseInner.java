/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.implementation;

import java.util.List;
import com.microsoft.azure.management.adhybridhealthservice.Operation;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Lists all of the available REST API operations for Azure Active Directory
 * Connect Health.
 */
public class OperationListResponseInner {
    /**
     * URL to get the next set of operation list results if there are any.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * List of operations supported by the Microsoft.ADHybridhHealthService
     * resource provider.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<Operation> value;

    /**
     * The continuation token to get next set of operations.
     */
    @JsonProperty(value = "continuationToken")
    private String continuationToken;

    /**
     * Get the nextLink value.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<Operation> value() {
        return this.value;
    }

    /**
     * Get the continuationToken value.
     *
     * @return the continuationToken value
     */
    public String continuationToken() {
        return this.continuationToken;
    }

    /**
     * Set the continuationToken value.
     *
     * @param continuationToken the continuationToken value to set
     * @return the OperationListResponseInner object itself.
     */
    public OperationListResponseInner withContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

}
