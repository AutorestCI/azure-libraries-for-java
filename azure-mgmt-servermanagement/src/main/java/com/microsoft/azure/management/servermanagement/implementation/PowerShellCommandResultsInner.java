/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servermanagement.implementation;

import java.util.List;
import com.microsoft.azure.management.servermanagement.PowerShellCommandResult;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A collection of results from a PowerShell command.
 */
public class PowerShellCommandResultsInner {
    /**
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<PowerShellCommandResult> results;

    /**
     * The pssession property.
     */
    @JsonProperty(value = "pssession")
    private String pssession;

    /**
     * The command property.
     */
    @JsonProperty(value = "command")
    private String command;

    /**
     * The completed property.
     */
    @JsonProperty(value = "completed")
    private Boolean completed;

    /**
     * Get the results value.
     *
     * @return the results value
     */
    public List<PowerShellCommandResult> results() {
        return this.results;
    }

    /**
     * Set the results value.
     *
     * @param results the results value to set
     * @return the PowerShellCommandResultsInner object itself.
     */
    public PowerShellCommandResultsInner withResults(List<PowerShellCommandResult> results) {
        this.results = results;
        return this;
    }

    /**
     * Get the pssession value.
     *
     * @return the pssession value
     */
    public String pssession() {
        return this.pssession;
    }

    /**
     * Set the pssession value.
     *
     * @param pssession the pssession value to set
     * @return the PowerShellCommandResultsInner object itself.
     */
    public PowerShellCommandResultsInner withPssession(String pssession) {
        this.pssession = pssession;
        return this;
    }

    /**
     * Get the command value.
     *
     * @return the command value
     */
    public String command() {
        return this.command;
    }

    /**
     * Set the command value.
     *
     * @param command the command value to set
     * @return the PowerShellCommandResultsInner object itself.
     */
    public PowerShellCommandResultsInner withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * Get the completed value.
     *
     * @return the completed value
     */
    public Boolean completed() {
        return this.completed;
    }

    /**
     * Set the completed value.
     *
     * @param completed the completed value to set
     * @return the PowerShellCommandResultsInner object itself.
     */
    public PowerShellCommandResultsInner withCompleted(Boolean completed) {
        this.completed = completed;
        return this;
    }

}
