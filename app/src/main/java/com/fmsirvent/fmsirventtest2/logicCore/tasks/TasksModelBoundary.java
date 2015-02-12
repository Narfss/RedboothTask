package com.fmsirvent.fmsirventtest2.logicCore.tasks;

import com.fmsirvent.fmsirventtest2.apiModule.ApiServiceManager;
import com.fmsirvent.fmsirventtest2.apiModule.response.TaskResponse;
import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;

import java.util.ArrayList;

/**
 * Created by narf on 12/02/15.
 */
public class TasksModelBoundary implements TasksModelPort{
    private TasksLogic activitiesLogic;
    private ApiServiceManager apiServiceManager;

    public static TasksModelBoundary newInstance() {
        TasksModelBoundary loginModelBoundary = new TasksModelBoundary();
        loginModelBoundary.initialize();
        return loginModelBoundary;
    }

    private void initialize() {
        apiServiceManager = new ApiServiceManager();
    }

    @Override
    public void setLogic(TasksLogic activitiesLogic) {
        this.activitiesLogic = activitiesLogic;
    }

    @Override
    public void loadTasks(String token) {
        apiServiceManager.loadTasks(this, token);
    }

    @Override
    public void notifyTasks(ArrayList<TaskResponse> activitiesResponse) {
        activitiesLogic.notifyTasks(activitiesResponse);
    }

    @Override
    public void notifyError(ErrorType errorType) {
        activitiesLogic.notifyError(errorType);
    }
}
