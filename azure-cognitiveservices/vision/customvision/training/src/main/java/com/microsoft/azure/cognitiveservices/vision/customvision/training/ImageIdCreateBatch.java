/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training;

import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ImageIdCreateBatch model.
 */
public class ImageIdCreateBatch {
    /**
     * The images property.
     */
    @JsonProperty(value = "images")
    private List<ImageIdCreateEntry> images;

    /**
     * The tagIds property.
     */
    @JsonProperty(value = "tagIds")
    private List<UUID> tagIds;

    /**
     * Get the images value.
     *
     * @return the images value
     */
    public List<ImageIdCreateEntry> images() {
        return this.images;
    }

    /**
     * Set the images value.
     *
     * @param images the images value to set
     * @return the ImageIdCreateBatch object itself.
     */
    public ImageIdCreateBatch withImages(List<ImageIdCreateEntry> images) {
        this.images = images;
        return this;
    }

    /**
     * Get the tagIds value.
     *
     * @return the tagIds value
     */
    public List<UUID> tagIds() {
        return this.tagIds;
    }

    /**
     * Set the tagIds value.
     *
     * @param tagIds the tagIds value to set
     * @return the ImageIdCreateBatch object itself.
     */
    public ImageIdCreateBatch withTagIds(List<UUID> tagIds) {
        this.tagIds = tagIds;
        return this;
    }

}
