package com.fmsirvent.fmsirventtest2.logicCore.createTask;

import com.fmsirvent.fmsirventtest2.apiModule.response.TaskListResponse;

import java.util.ArrayList;

/**
 * Created by fmsirvent on 13/2/15.
 */
public class TaskListMapper {
    public static ArrayList<TaskListModel> map(ArrayList<TaskListResponse> taskListResponses) {
        final ArrayList<TaskListModel> taskListModels = new ArrayList<>();
        for (TaskListResponse taskListResponse : taskListResponses) {
            final TaskListModel taskListModel = new TaskListModel();
            taskListModel.setType(taskListResponse.getType());
            taskListModel.setCreatedAt(taskListResponse.getCreatedAt());
            taskListModel.setUpdatedAt(taskListResponse.getUpdatedAt());
            taskListModel.setTaskListId(taskListResponse.getTaskListId());
            taskListModel.setName(taskListResponse.getName());
            taskListModel.setProjectId(taskListResponse.getProjectId());
            taskListModel.setUserId(taskListResponse.getUserId());
            taskListModel.setStartOn(taskListResponse.getStartOn());
            taskListModel.setFinishOn(taskListResponse.getFinishOn());
            taskListModel.setPosition(taskListResponse.getPosition());
            taskListModel.setArchived(taskListResponse.isArchived());
            taskListModel.setArchivedTasksCount(taskListResponse.getArchivedTasksCount());
            taskListModel.setTasksCount(taskListResponse.getTasksCount());
            taskListModel.setLastCommentId(taskListResponse.getLastCommentId());
            taskListModel.setUpdatedById(taskListResponse.getUpdatedById());
            taskListModel.setDeleted(taskListResponse.isDeleted());
            taskListModel.setCompletedAt(taskListResponse.getCompletedAt());
            taskListModels.add(taskListModel);
        }
        return taskListModels;
    }
}
