/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_02_01;

import com.microsoft.azure.management.storage.v20180201.implementation.SkuInner;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters used when creating a storage account.
 */
@JsonFlatten
public class StorageAccountCreateParameters {
    /**
     * Required. Gets or sets the sku name.
     */
    @JsonProperty(value = "sku", required = true)
    private SkuInner sku;

    /**
     * Required. Indicates the type of storage account. Possible values
     * include: 'Storage', 'StorageV2', 'BlobStorage'.
     */
    @JsonProperty(value = "kind", required = true)
    private Kind kind;

    /**
     * Required. Gets or sets the location of the resource. This will be one of
     * the supported and registered Azure Geo Regions (e.g. West US, East US,
     * Southeast Asia, etc.). The geo region of a resource cannot be changed
     * once it is created, but if an identical geo region is specified on
     * update, the request will succeed.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * Gets or sets a list of key value pairs that describe the resource. These
     * tags can be used for viewing and grouping this resource (across resource
     * groups). A maximum of 15 tags can be provided for a resource. Each tag
     * must have a key with a length no greater than 128 characters and a value
     * with a length no greater than 256 characters.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /**
     * User domain assigned to the storage account. Name is the CNAME source.
     * Only one custom domain is supported per storage account at this time. To
     * clear the existing custom domain, use an empty string for the custom
     * domain name property.
     */
    @JsonProperty(value = "properties.customDomain")
    private CustomDomain customDomain;

    /**
     * Provides the encryption settings on the account. If left unspecified the
     * account encryption settings will remain the same. The default setting is
     * unencrypted.
     */
    @JsonProperty(value = "properties.encryption")
    private Encryption encryption;

    /**
     * Network rule set.
     */
    @JsonProperty(value = "properties.networkAcls")
    private NetworkRuleSet networkRuleSet;

    /**
     * Required for storage accounts where kind = BlobStorage. The access tier
     * used for billing. Possible values include: 'Hot', 'Cool'.
     */
    @JsonProperty(value = "properties.accessTier")
    private AccessTier accessTier;

    /**
     * Allows https traffic only to storage service if sets to true.
     */
    @JsonProperty(value = "properties.supportsHttpsTrafficOnly")
    private Boolean enableHttpsTrafficOnly;

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public SkuInner sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withSku(SkuInner sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the kind value.
     *
     * @return the kind value
     */
    public Kind kind() {
        return this.kind;
    }

    /**
     * Set the kind value.
     *
     * @param kind the kind value to set
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withKind(Kind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity value.
     *
     * @return the identity value
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity value.
     *
     * @param identity the identity value to set
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the customDomain value.
     *
     * @return the customDomain value
     */
    public CustomDomain customDomain() {
        return this.customDomain;
    }

    /**
     * Set the customDomain value.
     *
     * @param customDomain the customDomain value to set
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withCustomDomain(CustomDomain customDomain) {
        this.customDomain = customDomain;
        return this;
    }

    /**
     * Get the encryption value.
     *
     * @return the encryption value
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption value.
     *
     * @param encryption the encryption value to set
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the networkRuleSet value.
     *
     * @return the networkRuleSet value
     */
    public NetworkRuleSet networkRuleSet() {
        return this.networkRuleSet;
    }

    /**
     * Set the networkRuleSet value.
     *
     * @param networkRuleSet the networkRuleSet value to set
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        this.networkRuleSet = networkRuleSet;
        return this;
    }

    /**
     * Get the accessTier value.
     *
     * @return the accessTier value
     */
    public AccessTier accessTier() {
        return this.accessTier;
    }

    /**
     * Set the accessTier value.
     *
     * @param accessTier the accessTier value to set
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withAccessTier(AccessTier accessTier) {
        this.accessTier = accessTier;
        return this;
    }

    /**
     * Get the enableHttpsTrafficOnly value.
     *
     * @return the enableHttpsTrafficOnly value
     */
    public Boolean enableHttpsTrafficOnly() {
        return this.enableHttpsTrafficOnly;
    }

    /**
     * Set the enableHttpsTrafficOnly value.
     *
     * @param enableHttpsTrafficOnly the enableHttpsTrafficOnly value to set
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly) {
        this.enableHttpsTrafficOnly = enableHttpsTrafficOnly;
        return this;
    }

}
