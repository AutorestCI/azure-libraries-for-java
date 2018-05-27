/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition of a single parameter for an entity.
 */
public class ParameterSpecification {
    /**
     * Parameter type. Possible values include: 'Object', 'String', 'Int',
     * 'Float', 'Bool', 'Array', 'SecureString'.
     */
    @JsonProperty(value = "type", required = true)
    private ParameterType type;

    /**
     * Default value of parameter.
     */
    @JsonProperty(value = "defaultValue")
    private Object defaultValue;

    /**
     * Get parameter type. Possible values include: 'Object', 'String', 'Int', 'Float', 'Bool', 'Array', 'SecureString'.
     *
     * @return the type value
     */
    public ParameterType type() {
        return this.type;
    }

    /**
     * Set parameter type. Possible values include: 'Object', 'String', 'Int', 'Float', 'Bool', 'Array', 'SecureString'.
     *
     * @param type the type value to set
     * @return the ParameterSpecification object itself.
     */
    public ParameterSpecification withType(ParameterType type) {
        this.type = type;
        return this;
    }

    /**
     * Get default value of parameter.
     *
     * @return the defaultValue value
     */
    public Object defaultValue() {
        return this.defaultValue;
    }

    /**
     * Set default value of parameter.
     *
     * @param defaultValue the defaultValue value to set
     * @return the ParameterSpecification object itself.
     */
    public ParameterSpecification withDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

}
