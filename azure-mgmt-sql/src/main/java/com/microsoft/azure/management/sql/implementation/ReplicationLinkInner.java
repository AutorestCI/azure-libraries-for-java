/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import com.microsoft.azure.management.sql.ReplicationRole;
import org.joda.time.DateTime;
import com.microsoft.azure.management.sql.ReplicationState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Represents a database replication link.
 */
@JsonFlatten
public class ReplicationLinkInner extends ProxyResourceInner {
    /**
     * Location of the server that contains this firewall rule.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Legacy value indicating whether termination is allowed.  Currently
     * always returns true.
     */
    @JsonProperty(value = "properties.isTerminationAllowed", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isTerminationAllowed;

    /**
     * Replication mode of this replication link.
     */
    @JsonProperty(value = "properties.replicationMode", access = JsonProperty.Access.WRITE_ONLY)
    private String replicationMode;

    /**
     * The name of the server hosting the partner database.
     */
    @JsonProperty(value = "properties.partnerServer", access = JsonProperty.Access.WRITE_ONLY)
    private String partnerServer;

    /**
     * The name of the partner database.
     */
    @JsonProperty(value = "properties.partnerDatabase", access = JsonProperty.Access.WRITE_ONLY)
    private String partnerDatabase;

    /**
     * The Azure Region of the partner database.
     */
    @JsonProperty(value = "properties.partnerLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String partnerLocation;

    /**
     * The role of the database in the replication link. Possible values
     * include: 'Primary', 'Secondary', 'NonReadableSecondary', 'Source',
     * 'Copy'.
     */
    @JsonProperty(value = "properties.role", access = JsonProperty.Access.WRITE_ONLY)
    private ReplicationRole role;

    /**
     * The role of the partner database in the replication link. Possible
     * values include: 'Primary', 'Secondary', 'NonReadableSecondary',
     * 'Source', 'Copy'.
     */
    @JsonProperty(value = "properties.partnerRole", access = JsonProperty.Access.WRITE_ONLY)
    private ReplicationRole partnerRole;

    /**
     * The start time for the replication link.
     */
    @JsonProperty(value = "properties.startTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startTime;

    /**
     * The percentage of seeding complete for the replication link.
     */
    @JsonProperty(value = "properties.percentComplete", access = JsonProperty.Access.WRITE_ONLY)
    private Integer percentComplete;

    /**
     * The replication state for the replication link. Possible values include:
     * 'PENDING', 'SEEDING', 'CATCH_UP', 'SUSPENDED'.
     */
    @JsonProperty(value = "properties.replicationState", access = JsonProperty.Access.WRITE_ONLY)
    private ReplicationState replicationState;

    /**
     * Get location of the server that contains this firewall rule.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Get legacy value indicating whether termination is allowed.  Currently always returns true.
     *
     * @return the isTerminationAllowed value
     */
    public Boolean isTerminationAllowed() {
        return this.isTerminationAllowed;
    }

    /**
     * Get replication mode of this replication link.
     *
     * @return the replicationMode value
     */
    public String replicationMode() {
        return this.replicationMode;
    }

    /**
     * Get the name of the server hosting the partner database.
     *
     * @return the partnerServer value
     */
    public String partnerServer() {
        return this.partnerServer;
    }

    /**
     * Get the name of the partner database.
     *
     * @return the partnerDatabase value
     */
    public String partnerDatabase() {
        return this.partnerDatabase;
    }

    /**
     * Get the Azure Region of the partner database.
     *
     * @return the partnerLocation value
     */
    public String partnerLocation() {
        return this.partnerLocation;
    }

    /**
     * Get the role of the database in the replication link. Possible values include: 'Primary', 'Secondary', 'NonReadableSecondary', 'Source', 'Copy'.
     *
     * @return the role value
     */
    public ReplicationRole role() {
        return this.role;
    }

    /**
     * Get the role of the partner database in the replication link. Possible values include: 'Primary', 'Secondary', 'NonReadableSecondary', 'Source', 'Copy'.
     *
     * @return the partnerRole value
     */
    public ReplicationRole partnerRole() {
        return this.partnerRole;
    }

    /**
     * Get the start time for the replication link.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the percentage of seeding complete for the replication link.
     *
     * @return the percentComplete value
     */
    public Integer percentComplete() {
        return this.percentComplete;
    }

    /**
     * Get the replication state for the replication link. Possible values include: 'PENDING', 'SEEDING', 'CATCH_UP', 'SUSPENDED'.
     *
     * @return the replicationState value
     */
    public ReplicationState replicationState() {
        return this.replicationState;
    }

}
