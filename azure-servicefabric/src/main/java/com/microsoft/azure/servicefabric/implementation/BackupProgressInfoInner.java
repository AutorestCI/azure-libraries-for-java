/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import com.microsoft.azure.servicefabric.BackupState;
import org.joda.time.DateTime;
import java.util.UUID;
import com.microsoft.azure.servicefabric.BackupEpoch;
import com.microsoft.azure.servicefabric.FabricErrorError;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the progress of a partition's backup.
 */
public class BackupProgressInfoInner {
    /**
     * Represents the current state of the partition backup operation. Possible
     * values include: 'Invalid', 'Accepted', 'BackupInProgress', 'Success',
     * 'Failure', 'Timeout'.
     */
    @JsonProperty(value = "BackupState")
    private BackupState backupState;

    /**
     * TimeStamp in UTC when operation succeeded or failed.
     */
    @JsonProperty(value = "TimeStampUtc")
    private DateTime timeStampUtc;

    /**
     * Unique ID of the newly created backup.
     */
    @JsonProperty(value = "BackupId")
    private UUID backupId;

    /**
     * Location, relative to the backup store, of the newly created backup.
     */
    @JsonProperty(value = "BackupLocation")
    private String backupLocation;

    /**
     * Specifies the epoch of the last record included in backup.
     */
    @JsonProperty(value = "EpochOfLastBackupRecord")
    private BackupEpoch epochOfLastBackupRecord;

    /**
     * The LSN of last record included in backup.
     */
    @JsonProperty(value = "LsnOfLastBackupRecord")
    private String lsnOfLastBackupRecord;

    /**
     * Denotes the failure encountered in performing backup operation.
     */
    @JsonProperty(value = "FailureError")
    private FabricErrorError failureError;

    /**
     * Get the backupState value.
     *
     * @return the backupState value
     */
    public BackupState backupState() {
        return this.backupState;
    }

    /**
     * Set the backupState value.
     *
     * @param backupState the backupState value to set
     * @return the BackupProgressInfoInner object itself.
     */
    public BackupProgressInfoInner withBackupState(BackupState backupState) {
        this.backupState = backupState;
        return this;
    }

    /**
     * Get the timeStampUtc value.
     *
     * @return the timeStampUtc value
     */
    public DateTime timeStampUtc() {
        return this.timeStampUtc;
    }

    /**
     * Set the timeStampUtc value.
     *
     * @param timeStampUtc the timeStampUtc value to set
     * @return the BackupProgressInfoInner object itself.
     */
    public BackupProgressInfoInner withTimeStampUtc(DateTime timeStampUtc) {
        this.timeStampUtc = timeStampUtc;
        return this;
    }

    /**
     * Get the backupId value.
     *
     * @return the backupId value
     */
    public UUID backupId() {
        return this.backupId;
    }

    /**
     * Set the backupId value.
     *
     * @param backupId the backupId value to set
     * @return the BackupProgressInfoInner object itself.
     */
    public BackupProgressInfoInner withBackupId(UUID backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * Get the backupLocation value.
     *
     * @return the backupLocation value
     */
    public String backupLocation() {
        return this.backupLocation;
    }

    /**
     * Set the backupLocation value.
     *
     * @param backupLocation the backupLocation value to set
     * @return the BackupProgressInfoInner object itself.
     */
    public BackupProgressInfoInner withBackupLocation(String backupLocation) {
        this.backupLocation = backupLocation;
        return this;
    }

    /**
     * Get the epochOfLastBackupRecord value.
     *
     * @return the epochOfLastBackupRecord value
     */
    public BackupEpoch epochOfLastBackupRecord() {
        return this.epochOfLastBackupRecord;
    }

    /**
     * Set the epochOfLastBackupRecord value.
     *
     * @param epochOfLastBackupRecord the epochOfLastBackupRecord value to set
     * @return the BackupProgressInfoInner object itself.
     */
    public BackupProgressInfoInner withEpochOfLastBackupRecord(BackupEpoch epochOfLastBackupRecord) {
        this.epochOfLastBackupRecord = epochOfLastBackupRecord;
        return this;
    }

    /**
     * Get the lsnOfLastBackupRecord value.
     *
     * @return the lsnOfLastBackupRecord value
     */
    public String lsnOfLastBackupRecord() {
        return this.lsnOfLastBackupRecord;
    }

    /**
     * Set the lsnOfLastBackupRecord value.
     *
     * @param lsnOfLastBackupRecord the lsnOfLastBackupRecord value to set
     * @return the BackupProgressInfoInner object itself.
     */
    public BackupProgressInfoInner withLsnOfLastBackupRecord(String lsnOfLastBackupRecord) {
        this.lsnOfLastBackupRecord = lsnOfLastBackupRecord;
        return this;
    }

    /**
     * Get the failureError value.
     *
     * @return the failureError value
     */
    public FabricErrorError failureError() {
        return this.failureError;
    }

    /**
     * Set the failureError value.
     *
     * @param failureError the failureError value to set
     * @return the BackupProgressInfoInner object itself.
     */
    public BackupProgressInfoInner withFailureError(FabricErrorError failureError) {
        this.failureError = failureError;
        return this;
    }

}
