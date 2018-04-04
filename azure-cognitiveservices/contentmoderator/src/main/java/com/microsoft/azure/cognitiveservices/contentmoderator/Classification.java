/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.contentmoderator;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The classification details of the text.
 */
public class Classification {
    /**
     * The category1 property.
     */
    @JsonProperty(value = "Category1")
    private Score category1;

    /**
     * The category2 property.
     */
    @JsonProperty(value = "Category2")
    private Score category2;

    /**
     * The category3 property.
     */
    @JsonProperty(value = "Category3")
    private Score category3;

    /**
     * The review recommended flag.
     */
    @JsonProperty(value = "ReviewRecommended")
    private Boolean reviewRecommended;

    /**
     * Get the category1 value.
     *
     * @return the category1 value
     */
    public Score category1() {
        return this.category1;
    }

    /**
     * Set the category1 value.
     *
     * @param category1 the category1 value to set
     * @return the Classification object itself.
     */
    public Classification withCategory1(Score category1) {
        this.category1 = category1;
        return this;
    }

    /**
     * Get the category2 value.
     *
     * @return the category2 value
     */
    public Score category2() {
        return this.category2;
    }

    /**
     * Set the category2 value.
     *
     * @param category2 the category2 value to set
     * @return the Classification object itself.
     */
    public Classification withCategory2(Score category2) {
        this.category2 = category2;
        return this;
    }

    /**
     * Get the category3 value.
     *
     * @return the category3 value
     */
    public Score category3() {
        return this.category3;
    }

    /**
     * Set the category3 value.
     *
     * @param category3 the category3 value to set
     * @return the Classification object itself.
     */
    public Classification withCategory3(Score category3) {
        this.category3 = category3;
        return this;
    }

    /**
     * Get the reviewRecommended value.
     *
     * @return the reviewRecommended value
     */
    public Boolean reviewRecommended() {
        return this.reviewRecommended;
    }

    /**
     * Set the reviewRecommended value.
     *
     * @param reviewRecommended the reviewRecommended value to set
     * @return the Classification object itself.
     */
    public Classification withReviewRecommended(Boolean reviewRecommended) {
        this.reviewRecommended = reviewRecommended;
        return this;
    }

}
