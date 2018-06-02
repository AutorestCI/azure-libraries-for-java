/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.implementation;

import java.util.List;
import com.microsoft.azure.management.mediaservices.StreamingLocatorContentKey;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class of response for listContentKeys action.
 */
public class ListContentKeysResponseInner {
    /**
     * ContentKeys used by current Streaming Locator.
     */
    @JsonProperty(value = "contentKeys")
    private List<StreamingLocatorContentKey> contentKeys;

    /**
     * Get contentKeys used by current Streaming Locator.
     *
     * @return the contentKeys value
     */
    public List<StreamingLocatorContentKey> contentKeys() {
        return this.contentKeys;
    }

    /**
     * Set contentKeys used by current Streaming Locator.
     *
     * @param contentKeys the contentKeys value to set
     * @return the ListContentKeysResponseInner object itself.
     */
    public ListContentKeysResponseInner withContentKeys(List<StreamingLocatorContentKey> contentKeys) {
        this.contentKeys = contentKeys;
        return this;
    }

}
