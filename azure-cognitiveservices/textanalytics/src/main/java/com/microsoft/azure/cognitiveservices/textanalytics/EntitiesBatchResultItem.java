/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.textanalytics;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The EntitiesBatchResultItem model.
 */
public class EntitiesBatchResultItem {
    /**
     * Unique document identifier.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Recognized entities in the document.
     */
    @JsonProperty(value = "entities", access = JsonProperty.Access.WRITE_ONLY)
    private List<EntityRecord> entities;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the entities value.
     *
     * @return the entities value
     */
    public List<EntityRecord> entities() {
        return this.entities;
    }

}
