/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.implementation;

import java.util.List;
import com.microsoft.azure.management.cosmosdb.DatabaseAccountConnectionString;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The connection strings for the given database account.
 */
public class DatabaseAccountListConnectionStringsResultInner {
    /**
     * An array that contains the connection strings for the Cosmos DB account.
     */
    @JsonProperty(value = "connectionStrings")
    private List<DatabaseAccountConnectionString> connectionStrings;

    /**
     * Get the connectionStrings value.
     *
     * @return the connectionStrings value
     */
    public List<DatabaseAccountConnectionString> connectionStrings() {
        return this.connectionStrings;
    }

    /**
     * Set the connectionStrings value.
     *
     * @param connectionStrings the connectionStrings value to set
     * @return the DatabaseAccountListConnectionStringsResultInner object itself.
     */
    public DatabaseAccountListConnectionStringsResultInner withConnectionStrings(List<DatabaseAccountConnectionString> connectionStrings) {
        this.connectionStrings = connectionStrings;
        return this;
    }

}
