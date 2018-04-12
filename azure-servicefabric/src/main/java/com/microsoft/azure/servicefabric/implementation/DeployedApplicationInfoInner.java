/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import com.microsoft.azure.servicefabric.DeployedApplicationStatus;
import com.microsoft.azure.servicefabric.HealthState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about application deployed on the node.
 */
public class DeployedApplicationInfoInner {
    /**
     * The identity of the application. This is an encoded representation of
     * the application name. This is used in the REST APIs to identify the
     * application resource.
     * Starting in version 6.0, hierarchical names are delimited with the "\~"
     * character. For example, if the application name is "fabric:/myapp/app1",
     * the application identity would be "myapp\~app1" in 6.0+ and "myapp/app1"
     * in previous versions.
     */
    @JsonProperty(value = "Id")
    private String id;

    /**
     * The name of the application, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * The application type name as defined in the application manifest.
     */
    @JsonProperty(value = "TypeName")
    private String typeName;

    /**
     * The status of the application deployed on the node. Following are the
     * possible values.
     * . Possible values include: 'Invalid', 'Downloading', 'Activating',
     * 'Active', 'Upgrading', 'Deactivating'.
     */
    @JsonProperty(value = "Status")
    private DeployedApplicationStatus status;

    /**
     * The work directory of the application on the node. The work directory
     * can be used to store application data.
     */
    @JsonProperty(value = "WorkDirectory")
    private String workDirectory;

    /**
     * The log directory of the application on the node. The log directory can
     * be used to store application logs.
     */
    @JsonProperty(value = "LogDirectory")
    private String logDirectory;

    /**
     * The temp directory of the application on the node. The code packages
     * belonging to the application are forked with this directory set as their
     * temporary directory.
     */
    @JsonProperty(value = "TempDirectory")
    private String tempDirectory;

    /**
     * The health state of a Service Fabric entity such as Cluster, Node,
     * Application, Service, Partition, Replica etc. Possible values include:
     * 'Invalid', 'Ok', 'Warning', 'Error', 'Unknown'.
     */
    @JsonProperty(value = "HealthState")
    private HealthState healthState;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the DeployedApplicationInfoInner object itself.
     */
    public DeployedApplicationInfoInner withId(String id) {
        this.id = id;
        return this;
    }

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
     * @return the DeployedApplicationInfoInner object itself.
     */
    public DeployedApplicationInfoInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the typeName value.
     *
     * @return the typeName value
     */
    public String typeName() {
        return this.typeName;
    }

    /**
     * Set the typeName value.
     *
     * @param typeName the typeName value to set
     * @return the DeployedApplicationInfoInner object itself.
     */
    public DeployedApplicationInfoInner withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public DeployedApplicationStatus status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the DeployedApplicationInfoInner object itself.
     */
    public DeployedApplicationInfoInner withStatus(DeployedApplicationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the workDirectory value.
     *
     * @return the workDirectory value
     */
    public String workDirectory() {
        return this.workDirectory;
    }

    /**
     * Set the workDirectory value.
     *
     * @param workDirectory the workDirectory value to set
     * @return the DeployedApplicationInfoInner object itself.
     */
    public DeployedApplicationInfoInner withWorkDirectory(String workDirectory) {
        this.workDirectory = workDirectory;
        return this;
    }

    /**
     * Get the logDirectory value.
     *
     * @return the logDirectory value
     */
    public String logDirectory() {
        return this.logDirectory;
    }

    /**
     * Set the logDirectory value.
     *
     * @param logDirectory the logDirectory value to set
     * @return the DeployedApplicationInfoInner object itself.
     */
    public DeployedApplicationInfoInner withLogDirectory(String logDirectory) {
        this.logDirectory = logDirectory;
        return this;
    }

    /**
     * Get the tempDirectory value.
     *
     * @return the tempDirectory value
     */
    public String tempDirectory() {
        return this.tempDirectory;
    }

    /**
     * Set the tempDirectory value.
     *
     * @param tempDirectory the tempDirectory value to set
     * @return the DeployedApplicationInfoInner object itself.
     */
    public DeployedApplicationInfoInner withTempDirectory(String tempDirectory) {
        this.tempDirectory = tempDirectory;
        return this;
    }

    /**
     * Get the healthState value.
     *
     * @return the healthState value
     */
    public HealthState healthState() {
        return this.healthState;
    }

    /**
     * Set the healthState value.
     *
     * @param healthState the healthState value to set
     * @return the DeployedApplicationInfoInner object itself.
     */
    public DeployedApplicationInfoInner withHealthState(HealthState healthState) {
        this.healthState = healthState;
        return this;
    }

}
