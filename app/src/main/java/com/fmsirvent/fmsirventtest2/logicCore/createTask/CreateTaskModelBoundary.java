package com.fmsirvent.fmsirventtest2.logicCore.createTask;

import com.fmsirvent.fmsirventtest2.apiModule.ApiServiceManager;
import com.fmsirvent.fmsirventtest2.apiModule.response.TaskListResponse;
import com.fmsirvent.fmsirventtest2.logicCore.ActionSuccess;
import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;

import java.util.ArrayList;

/**
 * Created by narf on 13/02/15.
 */
public class CreateTaskModelBoundary implements CreateTaskModelPort {
    private CreateTaskLogic activitiesLogic;
    private ApiServiceManager apiServiceManager;

    public static CreateTaskModelBoundary newInstance() {
        CreateTaskModelBoundary loginModelBoundary = new CreateTaskModelBoundary();
        loginModelBoundary.initialize();
        return loginModelBoundary;
    }

    private void initialize() {
        apiServiceManager = new ApiServiceManager();
    }

    @Override
    public void setLogic(CreateTaskLogic activitiesLogic) {
        this.activitiesLogic = activitiesLogic;
    }

    @Override
    public void loadTaskLists(String token) {
        apiServiceManager.loadTaskLists(this, token);
    }

    @Override
    public void createTask(String token, int projectId, int taskListId, String name, String description) {
        apiServiceManager.createTask(this, token, projectId, taskListId, name, description);
    }

    public void notifyError(ErrorType errorType, String message) {
        activitiesLogic.notifyError(errorType, message);
    }

    public void notifyTaskLists(ArrayList<TaskListResponse> taskListResponses) {
        activitiesLogic.notifyTaskLists(taskListResponses);
    }

    public void notifySuccess(String message, ActionSuccess actionSuccess) {
        activitiesLogic.notifySuccess(message, actionSuccess);
    }
}
