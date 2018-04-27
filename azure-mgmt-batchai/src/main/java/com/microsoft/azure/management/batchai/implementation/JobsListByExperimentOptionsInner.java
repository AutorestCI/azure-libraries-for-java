/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional parameters for listByExperiment operation.
 */
public class JobsListByExperimentOptionsInner {
    /**
     * The maximum number of items to return in the response. A maximum of 1000
     * files can be returned.
     */
    @JsonProperty(value = "")
    private Integer maxResults;

    /**
     * Get the maxResults value.
     *
     * @return the maxResults value
     */
    public Integer maxResults() {
        return this.maxResults;
    }

    /**
     * Set the maxResults value.
     *
     * @param maxResults the maxResults value to set
     * @return the JobsListByExperimentOptionsInner object itself.
     */
    public JobsListByExperimentOptionsInner withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

}
