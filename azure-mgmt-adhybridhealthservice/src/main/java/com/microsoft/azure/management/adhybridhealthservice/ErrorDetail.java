/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice;

import com.microsoft.azure.management.adhybridhealthservice.implementation.MergedExportErrorInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The error details.
 */
public class ErrorDetail {
    /**
     * The error description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * The knowledge base article url which contains more information about the
     * error.
     */
    @JsonProperty(value = "kbUrl")
    private String kbUrl;

    /**
     * Additional details related to the error.
     */
    @JsonProperty(value = "detail")
    private String detail;

    /**
     * The list of objects with sync errors.
     */
    @JsonProperty(value = "objectsWithSyncError")
    private ObjectWithSyncError objectsWithSyncError;

    /**
     * The object with sync error.
     */
    @JsonProperty(value = "objectWithSyncError")
    private MergedExportErrorInner objectWithSyncError;

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the ErrorDetail object itself.
     */
    public ErrorDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the kbUrl value.
     *
     * @return the kbUrl value
     */
    public String kbUrl() {
        return this.kbUrl;
    }

    /**
     * Set the kbUrl value.
     *
     * @param kbUrl the kbUrl value to set
     * @return the ErrorDetail object itself.
     */
    public ErrorDetail withKbUrl(String kbUrl) {
        this.kbUrl = kbUrl;
        return this;
    }

    /**
     * Get the detail value.
     *
     * @return the detail value
     */
    public String detail() {
        return this.detail;
    }

    /**
     * Set the detail value.
     *
     * @param detail the detail value to set
     * @return the ErrorDetail object itself.
     */
    public ErrorDetail withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Get the objectsWithSyncError value.
     *
     * @return the objectsWithSyncError value
     */
    public ObjectWithSyncError objectsWithSyncError() {
        return this.objectsWithSyncError;
    }

    /**
     * Set the objectsWithSyncError value.
     *
     * @param objectsWithSyncError the objectsWithSyncError value to set
     * @return the ErrorDetail object itself.
     */
    public ErrorDetail withObjectsWithSyncError(ObjectWithSyncError objectsWithSyncError) {
        this.objectsWithSyncError = objectsWithSyncError;
        return this;
    }

    /**
     * Get the objectWithSyncError value.
     *
     * @return the objectWithSyncError value
     */
    public MergedExportErrorInner objectWithSyncError() {
        return this.objectWithSyncError;
    }

    /**
     * Set the objectWithSyncError value.
     *
     * @param objectWithSyncError the objectWithSyncError value to set
     * @return the ErrorDetail object itself.
     */
    public ErrorDetail withObjectWithSyncError(MergedExportErrorInner objectWithSyncError) {
        this.objectWithSyncError = objectWithSyncError;
        return this;
    }

}
