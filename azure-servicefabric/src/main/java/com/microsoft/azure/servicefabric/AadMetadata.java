/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure Active Directory metadata used for secured connection to cluster.
 */
public class AadMetadata {
    /**
     * The AAD authority url.
     */
    @JsonProperty(value = "authority")
    private String authority;

    /**
     * The AAD client application Id.
     */
    @JsonProperty(value = "client")
    private String client;

    /**
     * The AAD cluster application Id.
     */
    @JsonProperty(value = "cluster")
    private String cluster;

    /**
     * The AAD login url.
     */
    @JsonProperty(value = "login")
    private String login;

    /**
     * The client application redirect address.
     */
    @JsonProperty(value = "redirect")
    private String redirect;

    /**
     * The AAD tenant Id.
     */
    @JsonProperty(value = "tenant")
    private String tenant;

    /**
     * Get the authority value.
     *
     * @return the authority value
     */
    public String authority() {
        return this.authority;
    }

    /**
     * Set the authority value.
     *
     * @param authority the authority value to set
     * @return the AadMetadata object itself.
     */
    public AadMetadata withAuthority(String authority) {
        this.authority = authority;
        return this;
    }

    /**
     * Get the client value.
     *
     * @return the client value
     */
    public String client() {
        return this.client;
    }

    /**
     * Set the client value.
     *
     * @param client the client value to set
     * @return the AadMetadata object itself.
     */
    public AadMetadata withClient(String client) {
        this.client = client;
        return this;
    }

    /**
     * Get the cluster value.
     *
     * @return the cluster value
     */
    public String cluster() {
        return this.cluster;
    }

    /**
     * Set the cluster value.
     *
     * @param cluster the cluster value to set
     * @return the AadMetadata object itself.
     */
    public AadMetadata withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * Get the login value.
     *
     * @return the login value
     */
    public String login() {
        return this.login;
    }

    /**
     * Set the login value.
     *
     * @param login the login value to set
     * @return the AadMetadata object itself.
     */
    public AadMetadata withLogin(String login) {
        this.login = login;
        return this;
    }

    /**
     * Get the redirect value.
     *
     * @return the redirect value
     */
    public String redirect() {
        return this.redirect;
    }

    /**
     * Set the redirect value.
     *
     * @param redirect the redirect value to set
     * @return the AadMetadata object itself.
     */
    public AadMetadata withRedirect(String redirect) {
        this.redirect = redirect;
        return this;
    }

    /**
     * Get the tenant value.
     *
     * @return the tenant value
     */
    public String tenant() {
        return this.tenant;
    }

    /**
     * Set the tenant value.
     *
     * @param tenant the tenant value to set
     * @return the AadMetadata object itself.
     */
    public AadMetadata withTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }

}
