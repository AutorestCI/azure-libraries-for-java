/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the policy for a monitored application upgrade.
 */
public class ApplicationUpgradePolicy {
    /**
     * The maximum amount of time to block processing of an upgrade domain and
     * prevent loss of availability when there are unexpected issues. When this
     * timeout expires, processing of the upgrade domain will proceed
     * regardless of availability loss issues. The timeout is reset at the
     * start of each upgrade domain. Valid values are between 0 and 42949672925
     * inclusive. (unsigned 32-bit integer).
     */
    @JsonProperty(value = "upgradeReplicaSetCheckTimeout")
    private Long upgradeReplicaSetCheckTimeout;

    /**
     * If true, then processes are forcefully restarted during upgrade even
     * when the code version has not changed (the upgrade only changes
     * configuration or data).
     */
    @JsonProperty(value = "forceRestart")
    private Boolean forceRestart;

    /**
     * The policy used for monitoring the application upgrade.
     */
    @JsonProperty(value = "rollingUpgradeMonitoringPolicy")
    private RollingUpgradeMonitoringPolicy rollingUpgradeMonitoringPolicy;

    /**
     * Defines a health policy used to evaluate the health of an application or
     * one of its children entities.
     */
    @JsonProperty(value = "applicationHealthPolicy")
    private ApplicationHealthPolicy applicationHealthPolicy;

    /**
     * Get the upgradeReplicaSetCheckTimeout value.
     *
     * @return the upgradeReplicaSetCheckTimeout value
     */
    public Long upgradeReplicaSetCheckTimeout() {
        return this.upgradeReplicaSetCheckTimeout;
    }

    /**
     * Set the upgradeReplicaSetCheckTimeout value.
     *
     * @param upgradeReplicaSetCheckTimeout the upgradeReplicaSetCheckTimeout value to set
     * @return the ApplicationUpgradePolicy object itself.
     */
    public ApplicationUpgradePolicy withUpgradeReplicaSetCheckTimeout(Long upgradeReplicaSetCheckTimeout) {
        this.upgradeReplicaSetCheckTimeout = upgradeReplicaSetCheckTimeout;
        return this;
    }

    /**
     * Get the forceRestart value.
     *
     * @return the forceRestart value
     */
    public Boolean forceRestart() {
        return this.forceRestart;
    }

    /**
     * Set the forceRestart value.
     *
     * @param forceRestart the forceRestart value to set
     * @return the ApplicationUpgradePolicy object itself.
     */
    public ApplicationUpgradePolicy withForceRestart(Boolean forceRestart) {
        this.forceRestart = forceRestart;
        return this;
    }

    /**
     * Get the rollingUpgradeMonitoringPolicy value.
     *
     * @return the rollingUpgradeMonitoringPolicy value
     */
    public RollingUpgradeMonitoringPolicy rollingUpgradeMonitoringPolicy() {
        return this.rollingUpgradeMonitoringPolicy;
    }

    /**
     * Set the rollingUpgradeMonitoringPolicy value.
     *
     * @param rollingUpgradeMonitoringPolicy the rollingUpgradeMonitoringPolicy value to set
     * @return the ApplicationUpgradePolicy object itself.
     */
    public ApplicationUpgradePolicy withRollingUpgradeMonitoringPolicy(RollingUpgradeMonitoringPolicy rollingUpgradeMonitoringPolicy) {
        this.rollingUpgradeMonitoringPolicy = rollingUpgradeMonitoringPolicy;
        return this;
    }

    /**
     * Get the applicationHealthPolicy value.
     *
     * @return the applicationHealthPolicy value
     */
    public ApplicationHealthPolicy applicationHealthPolicy() {
        return this.applicationHealthPolicy;
    }

    /**
     * Set the applicationHealthPolicy value.
     *
     * @param applicationHealthPolicy the applicationHealthPolicy value to set
     * @return the ApplicationUpgradePolicy object itself.
     */
    public ApplicationUpgradePolicy withApplicationHealthPolicy(ApplicationHealthPolicy applicationHealthPolicy) {
        this.applicationHealthPolicy = applicationHealthPolicy;
        return this;
    }

}
