package com.fmsirvent.fmsirventtest2.logicCore.activities;

/**
 * Created by narf on 12/02/15.
 */
public class ActivityModel {
    String title;
    private String type;
    private String createdAt;
    private String updatedAt;
    private String activityId;
    private String userId;
    private String projectId;
    private String targetId;
    private String targetType;
    private String commentTarget_id;
    private String action;
    private String lastActivity_id;
    private String isPrivate;
    private String body;
    private String assignedId;
    private String previousAssignedId;
    private String dueOn;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setCommentTarget_id(String commentTarget_id) {
        this.commentTarget_id = commentTarget_id;
    }

    public String getCommentTarget_id() {
        return commentTarget_id;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public void setLastActivity_id(String lastActivity_id) {
        this.lastActivity_id = lastActivity_id;
    }

    public String getLastActivity_id() {
        return lastActivity_id;
    }

    public void setIsPrivate(String isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getIsPrivate() {
        return isPrivate;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setAssignedId(String assignedId) {
        this.assignedId = assignedId;
    }

    public String getAssignedId() {
        return assignedId;
    }

    public void setPreviousAssignedId(String previousAssignedId) {
        this.previousAssignedId = previousAssignedId;
    }

    public String getPreviousAssignedId() {
        return previousAssignedId;
    }

    public void setDueOn(String dueOn) {
        this.dueOn = dueOn;
    }

    public String getDueOn() {
        return dueOn;
    }
}
