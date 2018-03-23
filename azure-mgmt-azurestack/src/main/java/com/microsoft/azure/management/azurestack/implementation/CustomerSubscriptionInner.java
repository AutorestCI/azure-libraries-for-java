/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestack.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Customer subcription.
 */
@JsonFlatten
public class CustomerSubscriptionInner extends Resource {
    /**
     * Tenant Id.
     */
    @JsonProperty(value = "properties.tenantId")
    private String tenantId;

    /**
     * Get the tenantId value.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId value.
     *
     * @param tenantId the tenantId value to set
     * @return the CustomerSubscriptionInner object itself.
     */
    public CustomerSubscriptionInner withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

}
