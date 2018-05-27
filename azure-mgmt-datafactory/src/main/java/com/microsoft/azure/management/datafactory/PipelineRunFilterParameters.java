/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Query parameters for listing pipeline runs.
 */
public class PipelineRunFilterParameters {
    /**
     * The continuation token for getting the next page of results. Null for
     * first page.
     */
    @JsonProperty(value = "continuationToken")
    private String continuationToken;

    /**
     * The time at or after which the pipeline run event was updated in 'ISO
     * 8601' format.
     */
    @JsonProperty(value = "lastUpdatedAfter", required = true)
    private DateTime lastUpdatedAfter;

    /**
     * The time at or before which the pipeline run event was updated in 'ISO
     * 8601' format.
     */
    @JsonProperty(value = "lastUpdatedBefore", required = true)
    private DateTime lastUpdatedBefore;

    /**
     * List of filters.
     */
    @JsonProperty(value = "filters")
    private List<PipelineRunQueryFilter> filters;

    /**
     * List of OrderBy option.
     */
    @JsonProperty(value = "orderBy")
    private List<PipelineRunQueryOrderBy> orderBy;

    /**
     * Get the continuation token for getting the next page of results. Null for first page.
     *
     * @return the continuationToken value
     */
    public String continuationToken() {
        return this.continuationToken;
    }

    /**
     * Set the continuation token for getting the next page of results. Null for first page.
     *
     * @param continuationToken the continuationToken value to set
     * @return the PipelineRunFilterParameters object itself.
     */
    public PipelineRunFilterParameters withContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * Get the time at or after which the pipeline run event was updated in 'ISO 8601' format.
     *
     * @return the lastUpdatedAfter value
     */
    public DateTime lastUpdatedAfter() {
        return this.lastUpdatedAfter;
    }

    /**
     * Set the time at or after which the pipeline run event was updated in 'ISO 8601' format.
     *
     * @param lastUpdatedAfter the lastUpdatedAfter value to set
     * @return the PipelineRunFilterParameters object itself.
     */
    public PipelineRunFilterParameters withLastUpdatedAfter(DateTime lastUpdatedAfter) {
        this.lastUpdatedAfter = lastUpdatedAfter;
        return this;
    }

    /**
     * Get the time at or before which the pipeline run event was updated in 'ISO 8601' format.
     *
     * @return the lastUpdatedBefore value
     */
    public DateTime lastUpdatedBefore() {
        return this.lastUpdatedBefore;
    }

    /**
     * Set the time at or before which the pipeline run event was updated in 'ISO 8601' format.
     *
     * @param lastUpdatedBefore the lastUpdatedBefore value to set
     * @return the PipelineRunFilterParameters object itself.
     */
    public PipelineRunFilterParameters withLastUpdatedBefore(DateTime lastUpdatedBefore) {
        this.lastUpdatedBefore = lastUpdatedBefore;
        return this;
    }

    /**
     * Get list of filters.
     *
     * @return the filters value
     */
    public List<PipelineRunQueryFilter> filters() {
        return this.filters;
    }

    /**
     * Set list of filters.
     *
     * @param filters the filters value to set
     * @return the PipelineRunFilterParameters object itself.
     */
    public PipelineRunFilterParameters withFilters(List<PipelineRunQueryFilter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Get list of OrderBy option.
     *
     * @return the orderBy value
     */
    public List<PipelineRunQueryOrderBy> orderBy() {
        return this.orderBy;
    }

    /**
     * Set list of OrderBy option.
     *
     * @param orderBy the orderBy value to set
     * @return the PipelineRunFilterParameters object itself.
     */
    public PipelineRunFilterParameters withOrderBy(List<PipelineRunQueryOrderBy> orderBy) {
        this.orderBy = orderBy;
        return this;
    }

}
