/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data POST-ed to the nameAvailability action.
 */
public class NameAvailabilityParametersInner {
    /**
     * The resource type. Should be always "Microsoft.SignalRService/SignalR".
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * The SignalR service name to validate. e.g."my-signalR-name-here".
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the NameAvailabilityParametersInner object itself.
     */
    public NameAvailabilityParametersInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the NameAvailabilityParametersInner object itself.
     */
    public NameAvailabilityParametersInner withName(String name) {
        this.name = name;
        return this;
    }

}