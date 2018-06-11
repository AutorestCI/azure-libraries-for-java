/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response of granting/revoking integration runtime permission operation.
 */
public class IntegrationRuntimePermissionResponseInner {
    /**
     * The number of the integration runtimes to which the given data factory
     * has been granted access.
     */
    @JsonProperty(value = "sharedIntegrationRuntimeCount")
    private Integer sharedIntegrationRuntimeCount;

    /**
     * Get the number of the integration runtimes to which the given data factory has been granted access.
     *
     * @return the sharedIntegrationRuntimeCount value
     */
    public Integer sharedIntegrationRuntimeCount() {
        return this.sharedIntegrationRuntimeCount;
    }

    /**
     * Set the number of the integration runtimes to which the given data factory has been granted access.
     *
     * @param sharedIntegrationRuntimeCount the sharedIntegrationRuntimeCount value to set
     * @return the IntegrationRuntimePermissionResponseInner object itself.
     */
    public IntegrationRuntimePermissionResponseInner withSharedIntegrationRuntimeCount(Integer sharedIntegrationRuntimeCount) {
        this.sharedIntegrationRuntimeCount = sharedIntegrationRuntimeCount;
        return this;
    }

}
