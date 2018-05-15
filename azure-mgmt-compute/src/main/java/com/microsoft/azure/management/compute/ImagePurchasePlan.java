/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the gallery image purchase plan. This is used by marketplace
 * images.
 */
public class ImagePurchasePlan {
    /**
     * The plan ID.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The publisher ID.
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /**
     * The product ID.
     */
    @JsonProperty(value = "product")
    private String product;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ImagePurchasePlan object itself.
     */
    public ImagePurchasePlan withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the publisher value.
     *
     * @return the publisher value
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher value.
     *
     * @param publisher the publisher value to set
     * @return the ImagePurchasePlan object itself.
     */
    public ImagePurchasePlan withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the product value.
     *
     * @return the product value
     */
    public String product() {
        return this.product;
    }

    /**
     * Set the product value.
     *
     * @param product the product value to set
     * @return the ImagePurchasePlan object itself.
     */
    public ImagePurchasePlan withProduct(String product) {
        this.product = product;
        return this;
    }

}
