/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import java.util.List;
import com.microsoft.azure.management.appservice.v20180201.implementation.CapabilityInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Global SKU Description.
 */
public class GlobalCsmSkuDescription {
    /**
     * Name of the resource SKU.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Service Tier of the resource SKU.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /**
     * Size specifier of the resource SKU.
     */
    @JsonProperty(value = "size")
    private String size;

    /**
     * Family code of the resource SKU.
     */
    @JsonProperty(value = "family")
    private String family;

    /**
     * Min, max, and default scale values of the SKU.
     */
    @JsonProperty(value = "capacity")
    private SkuCapacity capacity;

    /**
     * Locations of the SKU.
     */
    @JsonProperty(value = "locations")
    private List<String> locations;

    /**
     * Capabilities of the SKU, e.g., is traffic manager enabled?.
     */
    @JsonProperty(value = "capabilities")
    private List<CapabilityInner> capabilities;

    /**
     * Get name of the resource SKU.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the resource SKU.
     *
     * @param name the name value to set
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get service Tier of the resource SKU.
     *
     * @return the tier value
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set service Tier of the resource SKU.
     *
     * @param tier the tier value to set
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get size specifier of the resource SKU.
     *
     * @return the size value
     */
    public String size() {
        return this.size;
    }

    /**
     * Set size specifier of the resource SKU.
     *
     * @param size the size value to set
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get family code of the resource SKU.
     *
     * @return the family value
     */
    public String family() {
        return this.family;
    }

    /**
     * Set family code of the resource SKU.
     *
     * @param family the family value to set
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Get min, max, and default scale values of the SKU.
     *
     * @return the capacity value
     */
    public SkuCapacity capacity() {
        return this.capacity;
    }

    /**
     * Set min, max, and default scale values of the SKU.
     *
     * @param capacity the capacity value to set
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withCapacity(SkuCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get locations of the SKU.
     *
     * @return the locations value
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set locations of the SKU.
     *
     * @param locations the locations value to set
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get capabilities of the SKU, e.g., is traffic manager enabled?.
     *
     * @return the capabilities value
     */
    public List<CapabilityInner> capabilities() {
        return this.capabilities;
    }

    /**
     * Set capabilities of the SKU, e.g., is traffic manager enabled?.
     *
     * @param capabilities the capabilities value to set
     * @return the GlobalCsmSkuDescription object itself.
     */
    public GlobalCsmSkuDescription withCapabilities(List<CapabilityInner> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

}
