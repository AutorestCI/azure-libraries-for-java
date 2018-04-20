/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the backup suspension details.
 */
public class BackupSuspensionInfo {
    /**
     * Indicates whether periodic backup is suspended at this level or not.
     */
    @JsonProperty(value = "IsSuspended")
    private Boolean isSuspended;

    /**
     * Specifies the scope at which the backup suspension was applied. Possible
     * values include: 'Invalid', 'Partition', 'Service', 'Application'.
     */
    @JsonProperty(value = "SuspensionInheritedFrom")
    private BackupSuspensionScope suspensionInheritedFrom;

    /**
     * Get the isSuspended value.
     *
     * @return the isSuspended value
     */
    public Boolean isSuspended() {
        return this.isSuspended;
    }

    /**
     * Set the isSuspended value.
     *
     * @param isSuspended the isSuspended value to set
     * @return the BackupSuspensionInfo object itself.
     */
    public BackupSuspensionInfo withIsSuspended(Boolean isSuspended) {
        this.isSuspended = isSuspended;
        return this;
    }

    /**
     * Get the suspensionInheritedFrom value.
     *
     * @return the suspensionInheritedFrom value
     */
    public BackupSuspensionScope suspensionInheritedFrom() {
        return this.suspensionInheritedFrom;
    }

    /**
     * Set the suspensionInheritedFrom value.
     *
     * @param suspensionInheritedFrom the suspensionInheritedFrom value to set
     * @return the BackupSuspensionInfo object itself.
     */
    public BackupSuspensionInfo withSuspensionInheritedFrom(BackupSuspensionScope suspensionInheritedFrom) {
        this.suspensionInheritedFrom = suspensionInheritedFrom;
        return this;
    }

}
