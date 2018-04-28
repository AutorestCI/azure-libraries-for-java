/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The artifact content properties definition.
 */
public class ArtifactContentPropertiesDefinition extends ArtifactProperties {
    /**
     * The content property.
     */
    @JsonProperty(value = "content")
    private Object content;

    /**
     * The content type.
     */
    @JsonProperty(value = "contentType")
    private String contentType;

    /**
     * The content link.
     */
    @JsonProperty(value = "contentLink")
    private ContentLink contentLink;

    /**
     * Get the content value.
     *
     * @return the content value
     */
    public Object content() {
        return this.content;
    }

    /**
     * Set the content value.
     *
     * @param content the content value to set
     * @return the ArtifactContentPropertiesDefinition object itself.
     */
    public ArtifactContentPropertiesDefinition withContent(Object content) {
        this.content = content;
        return this;
    }

    /**
     * Get the contentType value.
     *
     * @return the contentType value
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType value.
     *
     * @param contentType the contentType value to set
     * @return the ArtifactContentPropertiesDefinition object itself.
     */
    public ArtifactContentPropertiesDefinition withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the contentLink value.
     *
     * @return the contentLink value
     */
    public ContentLink contentLink() {
        return this.contentLink;
    }

    /**
     * Set the contentLink value.
     *
     * @param contentLink the contentLink value to set
     * @return the ArtifactContentPropertiesDefinition object itself.
     */
    public ArtifactContentPropertiesDefinition withContentLink(ContentLink contentLink) {
        this.contentLink = contentLink;
        return this;
    }

}
