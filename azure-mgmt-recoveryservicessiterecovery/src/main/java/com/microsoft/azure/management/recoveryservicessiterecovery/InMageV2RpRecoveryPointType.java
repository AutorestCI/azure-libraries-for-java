/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for InMageV2RpRecoveryPointType.
 */
public enum InMageV2RpRecoveryPointType {
    /** Enum value Latest. */
    LATEST("Latest"),

    /** Enum value LatestApplicationConsistent. */
    LATEST_APPLICATION_CONSISTENT("LatestApplicationConsistent"),

    /** Enum value LatestCrashConsistent. */
    LATEST_CRASH_CONSISTENT("LatestCrashConsistent"),

    /** Enum value LatestProcessed. */
    LATEST_PROCESSED("LatestProcessed");

    /** The actual serialized value for a InMageV2RpRecoveryPointType instance. */
    private String value;

    InMageV2RpRecoveryPointType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a InMageV2RpRecoveryPointType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed InMageV2RpRecoveryPointType object, or null if unable to parse.
     */
    @JsonCreator
    public static InMageV2RpRecoveryPointType fromString(String value) {
        InMageV2RpRecoveryPointType[] items = InMageV2RpRecoveryPointType.values();
        for (InMageV2RpRecoveryPointType item : items) {
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