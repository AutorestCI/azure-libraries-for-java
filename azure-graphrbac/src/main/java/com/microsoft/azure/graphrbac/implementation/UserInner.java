/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.graphrbac.implementation;

import com.microsoft.azure.graphrbac.UserType;
import java.util.List;
import com.microsoft.azure.graphrbac.SignInName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Active Directory user information.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("User")
public class UserInner extends DirectoryObjectInner {
    /**
     * This must be specified if you are using a federated domain for the
     * user's userPrincipalName (UPN) property when creating a new user
     * account. It is used to associate an on-premises Active Directory user
     * account with their Azure AD user object.
     */
    @JsonProperty(value = "immutableId")
    private String immutableId;

    /**
     * A two letter country code (ISO standard 3166). Required for users that
     * will be assigned licenses due to legal requirement to check for
     * availability of services in countries. Examples include: "US", "JP", and
     * "GB".
     */
    @JsonProperty(value = "usageLocation")
    private String usageLocation;

    /**
     * The given name for the user.
     */
    @JsonProperty(value = "givenName")
    private String givenName;

    /**
     * The user's surname (family name or last name).
     */
    @JsonProperty(value = "surname")
    private String surname;

    /**
     * A string value that can be used to classify user types in your
     * directory, such as 'Member' and 'Guest'. Possible values include:
     * 'Member', 'Guest'.
     */
    @JsonProperty(value = "userType")
    private UserType userType;

    /**
     * Whether the account is enabled.
     */
    @JsonProperty(value = "accountEnabled")
    private Boolean accountEnabled;

    /**
     * The display name of the user.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The principal name of the user.
     */
    @JsonProperty(value = "userPrincipalName")
    private String userPrincipalName;

    /**
     * The mail alias for the user.
     */
    @JsonProperty(value = "mailNickname")
    private String mailNickname;

    /**
     * The primary email address of the user.
     */
    @JsonProperty(value = "mail")
    private String mail;

    /**
     * The sign-in names of the user.
     */
    @JsonProperty(value = "signInNames")
    private List<SignInName> signInNames;

    /**
     * Get this must be specified if you are using a federated domain for the user's userPrincipalName (UPN) property when creating a new user account. It is used to associate an on-premises Active Directory user account with their Azure AD user object.
     *
     * @return the immutableId value
     */
    public String immutableId() {
        return this.immutableId;
    }

    /**
     * Set this must be specified if you are using a federated domain for the user's userPrincipalName (UPN) property when creating a new user account. It is used to associate an on-premises Active Directory user account with their Azure AD user object.
     *
     * @param immutableId the immutableId value to set
     * @return the UserInner object itself.
     */
    public UserInner withImmutableId(String immutableId) {
        this.immutableId = immutableId;
        return this;
    }

    /**
     * Get a two letter country code (ISO standard 3166). Required for users that will be assigned licenses due to legal requirement to check for availability of services in countries. Examples include: "US", "JP", and "GB".
     *
     * @return the usageLocation value
     */
    public String usageLocation() {
        return this.usageLocation;
    }

    /**
     * Set a two letter country code (ISO standard 3166). Required for users that will be assigned licenses due to legal requirement to check for availability of services in countries. Examples include: "US", "JP", and "GB".
     *
     * @param usageLocation the usageLocation value to set
     * @return the UserInner object itself.
     */
    public UserInner withUsageLocation(String usageLocation) {
        this.usageLocation = usageLocation;
        return this;
    }

    /**
     * Get the given name for the user.
     *
     * @return the givenName value
     */
    public String givenName() {
        return this.givenName;
    }

    /**
     * Set the given name for the user.
     *
     * @param givenName the givenName value to set
     * @return the UserInner object itself.
     */
    public UserInner withGivenName(String givenName) {
        this.givenName = givenName;
        return this;
    }

    /**
     * Get the user's surname (family name or last name).
     *
     * @return the surname value
     */
    public String surname() {
        return this.surname;
    }

    /**
     * Set the user's surname (family name or last name).
     *
     * @param surname the surname value to set
     * @return the UserInner object itself.
     */
    public UserInner withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    /**
     * Get a string value that can be used to classify user types in your directory, such as 'Member' and 'Guest'. Possible values include: 'Member', 'Guest'.
     *
     * @return the userType value
     */
    public UserType userType() {
        return this.userType;
    }

    /**
     * Set a string value that can be used to classify user types in your directory, such as 'Member' and 'Guest'. Possible values include: 'Member', 'Guest'.
     *
     * @param userType the userType value to set
     * @return the UserInner object itself.
     */
    public UserInner withUserType(UserType userType) {
        this.userType = userType;
        return this;
    }

    /**
     * Get whether the account is enabled.
     *
     * @return the accountEnabled value
     */
    public Boolean accountEnabled() {
        return this.accountEnabled;
    }

    /**
     * Set whether the account is enabled.
     *
     * @param accountEnabled the accountEnabled value to set
     * @return the UserInner object itself.
     */
    public UserInner withAccountEnabled(Boolean accountEnabled) {
        this.accountEnabled = accountEnabled;
        return this;
    }

    /**
     * Get the display name of the user.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name of the user.
     *
     * @param displayName the displayName value to set
     * @return the UserInner object itself.
     */
    public UserInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the principal name of the user.
     *
     * @return the userPrincipalName value
     */
    public String userPrincipalName() {
        return this.userPrincipalName;
    }

    /**
     * Set the principal name of the user.
     *
     * @param userPrincipalName the userPrincipalName value to set
     * @return the UserInner object itself.
     */
    public UserInner withUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }

    /**
     * Get the mail alias for the user.
     *
     * @return the mailNickname value
     */
    public String mailNickname() {
        return this.mailNickname;
    }

    /**
     * Set the mail alias for the user.
     *
     * @param mailNickname the mailNickname value to set
     * @return the UserInner object itself.
     */
    public UserInner withMailNickname(String mailNickname) {
        this.mailNickname = mailNickname;
        return this;
    }

    /**
     * Get the primary email address of the user.
     *
     * @return the mail value
     */
    public String mail() {
        return this.mail;
    }

    /**
     * Set the primary email address of the user.
     *
     * @param mail the mail value to set
     * @return the UserInner object itself.
     */
    public UserInner withMail(String mail) {
        this.mail = mail;
        return this;
    }

    /**
     * Get the sign-in names of the user.
     *
     * @return the signInNames value
     */
    public List<SignInName> signInNames() {
        return this.signInNames;
    }

    /**
     * Set the sign-in names of the user.
     *
     * @param signInNames the signInNames value to set
     * @return the UserInner object itself.
     */
    public UserInner withSignInNames(List<SignInName> signInNames) {
        this.signInNames = signInNames;
        return this;
    }

}
