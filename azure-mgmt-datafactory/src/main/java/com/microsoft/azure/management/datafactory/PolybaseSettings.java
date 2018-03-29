/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PolyBase settings.
 */
public class PolybaseSettings {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Reject type. Possible values include: 'value', 'percentage'.
     */
    @JsonProperty(value = "rejectType")
    private PolybaseSettingsRejectType rejectType;

    /**
     * Specifies the value or the percentage of rows that can be rejected
     * before the query fails. Type: number (or Expression with resultType
     * number), minimum: 0.
     */
    @JsonProperty(value = "rejectValue")
    private Object rejectValue;

    /**
     * Determines the number of rows to attempt to retrieve before the PolyBase
     * recalculates the percentage of rejected rows. Type: integer (or
     * Expression with resultType integer), minimum: 0.
     */
    @JsonProperty(value = "rejectSampleValue")
    private Object rejectSampleValue;

    /**
     * Specifies how to handle missing values in delimited text files when
     * PolyBase retrieves data from the text file. Type: boolean (or Expression
     * with resultType boolean).
     */
    @JsonProperty(value = "useTypeDefault")
    private Object useTypeDefault;

    /**
     * Get the additionalProperties value.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties value.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the PolybaseSettings object itself.
     */
    public PolybaseSettings withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the rejectType value.
     *
     * @return the rejectType value
     */
    public PolybaseSettingsRejectType rejectType() {
        return this.rejectType;
    }

    /**
     * Set the rejectType value.
     *
     * @param rejectType the rejectType value to set
     * @return the PolybaseSettings object itself.
     */
    public PolybaseSettings withRejectType(PolybaseSettingsRejectType rejectType) {
        this.rejectType = rejectType;
        return this;
    }

    /**
     * Get the rejectValue value.
     *
     * @return the rejectValue value
     */
    public Object rejectValue() {
        return this.rejectValue;
    }

    /**
     * Set the rejectValue value.
     *
     * @param rejectValue the rejectValue value to set
     * @return the PolybaseSettings object itself.
     */
    public PolybaseSettings withRejectValue(Object rejectValue) {
        this.rejectValue = rejectValue;
        return this;
    }

    /**
     * Get the rejectSampleValue value.
     *
     * @return the rejectSampleValue value
     */
    public Object rejectSampleValue() {
        return this.rejectSampleValue;
    }

    /**
     * Set the rejectSampleValue value.
     *
     * @param rejectSampleValue the rejectSampleValue value to set
     * @return the PolybaseSettings object itself.
     */
    public PolybaseSettings withRejectSampleValue(Object rejectSampleValue) {
        this.rejectSampleValue = rejectSampleValue;
        return this;
    }

    /**
     * Get the useTypeDefault value.
     *
     * @return the useTypeDefault value
     */
    public Object useTypeDefault() {
        return this.useTypeDefault;
    }

    /**
     * Set the useTypeDefault value.
     *
     * @param useTypeDefault the useTypeDefault value to set
     * @return the PolybaseSettings object itself.
     */
    public PolybaseSettings withUseTypeDefault(Object useTypeDefault) {
        this.useTypeDefault = useTypeDefault;
        return this;
    }

}
