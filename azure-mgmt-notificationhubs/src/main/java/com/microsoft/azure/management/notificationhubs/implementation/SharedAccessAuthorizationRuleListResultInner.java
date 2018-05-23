/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response of the List Namespace operation.
 */
public class SharedAccessAuthorizationRuleListResultInner {
    /**
     * Result of the List AuthorizationRules operation.
     */
    @JsonProperty(value = "value")
    private List<SharedAccessAuthorizationRuleResourceInner> value;

    /**
     * Link to the next set of results. Not empty if Value contains incomplete
     * list of AuthorizationRules.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<SharedAccessAuthorizationRuleResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the SharedAccessAuthorizationRuleListResultInner object itself.
     */
    public SharedAccessAuthorizationRuleListResultInner withValue(List<SharedAccessAuthorizationRuleResourceInner> value) {
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

    /**
     * Set the nextLink value.
     *
     * @param nextLink the nextLink value to set
     * @return the SharedAccessAuthorizationRuleListResultInner object itself.
     */
    public SharedAccessAuthorizationRuleListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

}
