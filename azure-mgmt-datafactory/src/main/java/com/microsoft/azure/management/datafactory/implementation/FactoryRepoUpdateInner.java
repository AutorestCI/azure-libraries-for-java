/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.implementation;

import com.microsoft.azure.management.datafactory.FactoryVSTSConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Factory's VSTS repo information.
 */
public class FactoryRepoUpdateInner {
    /**
     * The factory id.
     */
    @JsonProperty(value = "factoryId")
    private String factoryId;

    /**
     * The resource group name.
     */
    @JsonProperty(value = "resourceGroupName")
    private String resourceGroupName;

    /**
     * VSTS repo information of the factory.
     */
    @JsonProperty(value = "vstsConfiguration")
    private FactoryVSTSConfiguration vstsConfiguration;

    /**
     * Get the factoryId value.
     *
     * @return the factoryId value
     */
    public String factoryId() {
        return this.factoryId;
    }

    /**
     * Set the factoryId value.
     *
     * @param factoryId the factoryId value to set
     * @return the FactoryRepoUpdateInner object itself.
     */
    public FactoryRepoUpdateInner withFactoryId(String factoryId) {
        this.factoryId = factoryId;
        return this;
    }

    /**
     * Get the resourceGroupName value.
     *
     * @return the resourceGroupName value
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resourceGroupName value.
     *
     * @param resourceGroupName the resourceGroupName value to set
     * @return the FactoryRepoUpdateInner object itself.
     */
    public FactoryRepoUpdateInner withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get the vstsConfiguration value.
     *
     * @return the vstsConfiguration value
     */
    public FactoryVSTSConfiguration vstsConfiguration() {
        return this.vstsConfiguration;
    }

    /**
     * Set the vstsConfiguration value.
     *
     * @param vstsConfiguration the vstsConfiguration value to set
     * @return the FactoryRepoUpdateInner object itself.
     */
    public FactoryRepoUpdateInner withVstsConfiguration(FactoryVSTSConfiguration vstsConfiguration) {
        this.vstsConfiguration = vstsConfiguration;
        return this;
    }

}
