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
 * Hyper-V Replica Azure specific protection profile details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("HyperVReplicaAzure")
public class HyperVReplicaAzurePolicyDetails extends PolicyProviderSpecificDetails {
    /**
     * The duration (in hours) to which point the recovery history needs to be
     * maintained.
     */
    @JsonProperty(value = "recoveryPointHistoryDurationInHours")
    private Integer recoveryPointHistoryDurationInHours;

    /**
     * The interval (in hours) at which Hyper-V Replica should create an
     * application consistent snapshot within the VM.
     */
    @JsonProperty(value = "applicationConsistentSnapshotFrequencyInHours")
    private Integer applicationConsistentSnapshotFrequencyInHours;

    /**
     * The replication interval.
     */
    @JsonProperty(value = "replicationInterval")
    private Integer replicationInterval;

    /**
     * The scheduled start time for the initial replication. If this parameter
     * is Null, the initial replication starts immediately.
     */
    @JsonProperty(value = "onlineReplicationStartTime")
    private String onlineReplicationStartTime;

    /**
     * A value indicating whether encryption is enabled for virtual machines in
     * this cloud.
     */
    @JsonProperty(value = "encryption")
    private String encryption;

    /**
     * The active storage account Id.
     */
    @JsonProperty(value = "activeStorageAccountId")
    private String activeStorageAccountId;

    /**
     * Get the recoveryPointHistoryDurationInHours value.
     *
     * @return the recoveryPointHistoryDurationInHours value
     */
    public Integer recoveryPointHistoryDurationInHours() {
        return this.recoveryPointHistoryDurationInHours;
    }

    /**
     * Set the recoveryPointHistoryDurationInHours value.
     *
     * @param recoveryPointHistoryDurationInHours the recoveryPointHistoryDurationInHours value to set
     * @return the HyperVReplicaAzurePolicyDetails object itself.
     */
    public HyperVReplicaAzurePolicyDetails withRecoveryPointHistoryDurationInHours(Integer recoveryPointHistoryDurationInHours) {
        this.recoveryPointHistoryDurationInHours = recoveryPointHistoryDurationInHours;
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
     * @return the HyperVReplicaAzurePolicyDetails object itself.
     */
    public HyperVReplicaAzurePolicyDetails withApplicationConsistentSnapshotFrequencyInHours(Integer applicationConsistentSnapshotFrequencyInHours) {
        this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
        return this;
    }

    /**
     * Get the replicationInterval value.
     *
     * @return the replicationInterval value
     */
    public Integer replicationInterval() {
        return this.replicationInterval;
    }

    /**
     * Set the replicationInterval value.
     *
     * @param replicationInterval the replicationInterval value to set
     * @return the HyperVReplicaAzurePolicyDetails object itself.
     */
    public HyperVReplicaAzurePolicyDetails withReplicationInterval(Integer replicationInterval) {
        this.replicationInterval = replicationInterval;
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
     * @return the HyperVReplicaAzurePolicyDetails object itself.
     */
    public HyperVReplicaAzurePolicyDetails withOnlineReplicationStartTime(String onlineReplicationStartTime) {
        this.onlineReplicationStartTime = onlineReplicationStartTime;
        return this;
    }

    /**
     * Get the encryption value.
     *
     * @return the encryption value
     */
    public String encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption value.
     *
     * @param encryption the encryption value to set
     * @return the HyperVReplicaAzurePolicyDetails object itself.
     */
    public HyperVReplicaAzurePolicyDetails withEncryption(String encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the activeStorageAccountId value.
     *
     * @return the activeStorageAccountId value
     */
    public String activeStorageAccountId() {
        return this.activeStorageAccountId;
    }

    /**
     * Set the activeStorageAccountId value.
     *
     * @param activeStorageAccountId the activeStorageAccountId value to set
     * @return the HyperVReplicaAzurePolicyDetails object itself.
     */
    public HyperVReplicaAzurePolicyDetails withActiveStorageAccountId(String activeStorageAccountId) {
        this.activeStorageAccountId = activeStorageAccountId;
        return this;
    }

}