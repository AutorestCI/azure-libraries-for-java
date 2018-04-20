/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for MoveCost.
 */
public final class MoveCost extends ExpandableStringEnum<MoveCost> {
    /** Static value Zero for MoveCost. */
    public static final MoveCost ZERO = fromString("Zero");

    /** Static value Low for MoveCost. */
    public static final MoveCost LOW = fromString("Low");

    /** Static value Medium for MoveCost. */
    public static final MoveCost MEDIUM = fromString("Medium");

    /** Static value High for MoveCost. */
    public static final MoveCost HIGH = fromString("High");

    /**
     * Creates or finds a MoveCost from its string representation.
     * @param name a name to look for
     * @return the corresponding MoveCost
     */
    @JsonCreator
    public static MoveCost fromString(String name) {
        return fromString(name, MoveCost.class);
    }

    /**
     * @return known MoveCost values
     */
    public static Collection<MoveCost> values() {
        return values(MoveCost.class);
    }
}
