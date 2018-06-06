/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.implementation.LinkedServiceInner;

/**
 * Linked service for Sybase data source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Sybase")
@JsonFlatten
public class SybaseLinkedService extends LinkedServiceInner {
    /**
     * Server name for connection. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.server", required = true)
    private Object server;

    /**
     * Database name for connection. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.database", required = true)
    private Object database;

    /**
     * Schema name for connection. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.schema")
    private Object schema;

    /**
     * AuthenticationType to be used for connection. Possible values include:
     * 'Basic', 'Windows'.
     */
    @JsonProperty(value = "typeProperties.authenticationType")
    private SybaseAuthenticationType authenticationType;

    /**
     * Username for authentication. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /**
     * Password for authentication.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get server name for connection. Type: string (or Expression with resultType string).
     *
     * @return the server value
     */
    public Object server() {
        return this.server;
    }

    /**
     * Set server name for connection. Type: string (or Expression with resultType string).
     *
     * @param server the server value to set
     * @return the SybaseLinkedService object itself.
     */
    public SybaseLinkedService withServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get database name for connection. Type: string (or Expression with resultType string).
     *
     * @return the database value
     */
    public Object database() {
        return this.database;
    }

    /**
     * Set database name for connection. Type: string (or Expression with resultType string).
     *
     * @param database the database value to set
     * @return the SybaseLinkedService object itself.
     */
    public SybaseLinkedService withDatabase(Object database) {
        this.database = database;
        return this;
    }

    /**
     * Get schema name for connection. Type: string (or Expression with resultType string).
     *
     * @return the schema value
     */
    public Object schema() {
        return this.schema;
    }

    /**
     * Set schema name for connection. Type: string (or Expression with resultType string).
     *
     * @param schema the schema value to set
     * @return the SybaseLinkedService object itself.
     */
    public SybaseLinkedService withSchema(Object schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get authenticationType to be used for connection. Possible values include: 'Basic', 'Windows'.
     *
     * @return the authenticationType value
     */
    public SybaseAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set authenticationType to be used for connection. Possible values include: 'Basic', 'Windows'.
     *
     * @param authenticationType the authenticationType value to set
     * @return the SybaseLinkedService object itself.
     */
    public SybaseLinkedService withAuthenticationType(SybaseAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get username for authentication. Type: string (or Expression with resultType string).
     *
     * @return the username value
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set username for authentication. Type: string (or Expression with resultType string).
     *
     * @param username the username value to set
     * @return the SybaseLinkedService object itself.
     */
    public SybaseLinkedService withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get password for authentication.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set password for authentication.
     *
     * @param password the password value to set
     * @return the SybaseLinkedService object itself.
     */
    public SybaseLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the SybaseLinkedService object itself.
     */
    public SybaseLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
