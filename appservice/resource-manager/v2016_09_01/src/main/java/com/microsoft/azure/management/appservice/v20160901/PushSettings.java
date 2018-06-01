/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Push settings for the App.
 */
@JsonFlatten
public class PushSettings extends ProxyOnlyResource {
    /**
     * Gets or sets a flag indicating whether the Push endpoint is enabled.
     */
    @JsonProperty(value = "properties.isPushEnabled", required = true)
    private boolean isPushEnabled;

    /**
     * Gets or sets a JSON string containing a list of tags that are
     * whitelisted for use by the push registration endpoint.
     */
    @JsonProperty(value = "properties.tagWhitelistJson")
    private String tagWhitelistJson;

    /**
     * Gets or sets a JSON string containing a list of tags that require user
     * authentication to be used in the push registration endpoint.
     * Tags can consist of alphanumeric characters and the following:
     * '_', '@', '#', '.', ':', '-'.
     * Validation should be performed at the PushRequestHandler.
     */
    @JsonProperty(value = "properties.tagsRequiringAuth")
    private String tagsRequiringAuth;

    /**
     * Gets or sets a JSON string containing a list of dynamic tags that will
     * be evaluated from user claims in the push registration endpoint.
     */
    @JsonProperty(value = "properties.dynamicTagsJson")
    private String dynamicTagsJson;

    /**
     * Get gets or sets a flag indicating whether the Push endpoint is enabled.
     *
     * @return the isPushEnabled value
     */
    public boolean isPushEnabled() {
        return this.isPushEnabled;
    }

    /**
     * Set gets or sets a flag indicating whether the Push endpoint is enabled.
     *
     * @param isPushEnabled the isPushEnabled value to set
     * @return the PushSettings object itself.
     */
    public PushSettings withIsPushEnabled(boolean isPushEnabled) {
        this.isPushEnabled = isPushEnabled;
        return this;
    }

    /**
     * Get gets or sets a JSON string containing a list of tags that are whitelisted for use by the push registration endpoint.
     *
     * @return the tagWhitelistJson value
     */
    public String tagWhitelistJson() {
        return this.tagWhitelistJson;
    }

    /**
     * Set gets or sets a JSON string containing a list of tags that are whitelisted for use by the push registration endpoint.
     *
     * @param tagWhitelistJson the tagWhitelistJson value to set
     * @return the PushSettings object itself.
     */
    public PushSettings withTagWhitelistJson(String tagWhitelistJson) {
        this.tagWhitelistJson = tagWhitelistJson;
        return this;
    }

    /**
     * Get gets or sets a JSON string containing a list of tags that require user authentication to be used in the push registration endpoint.
     Tags can consist of alphanumeric characters and the following:
     '_', '@', '#', '.', ':', '-'.
     Validation should be performed at the PushRequestHandler.
     *
     * @return the tagsRequiringAuth value
     */
    public String tagsRequiringAuth() {
        return this.tagsRequiringAuth;
    }

    /**
     * Set gets or sets a JSON string containing a list of tags that require user authentication to be used in the push registration endpoint.
     Tags can consist of alphanumeric characters and the following:
     '_', '@', '#', '.', ':', '-'.
     Validation should be performed at the PushRequestHandler.
     *
     * @param tagsRequiringAuth the tagsRequiringAuth value to set
     * @return the PushSettings object itself.
     */
    public PushSettings withTagsRequiringAuth(String tagsRequiringAuth) {
        this.tagsRequiringAuth = tagsRequiringAuth;
        return this;
    }

    /**
     * Get gets or sets a JSON string containing a list of dynamic tags that will be evaluated from user claims in the push registration endpoint.
     *
     * @return the dynamicTagsJson value
     */
    public String dynamicTagsJson() {
        return this.dynamicTagsJson;
    }

    /**
     * Set gets or sets a JSON string containing a list of dynamic tags that will be evaluated from user claims in the push registration endpoint.
     *
     * @param dynamicTagsJson the dynamicTagsJson value to set
     * @return the PushSettings object itself.
     */
    public PushSettings withDynamicTagsJson(String dynamicTagsJson) {
        this.dynamicTagsJson = dynamicTagsJson;
        return this;
    }

}
