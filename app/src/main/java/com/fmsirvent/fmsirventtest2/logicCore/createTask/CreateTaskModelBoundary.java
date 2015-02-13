package com.fmsirvent.fmsirventtest2.logicCore.createTask;

import com.fmsirvent.fmsirventtest2.apiModule.ApiServiceManager;
import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;

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
    public void createTask(String token, String name, String description) {
        apiServiceManager.createTask(this, token, name, description);
    }

    public void notifyCreateTask() {
        activitiesLogic.notifyCreateTask();
    }

    public void notifyError(ErrorType errorType) {
        activitiesLogic.notifyError(errorType);
    }
}
