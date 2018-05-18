/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters used to add a new Azure Storage account.
 */
@JsonFlatten
public class AddStorageAccountParameters {
    /**
     * The access key associated with this Azure Storage account that will be
     * used to connect to it.
     */
    @JsonProperty(value = "properties.accessKey", required = true)
    private String accessKey;

    /**
     * The optional suffix for the storage account.
     */
    @JsonProperty(value = "properties.suffix")
    private String suffix;

    /**
     * Get the accessKey value.
     *
     * @return the accessKey value
     */
    public String accessKey() {
        return this.accessKey;
    }

    /**
     * Set the accessKey value.
     *
     * @param accessKey the accessKey value to set
     * @return the AddStorageAccountParameters object itself.
     */
    public AddStorageAccountParameters withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * Get the suffix value.
     *
     * @return the suffix value
     */
    public String suffix() {
        return this.suffix;
    }

    /**
     * Set the suffix value.
     *
     * @param suffix the suffix value to set
     * @return the AddStorageAccountParameters object itself.
     */
    public AddStorageAccountParameters withSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

}
