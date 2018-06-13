/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servermanagement;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response to a prompt message.
 */
public class PromptMessageResponse {
    /**
     * The list of responses a cmdlet expects.
     */
    @JsonProperty(value = "response")
    private List<String> response;

    /**
     * Get the list of responses a cmdlet expects.
     *
     * @return the response value
     */
    public List<String> response() {
        return this.response;
    }

    /**
     * Set the list of responses a cmdlet expects.
     *
     * @param response the response value to set
     * @return the PromptMessageResponse object itself.
     */
    public PromptMessageResponse withResponse(List<String> response) {
        this.response = response;
        return this;
    }

}
