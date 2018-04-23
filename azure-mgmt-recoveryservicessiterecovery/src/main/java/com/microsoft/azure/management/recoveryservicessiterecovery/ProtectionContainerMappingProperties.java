/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Protection container mapping properties.
 */
public class ProtectionContainerMappingProperties {
    /**
     * Paired protection container ARM ID.
     */
    @JsonProperty(value = "targetProtectionContainerId")
    private String targetProtectionContainerId;

    /**
     * Friendly name of paired container.
     */
    @JsonProperty(value = "targetProtectionContainerFriendlyName")
    private String targetProtectionContainerFriendlyName;

    /**
     * Provider specific provider details.
     */
    @JsonProperty(value = "providerSpecificDetails")
    private ProtectionContainerMappingProviderSpecificDetails providerSpecificDetails;

    /**
     * Health of pairing.
     */
    @JsonProperty(value = "health")
    private String health;

    /**
     * Health error.
     */
    @JsonProperty(value = "healthErrorDetails")
    private List<HealthError> healthErrorDetails;

    /**
     * Policy ARM Id.
     */
    @JsonProperty(value = "policyId")
    private String policyId;

    /**
     * Association Status.
     */
    @JsonProperty(value = "state")
    private String state;

    /**
     * Friendly name of source protection container.
     */
    @JsonProperty(value = "sourceProtectionContainerFriendlyName")
    private String sourceProtectionContainerFriendlyName;

    /**
     * Friendly name of source fabric.
     */
    @JsonProperty(value = "sourceFabricFriendlyName")
    private String sourceFabricFriendlyName;

    /**
     * Friendly name of target fabric.
     */
    @JsonProperty(value = "targetFabricFriendlyName")
    private String targetFabricFriendlyName;

    /**
     * Friendly name of replication policy.
     */
    @JsonProperty(value = "policyFriendlyName")
    private String policyFriendlyName;

    /**
     * Get the targetProtectionContainerId value.
     *
     * @return the targetProtectionContainerId value
     */
    public String targetProtectionContainerId() {
        return this.targetProtectionContainerId;
    }

    /**
     * Set the targetProtectionContainerId value.
     *
     * @param targetProtectionContainerId the targetProtectionContainerId value to set
     * @return the ProtectionContainerMappingProperties object itself.
     */
    public ProtectionContainerMappingProperties withTargetProtectionContainerId(String targetProtectionContainerId) {
        this.targetProtectionContainerId = targetProtectionContainerId;
        return this;
    }

    /**
     * Get the targetProtectionContainerFriendlyName value.
     *
     * @return the targetProtectionContainerFriendlyName value
     */
    public String targetProtectionContainerFriendlyName() {
        return this.targetProtectionContainerFriendlyName;
    }

    /**
     * Set the targetProtectionContainerFriendlyName value.
     *
     * @param targetProtectionContainerFriendlyName the targetProtectionContainerFriendlyName value to set
     * @return the ProtectionContainerMappingProperties object itself.
     */
    public ProtectionContainerMappingProperties withTargetProtectionContainerFriendlyName(String targetProtectionContainerFriendlyName) {
        this.targetProtectionContainerFriendlyName = targetProtectionContainerFriendlyName;
        return this;
    }

    /**
     * Get the providerSpecificDetails value.
     *
     * @return the providerSpecificDetails value
     */
    public ProtectionContainerMappingProviderSpecificDetails providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails value.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set
     * @return the ProtectionContainerMappingProperties object itself.
     */
    public ProtectionContainerMappingProperties withProviderSpecificDetails(ProtectionContainerMappingProviderSpecificDetails providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

    /**
     * Get the health value.
     *
     * @return the health value
     */
    public String health() {
        return this.health;
    }

    /**
     * Set the health value.
     *
     * @param health the health value to set
     * @return the ProtectionContainerMappingProperties object itself.
     */
    public ProtectionContainerMappingProperties withHealth(String health) {
        this.health = health;
        return this;
    }

    /**
     * Get the healthErrorDetails value.
     *
     * @return the healthErrorDetails value
     */
    public List<HealthError> healthErrorDetails() {
        return this.healthErrorDetails;
    }

    /**
     * Set the healthErrorDetails value.
     *
     * @param healthErrorDetails the healthErrorDetails value to set
     * @return the ProtectionContainerMappingProperties object itself.
     */
    public ProtectionContainerMappingProperties withHealthErrorDetails(List<HealthError> healthErrorDetails) {
        this.healthErrorDetails = healthErrorDetails;
        return this;
    }

    /**
     * Get the policyId value.
     *
     * @return the policyId value
     */
    public String policyId() {
        return this.policyId;
    }

    /**
     * Set the policyId value.
     *
     * @param policyId the policyId value to set
     * @return the ProtectionContainerMappingProperties object itself.
     */
    public ProtectionContainerMappingProperties withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the ProtectionContainerMappingProperties object itself.
     */
    public ProtectionContainerMappingProperties withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the sourceProtectionContainerFriendlyName value.
     *
     * @return the sourceProtectionContainerFriendlyName value
     */
    public String sourceProtectionContainerFriendlyName() {
        return this.sourceProtectionContainerFriendlyName;
    }

    /**
     * Set the sourceProtectionContainerFriendlyName value.
     *
     * @param sourceProtectionContainerFriendlyName the sourceProtectionContainerFriendlyName value to set
     * @return the ProtectionContainerMappingProperties object itself.
     */
    public ProtectionContainerMappingProperties withSourceProtectionContainerFriendlyName(String sourceProtectionContainerFriendlyName) {
        this.sourceProtectionContainerFriendlyName = sourceProtectionContainerFriendlyName;
        return this;
    }

    /**
     * Get the sourceFabricFriendlyName value.
     *
     * @return the sourceFabricFriendlyName value
     */
    public String sourceFabricFriendlyName() {
        return this.sourceFabricFriendlyName;
    }

    /**
     * Set the sourceFabricFriendlyName value.
     *
     * @param sourceFabricFriendlyName the sourceFabricFriendlyName value to set
     * @return the ProtectionContainerMappingProperties object itself.
     */
    public ProtectionContainerMappingProperties withSourceFabricFriendlyName(String sourceFabricFriendlyName) {
        this.sourceFabricFriendlyName = sourceFabricFriendlyName;
        return this;
    }

    /**
     * Get the targetFabricFriendlyName value.
     *
     * @return the targetFabricFriendlyName value
     */
    public String targetFabricFriendlyName() {
        return this.targetFabricFriendlyName;
    }

    /**
     * Set the targetFabricFriendlyName value.
     *
     * @param targetFabricFriendlyName the targetFabricFriendlyName value to set
     * @return the ProtectionContainerMappingProperties object itself.
     */
    public ProtectionContainerMappingProperties withTargetFabricFriendlyName(String targetFabricFriendlyName) {
        this.targetFabricFriendlyName = targetFabricFriendlyName;
        return this;
    }

    /**
     * Get the policyFriendlyName value.
     *
     * @return the policyFriendlyName value
     */
    public String policyFriendlyName() {
        return this.policyFriendlyName;
    }

    /**
     * Set the policyFriendlyName value.
     *
     * @param policyFriendlyName the policyFriendlyName value to set
     * @return the ProtectionContainerMappingProperties object itself.
     */
    public ProtectionContainerMappingProperties withPolicyFriendlyName(String policyFriendlyName) {
        this.policyFriendlyName = policyFriendlyName;
        return this;
    }

}
