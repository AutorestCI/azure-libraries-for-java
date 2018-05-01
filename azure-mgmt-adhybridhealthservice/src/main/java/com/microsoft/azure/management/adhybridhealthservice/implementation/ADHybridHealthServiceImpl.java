/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the ADHybridHealthServiceImpl class.
 */
public class ADHybridHealthServiceImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The version of the API to be used with the client request. */
    private String apiVersion;

    /**
     * Gets The version of the API to be used with the client request.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public ADHybridHealthServiceImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public ADHybridHealthServiceImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public ADHybridHealthServiceImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The AddsservicesInner object to access its operations.
     */
    private AddsservicesInner addsservices;

    /**
     * Gets the AddsservicesInner object to access its operations.
     * @return the AddsservicesInner object.
     */
    public AddsservicesInner addsservices() {
        return this.addsservices;
    }

    /**
     * The AlertsInner object to access its operations.
     */
    private AlertsInner alerts;

    /**
     * Gets the AlertsInner object to access its operations.
     * @return the AlertsInner object.
     */
    public AlertsInner alerts() {
        return this.alerts;
    }

    /**
     * The ConfigurationsInner object to access its operations.
     */
    private ConfigurationsInner configurations;

    /**
     * Gets the ConfigurationsInner object to access its operations.
     * @return the ConfigurationsInner object.
     */
    public ConfigurationsInner configurations() {
        return this.configurations;
    }

    /**
     * The DimensionsInner object to access its operations.
     */
    private DimensionsInner dimensions;

    /**
     * Gets the DimensionsInner object to access its operations.
     * @return the DimensionsInner object.
     */
    public DimensionsInner dimensions() {
        return this.dimensions;
    }

    /**
     * The AddsservicemembersInner object to access its operations.
     */
    private AddsservicemembersInner addsservicemembers;

    /**
     * Gets the AddsservicemembersInner object to access its operations.
     * @return the AddsservicemembersInner object.
     */
    public AddsservicemembersInner addsservicemembers() {
        return this.addsservicemembers;
    }

    /**
     * The AddomainservicemembersInner object to access its operations.
     */
    private AddomainservicemembersInner addomainservicemembers;

    /**
     * Gets the AddomainservicemembersInner object to access its operations.
     * @return the AddomainservicemembersInner object.
     */
    public AddomainservicemembersInner addomainservicemembers() {
        return this.addomainservicemembers;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * The ServicesInner object to access its operations.
     */
    private ServicesInner services;

    /**
     * Gets the ServicesInner object to access its operations.
     * @return the ServicesInner object.
     */
    public ServicesInner services() {
        return this.services;
    }

    /**
     * The ServicemembersInner object to access its operations.
     */
    private ServicemembersInner servicemembers;

    /**
     * Gets the ServicemembersInner object to access its operations.
     * @return the ServicemembersInner object.
     */
    public ServicemembersInner servicemembers() {
        return this.servicemembers;
    }

    /**
     * The ServimembersInner object to access its operations.
     */
    private ServimembersInner servimembers;

    /**
     * Gets the ServimembersInner object to access its operations.
     * @return the ServimembersInner object.
     */
    public ServimembersInner servimembers() {
        return this.servimembers;
    }

    /**
     * Initializes an instance of ADHybridHealthService client.
     *
     * @param credentials the management credentials for Azure
     */
    public ADHybridHealthServiceImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of ADHybridHealthService client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public ADHybridHealthServiceImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of ADHybridHealthService client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public ADHybridHealthServiceImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2014-01-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.addsservices = new AddsservicesInner(restClient().retrofit(), this);
        this.alerts = new AlertsInner(restClient().retrofit(), this);
        this.configurations = new ConfigurationsInner(restClient().retrofit(), this);
        this.dimensions = new DimensionsInner(restClient().retrofit(), this);
        this.addsservicemembers = new AddsservicemembersInner(restClient().retrofit(), this);
        this.addomainservicemembers = new AddomainservicemembersInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.services = new ServicesInner(restClient().retrofit(), this);
        this.servicemembers = new ServicemembersInner(restClient().retrofit(), this);
        this.servimembers = new ServimembersInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "ADHybridHealthService", "2014-01-01");
    }
}
