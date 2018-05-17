/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.web.implementation;

import java.util.List;
import com.microsoft.azure.management.web.HostingEnvironmentDeploymentInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List of available locations (regions or App Service Environments) for
 * deployment of App Service resources.
 */
public class DeploymentLocationsInner {
    /**
     * Available regions.
     */
    @JsonProperty(value = "locations")
    private List<GeoRegionInner> locations;

    /**
     * Available App Service Environments with full descriptions of the
     * environments.
     */
    @JsonProperty(value = "hostingEnvironments")
    private List<AppServiceEnvironmentInner> hostingEnvironments;

    /**
     * Available App Service Environments with basic information.
     */
    @JsonProperty(value = "hostingEnvironmentDeploymentInfos")
    private List<HostingEnvironmentDeploymentInfo> hostingEnvironmentDeploymentInfos;

    /**
     * Get the locations value.
     *
     * @return the locations value
     */
    public List<GeoRegionInner> locations() {
        return this.locations;
    }

    /**
     * Set the locations value.
     *
     * @param locations the locations value to set
     * @return the DeploymentLocationsInner object itself.
     */
    public DeploymentLocationsInner withLocations(List<GeoRegionInner> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the hostingEnvironments value.
     *
     * @return the hostingEnvironments value
     */
    public List<AppServiceEnvironmentInner> hostingEnvironments() {
        return this.hostingEnvironments;
    }

    /**
     * Set the hostingEnvironments value.
     *
     * @param hostingEnvironments the hostingEnvironments value to set
     * @return the DeploymentLocationsInner object itself.
     */
    public DeploymentLocationsInner withHostingEnvironments(List<AppServiceEnvironmentInner> hostingEnvironments) {
        this.hostingEnvironments = hostingEnvironments;
        return this;
    }

    /**
     * Get the hostingEnvironmentDeploymentInfos value.
     *
     * @return the hostingEnvironmentDeploymentInfos value
     */
    public List<HostingEnvironmentDeploymentInfo> hostingEnvironmentDeploymentInfos() {
        return this.hostingEnvironmentDeploymentInfos;
    }

    /**
     * Set the hostingEnvironmentDeploymentInfos value.
     *
     * @param hostingEnvironmentDeploymentInfos the hostingEnvironmentDeploymentInfos value to set
     * @return the DeploymentLocationsInner object itself.
     */
    public DeploymentLocationsInner withHostingEnvironmentDeploymentInfos(List<HostingEnvironmentDeploymentInfo> hostingEnvironmentDeploymentInfos) {
        this.hostingEnvironmentDeploymentInfos = hostingEnvironmentDeploymentInfos;
        return this;
    }

}
