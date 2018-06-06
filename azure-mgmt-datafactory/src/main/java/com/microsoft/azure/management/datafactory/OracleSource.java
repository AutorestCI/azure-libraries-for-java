/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity Oracle source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("OracleSource")
public class OracleSource extends CopySource {
    /**
     * Oracle reader query. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "oracleReaderQuery")
    private Object oracleReaderQuery;

    /**
     * Query timeout. Type: string (or Expression with resultType string),
     * pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "queryTimeout")
    private Object queryTimeout;

    /**
     * Get oracle reader query. Type: string (or Expression with resultType string).
     *
     * @return the oracleReaderQuery value
     */
    public Object oracleReaderQuery() {
        return this.oracleReaderQuery;
    }

    /**
     * Set oracle reader query. Type: string (or Expression with resultType string).
     *
     * @param oracleReaderQuery the oracleReaderQuery value to set
     * @return the OracleSource object itself.
     */
    public OracleSource withOracleReaderQuery(Object oracleReaderQuery) {
        this.oracleReaderQuery = oracleReaderQuery;
        return this;
    }

    /**
     * Get query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the queryTimeout value
     */
    public Object queryTimeout() {
        return this.queryTimeout;
    }

    /**
     * Set query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param queryTimeout the queryTimeout value to set
     * @return the OracleSource object itself.
     */
    public OracleSource withQueryTimeout(Object queryTimeout) {
        this.queryTimeout = queryTimeout;
        return this;
    }

}
