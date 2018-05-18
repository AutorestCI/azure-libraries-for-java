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
 * The parameters used to add a new Data Lake Store account while creating a
 * new Data Lake Analytics account.
 */
@JsonFlatten
public class AddDataLakeStoreWithAccountParameters {
    /**
     * The unique name of the Data Lake Store account to add.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The optional suffix for the Data Lake Store account.
     */
    @JsonProperty(value = "properties.suffix")
    private String suffix;

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
     * @return the AddDataLakeStoreWithAccountParameters object itself.
     */
    public AddDataLakeStoreWithAccountParameters withName(String name) {
        this.name = name;
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
     * @return the AddDataLakeStoreWithAccountParameters object itself.
     */
    public AddDataLakeStoreWithAccountParameters withSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

}
