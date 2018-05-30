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
 * Collection of parameters for PowerShell tab completion.
 */
public class PowerShellTabCompletionParameters {
    /**
     * Command to get tab completion for.
     */
    @JsonProperty(value = "command")
    private String command;

    /**
     * Get command to get tab completion for.
     *
     * @return the command value
     */
    public String command() {
        return this.command;
    }

    /**
     * Set command to get tab completion for.
     *
     * @param command the command value to set
     * @return the PowerShellTabCompletionParameters object itself.
     */
    public PowerShellTabCompletionParameters withCommand(String command) {
        this.command = command;
        return this;
    }

}