/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.implementation;

import com.microsoft.azure.management.adhybridhealthservice.ServiceType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The service configuration.
 */
public class ServiceConfigurationInner {
    /**
     * The version of the sync service.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * The service type of the server. Possible values include: 'Undefined',
     * 'AadConnectSync', 'DirSync'.
     */
    @JsonProperty(value = "serviceType")
    private ServiceType serviceType;

    /**
     * The service account.
     */
    @JsonProperty(value = "serviceAccount")
    private String serviceAccount;

    /**
     * The SQL server information.
     */
    @JsonProperty(value = "sqlServer")
    private String sqlServer;

    /**
     * The SQL version.
     */
    @JsonProperty(value = "sqlVersion")
    private String sqlVersion;

    /**
     * The SQL edition.
     */
    @JsonProperty(value = "sqlEdition")
    private String sqlEdition;

    /**
     * The SQL instance details.
     */
    @JsonProperty(value = "sqlInstance")
    private String sqlInstance;

    /**
     * The SQL database.
     */
    @JsonProperty(value = "sqlDatabase")
    private String sqlDatabase;

    /**
     * The SQL database size.
     */
    @JsonProperty(value = "sqlDatabaseSize")
    private Integer sqlDatabaseSize;

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
     * @return the ServiceConfigurationInner object itself.
     */
    public ServiceConfigurationInner withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the serviceType value.
     *
     * @return the serviceType value
     */
    public ServiceType serviceType() {
        return this.serviceType;
    }

    /**
     * Set the serviceType value.
     *
     * @param serviceType the serviceType value to set
     * @return the ServiceConfigurationInner object itself.
     */
    public ServiceConfigurationInner withServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * Get the serviceAccount value.
     *
     * @return the serviceAccount value
     */
    public String serviceAccount() {
        return this.serviceAccount;
    }

    /**
     * Set the serviceAccount value.
     *
     * @param serviceAccount the serviceAccount value to set
     * @return the ServiceConfigurationInner object itself.
     */
    public ServiceConfigurationInner withServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
        return this;
    }

    /**
     * Get the sqlServer value.
     *
     * @return the sqlServer value
     */
    public String sqlServer() {
        return this.sqlServer;
    }

    /**
     * Set the sqlServer value.
     *
     * @param sqlServer the sqlServer value to set
     * @return the ServiceConfigurationInner object itself.
     */
    public ServiceConfigurationInner withSqlServer(String sqlServer) {
        this.sqlServer = sqlServer;
        return this;
    }

    /**
     * Get the sqlVersion value.
     *
     * @return the sqlVersion value
     */
    public String sqlVersion() {
        return this.sqlVersion;
    }

    /**
     * Set the sqlVersion value.
     *
     * @param sqlVersion the sqlVersion value to set
     * @return the ServiceConfigurationInner object itself.
     */
    public ServiceConfigurationInner withSqlVersion(String sqlVersion) {
        this.sqlVersion = sqlVersion;
        return this;
    }

    /**
     * Get the sqlEdition value.
     *
     * @return the sqlEdition value
     */
    public String sqlEdition() {
        return this.sqlEdition;
    }

    /**
     * Set the sqlEdition value.
     *
     * @param sqlEdition the sqlEdition value to set
     * @return the ServiceConfigurationInner object itself.
     */
    public ServiceConfigurationInner withSqlEdition(String sqlEdition) {
        this.sqlEdition = sqlEdition;
        return this;
    }

    /**
     * Get the sqlInstance value.
     *
     * @return the sqlInstance value
     */
    public String sqlInstance() {
        return this.sqlInstance;
    }

    /**
     * Set the sqlInstance value.
     *
     * @param sqlInstance the sqlInstance value to set
     * @return the ServiceConfigurationInner object itself.
     */
    public ServiceConfigurationInner withSqlInstance(String sqlInstance) {
        this.sqlInstance = sqlInstance;
        return this;
    }

    /**
     * Get the sqlDatabase value.
     *
     * @return the sqlDatabase value
     */
    public String sqlDatabase() {
        return this.sqlDatabase;
    }

    /**
     * Set the sqlDatabase value.
     *
     * @param sqlDatabase the sqlDatabase value to set
     * @return the ServiceConfigurationInner object itself.
     */
    public ServiceConfigurationInner withSqlDatabase(String sqlDatabase) {
        this.sqlDatabase = sqlDatabase;
        return this;
    }

    /**
     * Get the sqlDatabaseSize value.
     *
     * @return the sqlDatabaseSize value
     */
    public Integer sqlDatabaseSize() {
        return this.sqlDatabaseSize;
    }

    /**
     * Set the sqlDatabaseSize value.
     *
     * @param sqlDatabaseSize the sqlDatabaseSize value to set
     * @return the ServiceConfigurationInner object itself.
     */
    public ServiceConfigurationInner withSqlDatabaseSize(Integer sqlDatabaseSize) {
        this.sqlDatabaseSize = sqlDatabaseSize;
        return this;
    }

}
