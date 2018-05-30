/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01.implementation;

import com.microsoft.azure.management.network.v20171001.RetentionPolicyParameters;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Information on the configuration of flow log.
 */
@JsonFlatten
public class FlowLogInformationInner {
    /**
     * The ID of the resource to configure for flow logging.
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /**
     * ID of the storage account which is used to store the flow log.
     */
    @JsonProperty(value = "properties.storageId", required = true)
    private String storageId;

    /**
     * Flag to enable/disable flow logging.
     */
    @JsonProperty(value = "properties.enabled", required = true)
    private boolean enabled;

    /**
     * The retentionPolicy property.
     */
    @JsonProperty(value = "properties.retentionPolicy")
    private RetentionPolicyParameters retentionPolicy;

    /**
     * Get the ID of the resource to configure for flow logging.
     *
     * @return the targetResourceId value
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the ID of the resource to configure for flow logging.
     *
     * @param targetResourceId the targetResourceId value to set
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get iD of the storage account which is used to store the flow log.
     *
     * @return the storageId value
     */
    public String storageId() {
        return this.storageId;
    }

    /**
     * Set iD of the storage account which is used to store the flow log.
     *
     * @param storageId the storageId value to set
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withStorageId(String storageId) {
        this.storageId = storageId;
        return this;
    }

    /**
     * Get flag to enable/disable flow logging.
     *
     * @return the enabled value
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set flag to enable/disable flow logging.
     *
     * @param enabled the enabled value to set
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the retentionPolicy value.
     *
     * @return the retentionPolicy value
     */
    public RetentionPolicyParameters retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy value.
     *
     * @param retentionPolicy the retentionPolicy value to set
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withRetentionPolicy(RetentionPolicyParameters retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

}
