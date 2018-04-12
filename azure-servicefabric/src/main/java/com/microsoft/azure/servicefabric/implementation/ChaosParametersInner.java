/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import com.microsoft.azure.servicefabric.ChaosContext;
import com.microsoft.azure.servicefabric.ChaosTargetFilter;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines all the parameters to configure a Chaos run.
 */
public class ChaosParametersInner {
    /**
     * Total time (in seconds) for which Chaos will run before automatically
     * stopping. The maximum allowed value is 4,294,967,295
     * (System.UInt32.MaxValue).
     */
    @JsonProperty(value = "TimeToRunInSeconds")
    private String timeToRunInSeconds;

    /**
     * The maximum amount of time to wait for all cluster entities to become
     * stable and healthy. Chaos executes in iterations and at the start of
     * each iteration it validates the health of cluster entities.
     * During validation if a cluster entity is not stable and healthy within
     * MaxClusterStabilizationTimeoutInSeconds, Chaos generates a validation
     * failed event.
     */
    @JsonProperty(value = "MaxClusterStabilizationTimeoutInSeconds")
    private Long maxClusterStabilizationTimeoutInSeconds;

    /**
     * MaxConcurrentFaults is the maximum number of concurrent faults induced
     * per iteration.
     * Chaos executes in iterations and two consecutive iterations are
     * separated by a validation phase.
     * The higher the concurrency, the more aggressive the injection of faults
     * -- inducing more complex series of states to uncover bugs.
     * The recommendation is to start with a value of 2 or 3 and to exercise
     * caution while moving up.
     */
    @JsonProperty(value = "MaxConcurrentFaults")
    private Long maxConcurrentFaults;

    /**
     * Enables or disables the move primary and move secondary faults.
     */
    @JsonProperty(value = "EnableMoveReplicaFaults")
    private Boolean enableMoveReplicaFaults;

    /**
     * Wait time (in seconds) between consecutive faults within a single
     * iteration.
     * The larger the value, the lower the overlapping between faults and the
     * simpler the sequence of state transitions that the cluster goes through.
     * The recommendation is to start with a value between 1 and 5 and exercise
     * caution while moving up.
     */
    @JsonProperty(value = "WaitTimeBetweenFaultsInSeconds")
    private Long waitTimeBetweenFaultsInSeconds;

    /**
     * Time-separation (in seconds) between two consecutive iterations of
     * Chaos.
     * The larger the value, the lower the fault injection rate.
     */
    @JsonProperty(value = "WaitTimeBetweenIterationsInSeconds")
    private Long waitTimeBetweenIterationsInSeconds;

    /**
     * Passed-in cluster health policy is used to validate health of the
     * cluster in between Chaos iterations. If the cluster health is in error
     * or if an unexpected exception happens during fault execution--to provide
     * the cluster with some time to recuperate--Chaos will wait for 30 minutes
     * before the next health-check.
     */
    @JsonProperty(value = "ClusterHealthPolicy")
    private ClusterHealthPolicyInner clusterHealthPolicy;

    /**
     * Describes a map, which is a collection of (string, string) type
     * key-value pairs. The map can be used to record information about
     * the Chaos run. There cannot be more than 100 such pairs and each string
     * (key or value) can be at most 4095 characters long.
     * This map is set by the starter of the Chaos run to optionally store the
     * context about the specific run.
     */
    @JsonProperty(value = "Context")
    private ChaosContext context;

    /**
     * List of cluster entities to target for Chaos faults.
     * This filter can be used to target Chaos faults only to certain node
     * types or only to certain application instances. If ChaosTargetFilter is
     * not used, Chaos faults all cluster entities.
     * If ChaosTargetFilter is used, Chaos faults only the entities that meet
     * the ChaosTargetFilter specification.
     */
    @JsonProperty(value = "ChaosTargetFilter")
    private ChaosTargetFilter chaosTargetFilter;

    /**
     * Get the timeToRunInSeconds value.
     *
     * @return the timeToRunInSeconds value
     */
    public String timeToRunInSeconds() {
        return this.timeToRunInSeconds;
    }

    /**
     * Set the timeToRunInSeconds value.
     *
     * @param timeToRunInSeconds the timeToRunInSeconds value to set
     * @return the ChaosParametersInner object itself.
     */
    public ChaosParametersInner withTimeToRunInSeconds(String timeToRunInSeconds) {
        this.timeToRunInSeconds = timeToRunInSeconds;
        return this;
    }

    /**
     * Get the maxClusterStabilizationTimeoutInSeconds value.
     *
     * @return the maxClusterStabilizationTimeoutInSeconds value
     */
    public Long maxClusterStabilizationTimeoutInSeconds() {
        return this.maxClusterStabilizationTimeoutInSeconds;
    }

    /**
     * Set the maxClusterStabilizationTimeoutInSeconds value.
     *
     * @param maxClusterStabilizationTimeoutInSeconds the maxClusterStabilizationTimeoutInSeconds value to set
     * @return the ChaosParametersInner object itself.
     */
    public ChaosParametersInner withMaxClusterStabilizationTimeoutInSeconds(Long maxClusterStabilizationTimeoutInSeconds) {
        this.maxClusterStabilizationTimeoutInSeconds = maxClusterStabilizationTimeoutInSeconds;
        return this;
    }

    /**
     * Get the maxConcurrentFaults value.
     *
     * @return the maxConcurrentFaults value
     */
    public Long maxConcurrentFaults() {
        return this.maxConcurrentFaults;
    }

    /**
     * Set the maxConcurrentFaults value.
     *
     * @param maxConcurrentFaults the maxConcurrentFaults value to set
     * @return the ChaosParametersInner object itself.
     */
    public ChaosParametersInner withMaxConcurrentFaults(Long maxConcurrentFaults) {
        this.maxConcurrentFaults = maxConcurrentFaults;
        return this;
    }

    /**
     * Get the enableMoveReplicaFaults value.
     *
     * @return the enableMoveReplicaFaults value
     */
    public Boolean enableMoveReplicaFaults() {
        return this.enableMoveReplicaFaults;
    }

    /**
     * Set the enableMoveReplicaFaults value.
     *
     * @param enableMoveReplicaFaults the enableMoveReplicaFaults value to set
     * @return the ChaosParametersInner object itself.
     */
    public ChaosParametersInner withEnableMoveReplicaFaults(Boolean enableMoveReplicaFaults) {
        this.enableMoveReplicaFaults = enableMoveReplicaFaults;
        return this;
    }

    /**
     * Get the waitTimeBetweenFaultsInSeconds value.
     *
     * @return the waitTimeBetweenFaultsInSeconds value
     */
    public Long waitTimeBetweenFaultsInSeconds() {
        return this.waitTimeBetweenFaultsInSeconds;
    }

    /**
     * Set the waitTimeBetweenFaultsInSeconds value.
     *
     * @param waitTimeBetweenFaultsInSeconds the waitTimeBetweenFaultsInSeconds value to set
     * @return the ChaosParametersInner object itself.
     */
    public ChaosParametersInner withWaitTimeBetweenFaultsInSeconds(Long waitTimeBetweenFaultsInSeconds) {
        this.waitTimeBetweenFaultsInSeconds = waitTimeBetweenFaultsInSeconds;
        return this;
    }

    /**
     * Get the waitTimeBetweenIterationsInSeconds value.
     *
     * @return the waitTimeBetweenIterationsInSeconds value
     */
    public Long waitTimeBetweenIterationsInSeconds() {
        return this.waitTimeBetweenIterationsInSeconds;
    }

    /**
     * Set the waitTimeBetweenIterationsInSeconds value.
     *
     * @param waitTimeBetweenIterationsInSeconds the waitTimeBetweenIterationsInSeconds value to set
     * @return the ChaosParametersInner object itself.
     */
    public ChaosParametersInner withWaitTimeBetweenIterationsInSeconds(Long waitTimeBetweenIterationsInSeconds) {
        this.waitTimeBetweenIterationsInSeconds = waitTimeBetweenIterationsInSeconds;
        return this;
    }

    /**
     * Get the clusterHealthPolicy value.
     *
     * @return the clusterHealthPolicy value
     */
    public ClusterHealthPolicyInner clusterHealthPolicy() {
        return this.clusterHealthPolicy;
    }

    /**
     * Set the clusterHealthPolicy value.
     *
     * @param clusterHealthPolicy the clusterHealthPolicy value to set
     * @return the ChaosParametersInner object itself.
     */
    public ChaosParametersInner withClusterHealthPolicy(ClusterHealthPolicyInner clusterHealthPolicy) {
        this.clusterHealthPolicy = clusterHealthPolicy;
        return this;
    }

    /**
     * Get the context value.
     *
     * @return the context value
     */
    public ChaosContext context() {
        return this.context;
    }

    /**
     * Set the context value.
     *
     * @param context the context value to set
     * @return the ChaosParametersInner object itself.
     */
    public ChaosParametersInner withContext(ChaosContext context) {
        this.context = context;
        return this;
    }

    /**
     * Get the chaosTargetFilter value.
     *
     * @return the chaosTargetFilter value
     */
    public ChaosTargetFilter chaosTargetFilter() {
        return this.chaosTargetFilter;
    }

    /**
     * Set the chaosTargetFilter value.
     *
     * @param chaosTargetFilter the chaosTargetFilter value to set
     * @return the ChaosParametersInner object itself.
     */
    public ChaosParametersInner withChaosTargetFilter(ChaosTargetFilter chaosTargetFilter) {
        this.chaosTargetFilter = chaosTargetFilter;
        return this;
    }

}
