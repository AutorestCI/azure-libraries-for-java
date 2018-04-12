/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents health evaluation for replicas, containing health evaluations for
 * each unhealthy replica that impacted current aggregated health state. Can be
 * returned when evaluating partition health and the aggregated health state is
 * either Error or Warning.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Replicas")
public class ReplicasHealthEvaluation extends HealthEvaluation {
    /**
     * Maximum allowed percentage of unhealthy replicas per partition from the
     * ApplicationHealthPolicy.
     */
    @JsonProperty(value = "MaxPercentUnhealthyReplicasPerPartition")
    private Integer maxPercentUnhealthyReplicasPerPartition;

    /**
     * Total number of replicas in the partition from the health store.
     */
    @JsonProperty(value = "TotalCount")
    private Long totalCount;

    /**
     * List of unhealthy evaluations that led to the aggregated health state.
     * Includes all the unhealthy ReplicaHealthEvaluation that impacted the
     * aggregated health.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /**
     * Get the maxPercentUnhealthyReplicasPerPartition value.
     *
     * @return the maxPercentUnhealthyReplicasPerPartition value
     */
    public Integer maxPercentUnhealthyReplicasPerPartition() {
        return this.maxPercentUnhealthyReplicasPerPartition;
    }

    /**
     * Set the maxPercentUnhealthyReplicasPerPartition value.
     *
     * @param maxPercentUnhealthyReplicasPerPartition the maxPercentUnhealthyReplicasPerPartition value to set
     * @return the ReplicasHealthEvaluation object itself.
     */
    public ReplicasHealthEvaluation withMaxPercentUnhealthyReplicasPerPartition(Integer maxPercentUnhealthyReplicasPerPartition) {
        this.maxPercentUnhealthyReplicasPerPartition = maxPercentUnhealthyReplicasPerPartition;
        return this;
    }

    /**
     * Get the totalCount value.
     *
     * @return the totalCount value
     */
    public Long totalCount() {
        return this.totalCount;
    }

    /**
     * Set the totalCount value.
     *
     * @param totalCount the totalCount value to set
     * @return the ReplicasHealthEvaluation object itself.
     */
    public ReplicasHealthEvaluation withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get the unhealthyEvaluations value.
     *
     * @return the unhealthyEvaluations value
     */
    public List<HealthEvaluationWrapper> unhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set the unhealthyEvaluations value.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set
     * @return the ReplicasHealthEvaluation object itself.
     */
    public ReplicasHealthEvaluation withUnhealthyEvaluations(List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }

}
