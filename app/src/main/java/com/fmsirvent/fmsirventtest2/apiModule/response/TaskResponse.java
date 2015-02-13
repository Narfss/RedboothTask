package com.fmsirvent.fmsirventtest2.apiModule.response;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by narf on 12/02/15.
 */
public class TaskResponse {

    @JsonProperty("type")
    String type;

    @JsonProperty("created_at")
    int createdAt;

    @JsonProperty("updated_at")
    int updatedAt;

    @JsonProperty("end_date")
    String endDate;

    @JsonProperty("last_due_date")
    String lastDueDate;

    @JsonProperty("start_date")
    String startDate;

    @JsonProperty("frequency")
    String frequency;

    @JsonProperty("id")
    int id;

    @JsonProperty("name")
    String name;

    @JsonProperty("task_list_id")
    int taskListId;

    @JsonProperty("comments_count")
    int commentsCount;

    @JsonProperty("assigned_id")
    String assignedId;

    @JsonProperty("is_private")
    Boolean isPrivate;

    @JsonProperty("project_id")
    int projectId;
    
    @JsonProperty("urgent")
    boolean urgent;

    @JsonProperty("user_id")
    int userId;

    @JsonProperty("position")
    int position;

    @JsonProperty("last_activity_id")
    String lastActivityId;

    @JsonProperty("record_conversion_type")
    String recordConversionType;

    @JsonProperty("record_conversion_id")
    String recordConversionId;

    //@JsonProperty("metadata")
    //String metadata;

    @JsonProperty("subtasks_count")
    int subtasksCount;

    @JsonProperty("resolved_subtasks_count")
    int resolvedSubtasksCount;

    //@JsonProperty("watcher_ids")
    //String watcherIds;

    @JsonProperty("description")
    String description;

    @JsonProperty("description_html")
    String descriptionHtml;

    @JsonProperty("description_updated_by_user_id")
    String descriptionUpdatedByUserId;

    @JsonProperty("description_updated_at")
    int descriptionUpdatedAt;

    @JsonProperty("updated_by_id")
    String updatedById;

    @JsonProperty("deleted")
    boolean deleted;

    @JsonProperty("row_order")
    int rowOrder;

    @JsonProperty("status")
    String status;

    @JsonProperty("due_on")
    String dueOn;

    public String getType() {
        return type;
    }

    public int getCreatedAt() {
        return createdAt;
    }

    public int getUpdatedAt() {
        return updatedAt;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getLastDueDate() {
        return lastDueDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getFrequency() {
        return frequency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTaskListId() {
        return taskListId;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public String getAssignedId() {
        return assignedId;
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }

    public int getProjectId() {
        return projectId;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public int getUserId() {
        return userId;
    }

    public int getPosition() {
        return position;
    }

    public String getLastActivityId() {
        return lastActivityId;
    }

    public String getRecordConversionType() {
        return recordConversionType;
    }

    public String getRecordConversionId() {
        return recordConversionId;
    }

    public int getSubtasksCount() {
        return subtasksCount;
    }

    public int getResolvedSubtasksCount() {
        return resolvedSubtasksCount;
    }

    public String getDescription() {
        return description;
    }

    public String getDescriptionHtml() {
        return descriptionHtml;
    }

    public String getDescriptionUpdatedByUserId() {
        return descriptionUpdatedByUserId;
    }

    public int getDescriptionUpdatedAt() {
        return descriptionUpdatedAt;
    }

    public String getUpdatedById() {
        return updatedById;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public int getRowOrder() {
        return rowOrder;
    }

    public String getStatus() {
        return status;
    }

    public String getDueOn() {
        return dueOn;
    }
}

