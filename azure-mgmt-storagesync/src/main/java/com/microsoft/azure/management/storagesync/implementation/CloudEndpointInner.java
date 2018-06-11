/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Cloud Endpoint object.
 */
@JsonFlatten
public class CloudEndpointInner extends ProxyResource {
    /**
     * Storage Account access key.
     */
    @JsonProperty(value = "properties.storageAccountKey")
    private String storageAccountKey;

    /**
     * Storage Account name.
     */
    @JsonProperty(value = "properties.storageAccount")
    private String storageAccount;

    /**
     * Storage Account Resource Id.
     */
    @JsonProperty(value = "properties.storageAccountResourceId")
    private String storageAccountResourceId;

    /**
     * Storage Account Share name.
     */
    @JsonProperty(value = "properties.storageAccountShareName")
    private String storageAccountShareName;

    /**
     * Storage Account Tenant Id.
     */
    @JsonProperty(value = "properties.storageAccountTenantId")
    private String storageAccountTenantId;

    /**
     * Partnership Id.
     */
    @JsonProperty(value = "properties.partnershipId")
    private String partnershipId;

    /**
     * Friendly Name.
     */
    @JsonProperty(value = "properties.friendlyName")
    private String friendlyName;

    /**
     * Backup Enabled.
     */
    @JsonProperty(value = "properties.backupEnabled")
    private Boolean backupEnabled;

    /**
     * CloudEndpoint Provisioning State.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * CloudEndpoint lastWorkflowId.
     */
    @JsonProperty(value = "properties.lastWorkflowId")
    private String lastWorkflowId;

    /**
     * Get storage Account access key.
     *
     * @return the storageAccountKey value
     */
    public String storageAccountKey() {
        return this.storageAccountKey;
    }

    /**
     * Set storage Account access key.
     *
     * @param storageAccountKey the storageAccountKey value to set
     * @return the CloudEndpointInner object itself.
     */
    public CloudEndpointInner withStorageAccountKey(String storageAccountKey) {
        this.storageAccountKey = storageAccountKey;
        return this;
    }

    /**
     * Get storage Account name.
     *
     * @return the storageAccount value
     */
    public String storageAccount() {
        return this.storageAccount;
    }

    /**
     * Set storage Account name.
     *
     * @param storageAccount the storageAccount value to set
     * @return the CloudEndpointInner object itself.
     */
    public CloudEndpointInner withStorageAccount(String storageAccount) {
        this.storageAccount = storageAccount;
        return this;
    }

    /**
     * Get storage Account Resource Id.
     *
     * @return the storageAccountResourceId value
     */
    public String storageAccountResourceId() {
        return this.storageAccountResourceId;
    }

    /**
     * Set storage Account Resource Id.
     *
     * @param storageAccountResourceId the storageAccountResourceId value to set
     * @return the CloudEndpointInner object itself.
     */
    public CloudEndpointInner withStorageAccountResourceId(String storageAccountResourceId) {
        this.storageAccountResourceId = storageAccountResourceId;
        return this;
    }

    /**
     * Get storage Account Share name.
     *
     * @return the storageAccountShareName value
     */
    public String storageAccountShareName() {
        return this.storageAccountShareName;
    }

    /**
     * Set storage Account Share name.
     *
     * @param storageAccountShareName the storageAccountShareName value to set
     * @return the CloudEndpointInner object itself.
     */
    public CloudEndpointInner withStorageAccountShareName(String storageAccountShareName) {
        this.storageAccountShareName = storageAccountShareName;
        return this;
    }

    /**
     * Get storage Account Tenant Id.
     *
     * @return the storageAccountTenantId value
     */
    public String storageAccountTenantId() {
        return this.storageAccountTenantId;
    }

    /**
     * Set storage Account Tenant Id.
     *
     * @param storageAccountTenantId the storageAccountTenantId value to set
     * @return the CloudEndpointInner object itself.
     */
    public CloudEndpointInner withStorageAccountTenantId(String storageAccountTenantId) {
        this.storageAccountTenantId = storageAccountTenantId;
        return this;
    }

    /**
     * Get partnership Id.
     *
     * @return the partnershipId value
     */
    public String partnershipId() {
        return this.partnershipId;
    }

    /**
     * Set partnership Id.
     *
     * @param partnershipId the partnershipId value to set
     * @return the CloudEndpointInner object itself.
     */
    public CloudEndpointInner withPartnershipId(String partnershipId) {
        this.partnershipId = partnershipId;
        return this;
    }

    /**
     * Get friendly Name.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly Name.
     *
     * @param friendlyName the friendlyName value to set
     * @return the CloudEndpointInner object itself.
     */
    public CloudEndpointInner withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get backup Enabled.
     *
     * @return the backupEnabled value
     */
    public Boolean backupEnabled() {
        return this.backupEnabled;
    }

    /**
     * Set backup Enabled.
     *
     * @param backupEnabled the backupEnabled value to set
     * @return the CloudEndpointInner object itself.
     */
    public CloudEndpointInner withBackupEnabled(Boolean backupEnabled) {
        this.backupEnabled = backupEnabled;
        return this;
    }

    /**
     * Get cloudEndpoint Provisioning State.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set cloudEndpoint Provisioning State.
     *
     * @param provisioningState the provisioningState value to set
     * @return the CloudEndpointInner object itself.
     */
    public CloudEndpointInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get cloudEndpoint lastWorkflowId.
     *
     * @return the lastWorkflowId value
     */
    public String lastWorkflowId() {
        return this.lastWorkflowId;
    }

    /**
     * Set cloudEndpoint lastWorkflowId.
     *
     * @param lastWorkflowId the lastWorkflowId value to set
     * @return the CloudEndpointInner object itself.
     */
    public CloudEndpointInner withLastWorkflowId(String lastWorkflowId) {
        this.lastWorkflowId = lastWorkflowId;
        return this;
    }

}
