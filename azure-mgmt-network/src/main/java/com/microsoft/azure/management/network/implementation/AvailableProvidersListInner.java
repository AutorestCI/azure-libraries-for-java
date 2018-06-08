/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import java.util.List;
import com.microsoft.azure.management.network.AvailableProvidersListCountry;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List of available countries with details.
 */
public class AvailableProvidersListInner {
    /**
     * List of available countries.
     */
    @JsonProperty(value = "countries", required = true)
    private List<AvailableProvidersListCountry> countries;

    /**
     * Get list of available countries.
     *
     * @return the countries value
     */
    public List<AvailableProvidersListCountry> countries() {
        return this.countries;
    }

    /**
     * Set list of available countries.
     *
     * @param countries the countries value to set
     * @return the AvailableProvidersListInner object itself.
     */
    public AvailableProvidersListInner withCountries(List<AvailableProvidersListCountry> countries) {
        this.countries = countries;
        return this;
    }

}
