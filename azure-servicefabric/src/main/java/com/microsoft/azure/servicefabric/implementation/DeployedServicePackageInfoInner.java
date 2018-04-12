/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import com.microsoft.azure.servicefabric.DeploymentStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about service package deployed on a Service Fabric node.
 */
public class DeployedServicePackageInfoInner {
    /**
     * The name of the service package as specified in the service manifest.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * The version of the service package specified in service manifest.
     */
    @JsonProperty(value = "Version")
    private String version;

    /**
     * Specifies the status of a deployed application or service package on a
     * Service Fabric node.
     * . Possible values include: 'Invalid', 'Downloading', 'Activating',
     * 'Active', 'Upgrading', 'Deactivating'.
     */
    @JsonProperty(value = "Status")
    private DeploymentStatus status;

    /**
     * The ActivationId of a deployed service package. If
     * ServicePackageActivationMode specified at the time of creating the
     * service
     * is 'SharedProcess' (or if it is not specified, in which case it defaults
     * to 'SharedProcess'), then value of ServicePackageActivationId
     * is always an empty string.
     */
    @JsonProperty(value = "ServicePackageActivationId")
    private String servicePackageActivationId;

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
     * @return the DeployedServicePackageInfoInner object itself.
     */
    public DeployedServicePackageInfoInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set
     * @return the DeployedServicePackageInfoInner object itself.
     */
    public DeployedServicePackageInfoInner withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public DeploymentStatus status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the DeployedServicePackageInfoInner object itself.
     */
    public DeployedServicePackageInfoInner withStatus(DeploymentStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the servicePackageActivationId value.
     *
     * @return the servicePackageActivationId value
     */
    public String servicePackageActivationId() {
        return this.servicePackageActivationId;
    }

    /**
     * Set the servicePackageActivationId value.
     *
     * @param servicePackageActivationId the servicePackageActivationId value to set
     * @return the DeployedServicePackageInfoInner object itself.
     */
    public DeployedServicePackageInfoInner withServicePackageActivationId(String servicePackageActivationId) {
        this.servicePackageActivationId = servicePackageActivationId;
        return this;
    }

}
