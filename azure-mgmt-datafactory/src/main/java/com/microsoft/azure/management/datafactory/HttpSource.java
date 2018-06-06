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

/**
 * A copy activity source for an HTTP file.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("HttpSource")
public class HttpSource extends CopySource {
    /**
     * Specifies the timeout for a HTTP client to get HTTP response from HTTP
     * server. The default value is equivalent to
     * System.Net.HttpWebRequest.Timeout. Type: string (or Expression with
     * resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "httpRequestTimeout")
    private Object httpRequestTimeout;

    /**
     * Get specifies the timeout for a HTTP client to get HTTP response from HTTP server. The default value is equivalent to System.Net.HttpWebRequest.Timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the httpRequestTimeout value
     */
    public Object httpRequestTimeout() {
        return this.httpRequestTimeout;
    }

    /**
     * Set specifies the timeout for a HTTP client to get HTTP response from HTTP server. The default value is equivalent to System.Net.HttpWebRequest.Timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param httpRequestTimeout the httpRequestTimeout value to set
     * @return the HttpSource object itself.
     */
    public HttpSource withHttpRequestTimeout(Object httpRequestTimeout) {
        this.httpRequestTimeout = httpRequestTimeout;
        return this;
    }

}
