/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ResourceSkuRestrictionsReasonCode.
 */
public final class ResourceSkuRestrictionsReasonCode extends ExpandableStringEnum<ResourceSkuRestrictionsReasonCode> {
    /** Static value QuotaId for ResourceSkuRestrictionsReasonCode. */
    public static final ResourceSkuRestrictionsReasonCode QUOTA_ID = fromString("QuotaId");

    /** Static value NotAvailableForSubscription for ResourceSkuRestrictionsReasonCode. */
    public static final ResourceSkuRestrictionsReasonCode NOT_AVAILABLE_FOR_SUBSCRIPTION = fromString("NotAvailableForSubscription");

    /**
     * Creates or finds a ResourceSkuRestrictionsReasonCode from its string representation.
     * @param name a name to look for
     * @return the corresponding ResourceSkuRestrictionsReasonCode
     */
    @JsonCreator
    public static ResourceSkuRestrictionsReasonCode fromString(String name) {
        return fromString(name, ResourceSkuRestrictionsReasonCode.class);
    }

    /**
     * @return known ResourceSkuRestrictionsReasonCode values
     */
    public static Collection<ResourceSkuRestrictionsReasonCode> values() {
        return values(ResourceSkuRestrictionsReasonCode.class);
    }
}
