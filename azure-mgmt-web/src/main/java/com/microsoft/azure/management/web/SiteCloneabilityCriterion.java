/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.web;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An app cloneability criterion.
 */
public class SiteCloneabilityCriterion {
    /**
     * Name of criterion.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Description of criterion.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the SiteCloneabilityCriterion object itself.
     */
    public SiteCloneabilityCriterion withName(String name) {
        this.name = name;
        return this;
    }

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
     * @return the SiteCloneabilityCriterion object itself.
     */
    public SiteCloneabilityCriterion withDescription(String description) {
        this.description = description;
        return this;
    }

}
