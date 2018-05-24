/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import java.util.UUID;
import org.joda.time.DateTime;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * A database resource.
 */
@JsonFlatten
public class DatabaseUpdate {
    /**
     * The name and tier of the SKU.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Specifies the mode of database creation.
     *
     * Default: regular database creation.
     *
     * Copy: creates a database as a copy of an existing database.
     * sourceDatabaseId must be specified as the resource ID of the source
     * database.
     *
     * Secondary: creates a database as a secondary replica of an existing
     * database. sourceDatabaseId must be specified as the resource ID of the
     * existing primary database.
     *
     * PointInTimeRestore: Creates a database by restoring a point in time
     * backup of an existing database. sourceDatabaseId must be specified as
     * the resource ID of the existing database, and restorePointInTime must be
     * specified.
     *
     * Recovery: Creates a database by restoring a geo-replicated backup.
     * sourceDatabaseId must be specified as the recoverable database resource
     * ID to restore.
     *
     * Restore: Creates a database by restoring a backup of a deleted database.
     * sourceDatabaseId must be specified. If sourceDatabaseId is the
     * database's original resource ID, then sourceDatabaseDeletionDate must be
     * specified. Otherwise sourceDatabaseId must be the restorable dropped
     * database resource ID and sourceDatabaseDeletionDate is ignored.
     * restorePointInTime may also be specified to restore from an earlier
     * point in time.
     *
     * RestoreLongTermRetentionBackup: Creates a database by restoring from a
     * long term retention vault. recoveryServicesRecoveryPointResourceId must
     * be specified as the recovery point resource ID.
     *
     * Copy, Secondary, and RestoreLongTermRetentionBackup are not supported
     * for DataWarehouse edition. Possible values include: 'Default', 'Copy',
     * 'Secondary', 'PointInTimeRestore', 'Restore', 'Recovery',
     * 'RestoreExternalBackup', 'RestoreExternalBackupSecondary',
     * 'RestoreLongTermRetentionBackup', 'OnlineSecondary'.
     */
    @JsonProperty(value = "properties.createMode")
    private CreateMode createMode;

    /**
     * The collation of the database.
     */
    @JsonProperty(value = "properties.collation")
    private String collation;

    /**
     * The max size of the database expressed in bytes.
     */
    @JsonProperty(value = "properties.maxSizeBytes")
    private Long maxSizeBytes;

    /**
     * The name of the sample schema to apply when creating this database.
     * Possible values include: 'AdventureWorksLT', 'WideWorldImportersStd',
     * 'WideWorldImportersFull'.
     */
    @JsonProperty(value = "properties.sampleName")
    private SampleName sampleName;

    /**
     * The resource identifier of the elastic pool containing this database.
     */
    @JsonProperty(value = "properties.elasticPoolId")
    private String elasticPoolId;

    /**
     * The resource identifier of the source database associated with create
     * operation of this database.
     */
    @JsonProperty(value = "properties.sourceDatabaseId")
    private String sourceDatabaseId;

    /**
     * The status of the database. Possible values include: 'Online',
     * 'Restoring', 'RecoveryPending', 'Recovering', 'Suspect', 'Offline',
     * 'Standby', 'Shutdown', 'EmergencyMode', 'AutoClosed', 'Copying',
     * 'Creating', 'Inaccessible', 'OfflineSecondary', 'Pausing', 'Paused',
     * 'Resuming', 'Scaling'.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private DatabaseStatus status;

    /**
     * The ID of the database.
     */
    @JsonProperty(value = "properties.databaseId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID databaseId;

    /**
     * The creation date of the database (ISO8601 format).
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationDate;

    /**
     * The current service level objective name of the database.
     */
    @JsonProperty(value = "properties.currentServiceObjectiveName", access = JsonProperty.Access.WRITE_ONLY)
    private String currentServiceObjectiveName;

    /**
     * The requested service level objective name of the database.
     */
    @JsonProperty(value = "properties.requestedServiceObjectiveName", access = JsonProperty.Access.WRITE_ONLY)
    private String requestedServiceObjectiveName;

    /**
     * The default secondary region for this database.
     */
    @JsonProperty(value = "properties.defaultSecondaryLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultSecondaryLocation;

    /**
     * Failover Group resource identifier that this database belongs to.
     */
    @JsonProperty(value = "properties.failoverGroupId", access = JsonProperty.Access.WRITE_ONLY)
    private String failoverGroupId;

    /**
     * Specifies the point in time (ISO8601 format) of the source database that
     * will be restored to create the new database.
     */
    @JsonProperty(value = "properties.restorePointInTime")
    private DateTime restorePointInTime;

    /**
     * Specifies the time that the database was deleted.
     */
    @JsonProperty(value = "properties.sourceDatabaseDeletionDate")
    private DateTime sourceDatabaseDeletionDate;

    /**
     * The resource identifier of the recovery point associated with create
     * operation of this database.
     */
    @JsonProperty(value = "properties.recoveryServicesRecoveryPointId")
    private String recoveryServicesRecoveryPointId;

    /**
     * The resource identifier of the long term retention backup associated
     * with create operation of this database.
     */
    @JsonProperty(value = "properties.longTermRetentionBackupResourceId")
    private String longTermRetentionBackupResourceId;

    /**
     * The resource identifier of the recoverable database associated with
     * create operation of this database.
     */
    @JsonProperty(value = "properties.recoverableDatabaseId")
    private String recoverableDatabaseId;

    /**
     * The resource identifier of the restorable dropped database associated
     * with create operation of this database.
     */
    @JsonProperty(value = "properties.restorableDroppedDatabaseId")
    private String restorableDroppedDatabaseId;

    /**
     * Collation of the metadata catalog. Possible values include:
     * 'DATABASE_DEFAULT', 'SQL_Latin1_General_CP1_CI_AS'.
     */
    @JsonProperty(value = "properties.catalogCollation")
    private CatalogCollationType catalogCollation;

    /**
     * Whether or not this database is zone redundant, which means the replicas
     * of this database will be spread across multiple availability zones.
     */
    @JsonProperty(value = "properties.zoneRedundant")
    private Boolean zoneRedundant;

    /**
     * The license type to apply for this database. Possible values include:
     * 'LicenseIncluded', 'BasePrice'.
     */
    @JsonProperty(value = "properties.licenseType")
    private DatabaseLicenseType licenseType;

    /**
     * The max log size for this database.
     */
    @JsonProperty(value = "properties.maxLogSizeBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long maxLogSizeBytes;

    /**
     * This records the earliest start date and time that restore is available
     * for this database (ISO8601 format).
     */
    @JsonProperty(value = "properties.earliestRestoreDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime earliestRestoreDate;

    /**
     * The state of read-only routing. If enabled, connections that have
     * application intent set to readonly in their connection string may be
     * routed to a readonly secondary replica in the same region. Possible
     * values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.readScale")
    private DatabaseReadScale readScale;

    /**
     * The name and tier of the SKU.
     */
    @JsonProperty(value = "properties.currentSku", access = JsonProperty.Access.WRITE_ONLY)
    private Sku currentSku;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the createMode value.
     *
     * @return the createMode value
     */
    public CreateMode createMode() {
        return this.createMode;
    }

    /**
     * Set the createMode value.
     *
     * @param createMode the createMode value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withCreateMode(CreateMode createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Get the collation value.
     *
     * @return the collation value
     */
    public String collation() {
        return this.collation;
    }

    /**
     * Set the collation value.
     *
     * @param collation the collation value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withCollation(String collation) {
        this.collation = collation;
        return this;
    }

    /**
     * Get the maxSizeBytes value.
     *
     * @return the maxSizeBytes value
     */
    public Long maxSizeBytes() {
        return this.maxSizeBytes;
    }

    /**
     * Set the maxSizeBytes value.
     *
     * @param maxSizeBytes the maxSizeBytes value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withMaxSizeBytes(Long maxSizeBytes) {
        this.maxSizeBytes = maxSizeBytes;
        return this;
    }

    /**
     * Get the sampleName value.
     *
     * @return the sampleName value
     */
    public SampleName sampleName() {
        return this.sampleName;
    }

    /**
     * Set the sampleName value.
     *
     * @param sampleName the sampleName value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withSampleName(SampleName sampleName) {
        this.sampleName = sampleName;
        return this;
    }

    /**
     * Get the elasticPoolId value.
     *
     * @return the elasticPoolId value
     */
    public String elasticPoolId() {
        return this.elasticPoolId;
    }

    /**
     * Set the elasticPoolId value.
     *
     * @param elasticPoolId the elasticPoolId value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withElasticPoolId(String elasticPoolId) {
        this.elasticPoolId = elasticPoolId;
        return this;
    }

    /**
     * Get the sourceDatabaseId value.
     *
     * @return the sourceDatabaseId value
     */
    public String sourceDatabaseId() {
        return this.sourceDatabaseId;
    }

    /**
     * Set the sourceDatabaseId value.
     *
     * @param sourceDatabaseId the sourceDatabaseId value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withSourceDatabaseId(String sourceDatabaseId) {
        this.sourceDatabaseId = sourceDatabaseId;
        return this;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public DatabaseStatus status() {
        return this.status;
    }

    /**
     * Get the databaseId value.
     *
     * @return the databaseId value
     */
    public UUID databaseId() {
        return this.databaseId;
    }

    /**
     * Get the creationDate value.
     *
     * @return the creationDate value
     */
    public DateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the currentServiceObjectiveName value.
     *
     * @return the currentServiceObjectiveName value
     */
    public String currentServiceObjectiveName() {
        return this.currentServiceObjectiveName;
    }

    /**
     * Get the requestedServiceObjectiveName value.
     *
     * @return the requestedServiceObjectiveName value
     */
    public String requestedServiceObjectiveName() {
        return this.requestedServiceObjectiveName;
    }

    /**
     * Get the defaultSecondaryLocation value.
     *
     * @return the defaultSecondaryLocation value
     */
    public String defaultSecondaryLocation() {
        return this.defaultSecondaryLocation;
    }

    /**
     * Get the failoverGroupId value.
     *
     * @return the failoverGroupId value
     */
    public String failoverGroupId() {
        return this.failoverGroupId;
    }

    /**
     * Get the restorePointInTime value.
     *
     * @return the restorePointInTime value
     */
    public DateTime restorePointInTime() {
        return this.restorePointInTime;
    }

    /**
     * Set the restorePointInTime value.
     *
     * @param restorePointInTime the restorePointInTime value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withRestorePointInTime(DateTime restorePointInTime) {
        this.restorePointInTime = restorePointInTime;
        return this;
    }

    /**
     * Get the sourceDatabaseDeletionDate value.
     *
     * @return the sourceDatabaseDeletionDate value
     */
    public DateTime sourceDatabaseDeletionDate() {
        return this.sourceDatabaseDeletionDate;
    }

    /**
     * Set the sourceDatabaseDeletionDate value.
     *
     * @param sourceDatabaseDeletionDate the sourceDatabaseDeletionDate value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withSourceDatabaseDeletionDate(DateTime sourceDatabaseDeletionDate) {
        this.sourceDatabaseDeletionDate = sourceDatabaseDeletionDate;
        return this;
    }

    /**
     * Get the recoveryServicesRecoveryPointId value.
     *
     * @return the recoveryServicesRecoveryPointId value
     */
    public String recoveryServicesRecoveryPointId() {
        return this.recoveryServicesRecoveryPointId;
    }

    /**
     * Set the recoveryServicesRecoveryPointId value.
     *
     * @param recoveryServicesRecoveryPointId the recoveryServicesRecoveryPointId value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withRecoveryServicesRecoveryPointId(String recoveryServicesRecoveryPointId) {
        this.recoveryServicesRecoveryPointId = recoveryServicesRecoveryPointId;
        return this;
    }

    /**
     * Get the longTermRetentionBackupResourceId value.
     *
     * @return the longTermRetentionBackupResourceId value
     */
    public String longTermRetentionBackupResourceId() {
        return this.longTermRetentionBackupResourceId;
    }

    /**
     * Set the longTermRetentionBackupResourceId value.
     *
     * @param longTermRetentionBackupResourceId the longTermRetentionBackupResourceId value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withLongTermRetentionBackupResourceId(String longTermRetentionBackupResourceId) {
        this.longTermRetentionBackupResourceId = longTermRetentionBackupResourceId;
        return this;
    }

    /**
     * Get the recoverableDatabaseId value.
     *
     * @return the recoverableDatabaseId value
     */
    public String recoverableDatabaseId() {
        return this.recoverableDatabaseId;
    }

    /**
     * Set the recoverableDatabaseId value.
     *
     * @param recoverableDatabaseId the recoverableDatabaseId value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withRecoverableDatabaseId(String recoverableDatabaseId) {
        this.recoverableDatabaseId = recoverableDatabaseId;
        return this;
    }

    /**
     * Get the restorableDroppedDatabaseId value.
     *
     * @return the restorableDroppedDatabaseId value
     */
    public String restorableDroppedDatabaseId() {
        return this.restorableDroppedDatabaseId;
    }

    /**
     * Set the restorableDroppedDatabaseId value.
     *
     * @param restorableDroppedDatabaseId the restorableDroppedDatabaseId value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withRestorableDroppedDatabaseId(String restorableDroppedDatabaseId) {
        this.restorableDroppedDatabaseId = restorableDroppedDatabaseId;
        return this;
    }

    /**
     * Get the catalogCollation value.
     *
     * @return the catalogCollation value
     */
    public CatalogCollationType catalogCollation() {
        return this.catalogCollation;
    }

    /**
     * Set the catalogCollation value.
     *
     * @param catalogCollation the catalogCollation value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withCatalogCollation(CatalogCollationType catalogCollation) {
        this.catalogCollation = catalogCollation;
        return this;
    }

    /**
     * Get the zoneRedundant value.
     *
     * @return the zoneRedundant value
     */
    public Boolean zoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     * Set the zoneRedundant value.
     *
     * @param zoneRedundant the zoneRedundant value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withZoneRedundant(Boolean zoneRedundant) {
        this.zoneRedundant = zoneRedundant;
        return this;
    }

    /**
     * Get the licenseType value.
     *
     * @return the licenseType value
     */
    public DatabaseLicenseType licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType value.
     *
     * @param licenseType the licenseType value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withLicenseType(DatabaseLicenseType licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the maxLogSizeBytes value.
     *
     * @return the maxLogSizeBytes value
     */
    public Long maxLogSizeBytes() {
        return this.maxLogSizeBytes;
    }

    /**
     * Get the earliestRestoreDate value.
     *
     * @return the earliestRestoreDate value
     */
    public DateTime earliestRestoreDate() {
        return this.earliestRestoreDate;
    }

    /**
     * Get the readScale value.
     *
     * @return the readScale value
     */
    public DatabaseReadScale readScale() {
        return this.readScale;
    }

    /**
     * Set the readScale value.
     *
     * @param readScale the readScale value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withReadScale(DatabaseReadScale readScale) {
        this.readScale = readScale;
        return this;
    }

    /**
     * Get the currentSku value.
     *
     * @return the currentSku value
     */
    public Sku currentSku() {
        return this.currentSku;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}