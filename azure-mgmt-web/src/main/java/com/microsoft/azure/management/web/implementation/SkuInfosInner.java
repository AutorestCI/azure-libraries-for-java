/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.web.implementation;

import java.util.List;
import com.microsoft.azure.management.web.GlobalCsmSkuDescription;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Collection of SKU information.
 */
public class SkuInfosInner {
    /**
     * Resource type that this SKU applies to.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /**
     * List of SKUs the subscription is able to use.
     */
    @JsonProperty(value = "skus")
    private List<GlobalCsmSkuDescription> skus;

    /**
     * Get resource type that this SKU applies to.
     *
     * @return the resourceType value
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set resource type that this SKU applies to.
     *
     * @param resourceType the resourceType value to set
     * @return the SkuInfosInner object itself.
     */
    public SkuInfosInner withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get list of SKUs the subscription is able to use.
     *
     * @return the skus value
     */
    public List<GlobalCsmSkuDescription> skus() {
        return this.skus;
    }

    /**
     * Set list of SKUs the subscription is able to use.
     *
     * @param skus the skus value to set
     * @return the SkuInfosInner object itself.
     */
    public SkuInfosInner withSkus(List<GlobalCsmSkuDescription> skus) {
        this.skus = skus;
        return this;
    }

}
