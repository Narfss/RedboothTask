package com.fmsirvent.fmsirventtest2.logicCore.createTask;

/**
 * Created by fmsirvent on 13/2/15.
 */
public class TaskListModel {
    private String type;
    private int createdAt;
    private int updatedAt;
    private int taskListId;
    private String name;
    private int projectId;
    private int userId;
    private String startOn;
    private String finishOn;
    private String position;
    private boolean archived;
    private String archivedTasksCount;
    private String tasksCount;
    private int lastCommentId;
    private int updatedById;
    private boolean deleted;
    private String completedAt;

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

    public void setTaskListId(int taskListId) {
        this.taskListId = taskListId;
    }

    public int getTaskListId() {
        return taskListId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setStartOn(String startOn) {
        this.startOn = startOn;
    }

    public String getStartOn() {
        return startOn;
    }

    public void setFinishOn(String finishOn) {
        this.finishOn = finishOn;
    }

    public String getFinishOn() {
        return finishOn;
    }


    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public boolean isArchived() {
        return archived;
    }


    public void setArchivedTasksCount(String archivedTasksCount) {
        this.archivedTasksCount = archivedTasksCount;
    }

    public String getArchivedTasksCount() {
        return archivedTasksCount;
    }


    public void setTasksCount(String tasksCount) {
        this.tasksCount = tasksCount;
    }

    public String getTasksCount() {
        return tasksCount;
    }

    public void setLastCommentId(int lastCommentId) {
        this.lastCommentId = lastCommentId;
    }

    public int getLastCommentId() {
        return lastCommentId;
    }

    public void setUpdatedById(int updatedById) {
        this.updatedById = updatedById;
    }

    public int getUpdatedById() {
        return updatedById;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    public String getCompletedAt() {
        return completedAt;
    }

    public String toString()
    {
        return name ;
    }
}
