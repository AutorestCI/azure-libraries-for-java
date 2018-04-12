/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about an application type.
 */
public class ApplicationTypeInfo {
    /**
     * The application type name as defined in the application manifest.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * The version of the application type as defined in the application
     * manifest.
     */
    @JsonProperty(value = "Version")
    private String version;

    /**
     * List of application type parameters that can be overridden when creating
     * or updating the application.
     */
    @JsonProperty(value = "DefaultParameterList")
    private List<ApplicationParameter> defaultParameterList;

    /**
     * The status of the application type.
     * . Possible values include: 'Invalid', 'Provisioning', 'Available',
     * 'Unprovisioning', 'Failed'.
     */
    @JsonProperty(value = "Status")
    private ApplicationTypeStatus status;

    /**
     * Additional detailed information about the status of the application
     * type.
     */
    @JsonProperty(value = "StatusDetails")
    private String statusDetails;

    /**
     * The mechanism used to define a Service Fabric application type.
     * . Possible values include: 'Invalid', 'ServiceFabricApplicationPackage',
     * 'Compose'.
     */
    @JsonProperty(value = "ApplicationTypeDefinitionKind")
    private ApplicationTypeDefinitionKind applicationTypeDefinitionKind;

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
     * @return the ApplicationTypeInfo object itself.
     */
    public ApplicationTypeInfo withName(String name) {
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
     * @return the ApplicationTypeInfo object itself.
     */
    public ApplicationTypeInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the defaultParameterList value.
     *
     * @return the defaultParameterList value
     */
    public List<ApplicationParameter> defaultParameterList() {
        return this.defaultParameterList;
    }

    /**
     * Set the defaultParameterList value.
     *
     * @param defaultParameterList the defaultParameterList value to set
     * @return the ApplicationTypeInfo object itself.
     */
    public ApplicationTypeInfo withDefaultParameterList(List<ApplicationParameter> defaultParameterList) {
        this.defaultParameterList = defaultParameterList;
        return this;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public ApplicationTypeStatus status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the ApplicationTypeInfo object itself.
     */
    public ApplicationTypeInfo withStatus(ApplicationTypeStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the statusDetails value.
     *
     * @return the statusDetails value
     */
    public String statusDetails() {
        return this.statusDetails;
    }

    /**
     * Set the statusDetails value.
     *
     * @param statusDetails the statusDetails value to set
     * @return the ApplicationTypeInfo object itself.
     */
    public ApplicationTypeInfo withStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * Get the applicationTypeDefinitionKind value.
     *
     * @return the applicationTypeDefinitionKind value
     */
    public ApplicationTypeDefinitionKind applicationTypeDefinitionKind() {
        return this.applicationTypeDefinitionKind;
    }

    /**
     * Set the applicationTypeDefinitionKind value.
     *
     * @param applicationTypeDefinitionKind the applicationTypeDefinitionKind value to set
     * @return the ApplicationTypeInfo object itself.
     */
    public ApplicationTypeInfo withApplicationTypeDefinitionKind(ApplicationTypeDefinitionKind applicationTypeDefinitionKind) {
        this.applicationTypeDefinitionKind = applicationTypeDefinitionKind;
        return this;
    }

}
