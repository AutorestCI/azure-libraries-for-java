/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Describes the backup configuration information.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("BackupConfigurationInfo")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Application", value = ApplicationBackupConfigurationInfo.class),
    @JsonSubTypes.Type(name = "Service", value = ServiceBackupConfigurationInfo.class),
    @JsonSubTypes.Type(name = "Partition", value = PartitionBackupConfigurationInfoInner.class)
})
public class BackupConfigurationInfo {
    /**
     * The name of the backup policy which is applicable to this Service Fabric
     * application or service or partition.
     */
    @JsonProperty(value = "PolicyName")
    private String policyName;

    /**
     * Specifies the scope at which the backup policy is applied. Possible
     * values include: 'Invalid', 'Partition', 'Service', 'Application'.
     */
    @JsonProperty(value = "PolicyInheritedFrom")
    private BackupPolicyScope policyInheritedFrom;

    /**
     * Describes the backup suspension details.
     */
    @JsonProperty(value = "SuspensionInfo")
    private BackupSuspensionInfo suspensionInfo;

    /**
     * Get the policyName value.
     *
     * @return the policyName value
     */
    public String policyName() {
        return this.policyName;
    }

    /**
     * Set the policyName value.
     *
     * @param policyName the policyName value to set
     * @return the BackupConfigurationInfo object itself.
     */
    public BackupConfigurationInfo withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * Get the policyInheritedFrom value.
     *
     * @return the policyInheritedFrom value
     */
    public BackupPolicyScope policyInheritedFrom() {
        return this.policyInheritedFrom;
    }

    /**
     * Set the policyInheritedFrom value.
     *
     * @param policyInheritedFrom the policyInheritedFrom value to set
     * @return the BackupConfigurationInfo object itself.
     */
    public BackupConfigurationInfo withPolicyInheritedFrom(BackupPolicyScope policyInheritedFrom) {
        this.policyInheritedFrom = policyInheritedFrom;
        return this;
    }

    /**
     * Get the suspensionInfo value.
     *
     * @return the suspensionInfo value
     */
    public BackupSuspensionInfo suspensionInfo() {
        return this.suspensionInfo;
    }

    /**
     * Set the suspensionInfo value.
     *
     * @param suspensionInfo the suspensionInfo value to set
     * @return the BackupConfigurationInfo object itself.
     */
    public BackupConfigurationInfo withSuspensionInfo(BackupSuspensionInfo suspensionInfo) {
        this.suspensionInfo = suspensionInfo;
        return this;
    }

}
