/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains the information necessary to perform a create database restore
 * point operation.
 */
public class CreateDatabaseRestorePointDefinition {
    /**
     * The restore point label to apply.
     */
    @JsonProperty(value = "restorePointLabel", required = true)
    private String restorePointLabel;

    /**
     * Get the restore point label to apply.
     *
     * @return the restorePointLabel value
     */
    public String restorePointLabel() {
        return this.restorePointLabel;
    }

    /**
     * Set the restore point label to apply.
     *
     * @param restorePointLabel the restorePointLabel value to set
     * @return the CreateDatabaseRestorePointDefinition object itself.
     */
    public CreateDatabaseRestorePointDefinition withRestorePointLabel(String restorePointLabel) {
        this.restorePointLabel = restorePointLabel;
        return this;
    }

}
