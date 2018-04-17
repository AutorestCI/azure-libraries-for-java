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
 * Data Table which defines columns and raw row values.
 */
public class DataTableResponseObject {
    /**
     * Name of the table.
     */
    @JsonProperty(value = "tableName")
    private String tableName;

    /**
     * List of columns with data types.
     */
    @JsonProperty(value = "columns")
    private List<DataTableResponseColumn> columns;

    /**
     * Raw row values.
     */
    @JsonProperty(value = "rows")
    private List<List<String>> rows;

    /**
     * Get the tableName value.
     *
     * @return the tableName value
     */
    public String tableName() {
        return this.tableName;
    }

    /**
     * Set the tableName value.
     *
     * @param tableName the tableName value to set
     * @return the DataTableResponseObject object itself.
     */
    public DataTableResponseObject withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the columns value.
     *
     * @return the columns value
     */
    public List<DataTableResponseColumn> columns() {
        return this.columns;
    }

    /**
     * Set the columns value.
     *
     * @param columns the columns value to set
     * @return the DataTableResponseObject object itself.
     */
    public DataTableResponseObject withColumns(List<DataTableResponseColumn> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Get the rows value.
     *
     * @return the rows value
     */
    public List<List<String>> rows() {
        return this.rows;
    }

    /**
     * Set the rows value.
     *
     * @param rows the rows value to set
     * @return the DataTableResponseObject object itself.
     */
    public DataTableResponseObject withRows(List<List<String>> rows) {
        this.rows = rows;
        return this;
    }

}
