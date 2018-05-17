/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.web.implementation;

import com.microsoft.azure.management.web.Contact;
import com.microsoft.azure.management.web.DomainStatus;
import com.microsoft.azure.management.web.ProvisioningState;
import java.util.List;
import org.joda.time.DateTime;
import com.microsoft.azure.management.web.HostName;
import com.microsoft.azure.management.web.DomainPurchaseConsent;
import com.microsoft.azure.management.web.DnsType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Information about a domain.
 */
@JsonFlatten
public class DomainInner extends Resource {
    /**
     * Administrative contact.
     */
    @JsonProperty(value = "properties.contactAdmin", required = true)
    private Contact contactAdmin;

    /**
     * Billing contact.
     */
    @JsonProperty(value = "properties.contactBilling", required = true)
    private Contact contactBilling;

    /**
     * Registrant contact.
     */
    @JsonProperty(value = "properties.contactRegistrant", required = true)
    private Contact contactRegistrant;

    /**
     * Technical contact.
     */
    @JsonProperty(value = "properties.contactTech", required = true)
    private Contact contactTech;

    /**
     * Domain registration status. Possible values include: 'Active',
     * 'Awaiting', 'Cancelled', 'Confiscated', 'Disabled', 'Excluded',
     * 'Expired', 'Failed', 'Held', 'Locked', 'Parked', 'Pending', 'Reserved',
     * 'Reverted', 'Suspended', 'Transferred', 'Unknown', 'Unlocked',
     * 'Unparked', 'Updated', 'JsonConverterFailed'.
     */
    @JsonProperty(value = "properties.registrationStatus", access = JsonProperty.Access.WRITE_ONLY)
    private DomainStatus registrationStatus;

    /**
     * Domain provisioning state. Possible values include: 'Succeeded',
     * 'Failed', 'Canceled', 'InProgress', 'Deleting'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Name servers.
     */
    @JsonProperty(value = "properties.nameServers", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> nameServers;

    /**
     * &lt;code&gt;true&lt;/code&gt; if domain privacy is enabled for this
     * domain; otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.privacy")
    private Boolean privacy;

    /**
     * Domain creation timestamp.
     */
    @JsonProperty(value = "properties.createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdTime;

    /**
     * Domain expiration timestamp.
     */
    @JsonProperty(value = "properties.expirationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime expirationTime;

    /**
     * Timestamp when the domain was renewed last time.
     */
    @JsonProperty(value = "properties.lastRenewedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastRenewedTime;

    /**
     * &lt;code&gt;true&lt;/code&gt; if the domain should be automatically
     * renewed; otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.autoRenew")
    private Boolean autoRenew;

    /**
     * &lt;code&gt;true&lt;/code&gt; if Azure can assign this domain to App
     * Service apps; otherwise, &lt;code&gt;false&lt;/code&gt;. This value will
     * be &lt;code&gt;true&lt;/code&gt; if domain registration status is active
     * and
     * it is hosted on name servers Azure has programmatic access to.
     */
    @JsonProperty(value = "properties.readyForDnsRecordManagement", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean readyForDnsRecordManagement;

    /**
     * All hostnames derived from the domain and assigned to Azure resources.
     */
    @JsonProperty(value = "properties.managedHostNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<HostName> managedHostNames;

    /**
     * Legal agreement consent.
     */
    @JsonProperty(value = "properties.consent", required = true)
    private DomainPurchaseConsent consent;

    /**
     * Reasons why domain is not renewable.
     */
    @JsonProperty(value = "properties.domainNotRenewableReasons", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> domainNotRenewableReasons;

    /**
     * Current DNS type. Possible values include: 'AzureDns',
     * 'DefaultDomainRegistrarDns'.
     */
    @JsonProperty(value = "properties.dnsType")
    private DnsType dnsType;

    /**
     * Azure DNS Zone to use.
     */
    @JsonProperty(value = "properties.dnsZoneId")
    private String dnsZoneId;

    /**
     * Target DNS type (would be used for migration). Possible values include:
     * 'AzureDns', 'DefaultDomainRegistrarDns'.
     */
    @JsonProperty(value = "properties.targetDnsType")
    private DnsType targetDnsType;

    /**
     * The authCode property.
     */
    @JsonProperty(value = "properties.authCode")
    private String authCode;

    /**
     * Kind of resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Get the contactAdmin value.
     *
     * @return the contactAdmin value
     */
    public Contact contactAdmin() {
        return this.contactAdmin;
    }

    /**
     * Set the contactAdmin value.
     *
     * @param contactAdmin the contactAdmin value to set
     * @return the DomainInner object itself.
     */
    public DomainInner withContactAdmin(Contact contactAdmin) {
        this.contactAdmin = contactAdmin;
        return this;
    }

    /**
     * Get the contactBilling value.
     *
     * @return the contactBilling value
     */
    public Contact contactBilling() {
        return this.contactBilling;
    }

    /**
     * Set the contactBilling value.
     *
     * @param contactBilling the contactBilling value to set
     * @return the DomainInner object itself.
     */
    public DomainInner withContactBilling(Contact contactBilling) {
        this.contactBilling = contactBilling;
        return this;
    }

    /**
     * Get the contactRegistrant value.
     *
     * @return the contactRegistrant value
     */
    public Contact contactRegistrant() {
        return this.contactRegistrant;
    }

    /**
     * Set the contactRegistrant value.
     *
     * @param contactRegistrant the contactRegistrant value to set
     * @return the DomainInner object itself.
     */
    public DomainInner withContactRegistrant(Contact contactRegistrant) {
        this.contactRegistrant = contactRegistrant;
        return this;
    }

    /**
     * Get the contactTech value.
     *
     * @return the contactTech value
     */
    public Contact contactTech() {
        return this.contactTech;
    }

    /**
     * Set the contactTech value.
     *
     * @param contactTech the contactTech value to set
     * @return the DomainInner object itself.
     */
    public DomainInner withContactTech(Contact contactTech) {
        this.contactTech = contactTech;
        return this;
    }

    /**
     * Get the registrationStatus value.
     *
     * @return the registrationStatus value
     */
    public DomainStatus registrationStatus() {
        return this.registrationStatus;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the nameServers value.
     *
     * @return the nameServers value
     */
    public List<String> nameServers() {
        return this.nameServers;
    }

    /**
     * Get the privacy value.
     *
     * @return the privacy value
     */
    public Boolean privacy() {
        return this.privacy;
    }

    /**
     * Set the privacy value.
     *
     * @param privacy the privacy value to set
     * @return the DomainInner object itself.
     */
    public DomainInner withPrivacy(Boolean privacy) {
        this.privacy = privacy;
        return this;
    }

    /**
     * Get the createdTime value.
     *
     * @return the createdTime value
     */
    public DateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the expirationTime value.
     *
     * @return the expirationTime value
     */
    public DateTime expirationTime() {
        return this.expirationTime;
    }

    /**
     * Get the lastRenewedTime value.
     *
     * @return the lastRenewedTime value
     */
    public DateTime lastRenewedTime() {
        return this.lastRenewedTime;
    }

    /**
     * Get the autoRenew value.
     *
     * @return the autoRenew value
     */
    public Boolean autoRenew() {
        return this.autoRenew;
    }

    /**
     * Set the autoRenew value.
     *
     * @param autoRenew the autoRenew value to set
     * @return the DomainInner object itself.
     */
    public DomainInner withAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /**
     * Get the readyForDnsRecordManagement value.
     *
     * @return the readyForDnsRecordManagement value
     */
    public Boolean readyForDnsRecordManagement() {
        return this.readyForDnsRecordManagement;
    }

    /**
     * Get the managedHostNames value.
     *
     * @return the managedHostNames value
     */
    public List<HostName> managedHostNames() {
        return this.managedHostNames;
    }

    /**
     * Get the consent value.
     *
     * @return the consent value
     */
    public DomainPurchaseConsent consent() {
        return this.consent;
    }

    /**
     * Set the consent value.
     *
     * @param consent the consent value to set
     * @return the DomainInner object itself.
     */
    public DomainInner withConsent(DomainPurchaseConsent consent) {
        this.consent = consent;
        return this;
    }

    /**
     * Get the domainNotRenewableReasons value.
     *
     * @return the domainNotRenewableReasons value
     */
    public List<String> domainNotRenewableReasons() {
        return this.domainNotRenewableReasons;
    }

    /**
     * Get the dnsType value.
     *
     * @return the dnsType value
     */
    public DnsType dnsType() {
        return this.dnsType;
    }

    /**
     * Set the dnsType value.
     *
     * @param dnsType the dnsType value to set
     * @return the DomainInner object itself.
     */
    public DomainInner withDnsType(DnsType dnsType) {
        this.dnsType = dnsType;
        return this;
    }

    /**
     * Get the dnsZoneId value.
     *
     * @return the dnsZoneId value
     */
    public String dnsZoneId() {
        return this.dnsZoneId;
    }

    /**
     * Set the dnsZoneId value.
     *
     * @param dnsZoneId the dnsZoneId value to set
     * @return the DomainInner object itself.
     */
    public DomainInner withDnsZoneId(String dnsZoneId) {
        this.dnsZoneId = dnsZoneId;
        return this;
    }

    /**
     * Get the targetDnsType value.
     *
     * @return the targetDnsType value
     */
    public DnsType targetDnsType() {
        return this.targetDnsType;
    }

    /**
     * Set the targetDnsType value.
     *
     * @param targetDnsType the targetDnsType value to set
     * @return the DomainInner object itself.
     */
    public DomainInner withTargetDnsType(DnsType targetDnsType) {
        this.targetDnsType = targetDnsType;
        return this;
    }

    /**
     * Get the authCode value.
     *
     * @return the authCode value
     */
    public String authCode() {
        return this.authCode;
    }

    /**
     * Set the authCode value.
     *
     * @param authCode the authCode value to set
     * @return the DomainInner object itself.
     */
    public DomainInner withAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }

    /**
     * Get the kind value.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind value.
     *
     * @param kind the kind value to set
     * @return the DomainInner object itself.
     */
    public DomainInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

}
