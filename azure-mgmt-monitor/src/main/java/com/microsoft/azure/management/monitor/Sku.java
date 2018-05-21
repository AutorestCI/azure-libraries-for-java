/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Sku.
 */
public final class Sku extends ExpandableStringEnum<Sku> {
    /** Static value L1 for Sku. */
    public static final Sku L1 = fromString("L1");

    /** Static value L2 for Sku. */
    public static final Sku L2 = fromString("L2");

    /** Static value L3 for Sku. */
    public static final Sku L3 = fromString("L3");

    /**
     * Creates or finds a Sku from its string representation.
     * @param name a name to look for
     * @return the corresponding Sku
     */
    @JsonCreator
    public static Sku fromString(String name) {
        return fromString(name, Sku.class);
    }

    /**
     * @return known Sku values
     */
    public static Collection<Sku> values() {
        return values(Sku.class);
    }
}