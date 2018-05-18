/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.v2017_10_01.implementation;

import java.util.List;
import com.microsoft.azure.management.redis.v20171001.UpgradeNotification;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response of listUpgradeNotifications.
 */
public class NotificationListResponseInner {
    /**
     * List of all notifications.
     */
    @JsonProperty(value = "value")
    private List<UpgradeNotification> value;

    /**
     * Link for next set of notifications.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<UpgradeNotification> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the NotificationListResponseInner object itself.
     */
    public NotificationListResponseInner withValue(List<UpgradeNotification> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink value.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

}
