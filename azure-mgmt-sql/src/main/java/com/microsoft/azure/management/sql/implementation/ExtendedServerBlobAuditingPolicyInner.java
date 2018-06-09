/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import com.microsoft.azure.management.sql.BlobAuditingPolicyState;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * An extended server blob auditing policy.
 */
@JsonFlatten
public class ExtendedServerBlobAuditingPolicyInner extends ProxyResourceInner {
    /**
     * Specifies condition of where clause when creating an audit.
     */
    @JsonProperty(value = "properties.predicateExpression")
    private String predicateExpression;

    /**
     * Specifies the state of the policy. If state is Enabled, storageEndpoint
     * and storageAccountAccessKey are required. Possible values include:
     * 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.state", required = true)
    private BlobAuditingPolicyState state;

    /**
     * Specifies the blob storage endpoint (e.g.
     * https://MyAccount.blob.core.windows.net). If state is Enabled,
     * storageEndpoint is required.
     */
    @JsonProperty(value = "properties.storageEndpoint")
    private String storageEndpoint;

    /**
     * Specifies the identifier key of the auditing storage account. If state
     * is Enabled, storageAccountAccessKey is required.
     */
    @JsonProperty(value = "properties.storageAccountAccessKey")
    private String storageAccountAccessKey;

    /**
     * Specifies the number of days to keep in the audit logs.
     */
    @JsonProperty(value = "properties.retentionDays")
    private Integer retentionDays;

    /**
     * Specifies the Actions-Groups and Actions to audit.
     *
     * The recommended set of action groups to use is the following combination
     * - this will audit all the queries and stored procedures executed against
     * the database, as well as successful and failed logins:
     *
     * BATCH_COMPLETED_GROUP,
     * SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP,
     * FAILED_DATABASE_AUTHENTICATION_GROUP.
     *
     * This above combination is also the set that is configured by default
     * when enabling auditing from the Azure portal.
     *
     * The supported action groups to audit are (note: choose only specific
     * groups that cover your auditing needs. Using unnecessary groups could
     * lead to very large quantities of audit records):
     *
     * APPLICATION_ROLE_CHANGE_PASSWORD_GROUP
     * BACKUP_RESTORE_GROUP
     * DATABASE_LOGOUT_GROUP
     * DATABASE_OBJECT_CHANGE_GROUP
     * DATABASE_OBJECT_OWNERSHIP_CHANGE_GROUP
     * DATABASE_OBJECT_PERMISSION_CHANGE_GROUP
     * DATABASE_OPERATION_GROUP
     * DATABASE_PERMISSION_CHANGE_GROUP
     * DATABASE_PRINCIPAL_CHANGE_GROUP
     * DATABASE_PRINCIPAL_IMPERSONATION_GROUP
     * DATABASE_ROLE_MEMBER_CHANGE_GROUP
     * FAILED_DATABASE_AUTHENTICATION_GROUP
     * SCHEMA_OBJECT_ACCESS_GROUP
     * SCHEMA_OBJECT_CHANGE_GROUP
     * SCHEMA_OBJECT_OWNERSHIP_CHANGE_GROUP
     * SCHEMA_OBJECT_PERMISSION_CHANGE_GROUP
     * SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP
     * USER_CHANGE_PASSWORD_GROUP
     * BATCH_STARTED_GROUP
     * BATCH_COMPLETED_GROUP
     *
     * These are groups that cover all sql statements and stored procedures
     * executed against the database, and should not be used in combination
     * with other groups as this will result in duplicate audit logs.
     *
     * For more information, see [Database-Level Audit Action
     * Groups](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-action-groups).
     *
     * For Database auditing policy, specific Actions can also be specified
     * (note that Actions cannot be specified for Server auditing policy). The
     * supported actions to audit are:
     * SELECT
     * UPDATE
     * INSERT
     * DELETE
     * EXECUTE
     * RECEIVE
     * REFERENCES
     *
     * The general form for defining an action to be audited is:
     * &lt;action&gt; ON &lt;object&gt; BY &lt;principal&gt;
     *
     * Note that &lt;object&gt; in the above format can refer to an object like
     * a table, view, or stored procedure, or an entire database or schema. For
     * the latter cases, the forms DATABASE::&lt;db_name&gt; and
     * SCHEMA::&lt;schema_name&gt; are used, respectively.
     *
     * For example:
     * SELECT on dbo.myTable by public
     * SELECT on DATABASE::myDatabase by public
     * SELECT on SCHEMA::mySchema by public
     *
     * For more information, see [Database-Level Audit
     * Actions](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-actions).
     */
    @JsonProperty(value = "properties.auditActionsAndGroups")
    private List<String> auditActionsAndGroups;

    /**
     * Specifies the blob storage subscription Id.
     */
    @JsonProperty(value = "properties.storageAccountSubscriptionId")
    private UUID storageAccountSubscriptionId;

    /**
     * Specifies whether storageAccountAccessKey value is the storage's
     * secondary key.
     */
    @JsonProperty(value = "properties.isStorageSecondaryKeyInUse")
    private Boolean isStorageSecondaryKeyInUse;

    /**
     * Get specifies condition of where clause when creating an audit.
     *
     * @return the predicateExpression value
     */
    public String predicateExpression() {
        return this.predicateExpression;
    }

    /**
     * Set specifies condition of where clause when creating an audit.
     *
     * @param predicateExpression the predicateExpression value to set
     * @return the ExtendedServerBlobAuditingPolicyInner object itself.
     */
    public ExtendedServerBlobAuditingPolicyInner withPredicateExpression(String predicateExpression) {
        this.predicateExpression = predicateExpression;
        return this;
    }

    /**
     * Get specifies the state of the policy. If state is Enabled, storageEndpoint and storageAccountAccessKey are required. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the state value
     */
    public BlobAuditingPolicyState state() {
        return this.state;
    }

    /**
     * Set specifies the state of the policy. If state is Enabled, storageEndpoint and storageAccountAccessKey are required. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param state the state value to set
     * @return the ExtendedServerBlobAuditingPolicyInner object itself.
     */
    public ExtendedServerBlobAuditingPolicyInner withState(BlobAuditingPolicyState state) {
        this.state = state;
        return this;
    }

    /**
     * Get specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint is required.
     *
     * @return the storageEndpoint value
     */
    public String storageEndpoint() {
        return this.storageEndpoint;
    }

    /**
     * Set specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint is required.
     *
     * @param storageEndpoint the storageEndpoint value to set
     * @return the ExtendedServerBlobAuditingPolicyInner object itself.
     */
    public ExtendedServerBlobAuditingPolicyInner withStorageEndpoint(String storageEndpoint) {
        this.storageEndpoint = storageEndpoint;
        return this;
    }

    /**
     * Get specifies the identifier key of the auditing storage account. If state is Enabled, storageAccountAccessKey is required.
     *
     * @return the storageAccountAccessKey value
     */
    public String storageAccountAccessKey() {
        return this.storageAccountAccessKey;
    }

    /**
     * Set specifies the identifier key of the auditing storage account. If state is Enabled, storageAccountAccessKey is required.
     *
     * @param storageAccountAccessKey the storageAccountAccessKey value to set
     * @return the ExtendedServerBlobAuditingPolicyInner object itself.
     */
    public ExtendedServerBlobAuditingPolicyInner withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.storageAccountAccessKey = storageAccountAccessKey;
        return this;
    }

    /**
     * Get specifies the number of days to keep in the audit logs.
     *
     * @return the retentionDays value
     */
    public Integer retentionDays() {
        return this.retentionDays;
    }

    /**
     * Set specifies the number of days to keep in the audit logs.
     *
     * @param retentionDays the retentionDays value to set
     * @return the ExtendedServerBlobAuditingPolicyInner object itself.
     */
    public ExtendedServerBlobAuditingPolicyInner withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * Get specifies the Actions-Groups and Actions to audit.
     The recommended set of action groups to use is the following combination - this will audit all the queries and stored procedures executed against the database, as well as successful and failed logins:
     BATCH_COMPLETED_GROUP,
     SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP,
     FAILED_DATABASE_AUTHENTICATION_GROUP.
     This above combination is also the set that is configured by default when enabling auditing from the Azure portal.
     The supported action groups to audit are (note: choose only specific groups that cover your auditing needs. Using unnecessary groups could lead to very large quantities of audit records):
     APPLICATION_ROLE_CHANGE_PASSWORD_GROUP
     BACKUP_RESTORE_GROUP
     DATABASE_LOGOUT_GROUP
     DATABASE_OBJECT_CHANGE_GROUP
     DATABASE_OBJECT_OWNERSHIP_CHANGE_GROUP
     DATABASE_OBJECT_PERMISSION_CHANGE_GROUP
     DATABASE_OPERATION_GROUP
     DATABASE_PERMISSION_CHANGE_GROUP
     DATABASE_PRINCIPAL_CHANGE_GROUP
     DATABASE_PRINCIPAL_IMPERSONATION_GROUP
     DATABASE_ROLE_MEMBER_CHANGE_GROUP
     FAILED_DATABASE_AUTHENTICATION_GROUP
     SCHEMA_OBJECT_ACCESS_GROUP
     SCHEMA_OBJECT_CHANGE_GROUP
     SCHEMA_OBJECT_OWNERSHIP_CHANGE_GROUP
     SCHEMA_OBJECT_PERMISSION_CHANGE_GROUP
     SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP
     USER_CHANGE_PASSWORD_GROUP
     BATCH_STARTED_GROUP
     BATCH_COMPLETED_GROUP
     These are groups that cover all sql statements and stored procedures executed against the database, and should not be used in combination with other groups as this will result in duplicate audit logs.
     For more information, see [Database-Level Audit Action Groups](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-action-groups).
     For Database auditing policy, specific Actions can also be specified (note that Actions cannot be specified for Server auditing policy). The supported actions to audit are:
     SELECT
     UPDATE
     INSERT
     DELETE
     EXECUTE
     RECEIVE
     REFERENCES
     The general form for defining an action to be audited is:
     &lt;action&gt; ON &lt;object&gt; BY &lt;principal&gt;
     Note that &lt;object&gt; in the above format can refer to an object like a table, view, or stored procedure, or an entire database or schema. For the latter cases, the forms DATABASE::&lt;db_name&gt; and SCHEMA::&lt;schema_name&gt; are used, respectively.
     For example:
     SELECT on dbo.myTable by public
     SELECT on DATABASE::myDatabase by public
     SELECT on SCHEMA::mySchema by public
     For more information, see [Database-Level Audit Actions](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-actions).
     *
     * @return the auditActionsAndGroups value
     */
    public List<String> auditActionsAndGroups() {
        return this.auditActionsAndGroups;
    }

    /**
     * Set specifies the Actions-Groups and Actions to audit.
     The recommended set of action groups to use is the following combination - this will audit all the queries and stored procedures executed against the database, as well as successful and failed logins:
     BATCH_COMPLETED_GROUP,
     SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP,
     FAILED_DATABASE_AUTHENTICATION_GROUP.
     This above combination is also the set that is configured by default when enabling auditing from the Azure portal.
     The supported action groups to audit are (note: choose only specific groups that cover your auditing needs. Using unnecessary groups could lead to very large quantities of audit records):
     APPLICATION_ROLE_CHANGE_PASSWORD_GROUP
     BACKUP_RESTORE_GROUP
     DATABASE_LOGOUT_GROUP
     DATABASE_OBJECT_CHANGE_GROUP
     DATABASE_OBJECT_OWNERSHIP_CHANGE_GROUP
     DATABASE_OBJECT_PERMISSION_CHANGE_GROUP
     DATABASE_OPERATION_GROUP
     DATABASE_PERMISSION_CHANGE_GROUP
     DATABASE_PRINCIPAL_CHANGE_GROUP
     DATABASE_PRINCIPAL_IMPERSONATION_GROUP
     DATABASE_ROLE_MEMBER_CHANGE_GROUP
     FAILED_DATABASE_AUTHENTICATION_GROUP
     SCHEMA_OBJECT_ACCESS_GROUP
     SCHEMA_OBJECT_CHANGE_GROUP
     SCHEMA_OBJECT_OWNERSHIP_CHANGE_GROUP
     SCHEMA_OBJECT_PERMISSION_CHANGE_GROUP
     SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP
     USER_CHANGE_PASSWORD_GROUP
     BATCH_STARTED_GROUP
     BATCH_COMPLETED_GROUP
     These are groups that cover all sql statements and stored procedures executed against the database, and should not be used in combination with other groups as this will result in duplicate audit logs.
     For more information, see [Database-Level Audit Action Groups](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-action-groups).
     For Database auditing policy, specific Actions can also be specified (note that Actions cannot be specified for Server auditing policy). The supported actions to audit are:
     SELECT
     UPDATE
     INSERT
     DELETE
     EXECUTE
     RECEIVE
     REFERENCES
     The general form for defining an action to be audited is:
     &lt;action&gt; ON &lt;object&gt; BY &lt;principal&gt;
     Note that &lt;object&gt; in the above format can refer to an object like a table, view, or stored procedure, or an entire database or schema. For the latter cases, the forms DATABASE::&lt;db_name&gt; and SCHEMA::&lt;schema_name&gt; are used, respectively.
     For example:
     SELECT on dbo.myTable by public
     SELECT on DATABASE::myDatabase by public
     SELECT on SCHEMA::mySchema by public
     For more information, see [Database-Level Audit Actions](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-actions).
     *
     * @param auditActionsAndGroups the auditActionsAndGroups value to set
     * @return the ExtendedServerBlobAuditingPolicyInner object itself.
     */
    public ExtendedServerBlobAuditingPolicyInner withAuditActionsAndGroups(List<String> auditActionsAndGroups) {
        this.auditActionsAndGroups = auditActionsAndGroups;
        return this;
    }

    /**
     * Get specifies the blob storage subscription Id.
     *
     * @return the storageAccountSubscriptionId value
     */
    public UUID storageAccountSubscriptionId() {
        return this.storageAccountSubscriptionId;
    }

    /**
     * Set specifies the blob storage subscription Id.
     *
     * @param storageAccountSubscriptionId the storageAccountSubscriptionId value to set
     * @return the ExtendedServerBlobAuditingPolicyInner object itself.
     */
    public ExtendedServerBlobAuditingPolicyInner withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId) {
        this.storageAccountSubscriptionId = storageAccountSubscriptionId;
        return this;
    }

    /**
     * Get specifies whether storageAccountAccessKey value is the storage's secondary key.
     *
     * @return the isStorageSecondaryKeyInUse value
     */
    public Boolean isStorageSecondaryKeyInUse() {
        return this.isStorageSecondaryKeyInUse;
    }

    /**
     * Set specifies whether storageAccountAccessKey value is the storage's secondary key.
     *
     * @param isStorageSecondaryKeyInUse the isStorageSecondaryKeyInUse value to set
     * @return the ExtendedServerBlobAuditingPolicyInner object itself.
     */
    public ExtendedServerBlobAuditingPolicyInner withIsStorageSecondaryKeyInUse(Boolean isStorageSecondaryKeyInUse) {
        this.isStorageSecondaryKeyInUse = isStorageSecondaryKeyInUse;
        return this;
    }

}
