/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2017_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters used to check the availabity of the storage account name.
 */
public class StorageAccountCheckNameAvailabilityParameters {
    /**
     * The storage account name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The type of resource, Microsoft.Storage/storageAccounts.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Creates an instance of StorageAccountCheckNameAvailabilityParameters class.
     */
    public StorageAccountCheckNameAvailabilityParameters() {
        type = "Microsoft.Storage/storageAccounts";
    }

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
     * @return the StorageAccountCheckNameAvailabilityParameters object itself.
     */
    public StorageAccountCheckNameAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the StorageAccountCheckNameAvailabilityParameters object itself.
     */
    public StorageAccountCheckNameAvailabilityParameters withType(String type) {
        this.type = type;
        return this;
    }

}
