package com.fmsirvent.fmsirventtest2.apiModule.response;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by fmsirvent on 13/2/15.
 */
public class TaskListResponse {

    @JsonProperty("type")
    String type;

    @JsonProperty("created_at")
    int createdAt;

    @JsonProperty("updated_at")
    int updatedAt;

    @JsonProperty("id")
    int taskListId;

    @JsonProperty("name")
    String name;

    @JsonProperty("project_id")
    int projectId;

    @JsonProperty("user_id")
    int userId;

    @JsonProperty("start_on")
    String startOn;

    @JsonProperty("finish_on")
    String finishOn;

    @JsonProperty("position")
    String position;

    @JsonProperty("archived")
    boolean archived;

    @JsonProperty("archived_tasks_count")
    String archivedTasksCount;

    @JsonProperty("tasks_count")
    String tasksCount;

    @JsonProperty("last_comment_id")
    int lastCommentId;

    @JsonProperty("updated_by_id")
    int updatedById;

    //@JsonProperty("metadata")
    //String metadata;

    @JsonProperty("deleted")
    boolean deleted;

    @JsonProperty("completed_at")
    String completedAt;

    public String getType() {
        return type;
    }

    public int getCreatedAt() {
        return createdAt;
    }

    public int getUpdatedAt() {
        return updatedAt;
    }

    public int getTaskListId() {
        return taskListId;
    }

    public String getName() {
        return name;
    }

    public int getProjectId() {
        return projectId;
    }

    public int getUserId() {
        return userId;
    }

    public String getStartOn() {
        return startOn;
    }

    public String getFinishOn() {
        return finishOn;
    }

    public String getPosition() {
        return position;
    }

    public boolean isArchived() {
        return archived;
    }

    public String getArchivedTasksCount() {
        return archivedTasksCount;
    }

    public String getTasksCount() {
        return tasksCount;
    }

    public int getLastCommentId() {
        return lastCommentId;
    }

    public int getUpdatedById() {
        return updatedById;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public String getCompletedAt() {
        return completedAt;
    }
}
