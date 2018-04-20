/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import com.microsoft.azure.servicefabric.RestoreState;
import org.joda.time.DateTime;
import com.microsoft.azure.servicefabric.BackupEpoch;
import com.microsoft.azure.servicefabric.FabricErrorError;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the progress of a restore operation on a partition.
 */
public class RestoreProgressInfoInner {
    /**
     * Represents the current state of the partition restore operation.
     * Possible values include: 'Invalid', 'Accepted', 'RestoreInProgress',
     * 'Success', 'Failure', 'Timeout'.
     */
    @JsonProperty(value = "RestoreState")
    private RestoreState restoreState;

    /**
     * Timestamp when operation succeeded or failed.
     */
    @JsonProperty(value = "TimeStampUtc")
    private DateTime timeStampUtc;

    /**
     * Describes the epoch at which the partition is restored.
     */
    @JsonProperty(value = "RestoredEpoch")
    private BackupEpoch restoredEpoch;

    /**
     * Restored LSN.
     */
    @JsonProperty(value = "RestoredLsn")
    private String restoredLsn;

    /**
     * Denotes the failure encountered in performing restore operation.
     */
    @JsonProperty(value = "FailureError")
    private FabricErrorError failureError;

    /**
     * Get the restoreState value.
     *
     * @return the restoreState value
     */
    public RestoreState restoreState() {
        return this.restoreState;
    }

    /**
     * Set the restoreState value.
     *
     * @param restoreState the restoreState value to set
     * @return the RestoreProgressInfoInner object itself.
     */
    public RestoreProgressInfoInner withRestoreState(RestoreState restoreState) {
        this.restoreState = restoreState;
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
     * @return the RestoreProgressInfoInner object itself.
     */
    public RestoreProgressInfoInner withTimeStampUtc(DateTime timeStampUtc) {
        this.timeStampUtc = timeStampUtc;
        return this;
    }

    /**
     * Get the restoredEpoch value.
     *
     * @return the restoredEpoch value
     */
    public BackupEpoch restoredEpoch() {
        return this.restoredEpoch;
    }

    /**
     * Set the restoredEpoch value.
     *
     * @param restoredEpoch the restoredEpoch value to set
     * @return the RestoreProgressInfoInner object itself.
     */
    public RestoreProgressInfoInner withRestoredEpoch(BackupEpoch restoredEpoch) {
        this.restoredEpoch = restoredEpoch;
        return this;
    }

    /**
     * Get the restoredLsn value.
     *
     * @return the restoredLsn value
     */
    public String restoredLsn() {
        return this.restoredLsn;
    }

    /**
     * Set the restoredLsn value.
     *
     * @param restoredLsn the restoredLsn value to set
     * @return the RestoreProgressInfoInner object itself.
     */
    public RestoreProgressInfoInner withRestoredLsn(String restoredLsn) {
        this.restoredLsn = restoredLsn;
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
     * @return the RestoreProgressInfoInner object itself.
     */
    public RestoreProgressInfoInner withFailureError(FabricErrorError failureError) {
        this.failureError = failureError;
        return this;
    }

}
