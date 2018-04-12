/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import java.util.List;
import com.microsoft.azure.servicefabric.ServiceHealthState;
import com.microsoft.azure.servicefabric.DeployedApplicationHealthState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.servicefabric.EntityHealth;

/**
 * Represents the health of the application. Contains the application
 * aggregated health state and the service and deployed application health
 * states.
 */
public class ApplicationHealthInner extends EntityHealth {
    /**
     * The name of the application, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * Service health states as found in the health store.
     */
    @JsonProperty(value = "ServiceHealthStates")
    private List<ServiceHealthState> serviceHealthStates;

    /**
     * Deployed application health states as found in the health store.
     */
    @JsonProperty(value = "DeployedApplicationHealthStates")
    private List<DeployedApplicationHealthState> deployedApplicationHealthStates;

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
     * @return the ApplicationHealthInner object itself.
     */
    public ApplicationHealthInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the serviceHealthStates value.
     *
     * @return the serviceHealthStates value
     */
    public List<ServiceHealthState> serviceHealthStates() {
        return this.serviceHealthStates;
    }

    /**
     * Set the serviceHealthStates value.
     *
     * @param serviceHealthStates the serviceHealthStates value to set
     * @return the ApplicationHealthInner object itself.
     */
    public ApplicationHealthInner withServiceHealthStates(List<ServiceHealthState> serviceHealthStates) {
        this.serviceHealthStates = serviceHealthStates;
        return this;
    }

    /**
     * Get the deployedApplicationHealthStates value.
     *
     * @return the deployedApplicationHealthStates value
     */
    public List<DeployedApplicationHealthState> deployedApplicationHealthStates() {
        return this.deployedApplicationHealthStates;
    }

    /**
     * Set the deployedApplicationHealthStates value.
     *
     * @param deployedApplicationHealthStates the deployedApplicationHealthStates value to set
     * @return the ApplicationHealthInner object itself.
     */
    public ApplicationHealthInner withDeployedApplicationHealthStates(List<DeployedApplicationHealthState> deployedApplicationHealthStates) {
        this.deployedApplicationHealthStates = deployedApplicationHealthStates;
        return this;
    }

}
