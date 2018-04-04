/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.contentmoderator;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Detected SSN details.
 */
public class SSN {
    /**
     * Detected SSN in the input text content.
     */
    @JsonProperty(value = "Text")
    private String text;

    /**
     * Index(Location) of the SSN in the input text content.
     */
    @JsonProperty(value = "Index")
    private Integer index;

    /**
     * Get the text value.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text value.
     *
     * @param text the text value to set
     * @return the SSN object itself.
     */
    public SSN withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the index value.
     *
     * @return the index value
     */
    public Integer index() {
        return this.index;
    }

    /**
     * Set the index value.
     *
     * @param index the index value to set
     * @return the SSN object itself.
     */
    public SSN withIndex(Integer index) {
        this.index = index;
        return this;
    }

}
