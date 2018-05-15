/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the replication status of the gallery image version.
 */
public class ReplicationStatus {
    /**
     * This is the aggregated replication status based on the regional
     * replication status. Possible values include: 'Unknown', 'InProgress',
     * 'Completed', 'Failed'.
     */
    @JsonProperty(value = "aggregatedState")
    private AggregatedReplicationState aggregatedState;

    /**
     * This is a summary of replication status for each region.
     */
    @JsonProperty(value = "summary")
    private List<RegionalReplicationStatus> summary;

    /**
     * Get the aggregatedState value.
     *
     * @return the aggregatedState value
     */
    public AggregatedReplicationState aggregatedState() {
        return this.aggregatedState;
    }

    /**
     * Set the aggregatedState value.
     *
     * @param aggregatedState the aggregatedState value to set
     * @return the ReplicationStatus object itself.
     */
    public ReplicationStatus withAggregatedState(AggregatedReplicationState aggregatedState) {
        this.aggregatedState = aggregatedState;
        return this;
    }

    /**
     * Get the summary value.
     *
     * @return the summary value
     */
    public List<RegionalReplicationStatus> summary() {
        return this.summary;
    }

    /**
     * Set the summary value.
     *
     * @param summary the summary value to set
     * @return the ReplicationStatus object itself.
     */
    public ReplicationStatus withSummary(List<RegionalReplicationStatus> summary) {
        this.summary = summary;
        return this;
    }

}