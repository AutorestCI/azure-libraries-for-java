/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The execution options of a job step.
 */
public class JobStepExecutionOptions {
    /**
     * Execution timeout for the job step.
     */
    @JsonProperty(value = "timeoutSeconds")
    private Integer timeoutSeconds;

    /**
     * Maximum number of times the job step will be reattempted if the first
     * attempt fails.
     */
    @JsonProperty(value = "retryAttempts")
    private Integer retryAttempts;

    /**
     * Initial delay between retries for job step execution.
     */
    @JsonProperty(value = "initialRetryIntervalSeconds")
    private Integer initialRetryIntervalSeconds;

    /**
     * The maximum amount of time to wait between retries for job step
     * execution.
     */
    @JsonProperty(value = "maximumRetryIntervalSeconds")
    private Integer maximumRetryIntervalSeconds;

    /**
     * The backoff multiplier for the time between retries.
     */
    @JsonProperty(value = "retryIntervalBackoffMultiplier")
    private Double retryIntervalBackoffMultiplier;

    /**
     * Get the timeoutSeconds value.
     *
     * @return the timeoutSeconds value
     */
    public Integer timeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * Set the timeoutSeconds value.
     *
     * @param timeoutSeconds the timeoutSeconds value to set
     * @return the JobStepExecutionOptions object itself.
     */
    public JobStepExecutionOptions withTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    /**
     * Get the retryAttempts value.
     *
     * @return the retryAttempts value
     */
    public Integer retryAttempts() {
        return this.retryAttempts;
    }

    /**
     * Set the retryAttempts value.
     *
     * @param retryAttempts the retryAttempts value to set
     * @return the JobStepExecutionOptions object itself.
     */
    public JobStepExecutionOptions withRetryAttempts(Integer retryAttempts) {
        this.retryAttempts = retryAttempts;
        return this;
    }

    /**
     * Get the initialRetryIntervalSeconds value.
     *
     * @return the initialRetryIntervalSeconds value
     */
    public Integer initialRetryIntervalSeconds() {
        return this.initialRetryIntervalSeconds;
    }

    /**
     * Set the initialRetryIntervalSeconds value.
     *
     * @param initialRetryIntervalSeconds the initialRetryIntervalSeconds value to set
     * @return the JobStepExecutionOptions object itself.
     */
    public JobStepExecutionOptions withInitialRetryIntervalSeconds(Integer initialRetryIntervalSeconds) {
        this.initialRetryIntervalSeconds = initialRetryIntervalSeconds;
        return this;
    }

    /**
     * Get the maximumRetryIntervalSeconds value.
     *
     * @return the maximumRetryIntervalSeconds value
     */
    public Integer maximumRetryIntervalSeconds() {
        return this.maximumRetryIntervalSeconds;
    }

    /**
     * Set the maximumRetryIntervalSeconds value.
     *
     * @param maximumRetryIntervalSeconds the maximumRetryIntervalSeconds value to set
     * @return the JobStepExecutionOptions object itself.
     */
    public JobStepExecutionOptions withMaximumRetryIntervalSeconds(Integer maximumRetryIntervalSeconds) {
        this.maximumRetryIntervalSeconds = maximumRetryIntervalSeconds;
        return this;
    }

    /**
     * Get the retryIntervalBackoffMultiplier value.
     *
     * @return the retryIntervalBackoffMultiplier value
     */
    public Double retryIntervalBackoffMultiplier() {
        return this.retryIntervalBackoffMultiplier;
    }

    /**
     * Set the retryIntervalBackoffMultiplier value.
     *
     * @param retryIntervalBackoffMultiplier the retryIntervalBackoffMultiplier value to set
     * @return the JobStepExecutionOptions object itself.
     */
    public JobStepExecutionOptions withRetryIntervalBackoffMultiplier(Double retryIntervalBackoffMultiplier) {
        this.retryIntervalBackoffMultiplier = retryIntervalBackoffMultiplier;
        return this;
    }

}
