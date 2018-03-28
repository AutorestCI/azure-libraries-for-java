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
 * Instructions for rendering the data.
 */
public class Rendering {
    /**
     * Rendering Type. Possible values include: 'NoGraph', 'Table',
     * 'TimeSeries', 'TimeSeriesPerInstance'.
     */
    @JsonProperty(value = "renderingType")
    private RenderingType renderingType;

    /**
     * Title of data.
     */
    @JsonProperty(value = "title")
    private String title;

    /**
     * Description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the renderingType value.
     *
     * @return the renderingType value
     */
    public RenderingType renderingType() {
        return this.renderingType;
    }

    /**
     * Set the renderingType value.
     *
     * @param renderingType the renderingType value to set
     * @return the Rendering object itself.
     */
    public Rendering withRenderingType(RenderingType renderingType) {
        this.renderingType = renderingType;
        return this;
    }

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
     * @return the Rendering object itself.
     */
    public Rendering withTitle(String title) {
        this.title = title;
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
     * @return the Rendering object itself.
     */
    public Rendering withDescription(String description) {
        this.description = description;
        return this;
    }

}
