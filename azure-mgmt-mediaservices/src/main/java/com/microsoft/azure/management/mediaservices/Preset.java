/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base type for all Presets, which define the recipe or instructions on how
 * the input media files should be processed.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("Preset")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.AudioAnalyzerPreset", value = AudioAnalyzerPreset.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.BuiltInStandardEncoderPreset", value = BuiltInStandardEncoderPreset.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.StandardEncoderPreset", value = StandardEncoderPreset.class)
})
public class Preset {
}
