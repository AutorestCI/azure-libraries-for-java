/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.web.implementation;

import java.util.List;
import com.microsoft.azure.management.web.VnetValidationTestFailure;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.web.ProxyOnlyResource;

/**
 * A class that describes the reason for a validation failure.
 */
@JsonFlatten
public class VnetValidationFailureDetailsInner extends ProxyOnlyResource {
    /**
     * A flag describing whether or not validation failed.
     */
    @JsonProperty(value = "properties.failed")
    private Boolean failed;

    /**
     * A list of tests that failed in the validation.
     */
    @JsonProperty(value = "properties.failedTests")
    private List<VnetValidationTestFailure> failedTests;

    /**
     * Get a flag describing whether or not validation failed.
     *
     * @return the failed value
     */
    public Boolean failed() {
        return this.failed;
    }

    /**
     * Set a flag describing whether or not validation failed.
     *
     * @param failed the failed value to set
     * @return the VnetValidationFailureDetailsInner object itself.
     */
    public VnetValidationFailureDetailsInner withFailed(Boolean failed) {
        this.failed = failed;
        return this;
    }

    /**
     * Get a list of tests that failed in the validation.
     *
     * @return the failedTests value
     */
    public List<VnetValidationTestFailure> failedTests() {
        return this.failedTests;
    }

    /**
     * Set a list of tests that failed in the validation.
     *
     * @param failedTests the failedTests value to set
     * @return the VnetValidationFailureDetailsInner object itself.
     */
    public VnetValidationFailureDetailsInner withFailedTests(List<VnetValidationTestFailure> failedTests) {
        this.failedTests = failedTests;
        return this;
    }

}
