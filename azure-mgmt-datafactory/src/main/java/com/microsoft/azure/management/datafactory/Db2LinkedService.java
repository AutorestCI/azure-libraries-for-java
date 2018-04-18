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
 * Linked service for DB2 data source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Db2")
@JsonFlatten
public class Db2LinkedService extends LinkedServiceInner {
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
     * AuthenticationType to be used for connection. Possible values include:
     * 'Basic'.
     */
    @JsonProperty(value = "typeProperties.authenticationType")
    private Db2AuthenticationType authenticationType;

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
     * Get the server value.
     *
     * @return the server value
     */
    public Object server() {
        return this.server;
    }

    /**
     * Set the server value.
     *
     * @param server the server value to set
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the database value.
     *
     * @return the database value
     */
    public Object database() {
        return this.database;
    }

    /**
     * Set the database value.
     *
     * @param database the database value to set
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withDatabase(Object database) {
        this.database = database;
        return this;
    }

    /**
     * Get the authenticationType value.
     *
     * @return the authenticationType value
     */
    public Db2AuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType value.
     *
     * @param authenticationType the authenticationType value to set
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withAuthenticationType(Db2AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username value.
     *
     * @return the username value
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username value.
     *
     * @param username the username value to set
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password value.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password value.
     *
     * @param password the password value to set
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encryptedCredential value.
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential value.
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the Db2LinkedService object itself.
     */
    public Db2LinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
