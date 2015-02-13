package com.fmsirvent.fmsirventtest2.logicCore.task;

import com.fmsirvent.fmsirventtest2.apiModule.response.TaskResponse;

/**
 * Created by narf on 13/02/15.
 */
public class TaskMapper {
    public static TaskModel map(TaskResponse taskResponse) {
        TaskModel taskModel = new TaskModel();
        taskModel.setType(taskResponse.getType());
        taskModel.setCreatedAt(taskResponse.getCreatedAt());
        taskModel.setUpdatedAt(taskResponse.getUpdatedAt());
        taskModel.setEndDate(taskResponse.getEndDate());
        taskModel.setLastDueDate(taskResponse.getLastDueDate());
        taskModel.setStartDate(taskResponse.getStartDate());
        taskModel.setFrequency(taskResponse.getFrequency());
        taskModel.setId(taskResponse.getId());
        taskModel.setName(taskResponse.getName());
        taskModel.setTaskListId(taskResponse.getTaskListId());
        taskModel.setCommentsCount(taskResponse.getCommentsCount());
        taskModel.setAssignedId(taskResponse.getAssignedId());
        taskModel.setIsPrivate(taskResponse.getIsPrivate());
        taskModel.setProjectId(taskResponse.getProjectId());
        taskModel.setUrgent(taskResponse.isUrgent());
        taskModel.setUserId(taskResponse.getUserId());
        taskModel.setPosition(taskResponse.getPosition());
        taskModel.setLastActivityId(taskResponse.getLastActivityId());
        taskModel.setRecordConversionType(taskResponse.getRecordConversionType());
        taskModel.setRecordConversionId(taskResponse.getRecordConversionId());
        //taskModel.setMetadata(taskResponse.getMetadata());
        taskModel.setSubtasksCount(taskResponse.getSubtasksCount());
        taskModel.setResolvedSubtasksCount(taskResponse.getResolvedSubtasksCount());
        //taskModel.setWatcherIds(taskResponse.getWatcherIds());
        taskModel.setDescription(taskResponse.getDescription());
        taskModel.setDescriptionHtml(taskResponse.getDescriptionHtml());
        taskModel.setDescriptionUpdatedByUserId(taskResponse.getDescriptionUpdatedByUserId());
        taskModel.setDescriptionUpdatedAt(taskResponse.getDescriptionUpdatedAt());
        taskModel.setUpdatedById(taskResponse.getUpdatedById());
        taskModel.setDeleted(taskResponse.isDeleted());
        taskModel.setRowOrder(taskResponse.getRowOrder());
        taskModel.setStatus(taskResponse.getStatus());
        taskModel.setDueOn(taskResponse.getDueOn());
        return taskModel;
    }
}
