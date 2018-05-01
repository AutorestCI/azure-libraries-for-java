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
 * The EntityRecord model.
 */
public class EntityRecord {
    /**
     * Entity formal name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * List of instances this entity appears in the text.
     */
    @JsonProperty(value = "matches", access = JsonProperty.Access.WRITE_ONLY)
    private List<MatchRecord> matches;

    /**
     * Wikipedia language for which the WikipediaId and WikipediaUrl refers to.
     */
    @JsonProperty(value = "wikipediaLanguage")
    private String wikipediaLanguage;

    /**
     * Wikipedia unique identifier of the recognized entity.
     */
    @JsonProperty(value = "wikipediaId")
    private String wikipediaId;

    /**
     * URL for the entity's English Wikipedia page.
     */
    @JsonProperty(value = "wikipediaUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String wikipediaUrl;

    /**
     * Bing unique identifier of the recognized entity. Use in conjunction with
     * the Bing Entity Search API to fetch additional relevant information.
     */
    @JsonProperty(value = "bingId")
    private String bingId;

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
     * @return the EntityRecord object itself.
     */
    public EntityRecord withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the matches value.
     *
     * @return the matches value
     */
    public List<MatchRecord> matches() {
        return this.matches;
    }

    /**
     * Get the wikipediaLanguage value.
     *
     * @return the wikipediaLanguage value
     */
    public String wikipediaLanguage() {
        return this.wikipediaLanguage;
    }

    /**
     * Set the wikipediaLanguage value.
     *
     * @param wikipediaLanguage the wikipediaLanguage value to set
     * @return the EntityRecord object itself.
     */
    public EntityRecord withWikipediaLanguage(String wikipediaLanguage) {
        this.wikipediaLanguage = wikipediaLanguage;
        return this;
    }

    /**
     * Get the wikipediaId value.
     *
     * @return the wikipediaId value
     */
    public String wikipediaId() {
        return this.wikipediaId;
    }

    /**
     * Set the wikipediaId value.
     *
     * @param wikipediaId the wikipediaId value to set
     * @return the EntityRecord object itself.
     */
    public EntityRecord withWikipediaId(String wikipediaId) {
        this.wikipediaId = wikipediaId;
        return this;
    }

    /**
     * Get the wikipediaUrl value.
     *
     * @return the wikipediaUrl value
     */
    public String wikipediaUrl() {
        return this.wikipediaUrl;
    }

    /**
     * Get the bingId value.
     *
     * @return the bingId value
     */
    public String bingId() {
        return this.bingId;
    }

    /**
     * Set the bingId value.
     *
     * @param bingId the bingId value to set
     * @return the EntityRecord object itself.
     */
    public EntityRecord withBingId(String bingId) {
        this.bingId = bingId;
        return this;
    }

}
