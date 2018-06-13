/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for Post operation.
 */
public class CloudEndpointPostRestorePostHeaders {
    /**
     * Operation Status Location URI.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * request id.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /**
     * correlation request id.
     */
    @JsonProperty(value = "x-ms-correlation-request-id")
    private String xMsCorrelationRequestId;

    /**
     * Get operation Status Location URI.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set operation Status Location URI.
     *
     * @param location the location value to set
     * @return the CloudEndpointPostRestorePostHeaders object itself.
     */
    public CloudEndpointPostRestorePostHeaders withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get request id.
     *
     * @return the xMsRequestId value
     */
    public String xMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set request id.
     *
     * @param xMsRequestId the xMsRequestId value to set
     * @return the CloudEndpointPostRestorePostHeaders object itself.
     */
    public CloudEndpointPostRestorePostHeaders withXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get correlation request id.
     *
     * @return the xMsCorrelationRequestId value
     */
    public String xMsCorrelationRequestId() {
        return this.xMsCorrelationRequestId;
    }

    /**
     * Set correlation request id.
     *
     * @param xMsCorrelationRequestId the xMsCorrelationRequestId value to set
     * @return the CloudEndpointPostRestorePostHeaders object itself.
     */
    public CloudEndpointPostRestorePostHeaders withXMsCorrelationRequestId(String xMsCorrelationRequestId) {
        this.xMsCorrelationRequestId = xMsCorrelationRequestId;
        return this;
    }

}
