/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A video analyzer preset that extracts insights (rich metadata) from both
 * audio and video, and outputs a JSON format file.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.VideoAnalyzerPreset")
public class VideoAnalyzerPreset extends AudioAnalyzerPreset {
    /**
     * Whether to only extract audio insights when processing a video file.
     */
    @JsonProperty(value = "audioInsightsOnly")
    private Boolean audioInsightsOnly;

    /**
     * Get the audioInsightsOnly value.
     *
     * @return the audioInsightsOnly value
     */
    public Boolean audioInsightsOnly() {
        return this.audioInsightsOnly;
    }

    /**
     * Set the audioInsightsOnly value.
     *
     * @param audioInsightsOnly the audioInsightsOnly value to set
     * @return the VideoAnalyzerPreset object itself.
     */
    public VideoAnalyzerPreset withAudioInsightsOnly(Boolean audioInsightsOnly) {
        this.audioInsightsOnly = audioInsightsOnly;
        return this;
    }

}
