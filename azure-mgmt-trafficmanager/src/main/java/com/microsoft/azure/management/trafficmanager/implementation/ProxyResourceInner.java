/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.trafficmanager.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * The resource model definition for a ARM proxy resource. It will have
 * everything other than required location and tags.
 */
public class ProxyResourceInner extends ProxyResource {
    /**
     * Fully qualified resource Id for the resource. Ex -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{resourceName}.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The name of the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The type of the resource. Ex- Microsoft.Network/trafficmanagerProfiles.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{resourceName}.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{resourceName}.
     *
     * @param id the id value to set
     * @return the ProxyResourceInner object itself.
     */
    public ProxyResourceInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name of the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource.
     *
     * @param name the name value to set
     * @return the ProxyResourceInner object itself.
     */
    public ProxyResourceInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type of the resource. Ex- Microsoft.Network/trafficmanagerProfiles.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type of the resource. Ex- Microsoft.Network/trafficmanagerProfiles.
     *
     * @param type the type value to set
     * @return the ProxyResourceInner object itself.
     */
    public ProxyResourceInner withType(String type) {
        this.type = type;
        return this;
    }

}
