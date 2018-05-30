/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servermanagement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Collection of parameters for operations on a gateway resource.
 */
@JsonFlatten
public class GatewayParameters {
    /**
     * Location of the resource.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Object tags;

    /**
     * The upgradeMode property gives the flexibility to gateway to auto
     * upgrade itself. If properties value not specified, then we assume
     * upgradeMode = Automatic. Possible values include: 'Manual', 'Automatic'.
     */
    @JsonProperty(value = "properties.upgradeMode")
    private UpgradeMode upgradeMode;

    /**
     * Get location of the resource.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set location of the resource.
     *
     * @param location the location value to set
     * @return the GatewayParameters object itself.
     */
    public GatewayParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Object tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the GatewayParameters object itself.
     */
    public GatewayParameters withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the upgradeMode property gives the flexibility to gateway to auto upgrade itself. If properties value not specified, then we assume upgradeMode = Automatic. Possible values include: 'Manual', 'Automatic'.
     *
     * @return the upgradeMode value
     */
    public UpgradeMode upgradeMode() {
        return this.upgradeMode;
    }

    /**
     * Set the upgradeMode property gives the flexibility to gateway to auto upgrade itself. If properties value not specified, then we assume upgradeMode = Automatic. Possible values include: 'Manual', 'Automatic'.
     *
     * @param upgradeMode the upgradeMode value to set
     * @return the GatewayParameters object itself.
     */
    public GatewayParameters withUpgradeMode(UpgradeMode upgradeMode) {
        this.upgradeMode = upgradeMode;
        return this;
    }

}