/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.implementation;

import com.microsoft.azure.management.iothub.TestResultStatus;
import com.microsoft.azure.management.iothub.TestRouteResultDetails;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of testing one route.
 */
public class TestRouteResultInner {
    /**
     * Result of testing route. Possible values include: 'undefined', 'false',
     * 'true'.
     */
    @JsonProperty(value = "result")
    private TestResultStatus result;

    /**
     * Detailed result of testing route.
     */
    @JsonProperty(value = "details")
    private TestRouteResultDetails details;

    /**
     * Get the result value.
     *
     * @return the result value
     */
    public TestResultStatus result() {
        return this.result;
    }

    /**
     * Set the result value.
     *
     * @param result the result value to set
     * @return the TestRouteResultInner object itself.
     */
    public TestRouteResultInner withResult(TestResultStatus result) {
        this.result = result;
        return this;
    }

    /**
     * Get the details value.
     *
     * @return the details value
     */
    public TestRouteResultDetails details() {
        return this.details;
    }

    /**
     * Set the details value.
     *
     * @param details the details value to set
     * @return the TestRouteResultInner object itself.
     */
    public TestRouteResultInner withDetails(TestRouteResultDetails details) {
        this.details = details;
        return this;
    }

}
