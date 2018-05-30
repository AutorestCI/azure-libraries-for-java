/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_02_01.implementation;

import com.microsoft.azure.management.storage.v20180201.Kind;
import com.microsoft.azure.management.storage.v20180201.Identity;
import com.microsoft.azure.management.storage.v20180201.ProvisioningState;
import com.microsoft.azure.management.storage.v20180201.Endpoints;
import com.microsoft.azure.management.storage.v20180201.AccountStatus;
import org.joda.time.DateTime;
import com.microsoft.azure.management.storage.v20180201.CustomDomain;
import com.microsoft.azure.management.storage.v20180201.Encryption;
import com.microsoft.azure.management.storage.v20180201.AccessTier;
import com.microsoft.azure.management.storage.v20180201.NetworkRuleSet;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The storage account.
 */
@JsonFlatten
public class StorageAccountInner extends TrackedResourceInner {
    /**
     * Gets the SKU.
     */
    @JsonProperty(value = "sku", access = JsonProperty.Access.WRITE_ONLY)
    private SkuInner sku;

    /**
     * Gets the Kind. Possible values include: 'Storage', 'StorageV2',
     * 'BlobStorage'.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private Kind kind;

    /**
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /**
     * Gets the status of the storage account at the time the operation was
     * called. Possible values include: 'Creating', 'ResolvingDNS',
     * 'Succeeded'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Gets the URLs that are used to perform a retrieval of a public blob,
     * queue, or table object. Note that Standard_ZRS and Premium_LRS accounts
     * only return the blob endpoint.
     */
    @JsonProperty(value = "properties.primaryEndpoints", access = JsonProperty.Access.WRITE_ONLY)
    private Endpoints primaryEndpoints;

    /**
     * Gets the location of the primary data center for the storage account.
     */
    @JsonProperty(value = "properties.primaryLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryLocation;

    /**
     * Gets the status indicating whether the primary location of the storage
     * account is available or unavailable. Possible values include:
     * 'available', 'unavailable'.
     */
    @JsonProperty(value = "properties.statusOfPrimary", access = JsonProperty.Access.WRITE_ONLY)
    private AccountStatus statusOfPrimary;

    /**
     * Gets the timestamp of the most recent instance of a failover to the
     * secondary location. Only the most recent timestamp is retained. This
     * element is not returned if there has never been a failover instance.
     * Only available if the accountType is Standard_GRS or Standard_RAGRS.
     */
    @JsonProperty(value = "properties.lastGeoFailoverTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastGeoFailoverTime;

    /**
     * Gets the location of the geo-replicated secondary for the storage
     * account. Only available if the accountType is Standard_GRS or
     * Standard_RAGRS.
     */
    @JsonProperty(value = "properties.secondaryLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String secondaryLocation;

    /**
     * Gets the status indicating whether the secondary location of the storage
     * account is available or unavailable. Only available if the SKU name is
     * Standard_GRS or Standard_RAGRS. Possible values include: 'available',
     * 'unavailable'.
     */
    @JsonProperty(value = "properties.statusOfSecondary", access = JsonProperty.Access.WRITE_ONLY)
    private AccountStatus statusOfSecondary;

    /**
     * Gets the creation date and time of the storage account in UTC.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationTime;

    /**
     * Gets the custom domain the user assigned to this storage account.
     */
    @JsonProperty(value = "properties.customDomain", access = JsonProperty.Access.WRITE_ONLY)
    private CustomDomain customDomain;

    /**
     * Gets the URLs that are used to perform a retrieval of a public blob,
     * queue, or table object from the secondary location of the storage
     * account. Only available if the SKU name is Standard_RAGRS.
     */
    @JsonProperty(value = "properties.secondaryEndpoints", access = JsonProperty.Access.WRITE_ONLY)
    private Endpoints secondaryEndpoints;

    /**
     * Gets the encryption settings on the account. If unspecified, the account
     * is unencrypted.
     */
    @JsonProperty(value = "properties.encryption", access = JsonProperty.Access.WRITE_ONLY)
    private Encryption encryption;

    /**
     * Required for storage accounts where kind = BlobStorage. The access tier
     * used for billing. Possible values include: 'Hot', 'Cool'.
     */
    @JsonProperty(value = "properties.accessTier", access = JsonProperty.Access.WRITE_ONLY)
    private AccessTier accessTier;

    /**
     * Allows https traffic only to storage service if sets to true.
     */
    @JsonProperty(value = "properties.supportsHttpsTrafficOnly")
    private Boolean enableHttpsTrafficOnly;

    /**
     * Network rule set.
     */
    @JsonProperty(value = "properties.networkAcls", access = JsonProperty.Access.WRITE_ONLY)
    private NetworkRuleSet networkRuleSet;

    /**
     * Get gets the SKU.
     *
     * @return the sku value
     */
    public SkuInner sku() {
        return this.sku;
    }

    /**
     * Get gets the Kind. Possible values include: 'Storage', 'StorageV2', 'BlobStorage'.
     *
     * @return the kind value
     */
    public Kind kind() {
        return this.kind;
    }

    /**
     * Get the identity of the resource.
     *
     * @return the identity value
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity of the resource.
     *
     * @param identity the identity value to set
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get gets the status of the storage account at the time the operation was called. Possible values include: 'Creating', 'ResolvingDNS', 'Succeeded'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get gets the URLs that are used to perform a retrieval of a public blob, queue, or table object. Note that Standard_ZRS and Premium_LRS accounts only return the blob endpoint.
     *
     * @return the primaryEndpoints value
     */
    public Endpoints primaryEndpoints() {
        return this.primaryEndpoints;
    }

    /**
     * Get gets the location of the primary data center for the storage account.
     *
     * @return the primaryLocation value
     */
    public String primaryLocation() {
        return this.primaryLocation;
    }

    /**
     * Get gets the status indicating whether the primary location of the storage account is available or unavailable. Possible values include: 'available', 'unavailable'.
     *
     * @return the statusOfPrimary value
     */
    public AccountStatus statusOfPrimary() {
        return this.statusOfPrimary;
    }

    /**
     * Get gets the timestamp of the most recent instance of a failover to the secondary location. Only the most recent timestamp is retained. This element is not returned if there has never been a failover instance. Only available if the accountType is Standard_GRS or Standard_RAGRS.
     *
     * @return the lastGeoFailoverTime value
     */
    public DateTime lastGeoFailoverTime() {
        return this.lastGeoFailoverTime;
    }

    /**
     * Get gets the location of the geo-replicated secondary for the storage account. Only available if the accountType is Standard_GRS or Standard_RAGRS.
     *
     * @return the secondaryLocation value
     */
    public String secondaryLocation() {
        return this.secondaryLocation;
    }

    /**
     * Get gets the status indicating whether the secondary location of the storage account is available or unavailable. Only available if the SKU name is Standard_GRS or Standard_RAGRS. Possible values include: 'available', 'unavailable'.
     *
     * @return the statusOfSecondary value
     */
    public AccountStatus statusOfSecondary() {
        return this.statusOfSecondary;
    }

    /**
     * Get gets the creation date and time of the storage account in UTC.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get gets the custom domain the user assigned to this storage account.
     *
     * @return the customDomain value
     */
    public CustomDomain customDomain() {
        return this.customDomain;
    }

    /**
     * Get gets the URLs that are used to perform a retrieval of a public blob, queue, or table object from the secondary location of the storage account. Only available if the SKU name is Standard_RAGRS.
     *
     * @return the secondaryEndpoints value
     */
    public Endpoints secondaryEndpoints() {
        return this.secondaryEndpoints;
    }

    /**
     * Get gets the encryption settings on the account. If unspecified, the account is unencrypted.
     *
     * @return the encryption value
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Get required for storage accounts where kind = BlobStorage. The access tier used for billing. Possible values include: 'Hot', 'Cool'.
     *
     * @return the accessTier value
     */
    public AccessTier accessTier() {
        return this.accessTier;
    }

    /**
     * Get allows https traffic only to storage service if sets to true.
     *
     * @return the enableHttpsTrafficOnly value
     */
    public Boolean enableHttpsTrafficOnly() {
        return this.enableHttpsTrafficOnly;
    }

    /**
     * Set allows https traffic only to storage service if sets to true.
     *
     * @param enableHttpsTrafficOnly the enableHttpsTrafficOnly value to set
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly) {
        this.enableHttpsTrafficOnly = enableHttpsTrafficOnly;
        return this;
    }

    /**
     * Get network rule set.
     *
     * @return the networkRuleSet value
     */
    public NetworkRuleSet networkRuleSet() {
        return this.networkRuleSet;
    }

}
