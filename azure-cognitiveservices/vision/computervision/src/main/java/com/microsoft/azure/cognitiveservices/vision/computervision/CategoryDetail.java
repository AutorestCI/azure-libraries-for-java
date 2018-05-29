/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object describing additional category details.
 */
public class CategoryDetail {
    /**
     * An array of celebrities if any identified.
     */
    @JsonProperty(value = "celebrities")
    private List<CelebritiesModel> celebrities;

    /**
     * Get an array of celebrities if any identified.
     *
     * @return the celebrities value
     */
    public List<CelebritiesModel> celebrities() {
        return this.celebrities;
    }

    /**
     * Set an array of celebrities if any identified.
     *
     * @param celebrities the celebrities value to set
     * @return the CategoryDetail object itself.
     */
    public CategoryDetail withCelebrities(List<CelebritiesModel> celebrities) {
        this.celebrities = celebrities;
        return this;
    }

}
