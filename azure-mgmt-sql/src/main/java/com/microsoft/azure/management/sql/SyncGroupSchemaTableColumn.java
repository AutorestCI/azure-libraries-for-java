/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of column in sync group table.
 */
public class SyncGroupSchemaTableColumn {
    /**
     * Quoted name of sync group table column.
     */
    @JsonProperty(value = "quotedName")
    private String quotedName;

    /**
     * Data size of the column.
     */
    @JsonProperty(value = "dataSize")
    private String dataSize;

    /**
     * Data type of the column.
     */
    @JsonProperty(value = "dataType")
    private String dataType;

    /**
     * Get quoted name of sync group table column.
     *
     * @return the quotedName value
     */
    public String quotedName() {
        return this.quotedName;
    }

    /**
     * Set quoted name of sync group table column.
     *
     * @param quotedName the quotedName value to set
     * @return the SyncGroupSchemaTableColumn object itself.
     */
    public SyncGroupSchemaTableColumn withQuotedName(String quotedName) {
        this.quotedName = quotedName;
        return this;
    }

    /**
     * Get data size of the column.
     *
     * @return the dataSize value
     */
    public String dataSize() {
        return this.dataSize;
    }

    /**
     * Set data size of the column.
     *
     * @param dataSize the dataSize value to set
     * @return the SyncGroupSchemaTableColumn object itself.
     */
    public SyncGroupSchemaTableColumn withDataSize(String dataSize) {
        this.dataSize = dataSize;
        return this;
    }

    /**
     * Get data type of the column.
     *
     * @return the dataType value
     */
    public String dataType() {
        return this.dataType;
    }

    /**
     * Set data type of the column.
     *
     * @param dataType the dataType value to set
     * @return the SyncGroupSchemaTableColumn object itself.
     */
    public SyncGroupSchemaTableColumn withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

}
