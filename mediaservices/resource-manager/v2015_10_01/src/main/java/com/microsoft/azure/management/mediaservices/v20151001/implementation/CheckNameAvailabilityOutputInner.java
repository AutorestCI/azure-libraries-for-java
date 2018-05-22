/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2015_10_01.implementation;

import com.microsoft.azure.management.mediaservices.v20151001.EntityNameUnavailabilityReason;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response body for CheckNameAvailability API.
 */
public class CheckNameAvailabilityOutputInner {
    /**
     * Specifies if the name is available.
     */
    @JsonProperty(value = "nameAvailable")
    private Boolean nameAvailable;

    /**
     * Specifies the reason if the name is not available. Possible values
     * include: 'None', 'Invalid', 'AlreadyExists'.
     */
    @JsonProperty(value = "reason")
    private EntityNameUnavailabilityReason reason;

    /**
     * Specifies the detailed reason if the name is not available.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the nameAvailable value.
     *
     * @return the nameAvailable value
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set the nameAvailable value.
     *
     * @param nameAvailable the nameAvailable value to set
     * @return the CheckNameAvailabilityOutputInner object itself.
     */
    public CheckNameAvailabilityOutputInner withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get the reason value.
     *
     * @return the reason value
     */
    public EntityNameUnavailabilityReason reason() {
        return this.reason;
    }

    /**
     * Set the reason value.
     *
     * @param reason the reason value to set
     * @return the CheckNameAvailabilityOutputInner object itself.
     */
    public CheckNameAvailabilityOutputInner withReason(EntityNameUnavailabilityReason reason) {
        this.reason = reason;
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
     * @return the CheckNameAvailabilityOutputInner object itself.
     */
    public CheckNameAvailabilityOutputInner withMessage(String message) {
        this.message = message;
        return this;
    }

}
