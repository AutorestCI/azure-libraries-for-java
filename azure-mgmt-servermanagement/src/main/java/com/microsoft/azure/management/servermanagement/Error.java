/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servermanagement;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error message.
 */
public class Error {
    /**
     * The code property.
     */
    @JsonProperty(value = "code")
    private Integer code;

    /**
     * The message property.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * The fields property.
     */
    @JsonProperty(value = "fields")
    private String fields;

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public Integer code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the Error object itself.
     */
    public Error withCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the Error object itself.
     */
    public Error withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the fields value.
     *
     * @return the fields value
     */
    public String fields() {
        return this.fields;
    }

    /**
     * Set the fields value.
     *
     * @param fields the fields value to set
     * @return the Error object itself.
     */
    public Error withFields(String fields) {
        this.fields = fields;
        return this;
    }

}
