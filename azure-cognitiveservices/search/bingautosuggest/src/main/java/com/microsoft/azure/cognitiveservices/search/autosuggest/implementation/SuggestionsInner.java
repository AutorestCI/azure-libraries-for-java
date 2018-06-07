/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.autosuggest.implementation;

import java.util.List;
import com.microsoft.azure.cognitiveservices.search.autosuggest.SuggestionsSuggestionGroup;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.cognitiveservices.search.autosuggest.SearchResultsAnswer;

/**
 * Defines an AutoSuggest answer.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type")
@JsonTypeName("Suggestions")
public class SuggestionsInner extends SearchResultsAnswer {
    /**
     * The suggestionGroups property.
     */
    @JsonProperty(value = "suggestionGroups", required = true)
    private List<SuggestionsSuggestionGroup> suggestionGroups;

    /**
     * Get the suggestionGroups value.
     *
     * @return the suggestionGroups value
     */
    public List<SuggestionsSuggestionGroup> suggestionGroups() {
        return this.suggestionGroups;
    }

    /**
     * Set the suggestionGroups value.
     *
     * @param suggestionGroups the suggestionGroups value to set
     * @return the SuggestionsInner object itself.
     */
    public SuggestionsInner withSuggestionGroups(List<SuggestionsSuggestionGroup> suggestionGroups) {
        this.suggestionGroups = suggestionGroups;
        return this;
    }

}
