package com.fmsirvent.fmsirventtest2.apiModule.response;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by narf on 12/02/15.
 */
public class ActivityResponse {
    /*
    {
        type: "DenormalizedActivity",
        created_at: 1423521210,
        updated_at: 1423521211,
        id: 78599537,
        user_id: 787710,
        project_id: 1367628,
        target_id: 16790184,
        target_type: "Task",
        comment_target_id: null,
        action: "create",
        last_activity_id: 78599537,
        is_private: false,
        title: "Crear app",
        body: "Client ID 61e53f179fa7849edb35f0a70f15199ae52bdab1b53e247f5bad24e00b7527bc Client Secret 4ee0e4d8cc52edf0c5e6476fddfa30a33b7f36df3230adf9017728640be4ef8f Return URI http://fmsirvent.com",
        assigned_id: null,
        previous_assigned_id: null,
        due_on: null,
        previous_due_on: null,
        urgent: false,
        previous_urgent: null,
        time_tracking_on: null
     }
     */
    @JsonProperty("type")
    String type;
    @JsonProperty("created_at")
    String createdAt;
    @JsonProperty("updated_at")
    String updatedAt;
    @JsonProperty("id")
    String activityId;
    @JsonProperty("user_id")
    String userId;
    @JsonProperty("project_id")
    String projectId;
    @JsonProperty("target_id")
    String targetId;
    @JsonProperty("target_type")
    String targetType;
    @JsonProperty("comment_target_id")
    String commentTargetId;
    @JsonProperty("action")
    String action;
    @JsonProperty("last_activity_id")
    String lastActivityId;
    @JsonProperty("is_private")
    String isPrivate;
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

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getActivityId() {
        return activityId;
    }

    public String getUserId() {
        return userId;
    }

    public String getProjectId() {
        return projectId;
    }

    public String getTargetId() {
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

    public String getLastActivityId() {
        return lastActivityId;
    }

    public String getIsPrivate() {
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
