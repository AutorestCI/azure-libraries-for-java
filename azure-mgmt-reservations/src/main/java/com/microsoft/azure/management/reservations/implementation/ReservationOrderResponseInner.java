/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.reservations.implementation;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The ReservationOrderResponseInner model.
 */
@JsonFlatten
public class ReservationOrderResponseInner {
    /**
     * The etag property.
     */
    @JsonProperty(value = "etag")
    private Integer etag;

    /**
     * Identifier of the reservation.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Name of the reservation.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Friendly name for user to easily identified the reservation.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * This is the DateTime when the reservation was initially requested for
     * purchase.
     */
    @JsonProperty(value = "properties.requestDateTime")
    private DateTime requestDateTime;

    /**
     * This is the DateTime when the reservation was created.
     */
    @JsonProperty(value = "properties.createdDateTime")
    private DateTime createdDateTime;

    /**
     * This is the date when the Reservation will expire.
     */
    @JsonProperty(value = "properties.expiryDate")
    private LocalDate expiryDate;

    /**
     * Total Quantity of the SKUs purchased in the Reservation.
     */
    @JsonProperty(value = "properties.originalQuantity")
    private Integer originalQuantity;

    /**
     * Possible values include: 'P1Y', 'P3Y'.
     */
    @JsonProperty(value = "properties.term")
    private String term;

    /**
     * Possible values include: 'Creating', 'PendingResourceHold',
     * 'ConfirmedResourceHold', 'PendingBilling', 'ConfirmedBilling',
     * 'Created', 'Succeeded', 'Cancelled', 'Expired', 'BillingFailed',
     * 'Failed', 'Split', 'Merged'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The reservations property.
     */
    @JsonProperty(value = "properties.reservations")
    private List<ReservationResponseInner> reservations;

    /**
     * Type of resource. "Microsoft.Capacity/reservations".
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public Integer etag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withEtag(Integer etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get identifier of the reservation.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get name of the reservation.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get friendly name for user to easily identified the reservation.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set friendly name for user to easily identified the reservation.
     *
     * @param displayName the displayName value to set
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get this is the DateTime when the reservation was initially requested for purchase.
     *
     * @return the requestDateTime value
     */
    public DateTime requestDateTime() {
        return this.requestDateTime;
    }

    /**
     * Set this is the DateTime when the reservation was initially requested for purchase.
     *
     * @param requestDateTime the requestDateTime value to set
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withRequestDateTime(DateTime requestDateTime) {
        this.requestDateTime = requestDateTime;
        return this;
    }

    /**
     * Get this is the DateTime when the reservation was created.
     *
     * @return the createdDateTime value
     */
    public DateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set this is the DateTime when the reservation was created.
     *
     * @param createdDateTime the createdDateTime value to set
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withCreatedDateTime(DateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get this is the date when the Reservation will expire.
     *
     * @return the expiryDate value
     */
    public LocalDate expiryDate() {
        return this.expiryDate;
    }

    /**
     * Set this is the date when the Reservation will expire.
     *
     * @param expiryDate the expiryDate value to set
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * Get total Quantity of the SKUs purchased in the Reservation.
     *
     * @return the originalQuantity value
     */
    public Integer originalQuantity() {
        return this.originalQuantity;
    }

    /**
     * Set total Quantity of the SKUs purchased in the Reservation.
     *
     * @param originalQuantity the originalQuantity value to set
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withOriginalQuantity(Integer originalQuantity) {
        this.originalQuantity = originalQuantity;
        return this;
    }

    /**
     * Get possible values include: 'P1Y', 'P3Y'.
     *
     * @return the term value
     */
    public String term() {
        return this.term;
    }

    /**
     * Set possible values include: 'P1Y', 'P3Y'.
     *
     * @param term the term value to set
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withTerm(String term) {
        this.term = term;
        return this;
    }

    /**
     * Get possible values include: 'Creating', 'PendingResourceHold', 'ConfirmedResourceHold', 'PendingBilling', 'ConfirmedBilling', 'Created', 'Succeeded', 'Cancelled', 'Expired', 'BillingFailed', 'Failed', 'Split', 'Merged'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set possible values include: 'Creating', 'PendingResourceHold', 'ConfirmedResourceHold', 'PendingBilling', 'ConfirmedBilling', 'Created', 'Succeeded', 'Cancelled', 'Expired', 'BillingFailed', 'Failed', 'Split', 'Merged'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the reservations value.
     *
     * @return the reservations value
     */
    public List<ReservationResponseInner> reservations() {
        return this.reservations;
    }

    /**
     * Set the reservations value.
     *
     * @param reservations the reservations value to set
     * @return the ReservationOrderResponseInner object itself.
     */
    public ReservationOrderResponseInner withReservations(List<ReservationResponseInner> reservations) {
        this.reservations = reservations;
        return this;
    }

    /**
     * Get type of resource. "Microsoft.Capacity/reservations".
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
