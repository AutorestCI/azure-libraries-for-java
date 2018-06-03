/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The managed server family capability.
 */
public class ManagedInstanceFamilyCapability {
    /**
     * Family name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * SKU name.
     */
    @JsonProperty(value = "sku", access = JsonProperty.Access.WRITE_ONLY)
    private String sku;

    /**
     * List of supported license types.
     */
    @JsonProperty(value = "supportedLicenseTypes", access = JsonProperty.Access.WRITE_ONLY)
    private List<LicenseTypeCapability> supportedLicenseTypes;

    /**
     * List of supported virtual cores values.
     */
    @JsonProperty(value = "supportedVcoresValues", access = JsonProperty.Access.WRITE_ONLY)
    private List<ManagedInstanceVcoresCapability> supportedVcoresValues;

    /**
     * Included size.
     */
    @JsonProperty(value = "includedMaxSize", access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeCapability includedMaxSize;

    /**
     * Storage size ranges.
     */
    @JsonProperty(value = "supportedStorageSizes", access = JsonProperty.Access.WRITE_ONLY)
    private List<MaxSizeRangeCapability> supportedStorageSizes;

    /**
     * The status of the capability. Possible values include: 'Visible',
     * 'Available', 'Default', 'Disabled'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /**
     * The reason for the capability not being available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * Get family name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get sKU name.
     *
     * @return the sku value
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Get list of supported license types.
     *
     * @return the supportedLicenseTypes value
     */
    public List<LicenseTypeCapability> supportedLicenseTypes() {
        return this.supportedLicenseTypes;
    }

    /**
     * Get list of supported virtual cores values.
     *
     * @return the supportedVcoresValues value
     */
    public List<ManagedInstanceVcoresCapability> supportedVcoresValues() {
        return this.supportedVcoresValues;
    }

    /**
     * Get included size.
     *
     * @return the includedMaxSize value
     */
    public MaxSizeCapability includedMaxSize() {
        return this.includedMaxSize;
    }

    /**
     * Get storage size ranges.
     *
     * @return the supportedStorageSizes value
     */
    public List<MaxSizeRangeCapability> supportedStorageSizes() {
        return this.supportedStorageSizes;
    }

    /**
     * Get the status of the capability. Possible values include: 'Visible', 'Available', 'Default', 'Disabled'.
     *
     * @return the status value
     */
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Get the reason for the capability not being available.
     *
     * @return the reason value
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason for the capability not being available.
     *
     * @param reason the reason value to set
     * @return the ManagedInstanceFamilyCapability object itself.
     */
    public ManagedInstanceFamilyCapability withReason(String reason) {
        this.reason = reason;
        return this;
    }

}
