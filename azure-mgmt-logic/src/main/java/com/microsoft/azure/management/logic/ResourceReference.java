/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The resource reference.
 */
public class ResourceReference {
    /**
     * The resource id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Gets the resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Gets the resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the resource id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get gets the resource name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get gets the resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
