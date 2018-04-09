/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.web;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class representing data source used by the detectors.
 */
public class DataSource {
    /**
     * Instrunctions if any for the data source.
     */
    @JsonProperty(value = "instructions")
    private List<String> instructions;

    /**
     * Datasource Uri Links.
     */
    @JsonProperty(value = "dataSourceUri")
    private List<NameValuePair> dataSourceUri;

    /**
     * Get the instructions value.
     *
     * @return the instructions value
     */
    public List<String> instructions() {
        return this.instructions;
    }

    /**
     * Set the instructions value.
     *
     * @param instructions the instructions value to set
     * @return the DataSource object itself.
     */
    public DataSource withInstructions(List<String> instructions) {
        this.instructions = instructions;
        return this;
    }

    /**
     * Get the dataSourceUri value.
     *
     * @return the dataSourceUri value
     */
    public List<NameValuePair> dataSourceUri() {
        return this.dataSourceUri;
    }

    /**
     * Set the dataSourceUri value.
     *
     * @param dataSourceUri the dataSourceUri value to set
     * @return the DataSource object itself.
     */
    public DataSource withDataSourceUri(List<NameValuePair> dataSourceUri) {
        this.dataSourceUri = dataSourceUri;
        return this;
    }

}
