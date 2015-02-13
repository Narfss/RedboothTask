package com.fmsirvent.fmsirventtest2.logicCore.activities;

/**
 * Created by narf on 12/02/15.
 */
public class ActivityModel {

    private String type;
    private int createdAt;
    private int updatedAt;
    private int activityId;
    private int userId;
    private int projectId;
    private int targetId;
    private String targetType;
    private String commentTarget_id;
    private String action;
    private int lastActivity_id;
    private boolean isPrivate;
    private String title;
    private String body;
    private String assignedId;
    private String previousAssignedId;
    private String dueOn;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
    }

    public int getCreatedAt() {
        return createdAt;
    }


    public void setUpdatedAt(int updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getUpdatedAt() {
        return updatedAt;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }


    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setTargetId(int targetId) {
        this.targetId = targetId;
    }

    public int getTargetId() {
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

    public void setLastActivity_id(int lastActivity_id) {
        this.lastActivity_id = lastActivity_id;
    }

    public int getLastActivity_id() {
        return lastActivity_id;
    }

    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
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
