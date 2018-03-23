/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestack;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Link with additional information about a product.
 */
public class ProductLink {
    /**
     * The description of the link.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The URI corresponding to the link.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the ProductLink object itself.
     */
    public ProductLink withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the uri value.
     *
     * @return the uri value
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri value.
     *
     * @param uri the uri value to set
     * @return the ProductLink object itself.
     */
    public ProductLink withUri(String uri) {
        this.uri = uri;
        return this;
    }

}