/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object that hold sync object details.
 */
public class AssociatedObject {
    /**
     * The display name of the object.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The distinguished name of the object.
     */
    @JsonProperty(value = "distinguishedName")
    private String distinguishedName;

    /**
     * The last dirSync time.
     */
    @JsonProperty(value = "lastDirSyncTime")
    private DateTime lastDirSyncTime;

    /**
     * The email of the object.
     */
    @JsonProperty(value = "mail")
    private String mail;

    /**
     * The object guid.
     */
    @JsonProperty(value = "objectGuid")
    private String objectGuid;

    /**
     * The object type.
     */
    @JsonProperty(value = "objectType")
    private String objectType;

    /**
     * The On-premises UPN.
     */
    @JsonProperty(value = "onpremisesUserPrincipalName")
    private String onpremisesUserPrincipalName;

    /**
     * The proxy addresses.
     */
    @JsonProperty(value = "proxyAddresses")
    private String proxyAddresses;

    /**
     * The source anchor.
     */
    @JsonProperty(value = "sourceAnchor")
    private String sourceAnchor;

    /**
     * The source of authority.
     */
    @JsonProperty(value = "sourceOfAuthority")
    private String sourceOfAuthority;

    /**
     * The time of the error.
     */
    @JsonProperty(value = "timeOccurred")
    private DateTime timeOccurred;

    /**
     * The UPN.
     */
    @JsonProperty(value = "userPrincipalName")
    private String userPrincipalName;

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the distinguishedName value.
     *
     * @return the distinguishedName value
     */
    public String distinguishedName() {
        return this.distinguishedName;
    }

    /**
     * Set the distinguishedName value.
     *
     * @param distinguishedName the distinguishedName value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withDistinguishedName(String distinguishedName) {
        this.distinguishedName = distinguishedName;
        return this;
    }

    /**
     * Get the lastDirSyncTime value.
     *
     * @return the lastDirSyncTime value
     */
    public DateTime lastDirSyncTime() {
        return this.lastDirSyncTime;
    }

    /**
     * Set the lastDirSyncTime value.
     *
     * @param lastDirSyncTime the lastDirSyncTime value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withLastDirSyncTime(DateTime lastDirSyncTime) {
        this.lastDirSyncTime = lastDirSyncTime;
        return this;
    }

    /**
     * Get the mail value.
     *
     * @return the mail value
     */
    public String mail() {
        return this.mail;
    }

    /**
     * Set the mail value.
     *
     * @param mail the mail value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withMail(String mail) {
        this.mail = mail;
        return this;
    }

    /**
     * Get the objectGuid value.
     *
     * @return the objectGuid value
     */
    public String objectGuid() {
        return this.objectGuid;
    }

    /**
     * Set the objectGuid value.
     *
     * @param objectGuid the objectGuid value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withObjectGuid(String objectGuid) {
        this.objectGuid = objectGuid;
        return this;
    }

    /**
     * Get the objectType value.
     *
     * @return the objectType value
     */
    public String objectType() {
        return this.objectType;
    }

    /**
     * Set the objectType value.
     *
     * @param objectType the objectType value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get the onpremisesUserPrincipalName value.
     *
     * @return the onpremisesUserPrincipalName value
     */
    public String onpremisesUserPrincipalName() {
        return this.onpremisesUserPrincipalName;
    }

    /**
     * Set the onpremisesUserPrincipalName value.
     *
     * @param onpremisesUserPrincipalName the onpremisesUserPrincipalName value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withOnpremisesUserPrincipalName(String onpremisesUserPrincipalName) {
        this.onpremisesUserPrincipalName = onpremisesUserPrincipalName;
        return this;
    }

    /**
     * Get the proxyAddresses value.
     *
     * @return the proxyAddresses value
     */
    public String proxyAddresses() {
        return this.proxyAddresses;
    }

    /**
     * Set the proxyAddresses value.
     *
     * @param proxyAddresses the proxyAddresses value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withProxyAddresses(String proxyAddresses) {
        this.proxyAddresses = proxyAddresses;
        return this;
    }

    /**
     * Get the sourceAnchor value.
     *
     * @return the sourceAnchor value
     */
    public String sourceAnchor() {
        return this.sourceAnchor;
    }

    /**
     * Set the sourceAnchor value.
     *
     * @param sourceAnchor the sourceAnchor value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withSourceAnchor(String sourceAnchor) {
        this.sourceAnchor = sourceAnchor;
        return this;
    }

    /**
     * Get the sourceOfAuthority value.
     *
     * @return the sourceOfAuthority value
     */
    public String sourceOfAuthority() {
        return this.sourceOfAuthority;
    }

    /**
     * Set the sourceOfAuthority value.
     *
     * @param sourceOfAuthority the sourceOfAuthority value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withSourceOfAuthority(String sourceOfAuthority) {
        this.sourceOfAuthority = sourceOfAuthority;
        return this;
    }

    /**
     * Get the timeOccurred value.
     *
     * @return the timeOccurred value
     */
    public DateTime timeOccurred() {
        return this.timeOccurred;
    }

    /**
     * Set the timeOccurred value.
     *
     * @param timeOccurred the timeOccurred value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withTimeOccurred(DateTime timeOccurred) {
        this.timeOccurred = timeOccurred;
        return this;
    }

    /**
     * Get the userPrincipalName value.
     *
     * @return the userPrincipalName value
     */
    public String userPrincipalName() {
        return this.userPrincipalName;
    }

    /**
     * Set the userPrincipalName value.
     *
     * @param userPrincipalName the userPrincipalName value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }

}
