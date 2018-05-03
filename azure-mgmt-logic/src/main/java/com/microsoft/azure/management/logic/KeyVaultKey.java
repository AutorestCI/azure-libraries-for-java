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
 * The key vault key.
 */
public class KeyVaultKey {
    /**
     * The key id.
     */
    @JsonProperty(value = "kid")
    private String kid;

    /**
     * The key attributes.
     */
    @JsonProperty(value = "attributes")
    private KeyVaultKeyAttributes attributes;

    /**
     * Get the kid value.
     *
     * @return the kid value
     */
    public String kid() {
        return this.kid;
    }

    /**
     * Set the kid value.
     *
     * @param kid the kid value to set
     * @return the KeyVaultKey object itself.
     */
    public KeyVaultKey withKid(String kid) {
        this.kid = kid;
        return this;
    }

    /**
     * Get the attributes value.
     *
     * @return the attributes value
     */
    public KeyVaultKeyAttributes attributes() {
        return this.attributes;
    }

    /**
     * Set the attributes value.
     *
     * @param attributes the attributes value to set
     * @return the KeyVaultKey object itself.
     */
    public KeyVaultKey withAttributes(KeyVaultKeyAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

}
