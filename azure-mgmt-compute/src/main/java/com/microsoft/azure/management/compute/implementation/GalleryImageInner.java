/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.implementation;

import com.microsoft.azure.management.compute.OperatingSystemTypes;
import com.microsoft.azure.management.compute.OperatingSystemStateTypes;
import org.joda.time.LocalDate;
import com.microsoft.azure.management.compute.GalleryImageIdentifier;
import com.microsoft.azure.management.compute.RecommendedMachineConfiguration;
import com.microsoft.azure.management.compute.Disallowed;
import com.microsoft.azure.management.compute.ImagePurchasePlan;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Specifies information about the gallery image that you want to create or
 * update.
 */
@JsonFlatten
public class GalleryImageInner extends Resource {
    /**
     * The description of this gallery image resource.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The Eula agreement for the gallery image.
     */
    @JsonProperty(value = "properties.eula")
    private String eula;

    /**
     * The privacy statement uri.
     */
    @JsonProperty(value = "properties.privacyStatementUri")
    private String privacyStatementUri;

    /**
     * The release note uri.
     */
    @JsonProperty(value = "properties.releaseNoteUri")
    private String releaseNoteUri;

    /**
     * This property allows you to specify the type of the OS that is included
     * in the disk if creating a VM from user-image or a specialized VHD.
     * &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt;
     * **Windows** &lt;br&gt;&lt;br&gt; **Linux**. Possible values include:
     * 'Windows', 'Linux'.
     */
    @JsonProperty(value = "properties.osType")
    private OperatingSystemTypes osType;

    /**
     * The OS State. Possible values include: 'Generalized', 'Specialized'.
     */
    @JsonProperty(value = "properties.osState")
    private OperatingSystemStateTypes osState;

    /**
     * The end of life of this gallery image.
     */
    @JsonProperty(value = "properties.endOfLifeDate")
    private LocalDate endOfLifeDate;

    /**
     * The identifier property.
     */
    @JsonProperty(value = "properties.identifier")
    private GalleryImageIdentifier identifier;

    /**
     * The recommended property.
     */
    @JsonProperty(value = "properties.recommended")
    private RecommendedMachineConfiguration recommended;

    /**
     * The disallowed property.
     */
    @JsonProperty(value = "properties.disallowed")
    private Disallowed disallowed;

    /**
     * The purchasePlan property.
     */
    @JsonProperty(value = "properties.purchasePlan")
    private ImagePurchasePlan purchasePlan;

    /**
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the eula value.
     *
     * @return the eula value
     */
    public String eula() {
        return this.eula;
    }

    /**
     * Set the eula value.
     *
     * @param eula the eula value to set
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withEula(String eula) {
        this.eula = eula;
        return this;
    }

    /**
     * Get the privacyStatementUri value.
     *
     * @return the privacyStatementUri value
     */
    public String privacyStatementUri() {
        return this.privacyStatementUri;
    }

    /**
     * Set the privacyStatementUri value.
     *
     * @param privacyStatementUri the privacyStatementUri value to set
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withPrivacyStatementUri(String privacyStatementUri) {
        this.privacyStatementUri = privacyStatementUri;
        return this;
    }

    /**
     * Get the releaseNoteUri value.
     *
     * @return the releaseNoteUri value
     */
    public String releaseNoteUri() {
        return this.releaseNoteUri;
    }

    /**
     * Set the releaseNoteUri value.
     *
     * @param releaseNoteUri the releaseNoteUri value to set
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withReleaseNoteUri(String releaseNoteUri) {
        this.releaseNoteUri = releaseNoteUri;
        return this;
    }

    /**
     * Get the osType value.
     *
     * @return the osType value
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the osType value.
     *
     * @param osType the osType value to set
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the osState value.
     *
     * @return the osState value
     */
    public OperatingSystemStateTypes osState() {
        return this.osState;
    }

    /**
     * Set the osState value.
     *
     * @param osState the osState value to set
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withOsState(OperatingSystemStateTypes osState) {
        this.osState = osState;
        return this;
    }

    /**
     * Get the endOfLifeDate value.
     *
     * @return the endOfLifeDate value
     */
    public LocalDate endOfLifeDate() {
        return this.endOfLifeDate;
    }

    /**
     * Set the endOfLifeDate value.
     *
     * @param endOfLifeDate the endOfLifeDate value to set
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withEndOfLifeDate(LocalDate endOfLifeDate) {
        this.endOfLifeDate = endOfLifeDate;
        return this;
    }

    /**
     * Get the identifier value.
     *
     * @return the identifier value
     */
    public GalleryImageIdentifier identifier() {
        return this.identifier;
    }

    /**
     * Set the identifier value.
     *
     * @param identifier the identifier value to set
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withIdentifier(GalleryImageIdentifier identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the recommended value.
     *
     * @return the recommended value
     */
    public RecommendedMachineConfiguration recommended() {
        return this.recommended;
    }

    /**
     * Set the recommended value.
     *
     * @param recommended the recommended value to set
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withRecommended(RecommendedMachineConfiguration recommended) {
        this.recommended = recommended;
        return this;
    }

    /**
     * Get the disallowed value.
     *
     * @return the disallowed value
     */
    public Disallowed disallowed() {
        return this.disallowed;
    }

    /**
     * Set the disallowed value.
     *
     * @param disallowed the disallowed value to set
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withDisallowed(Disallowed disallowed) {
        this.disallowed = disallowed;
        return this;
    }

    /**
     * Get the purchasePlan value.
     *
     * @return the purchasePlan value
     */
    public ImagePurchasePlan purchasePlan() {
        return this.purchasePlan;
    }

    /**
     * Set the purchasePlan value.
     *
     * @param purchasePlan the purchasePlan value to set
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withPurchasePlan(ImagePurchasePlan purchasePlan) {
        this.purchasePlan = purchasePlan;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

}
