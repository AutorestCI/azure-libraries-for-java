/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iotcentral;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AppSku.
 */
public final class AppSku extends ExpandableStringEnum<AppSku> {
    /** Static value F1 for AppSku. */
    public static final AppSku F1 = fromString("F1");

    /** Static value S1 for AppSku. */
    public static final AppSku S1 = fromString("S1");

    /**
     * Creates or finds a AppSku from its string representation.
     * @param name a name to look for
     * @return the corresponding AppSku
     */
    @JsonCreator
    public static AppSku fromString(String name) {
        return fromString(name, AppSku.class);
    }

    /**
     * @return known AppSku values
     */
    public static Collection<AppSku> values() {
        return values(AppSku.class);
    }
}
