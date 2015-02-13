package com.fmsirvent.fmsirventtest2.apiModule.response;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by narf on 12/02/15.
 */
public class ActivityResponse {

    @JsonProperty("type")
    String type;
    @JsonProperty("created_at")
    int createdAt;
    @JsonProperty("updated_at")
    int updatedAt;
    @JsonProperty("id")
    int activityId;
    @JsonProperty("user_id")
    int userId;
    @JsonProperty("project_id")
    int projectId;
    @JsonProperty("target_id")
    int targetId;
    @JsonProperty("target_type")
    String targetType;
    @JsonProperty("comment_target_id")
    String commentTargetId;
    @JsonProperty("action")
    String action;
    @JsonProperty("last_activity_id")
    int lastActivityId;
    @JsonProperty("is_private")
    boolean isPrivate;
    @JsonProperty("title")
    String title;
    @JsonProperty("body")
    String body;
    @JsonProperty("assigned_id")
    String assignedId;
    @JsonProperty("previous_assigned_id")
    String previousAssignedId;
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

    public int getActivityId() {
        return activityId;
    }

    public int getUserId() {
        return userId;
    }

    public int getProjectId() {
        return projectId;
    }

    public int getTargetId() {
        return targetId;
    }

    public String getTargetType() {
        return targetType;
    }

    public String getCommentTargetId() {
        return commentTargetId;
    }

    public String getAction() {
        return action;
    }

    public int getLastActivityId() {
        return lastActivityId;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getAssignedId() {
        return assignedId;
    }

    public String getPreviousAssignedId() {
        return previousAssignedId;
    }

    public String getDueOn() {
        return dueOn;
    }
}
