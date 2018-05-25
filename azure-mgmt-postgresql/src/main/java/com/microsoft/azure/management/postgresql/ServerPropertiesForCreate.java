/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The properties used to create a new server.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "createMode")
@JsonTypeName("ServerPropertiesForCreate")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Default", value = ServerPropertiesForDefaultCreate.class),
    @JsonSubTypes.Type(name = "PointInTimeRestore", value = ServerPropertiesForRestore.class),
    @JsonSubTypes.Type(name = "GeoRestore", value = ServerPropertiesForGeoRestore.class)
})
public class ServerPropertiesForCreate {
    /**
     * Server version. Possible values include: '9.5', '9.6'.
     */
    @JsonProperty(value = "version")
    private ServerVersion version;

    /**
     * Enable ssl enforcement or not when connect to server. Possible values
     * include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "sslEnforcement")
    private SslEnforcementEnum sslEnforcement;

    /**
     * Storage profile of a server.
     */
    @JsonProperty(value = "storageProfile")
    private StorageProfile storageProfile;

    /**
     * Get server version. Possible values include: '9.5', '9.6'.
     *
     * @return the version value
     */
    public ServerVersion version() {
        return this.version;
    }

    /**
     * Set server version. Possible values include: '9.5', '9.6'.
     *
     * @param version the version value to set
     * @return the ServerPropertiesForCreate object itself.
     */
    public ServerPropertiesForCreate withVersion(ServerVersion version) {
        this.version = version;
        return this;
    }

    /**
     * Get enable ssl enforcement or not when connect to server. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the sslEnforcement value
     */
    public SslEnforcementEnum sslEnforcement() {
        return this.sslEnforcement;
    }

    /**
     * Set enable ssl enforcement or not when connect to server. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param sslEnforcement the sslEnforcement value to set
     * @return the ServerPropertiesForCreate object itself.
     */
    public ServerPropertiesForCreate withSslEnforcement(SslEnforcementEnum sslEnforcement) {
        this.sslEnforcement = sslEnforcement;
        return this;
    }

    /**
     * Get storage profile of a server.
     *
     * @return the storageProfile value
     */
    public StorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set storage profile of a server.
     *
     * @param storageProfile the storageProfile value to set
     * @return the ServerPropertiesForCreate object itself.
     */
    public ServerPropertiesForCreate withStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

}
