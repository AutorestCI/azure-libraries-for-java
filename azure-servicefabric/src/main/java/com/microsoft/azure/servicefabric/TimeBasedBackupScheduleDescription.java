/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the time based backup schedule.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ScheduleKind")
@JsonTypeName("TimeBased")
public class TimeBasedBackupScheduleDescription extends BackupScheduleDescription {
    /**
     * Describes the frequency with which to run the time based backup
     * schedule.
     * . Possible values include: 'Invalid', 'Daily', 'Weekly'.
     */
    @JsonProperty(value = "ScheduleFrequencyType", required = true)
    private BackupScheduleFrequencyType scheduleFrequencyType;

    /**
     * List of days of a week when to trigger the periodic backup. This is
     * valid only when the backup schedule frequency type is weekly.
     */
    @JsonProperty(value = "RunDays")
    private List<DayOfWeek> runDays;

    /**
     * Represents the list of exact time during the day in ISO8601 format. Like
     * '19:00:00' will represent '7PM' during the day. Date specified along
     * with time will be ignored.
     */
    @JsonProperty(value = "RunTimes", required = true)
    private List<DateTime> runTimes;

    /**
     * Get the scheduleFrequencyType value.
     *
     * @return the scheduleFrequencyType value
     */
    public BackupScheduleFrequencyType scheduleFrequencyType() {
        return this.scheduleFrequencyType;
    }

    /**
     * Set the scheduleFrequencyType value.
     *
     * @param scheduleFrequencyType the scheduleFrequencyType value to set
     * @return the TimeBasedBackupScheduleDescription object itself.
     */
    public TimeBasedBackupScheduleDescription withScheduleFrequencyType(BackupScheduleFrequencyType scheduleFrequencyType) {
        this.scheduleFrequencyType = scheduleFrequencyType;
        return this;
    }

    /**
     * Get the runDays value.
     *
     * @return the runDays value
     */
    public List<DayOfWeek> runDays() {
        return this.runDays;
    }

    /**
     * Set the runDays value.
     *
     * @param runDays the runDays value to set
     * @return the TimeBasedBackupScheduleDescription object itself.
     */
    public TimeBasedBackupScheduleDescription withRunDays(List<DayOfWeek> runDays) {
        this.runDays = runDays;
        return this;
    }

    /**
     * Get the runTimes value.
     *
     * @return the runTimes value
     */
    public List<DateTime> runTimes() {
        return this.runTimes;
    }

    /**
     * Set the runTimes value.
     *
     * @param runTimes the runTimes value to set
     * @return the TimeBasedBackupScheduleDescription object itself.
     */
    public TimeBasedBackupScheduleDescription withRunTimes(List<DateTime> runTimes) {
        this.runTimes = runTimes;
        return this;
    }

}
