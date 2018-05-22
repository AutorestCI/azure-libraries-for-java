/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for Rotation.
 */
public enum Rotation {
    /** Automatically detect and rotate as needed. */
    AUTO("Auto"),

    /** Do not rotate the video.  If the output format supports it, any metadata about rotation is kept intact. */
    NONE("None"),

    /** Do not rotate the video but remove any metadata about the rotation. */
    ROTATE0("Rotate0"),

    /** Rotate 90 degrees clockwise. */
    ROTATE90("Rotate90"),

    /** Rotate 180 degrees clockwise. */
    ROTATE180("Rotate180"),

    /** Rotate 270 degrees clockwise. */
    ROTATE270("Rotate270");

    /** The actual serialized value for a Rotation instance. */
    private String value;

    Rotation(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a Rotation instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed Rotation object, or null if unable to parse.
     */
    @JsonCreator
    public static Rotation fromString(String value) {
        Rotation[] items = Rotation.values();
        for (Rotation item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
