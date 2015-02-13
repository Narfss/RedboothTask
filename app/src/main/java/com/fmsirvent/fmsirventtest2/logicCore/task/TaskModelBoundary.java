package com.fmsirvent.fmsirventtest2.logicCore.task;

import com.fmsirvent.fmsirventtest2.apiModule.ApiServiceManager;
import com.fmsirvent.fmsirventtest2.apiModule.response.TaskResponse;
import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;

/**
 * Created by narf on 13/02/15.
 */
public class TaskModelBoundary implements TaskModelPort {
    private TaskLogic activitiesLogic;
    private ApiServiceManager apiServiceManager;

    public static TaskModelBoundary newInstance() {
        TaskModelBoundary loginModelBoundary = new TaskModelBoundary();
        loginModelBoundary.initialize();
        return loginModelBoundary;
    }

    private void initialize() {
        apiServiceManager = new ApiServiceManager();
    }

    @Override
    public void setLogic(TaskLogic activitiesLogic) {
        this.activitiesLogic = activitiesLogic;
    }

    @Override
    public void loadTask(String token, int taskId) {
        apiServiceManager.loadTask(this, token, taskId);
    }

    public void notifyTask(TaskResponse taskResponse) {
        activitiesLogic.notifyTask(taskResponse);
    }

    public void notifyError(ErrorType errorType, String message) {
        activitiesLogic.notifyError(errorType, message);
    }
}
