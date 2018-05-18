/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01.implementation;

import com.microsoft.azure.management.iothub.v20180401.AccessRights;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of an IoT hub shared access policy.
 */
public class SharedAccessSignatureAuthorizationRuleInner {
    /**
     * The name of the shared access policy.
     */
    @JsonProperty(value = "keyName", required = true)
    private String keyName;

    /**
     * The primary key.
     */
    @JsonProperty(value = "primaryKey")
    private String primaryKey;

    /**
     * The secondary key.
     */
    @JsonProperty(value = "secondaryKey")
    private String secondaryKey;

    /**
     * The permissions assigned to the shared access policy. Possible values
     * include: 'RegistryRead', 'RegistryWrite', 'ServiceConnect',
     * 'DeviceConnect', 'RegistryRead, RegistryWrite', 'RegistryRead,
     * ServiceConnect', 'RegistryRead, DeviceConnect', 'RegistryWrite,
     * ServiceConnect', 'RegistryWrite, DeviceConnect', 'ServiceConnect,
     * DeviceConnect', 'RegistryRead, RegistryWrite, ServiceConnect',
     * 'RegistryRead, RegistryWrite, DeviceConnect', 'RegistryRead,
     * ServiceConnect, DeviceConnect', 'RegistryWrite, ServiceConnect,
     * DeviceConnect', 'RegistryRead, RegistryWrite, ServiceConnect,
     * DeviceConnect'.
     */
    @JsonProperty(value = "rights", required = true)
    private AccessRights rights;

    /**
     * Get the keyName value.
     *
     * @return the keyName value
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName value.
     *
     * @param keyName the keyName value to set
     * @return the SharedAccessSignatureAuthorizationRuleInner object itself.
     */
    public SharedAccessSignatureAuthorizationRuleInner withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the primaryKey value.
     *
     * @return the primaryKey value
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Set the primaryKey value.
     *
     * @param primaryKey the primaryKey value to set
     * @return the SharedAccessSignatureAuthorizationRuleInner object itself.
     */
    public SharedAccessSignatureAuthorizationRuleInner withPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * Get the secondaryKey value.
     *
     * @return the secondaryKey value
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }

    /**
     * Set the secondaryKey value.
     *
     * @param secondaryKey the secondaryKey value to set
     * @return the SharedAccessSignatureAuthorizationRuleInner object itself.
     */
    public SharedAccessSignatureAuthorizationRuleInner withSecondaryKey(String secondaryKey) {
        this.secondaryKey = secondaryKey;
        return this;
    }

    /**
     * Get the rights value.
     *
     * @return the rights value
     */
    public AccessRights rights() {
        return this.rights;
    }

    /**
     * Set the rights value.
     *
     * @param rights the rights value to set
     * @return the SharedAccessSignatureAuthorizationRuleInner object itself.
     */
    public SharedAccessSignatureAuthorizationRuleInner withRights(AccessRights rights) {
        this.rights = rights;
        return this;
    }

}
