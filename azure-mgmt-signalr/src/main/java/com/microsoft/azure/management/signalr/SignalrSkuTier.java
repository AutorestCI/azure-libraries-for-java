/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SignalrSkuTier.
 */
public final class SignalrSkuTier extends ExpandableStringEnum<SignalrSkuTier> {
    /** Static value Free for SignalrSkuTier. */
    public static final SignalrSkuTier FREE = fromString("Free");

    /** Static value Basic for SignalrSkuTier. */
    public static final SignalrSkuTier BASIC = fromString("Basic");

    /** Static value Premium for SignalrSkuTier. */
    public static final SignalrSkuTier PREMIUM = fromString("Premium");

    /**
     * Creates or finds a SignalrSkuTier from its string representation.
     * @param name a name to look for
     * @return the corresponding SignalrSkuTier
     */
    @JsonCreator
    public static SignalrSkuTier fromString(String name) {
        return fromString(name, SignalrSkuTier.class);
    }

    /**
     * @return known SignalrSkuTier values
     */
    public static Collection<SignalrSkuTier> values() {
        return values(SignalrSkuTier.class);
    }
}