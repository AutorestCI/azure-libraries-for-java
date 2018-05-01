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
 * The help link which contains more information related to an alert.
 */
public class HelpLink {
    /**
     * The title for the link.
     */
    @JsonProperty(value = "title")
    private String title;

    /**
     * The url for the help document.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * Get the title value.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title value.
     *
     * @param title the title value to set
     * @return the HelpLink object itself.
     */
    public HelpLink withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the url value.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url value.
     *
     * @param url the url value to set
     * @return the HelpLink object itself.
     */
    public HelpLink withUrl(String url) {
        this.url = url;
        return this;
    }

}
