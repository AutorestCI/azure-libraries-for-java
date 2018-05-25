/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servermanagement.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.servermanagement.Version;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * A PowerShell session resource (practically equivalent to a runspace
 * instance).
 */
@JsonFlatten
@SkipParentValidation
public class PowerShellSessionResourceInner extends Resource {
    /**
     * The PowerShell Session ID.
     */
    @JsonProperty(value = "properties.sessionId")
    private String sessionId;

    /**
     * The runspace state.
     */
    @JsonProperty(value = "properties.state")
    private String state;

    /**
     * The availability of the runspace.
     */
    @JsonProperty(value = "properties.runspaceAvailability")
    private String runspaceAvailability;

    /**
     * Timestamp of last time the service disconnected from the runspace.
     */
    @JsonProperty(value = "properties.disconnectedOn")
    private DateTime disconnectedOn;

    /**
     * Timestamp when the runspace expires.
     */
    @JsonProperty(value = "properties.expiresOn")
    private DateTime expiresOn;

    /**
     * The version property.
     */
    @JsonProperty(value = "properties.version")
    private Version version;

    /**
     * Name of the runspace.
     */
    @JsonProperty(value = "properties.name")
    private String powerShellSessionResourceName;

    /**
     * The etag property.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the PowerShell Session ID.
     *
     * @return the sessionId value
     */
    public String sessionId() {
        return this.sessionId;
    }

    /**
     * Set the PowerShell Session ID.
     *
     * @param sessionId the sessionId value to set
     * @return the PowerShellSessionResourceInner object itself.
     */
    public PowerShellSessionResourceInner withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Get the runspace state.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the runspace state.
     *
     * @param state the state value to set
     * @return the PowerShellSessionResourceInner object itself.
     */
    public PowerShellSessionResourceInner withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the availability of the runspace.
     *
     * @return the runspaceAvailability value
     */
    public String runspaceAvailability() {
        return this.runspaceAvailability;
    }

    /**
     * Set the availability of the runspace.
     *
     * @param runspaceAvailability the runspaceAvailability value to set
     * @return the PowerShellSessionResourceInner object itself.
     */
    public PowerShellSessionResourceInner withRunspaceAvailability(String runspaceAvailability) {
        this.runspaceAvailability = runspaceAvailability;
        return this;
    }

    /**
     * Get timestamp of last time the service disconnected from the runspace.
     *
     * @return the disconnectedOn value
     */
    public DateTime disconnectedOn() {
        return this.disconnectedOn;
    }

    /**
     * Set timestamp of last time the service disconnected from the runspace.
     *
     * @param disconnectedOn the disconnectedOn value to set
     * @return the PowerShellSessionResourceInner object itself.
     */
    public PowerShellSessionResourceInner withDisconnectedOn(DateTime disconnectedOn) {
        this.disconnectedOn = disconnectedOn;
        return this;
    }

    /**
     * Get timestamp when the runspace expires.
     *
     * @return the expiresOn value
     */
    public DateTime expiresOn() {
        return this.expiresOn;
    }

    /**
     * Set timestamp when the runspace expires.
     *
     * @param expiresOn the expiresOn value to set
     * @return the PowerShellSessionResourceInner object itself.
     */
    public PowerShellSessionResourceInner withExpiresOn(DateTime expiresOn) {
        this.expiresOn = expiresOn;
        return this;
    }

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public Version version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set
     * @return the PowerShellSessionResourceInner object itself.
     */
    public PowerShellSessionResourceInner withVersion(Version version) {
        this.version = version;
        return this;
    }

    /**
     * Get name of the runspace.
     *
     * @return the powerShellSessionResourceName value
     */
    public String powerShellSessionResourceName() {
        return this.powerShellSessionResourceName;
    }

    /**
     * Set name of the runspace.
     *
     * @param powerShellSessionResourceName the powerShellSessionResourceName value to set
     * @return the PowerShellSessionResourceInner object itself.
     */
    public PowerShellSessionResourceInner withPowerShellSessionResourceName(String powerShellSessionResourceName) {
        this.powerShellSessionResourceName = powerShellSessionResourceName;
        return this;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     * @return the PowerShellSessionResourceInner object itself.
     */
    public PowerShellSessionResourceInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
