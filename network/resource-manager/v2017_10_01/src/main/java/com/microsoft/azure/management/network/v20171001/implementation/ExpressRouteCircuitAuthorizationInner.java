/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01.implementation;

import com.microsoft.azure.management.network.v20171001.AuthorizationUseStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Authorization in an ExpressRouteCircuit resource.
 */
@JsonFlatten
public class ExpressRouteCircuitAuthorizationInner extends SubResource {
    /**
     * The authorization key.
     */
    @JsonProperty(value = "properties.authorizationKey")
    private String authorizationKey;

    /**
     * AuthorizationUseStatus. Possible values are: 'Available' and 'InUse'.
     * Possible values include: 'Available', 'InUse'.
     */
    @JsonProperty(value = "properties.authorizationUseStatus")
    private AuthorizationUseStatus authorizationUseStatus;

    /**
     * Gets the provisioning state of the public IP resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the authorization key.
     *
     * @return the authorizationKey value
     */
    public String authorizationKey() {
        return this.authorizationKey;
    }

    /**
     * Set the authorization key.
     *
     * @param authorizationKey the authorizationKey value to set
     * @return the ExpressRouteCircuitAuthorizationInner object itself.
     */
    public ExpressRouteCircuitAuthorizationInner withAuthorizationKey(String authorizationKey) {
        this.authorizationKey = authorizationKey;
        return this;
    }

    /**
     * Get authorizationUseStatus. Possible values are: 'Available' and 'InUse'. Possible values include: 'Available', 'InUse'.
     *
     * @return the authorizationUseStatus value
     */
    public AuthorizationUseStatus authorizationUseStatus() {
        return this.authorizationUseStatus;
    }

    /**
     * Set authorizationUseStatus. Possible values are: 'Available' and 'InUse'. Possible values include: 'Available', 'InUse'.
     *
     * @param authorizationUseStatus the authorizationUseStatus value to set
     * @return the ExpressRouteCircuitAuthorizationInner object itself.
     */
    public ExpressRouteCircuitAuthorizationInner withAuthorizationUseStatus(AuthorizationUseStatus authorizationUseStatus) {
        this.authorizationUseStatus = authorizationUseStatus;
        return this;
    }

    /**
     * Get gets the provisioning state of the public IP resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set gets the provisioning state of the public IP resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ExpressRouteCircuitAuthorizationInner object itself.
     */
    public ExpressRouteCircuitAuthorizationInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get gets name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set gets name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the ExpressRouteCircuitAuthorizationInner object itself.
     */
    public ExpressRouteCircuitAuthorizationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

}
