/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.implementation;

import com.microsoft.azure.management.recoveryservicessiterecovery.RecoveryServicesProviderProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.Resource;

/**
 * Provider details.
 */
public class RecoveryServicesProviderInner extends Resource {
    /**
     * Provider properties.
     */
    @JsonProperty(value = "properties")
    private RecoveryServicesProviderProperties properties;

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public RecoveryServicesProviderProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the RecoveryServicesProviderInner object itself.
     */
    public RecoveryServicesProviderInner withProperties(RecoveryServicesProviderProperties properties) {
        this.properties = properties;
        return this;
    }

}