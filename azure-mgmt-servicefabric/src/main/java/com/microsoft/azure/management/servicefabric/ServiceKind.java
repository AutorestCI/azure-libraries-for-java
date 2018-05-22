/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ServiceKind.
 */
public final class ServiceKind extends ExpandableStringEnum<ServiceKind> {
    /** Static value Invalid for ServiceKind. */
    public static final ServiceKind INVALID = fromString("Invalid");

    /** Static value Stateless for ServiceKind. */
    public static final ServiceKind STATELESS = fromString("Stateless");

    /** Static value Stateful for ServiceKind. */
    public static final ServiceKind STATEFUL = fromString("Stateful");

    /**
     * Creates or finds a ServiceKind from its string representation.
     * @param name a name to look for
     * @return the corresponding ServiceKind
     */
    @JsonCreator
    public static ServiceKind fromString(String name) {
        return fromString(name, ServiceKind.class);
    }

    /**
     * @return known ServiceKind values
     */
    public static Collection<ServiceKind> values() {
        return values(ServiceKind.class);
    }
}
