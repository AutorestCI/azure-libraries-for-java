/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hanaonazure.implementation;

import com.microsoft.azure.management.hanaonazure.HardwareProfile;
import com.microsoft.azure.management.hanaonazure.StorageProfile;
import com.microsoft.azure.management.hanaonazure.OSProfile;
import com.microsoft.azure.management.hanaonazure.NetworkProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * HANA instance info on Azure (ARM properties and HANA properties).
 */
@JsonFlatten
@SkipParentValidation
public class HanaInstanceInner extends Resource {
    /**
     * Specifies the hardware settings for the HANA instance.
     */
    @JsonProperty(value = "properties.hardwareProfile")
    private HardwareProfile hardwareProfile;

    /**
     * Specifies the storage settings for the HANA instance disks.
     */
    @JsonProperty(value = "properties.storageProfile")
    private StorageProfile storageProfile;

    /**
     * Specifies the operating system settings for the HANA instance.
     */
    @JsonProperty(value = "properties.osProfile")
    private OSProfile osProfile;

    /**
     * Specifies the network settings for the HANA instance.
     */
    @JsonProperty(value = "properties.networkProfile")
    private NetworkProfile networkProfile;

    /**
     * Specifies the HANA instance unique ID.
     */
    @JsonProperty(value = "properties.hanaInstanceId", access = JsonProperty.Access.WRITE_ONLY)
    private String hanaInstanceId;

    /**
     * Get the hardwareProfile value.
     *
     * @return the hardwareProfile value
     */
    public HardwareProfile hardwareProfile() {
        return this.hardwareProfile;
    }

    /**
     * Set the hardwareProfile value.
     *
     * @param hardwareProfile the hardwareProfile value to set
     * @return the HanaInstanceInner object itself.
     */
    public HanaInstanceInner withHardwareProfile(HardwareProfile hardwareProfile) {
        this.hardwareProfile = hardwareProfile;
        return this;
    }

    /**
     * Get the storageProfile value.
     *
     * @return the storageProfile value
     */
    public StorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile value.
     *
     * @param storageProfile the storageProfile value to set
     * @return the HanaInstanceInner object itself.
     */
    public HanaInstanceInner withStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the osProfile value.
     *
     * @return the osProfile value
     */
    public OSProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Set the osProfile value.
     *
     * @param osProfile the osProfile value to set
     * @return the HanaInstanceInner object itself.
     */
    public HanaInstanceInner withOsProfile(OSProfile osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    /**
     * Get the networkProfile value.
     *
     * @return the networkProfile value
     */
    public NetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the networkProfile value.
     *
     * @param networkProfile the networkProfile value to set
     * @return the HanaInstanceInner object itself.
     */
    public HanaInstanceInner withNetworkProfile(NetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Get the hanaInstanceId value.
     *
     * @return the hanaInstanceId value
     */
    public String hanaInstanceId() {
        return this.hanaInstanceId;
    }

}
