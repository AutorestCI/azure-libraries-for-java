/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The metric group details.
 */
public class MetricGroup {
    /**
     * The key for the group.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * The display name for the group.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * indicates if the metric group is displayed in Azure Active Directory
     * Connect Health UI.
     */
    @JsonProperty(value = "invisibleForUi")
    private Boolean invisibleForUi;

    /**
     * Get the key value.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key value.
     *
     * @param key the key value to set
     * @return the MetricGroup object itself.
     */
    public MetricGroup withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the MetricGroup object itself.
     */
    public MetricGroup withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the invisibleForUi value.
     *
     * @return the invisibleForUi value
     */
    public Boolean invisibleForUi() {
        return this.invisibleForUi;
    }

    /**
     * Set the invisibleForUi value.
     *
     * @param invisibleForUi the invisibleForUi value to set
     * @return the MetricGroup object itself.
     */
    public MetricGroup withInvisibleForUi(Boolean invisibleForUi) {
        this.invisibleForUi = invisibleForUi;
        return this;
    }

}
