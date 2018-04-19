/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Base class for HyperVReplica policy details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("HyperVReplicaBasePolicyDetails")
public class HyperVReplicaBasePolicyDetails extends PolicyProviderSpecificDetails {
    /**
     * A value indicating the number of recovery points.
     */
    @JsonProperty(value = "recoveryPoints")
    private Integer recoveryPoints;

    /**
     * A value indicating the application consistent frequency.
     */
    @JsonProperty(value = "applicationConsistentSnapshotFrequencyInHours")
    private Integer applicationConsistentSnapshotFrequencyInHours;

    /**
     * A value indicating whether compression has to be enabled.
     */
    @JsonProperty(value = "compression")
    private String compression;

    /**
     * A value indicating whether IR is online.
     */
    @JsonProperty(value = "initialReplicationMethod")
    private String initialReplicationMethod;

    /**
     * A value indicating the online IR start time.
     */
    @JsonProperty(value = "onlineReplicationStartTime")
    private String onlineReplicationStartTime;

    /**
     * A value indicating the offline IR import path.
     */
    @JsonProperty(value = "offlineReplicationImportPath")
    private String offlineReplicationImportPath;

    /**
     * A value indicating the offline IR export path.
     */
    @JsonProperty(value = "offlineReplicationExportPath")
    private String offlineReplicationExportPath;

    /**
     * A value indicating the recovery HTTPS port.
     */
    @JsonProperty(value = "replicationPort")
    private Integer replicationPort;

    /**
     * A value indicating the authentication type.
     */
    @JsonProperty(value = "allowedAuthenticationType")
    private Integer allowedAuthenticationType;

    /**
     * A value indicating whether the VM has to be auto deleted. Supported
     * Values: String.Empty, None, OnRecoveryCloud.
     */
    @JsonProperty(value = "replicaDeletionOption")
    private String replicaDeletionOption;

    /**
     * Get the recoveryPoints value.
     *
     * @return the recoveryPoints value
     */
    public Integer recoveryPoints() {
        return this.recoveryPoints;
    }

    /**
     * Set the recoveryPoints value.
     *
     * @param recoveryPoints the recoveryPoints value to set
     * @return the HyperVReplicaBasePolicyDetails object itself.
     */
    public HyperVReplicaBasePolicyDetails withRecoveryPoints(Integer recoveryPoints) {
        this.recoveryPoints = recoveryPoints;
        return this;
    }

    /**
     * Get the applicationConsistentSnapshotFrequencyInHours value.
     *
     * @return the applicationConsistentSnapshotFrequencyInHours value
     */
    public Integer applicationConsistentSnapshotFrequencyInHours() {
        return this.applicationConsistentSnapshotFrequencyInHours;
    }

    /**
     * Set the applicationConsistentSnapshotFrequencyInHours value.
     *
     * @param applicationConsistentSnapshotFrequencyInHours the applicationConsistentSnapshotFrequencyInHours value to set
     * @return the HyperVReplicaBasePolicyDetails object itself.
     */
    public HyperVReplicaBasePolicyDetails withApplicationConsistentSnapshotFrequencyInHours(Integer applicationConsistentSnapshotFrequencyInHours) {
        this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
        return this;
    }

    /**
     * Get the compression value.
     *
     * @return the compression value
     */
    public String compression() {
        return this.compression;
    }

    /**
     * Set the compression value.
     *
     * @param compression the compression value to set
     * @return the HyperVReplicaBasePolicyDetails object itself.
     */
    public HyperVReplicaBasePolicyDetails withCompression(String compression) {
        this.compression = compression;
        return this;
    }

    /**
     * Get the initialReplicationMethod value.
     *
     * @return the initialReplicationMethod value
     */
    public String initialReplicationMethod() {
        return this.initialReplicationMethod;
    }

    /**
     * Set the initialReplicationMethod value.
     *
     * @param initialReplicationMethod the initialReplicationMethod value to set
     * @return the HyperVReplicaBasePolicyDetails object itself.
     */
    public HyperVReplicaBasePolicyDetails withInitialReplicationMethod(String initialReplicationMethod) {
        this.initialReplicationMethod = initialReplicationMethod;
        return this;
    }

    /**
     * Get the onlineReplicationStartTime value.
     *
     * @return the onlineReplicationStartTime value
     */
    public String onlineReplicationStartTime() {
        return this.onlineReplicationStartTime;
    }

    /**
     * Set the onlineReplicationStartTime value.
     *
     * @param onlineReplicationStartTime the onlineReplicationStartTime value to set
     * @return the HyperVReplicaBasePolicyDetails object itself.
     */
    public HyperVReplicaBasePolicyDetails withOnlineReplicationStartTime(String onlineReplicationStartTime) {
        this.onlineReplicationStartTime = onlineReplicationStartTime;
        return this;
    }

    /**
     * Get the offlineReplicationImportPath value.
     *
     * @return the offlineReplicationImportPath value
     */
    public String offlineReplicationImportPath() {
        return this.offlineReplicationImportPath;
    }

    /**
     * Set the offlineReplicationImportPath value.
     *
     * @param offlineReplicationImportPath the offlineReplicationImportPath value to set
     * @return the HyperVReplicaBasePolicyDetails object itself.
     */
    public HyperVReplicaBasePolicyDetails withOfflineReplicationImportPath(String offlineReplicationImportPath) {
        this.offlineReplicationImportPath = offlineReplicationImportPath;
        return this;
    }

    /**
     * Get the offlineReplicationExportPath value.
     *
     * @return the offlineReplicationExportPath value
     */
    public String offlineReplicationExportPath() {
        return this.offlineReplicationExportPath;
    }

    /**
     * Set the offlineReplicationExportPath value.
     *
     * @param offlineReplicationExportPath the offlineReplicationExportPath value to set
     * @return the HyperVReplicaBasePolicyDetails object itself.
     */
    public HyperVReplicaBasePolicyDetails withOfflineReplicationExportPath(String offlineReplicationExportPath) {
        this.offlineReplicationExportPath = offlineReplicationExportPath;
        return this;
    }

    /**
     * Get the replicationPort value.
     *
     * @return the replicationPort value
     */
    public Integer replicationPort() {
        return this.replicationPort;
    }

    /**
     * Set the replicationPort value.
     *
     * @param replicationPort the replicationPort value to set
     * @return the HyperVReplicaBasePolicyDetails object itself.
     */
    public HyperVReplicaBasePolicyDetails withReplicationPort(Integer replicationPort) {
        this.replicationPort = replicationPort;
        return this;
    }

    /**
     * Get the allowedAuthenticationType value.
     *
     * @return the allowedAuthenticationType value
     */
    public Integer allowedAuthenticationType() {
        return this.allowedAuthenticationType;
    }

    /**
     * Set the allowedAuthenticationType value.
     *
     * @param allowedAuthenticationType the allowedAuthenticationType value to set
     * @return the HyperVReplicaBasePolicyDetails object itself.
     */
    public HyperVReplicaBasePolicyDetails withAllowedAuthenticationType(Integer allowedAuthenticationType) {
        this.allowedAuthenticationType = allowedAuthenticationType;
        return this;
    }

    /**
     * Get the replicaDeletionOption value.
     *
     * @return the replicaDeletionOption value
     */
    public String replicaDeletionOption() {
        return this.replicaDeletionOption;
    }

    /**
     * Set the replicaDeletionOption value.
     *
     * @param replicaDeletionOption the replicaDeletionOption value to set
     * @return the HyperVReplicaBasePolicyDetails object itself.
     */
    public HyperVReplicaBasePolicyDetails withReplicaDeletionOption(String replicaDeletionOption) {
        this.replicaDeletionOption = replicaDeletionOption;
        return this;
    }

}