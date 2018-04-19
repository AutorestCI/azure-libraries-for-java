/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Identity details.
 */
public class IdentityInformation {
    /**
     * The identity provider type. Value is the ToString() of a
     * IdentityProviderType value. Possible values include:
     * 'RecoveryServicesActiveDirectory'.
     */
    @JsonProperty(value = "identityProviderType")
    private IdentityProviderType identityProviderType;

    /**
     * The tenant Id for the service principal with which the on-premise
     * management/data plane components would communicate with our Azure
     * services.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * The application/client Id for the service principal with which the
     * on-premise management/data plane components would communicate with our
     * Azure services.
     */
    @JsonProperty(value = "applicationId")
    private String applicationId;

    /**
     * The object Id of the service principal with which the on-premise
     * management/data plane components would communicate with our Azure
     * services.
     */
    @JsonProperty(value = "objectId")
    private String objectId;

    /**
     * The intended Audience of the service principal with which the on-premise
     * management/data plane components would communicate with our Azure
     * services.
     */
    @JsonProperty(value = "audience")
    private String audience;

    /**
     * The base authority for Azure Active Directory authentication.
     */
    @JsonProperty(value = "aadAuthority")
    private String aadAuthority;

    /**
     * The certificate thumbprint. Applicable only if IdentityProviderType is
     * RecoveryServicesActiveDirectory.
     */
    @JsonProperty(value = "certificateThumbprint")
    private String certificateThumbprint;

    /**
     * Get the identityProviderType value.
     *
     * @return the identityProviderType value
     */
    public IdentityProviderType identityProviderType() {
        return this.identityProviderType;
    }

    /**
     * Set the identityProviderType value.
     *
     * @param identityProviderType the identityProviderType value to set
     * @return the IdentityInformation object itself.
     */
    public IdentityInformation withIdentityProviderType(IdentityProviderType identityProviderType) {
        this.identityProviderType = identityProviderType;
        return this;
    }

    /**
     * Get the tenantId value.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId value.
     *
     * @param tenantId the tenantId value to set
     * @return the IdentityInformation object itself.
     */
    public IdentityInformation withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the applicationId value.
     *
     * @return the applicationId value
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Set the applicationId value.
     *
     * @param applicationId the applicationId value to set
     * @return the IdentityInformation object itself.
     */
    public IdentityInformation withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get the objectId value.
     *
     * @return the objectId value
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Set the objectId value.
     *
     * @param objectId the objectId value to set
     * @return the IdentityInformation object itself.
     */
    public IdentityInformation withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Get the audience value.
     *
     * @return the audience value
     */
    public String audience() {
        return this.audience;
    }

    /**
     * Set the audience value.
     *
     * @param audience the audience value to set
     * @return the IdentityInformation object itself.
     */
    public IdentityInformation withAudience(String audience) {
        this.audience = audience;
        return this;
    }

    /**
     * Get the aadAuthority value.
     *
     * @return the aadAuthority value
     */
    public String aadAuthority() {
        return this.aadAuthority;
    }

    /**
     * Set the aadAuthority value.
     *
     * @param aadAuthority the aadAuthority value to set
     * @return the IdentityInformation object itself.
     */
    public IdentityInformation withAadAuthority(String aadAuthority) {
        this.aadAuthority = aadAuthority;
        return this;
    }

    /**
     * Get the certificateThumbprint value.
     *
     * @return the certificateThumbprint value
     */
    public String certificateThumbprint() {
        return this.certificateThumbprint;
    }

    /**
     * Set the certificateThumbprint value.
     *
     * @param certificateThumbprint the certificateThumbprint value to set
     * @return the IdentityInformation object itself.
     */
    public IdentityInformation withCertificateThumbprint(String certificateThumbprint) {
        this.certificateThumbprint = certificateThumbprint;
        return this;
    }

}