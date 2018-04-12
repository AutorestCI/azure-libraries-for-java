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
 * Defines values for ApplicationDefinitionKind.
 */
public final class ApplicationDefinitionKind extends ExpandableStringEnum<ApplicationDefinitionKind> {
    /** Static value Invalid for ApplicationDefinitionKind. */
    public static final ApplicationDefinitionKind INVALID = fromString("Invalid");

    /** Static value ServiceFabricApplicationDescription for ApplicationDefinitionKind. */
    public static final ApplicationDefinitionKind SERVICE_FABRIC_APPLICATION_DESCRIPTION = fromString("ServiceFabricApplicationDescription");

    /** Static value Compose for ApplicationDefinitionKind. */
    public static final ApplicationDefinitionKind COMPOSE = fromString("Compose");

    /**
     * Creates or finds a ApplicationDefinitionKind from its string representation.
     * @param name a name to look for
     * @return the corresponding ApplicationDefinitionKind
     */
    @JsonCreator
    public static ApplicationDefinitionKind fromString(String name) {
        return fromString(name, ApplicationDefinitionKind.class);
    }

    /**
     * @return known ApplicationDefinitionKind values
     */
    public static Collection<ApplicationDefinitionKind> values() {
        return values(ApplicationDefinitionKind.class);
    }
}
