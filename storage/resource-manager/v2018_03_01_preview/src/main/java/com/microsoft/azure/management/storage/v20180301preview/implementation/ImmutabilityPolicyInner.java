/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_03_01_preview.implementation;

import com.microsoft.azure.management.storage.v20180301preview.ImmutabilityPolicyState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The ImmutabilityPolicy property of a blob container, including Id, resource
 * name, resource type, Etag.
 */
@JsonFlatten
public class ImmutabilityPolicyInner extends AzureEntityResourceInner {
    /**
     * The immutability period for the blobs in the container since the policy
     * creation, in days.
     */
    @JsonProperty(value = "properties.immutabilityPeriodSinceCreationInDays", required = true)
    private int immutabilityPeriodSinceCreationInDays;

    /**
     * The ImmutabilityPolicy state of a blob container, possible values
     * include: Locked and Unlocked. Possible values include: 'Locked',
     * 'Unlocked'.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private ImmutabilityPolicyState state;

    /**
     * Get the immutability period for the blobs in the container since the policy creation, in days.
     *
     * @return the immutabilityPeriodSinceCreationInDays value
     */
    public int immutabilityPeriodSinceCreationInDays() {
        return this.immutabilityPeriodSinceCreationInDays;
    }

    /**
     * Set the immutability period for the blobs in the container since the policy creation, in days.
     *
     * @param immutabilityPeriodSinceCreationInDays the immutabilityPeriodSinceCreationInDays value to set
     * @return the ImmutabilityPolicyInner object itself.
     */
    public ImmutabilityPolicyInner withImmutabilityPeriodSinceCreationInDays(int immutabilityPeriodSinceCreationInDays) {
        this.immutabilityPeriodSinceCreationInDays = immutabilityPeriodSinceCreationInDays;
        return this;
    }

    /**
     * Get the ImmutabilityPolicy state of a blob container, possible values include: Locked and Unlocked. Possible values include: 'Locked', 'Unlocked'.
     *
     * @return the state value
     */
    public ImmutabilityPolicyState state() {
        return this.state;
    }

}
