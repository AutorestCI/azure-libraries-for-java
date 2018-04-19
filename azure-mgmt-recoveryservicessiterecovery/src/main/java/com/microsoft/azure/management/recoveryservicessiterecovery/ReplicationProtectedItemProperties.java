/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Replication protected item custom data details.
 */
public class ReplicationProtectedItemProperties {
    /**
     * The name.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * The type of protected item type.
     */
    @JsonProperty(value = "protectedItemType")
    private String protectedItemType;

    /**
     * The protected item ARM Id.
     */
    @JsonProperty(value = "protectableItemId")
    private String protectableItemId;

    /**
     * The recovery provider ARM Id.
     */
    @JsonProperty(value = "recoveryServicesProviderId")
    private String recoveryServicesProviderId;

    /**
     * The friendly name of the primary fabric.
     */
    @JsonProperty(value = "primaryFabricFriendlyName")
    private String primaryFabricFriendlyName;

    /**
     * The fabric provider of the primary fabric.
     */
    @JsonProperty(value = "primaryFabricProvider")
    private String primaryFabricProvider;

    /**
     * The friendly name of recovery fabric.
     */
    @JsonProperty(value = "recoveryFabricFriendlyName")
    private String recoveryFabricFriendlyName;

    /**
     * The Arm Id of recovery fabric.
     */
    @JsonProperty(value = "recoveryFabricId")
    private String recoveryFabricId;

    /**
     * The name of primary protection container friendly name.
     */
    @JsonProperty(value = "primaryProtectionContainerFriendlyName")
    private String primaryProtectionContainerFriendlyName;

    /**
     * The name of recovery container friendly name.
     */
    @JsonProperty(value = "recoveryProtectionContainerFriendlyName")
    private String recoveryProtectionContainerFriendlyName;

    /**
     * The protection status.
     */
    @JsonProperty(value = "protectionState")
    private String protectionState;

    /**
     * The protection state description.
     */
    @JsonProperty(value = "protectionStateDescription")
    private String protectionStateDescription;

    /**
     * The Current active location of the PE.
     */
    @JsonProperty(value = "activeLocation")
    private String activeLocation;

    /**
     * The Test failover state.
     */
    @JsonProperty(value = "testFailoverState")
    private String testFailoverState;

    /**
     * The Test failover state description.
     */
    @JsonProperty(value = "testFailoverStateDescription")
    private String testFailoverStateDescription;

    /**
     * The allowed operations on the Replication protected item.
     */
    @JsonProperty(value = "allowedOperations")
    private List<String> allowedOperations;

    /**
     * The consolidated protection health for the VM taking any issues with SRS
     * as well as all the replication units associated with the VM's
     * replication group into account. This is a string representation of the
     * ProtectionHealth enumeration.
     */
    @JsonProperty(value = "replicationHealth")
    private String replicationHealth;

    /**
     * The consolidated failover health for the VM.
     */
    @JsonProperty(value = "failoverHealth")
    private String failoverHealth;

    /**
     * List of health errors.
     */
    @JsonProperty(value = "healthErrors")
    private List<HealthError> healthErrors;

    /**
     * The ID of Policy governing this PE.
     */
    @JsonProperty(value = "policyId")
    private String policyId;

    /**
     * The name of Policy governing this PE.
     */
    @JsonProperty(value = "policyFriendlyName")
    private String policyFriendlyName;

    /**
     * The Last successful failover time.
     */
    @JsonProperty(value = "lastSuccessfulFailoverTime")
    private DateTime lastSuccessfulFailoverTime;

    /**
     * The Last successful test failover time.
     */
    @JsonProperty(value = "lastSuccessfulTestFailoverTime")
    private DateTime lastSuccessfulTestFailoverTime;

    /**
     * The current scenario.
     */
    @JsonProperty(value = "currentScenario")
    private CurrentScenarioDetails currentScenario;

    /**
     * The recovery point ARM Id to which the Vm was failed over.
     */
    @JsonProperty(value = "failoverRecoveryPointId")
    private String failoverRecoveryPointId;

    /**
     * The Replication provider custom settings.
     */
    @JsonProperty(value = "providerSpecificDetails")
    private ReplicationProviderSpecificSettings providerSpecificDetails;

    /**
     * The recovery container Id.
     */
    @JsonProperty(value = "recoveryContainerId")
    private String recoveryContainerId;

    /**
     * Get the friendlyName value.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName value.
     *
     * @param friendlyName the friendlyName value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the protectedItemType value.
     *
     * @return the protectedItemType value
     */
    public String protectedItemType() {
        return this.protectedItemType;
    }

    /**
     * Set the protectedItemType value.
     *
     * @param protectedItemType the protectedItemType value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withProtectedItemType(String protectedItemType) {
        this.protectedItemType = protectedItemType;
        return this;
    }

    /**
     * Get the protectableItemId value.
     *
     * @return the protectableItemId value
     */
    public String protectableItemId() {
        return this.protectableItemId;
    }

    /**
     * Set the protectableItemId value.
     *
     * @param protectableItemId the protectableItemId value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withProtectableItemId(String protectableItemId) {
        this.protectableItemId = protectableItemId;
        return this;
    }

    /**
     * Get the recoveryServicesProviderId value.
     *
     * @return the recoveryServicesProviderId value
     */
    public String recoveryServicesProviderId() {
        return this.recoveryServicesProviderId;
    }

    /**
     * Set the recoveryServicesProviderId value.
     *
     * @param recoveryServicesProviderId the recoveryServicesProviderId value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withRecoveryServicesProviderId(String recoveryServicesProviderId) {
        this.recoveryServicesProviderId = recoveryServicesProviderId;
        return this;
    }

    /**
     * Get the primaryFabricFriendlyName value.
     *
     * @return the primaryFabricFriendlyName value
     */
    public String primaryFabricFriendlyName() {
        return this.primaryFabricFriendlyName;
    }

    /**
     * Set the primaryFabricFriendlyName value.
     *
     * @param primaryFabricFriendlyName the primaryFabricFriendlyName value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withPrimaryFabricFriendlyName(String primaryFabricFriendlyName) {
        this.primaryFabricFriendlyName = primaryFabricFriendlyName;
        return this;
    }

    /**
     * Get the primaryFabricProvider value.
     *
     * @return the primaryFabricProvider value
     */
    public String primaryFabricProvider() {
        return this.primaryFabricProvider;
    }

    /**
     * Set the primaryFabricProvider value.
     *
     * @param primaryFabricProvider the primaryFabricProvider value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withPrimaryFabricProvider(String primaryFabricProvider) {
        this.primaryFabricProvider = primaryFabricProvider;
        return this;
    }

    /**
     * Get the recoveryFabricFriendlyName value.
     *
     * @return the recoveryFabricFriendlyName value
     */
    public String recoveryFabricFriendlyName() {
        return this.recoveryFabricFriendlyName;
    }

    /**
     * Set the recoveryFabricFriendlyName value.
     *
     * @param recoveryFabricFriendlyName the recoveryFabricFriendlyName value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withRecoveryFabricFriendlyName(String recoveryFabricFriendlyName) {
        this.recoveryFabricFriendlyName = recoveryFabricFriendlyName;
        return this;
    }

    /**
     * Get the recoveryFabricId value.
     *
     * @return the recoveryFabricId value
     */
    public String recoveryFabricId() {
        return this.recoveryFabricId;
    }

    /**
     * Set the recoveryFabricId value.
     *
     * @param recoveryFabricId the recoveryFabricId value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withRecoveryFabricId(String recoveryFabricId) {
        this.recoveryFabricId = recoveryFabricId;
        return this;
    }

    /**
     * Get the primaryProtectionContainerFriendlyName value.
     *
     * @return the primaryProtectionContainerFriendlyName value
     */
    public String primaryProtectionContainerFriendlyName() {
        return this.primaryProtectionContainerFriendlyName;
    }

    /**
     * Set the primaryProtectionContainerFriendlyName value.
     *
     * @param primaryProtectionContainerFriendlyName the primaryProtectionContainerFriendlyName value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withPrimaryProtectionContainerFriendlyName(String primaryProtectionContainerFriendlyName) {
        this.primaryProtectionContainerFriendlyName = primaryProtectionContainerFriendlyName;
        return this;
    }

    /**
     * Get the recoveryProtectionContainerFriendlyName value.
     *
     * @return the recoveryProtectionContainerFriendlyName value
     */
    public String recoveryProtectionContainerFriendlyName() {
        return this.recoveryProtectionContainerFriendlyName;
    }

    /**
     * Set the recoveryProtectionContainerFriendlyName value.
     *
     * @param recoveryProtectionContainerFriendlyName the recoveryProtectionContainerFriendlyName value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withRecoveryProtectionContainerFriendlyName(String recoveryProtectionContainerFriendlyName) {
        this.recoveryProtectionContainerFriendlyName = recoveryProtectionContainerFriendlyName;
        return this;
    }

    /**
     * Get the protectionState value.
     *
     * @return the protectionState value
     */
    public String protectionState() {
        return this.protectionState;
    }

    /**
     * Set the protectionState value.
     *
     * @param protectionState the protectionState value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withProtectionState(String protectionState) {
        this.protectionState = protectionState;
        return this;
    }

    /**
     * Get the protectionStateDescription value.
     *
     * @return the protectionStateDescription value
     */
    public String protectionStateDescription() {
        return this.protectionStateDescription;
    }

    /**
     * Set the protectionStateDescription value.
     *
     * @param protectionStateDescription the protectionStateDescription value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withProtectionStateDescription(String protectionStateDescription) {
        this.protectionStateDescription = protectionStateDescription;
        return this;
    }

    /**
     * Get the activeLocation value.
     *
     * @return the activeLocation value
     */
    public String activeLocation() {
        return this.activeLocation;
    }

    /**
     * Set the activeLocation value.
     *
     * @param activeLocation the activeLocation value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withActiveLocation(String activeLocation) {
        this.activeLocation = activeLocation;
        return this;
    }

    /**
     * Get the testFailoverState value.
     *
     * @return the testFailoverState value
     */
    public String testFailoverState() {
        return this.testFailoverState;
    }

    /**
     * Set the testFailoverState value.
     *
     * @param testFailoverState the testFailoverState value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withTestFailoverState(String testFailoverState) {
        this.testFailoverState = testFailoverState;
        return this;
    }

    /**
     * Get the testFailoverStateDescription value.
     *
     * @return the testFailoverStateDescription value
     */
    public String testFailoverStateDescription() {
        return this.testFailoverStateDescription;
    }

    /**
     * Set the testFailoverStateDescription value.
     *
     * @param testFailoverStateDescription the testFailoverStateDescription value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withTestFailoverStateDescription(String testFailoverStateDescription) {
        this.testFailoverStateDescription = testFailoverStateDescription;
        return this;
    }

    /**
     * Get the allowedOperations value.
     *
     * @return the allowedOperations value
     */
    public List<String> allowedOperations() {
        return this.allowedOperations;
    }

    /**
     * Set the allowedOperations value.
     *
     * @param allowedOperations the allowedOperations value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withAllowedOperations(List<String> allowedOperations) {
        this.allowedOperations = allowedOperations;
        return this;
    }

    /**
     * Get the replicationHealth value.
     *
     * @return the replicationHealth value
     */
    public String replicationHealth() {
        return this.replicationHealth;
    }

    /**
     * Set the replicationHealth value.
     *
     * @param replicationHealth the replicationHealth value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withReplicationHealth(String replicationHealth) {
        this.replicationHealth = replicationHealth;
        return this;
    }

    /**
     * Get the failoverHealth value.
     *
     * @return the failoverHealth value
     */
    public String failoverHealth() {
        return this.failoverHealth;
    }

    /**
     * Set the failoverHealth value.
     *
     * @param failoverHealth the failoverHealth value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withFailoverHealth(String failoverHealth) {
        this.failoverHealth = failoverHealth;
        return this;
    }

    /**
     * Get the healthErrors value.
     *
     * @return the healthErrors value
     */
    public List<HealthError> healthErrors() {
        return this.healthErrors;
    }

    /**
     * Set the healthErrors value.
     *
     * @param healthErrors the healthErrors value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withHealthErrors(List<HealthError> healthErrors) {
        this.healthErrors = healthErrors;
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
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withPolicyId(String policyId) {
        this.policyId = policyId;
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
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withPolicyFriendlyName(String policyFriendlyName) {
        this.policyFriendlyName = policyFriendlyName;
        return this;
    }

    /**
     * Get the lastSuccessfulFailoverTime value.
     *
     * @return the lastSuccessfulFailoverTime value
     */
    public DateTime lastSuccessfulFailoverTime() {
        return this.lastSuccessfulFailoverTime;
    }

    /**
     * Set the lastSuccessfulFailoverTime value.
     *
     * @param lastSuccessfulFailoverTime the lastSuccessfulFailoverTime value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withLastSuccessfulFailoverTime(DateTime lastSuccessfulFailoverTime) {
        this.lastSuccessfulFailoverTime = lastSuccessfulFailoverTime;
        return this;
    }

    /**
     * Get the lastSuccessfulTestFailoverTime value.
     *
     * @return the lastSuccessfulTestFailoverTime value
     */
    public DateTime lastSuccessfulTestFailoverTime() {
        return this.lastSuccessfulTestFailoverTime;
    }

    /**
     * Set the lastSuccessfulTestFailoverTime value.
     *
     * @param lastSuccessfulTestFailoverTime the lastSuccessfulTestFailoverTime value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withLastSuccessfulTestFailoverTime(DateTime lastSuccessfulTestFailoverTime) {
        this.lastSuccessfulTestFailoverTime = lastSuccessfulTestFailoverTime;
        return this;
    }

    /**
     * Get the currentScenario value.
     *
     * @return the currentScenario value
     */
    public CurrentScenarioDetails currentScenario() {
        return this.currentScenario;
    }

    /**
     * Set the currentScenario value.
     *
     * @param currentScenario the currentScenario value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withCurrentScenario(CurrentScenarioDetails currentScenario) {
        this.currentScenario = currentScenario;
        return this;
    }

    /**
     * Get the failoverRecoveryPointId value.
     *
     * @return the failoverRecoveryPointId value
     */
    public String failoverRecoveryPointId() {
        return this.failoverRecoveryPointId;
    }

    /**
     * Set the failoverRecoveryPointId value.
     *
     * @param failoverRecoveryPointId the failoverRecoveryPointId value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withFailoverRecoveryPointId(String failoverRecoveryPointId) {
        this.failoverRecoveryPointId = failoverRecoveryPointId;
        return this;
    }

    /**
     * Get the providerSpecificDetails value.
     *
     * @return the providerSpecificDetails value
     */
    public ReplicationProviderSpecificSettings providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails value.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withProviderSpecificDetails(ReplicationProviderSpecificSettings providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

    /**
     * Get the recoveryContainerId value.
     *
     * @return the recoveryContainerId value
     */
    public String recoveryContainerId() {
        return this.recoveryContainerId;
    }

    /**
     * Set the recoveryContainerId value.
     *
     * @param recoveryContainerId the recoveryContainerId value to set
     * @return the ReplicationProtectedItemProperties object itself.
     */
    public ReplicationProtectedItemProperties withRecoveryContainerId(String recoveryContainerId) {
        this.recoveryContainerId = recoveryContainerId;
        return this;
    }

}