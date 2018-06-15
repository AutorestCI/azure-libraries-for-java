/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.prediction;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Prediction model.
 */
public class Prediction {
    /**
     * The probability property.
     */
    @JsonProperty(value = "probability", access = JsonProperty.Access.WRITE_ONLY)
    private double probability;

    /**
     * The tagId property.
     */
    @JsonProperty(value = "tagId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID tagId;

    /**
     * The tagName property.
     */
    @JsonProperty(value = "tagName", access = JsonProperty.Access.WRITE_ONLY)
    private String tagName;

    /**
     * The boundingBox property.
     */
    @JsonProperty(value = "boundingBox", access = JsonProperty.Access.WRITE_ONLY)
    private BoundingBox boundingBox;

    /**
     * Get the probability value.
     *
     * @return the probability value
     */
    public double probability() {
        return this.probability;
    }

    /**
     * Get the tagId value.
     *
     * @return the tagId value
     */
    public UUID tagId() {
        return this.tagId;
    }

    /**
     * Get the tagName value.
     *
     * @return the tagName value
     */
    public String tagName() {
        return this.tagName;
    }

    /**
     * Get the boundingBox value.
     *
     * @return the boundingBox value
     */
    public BoundingBox boundingBox() {
        return this.boundingBox;
    }

}
