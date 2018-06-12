/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.dns;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A reference to a another resource.
 */
public class SubResource {
    /**
     * Resource Id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get resource Id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource Id.
     *
     * @param id the id value to set
     * @return the SubResource object itself.
     */
    public SubResource withId(String id) {
        this.id = id;
        return this;
    }

}
