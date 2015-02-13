package com.fmsirvent.fmsirventtest2.logicCore.createTask;

import com.fmsirvent.fmsirventtest2.apiModule.response.TaskListResponse;
import com.fmsirvent.fmsirventtest2.logicCore.ActionSuccess;
import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;
import com.fmsirvent.fmsirventtest2.logicCore.data.DataModulePort;

import java.util.ArrayList;

/**
 * Created by narf on 12/02/15.
 */
public class CreateTaskLogic {
    private final CreateTaskViewPort activitiesViewPort;
    private final CreateTaskModelPort activitiesModelPort;
    private final DataModulePort dataModulePort;

    public CreateTaskLogic(CreateTaskViewPort activitiesViewPort, CreateTaskModelPort activitiesModelPort, DataModulePort dataModulePort) {
        this.activitiesViewPort = activitiesViewPort;
        this.activitiesModelPort = activitiesModelPort;
        this.dataModulePort = dataModulePort;
    }

    public static CreateTaskLogic newInstance(CreateTaskViewPort logicViewPort, CreateTaskModelPort loginModelPort, DataModulePort dataModulePort) {
        CreateTaskLogic loginLogic = new CreateTaskLogic(logicViewPort, loginModelPort, dataModulePort);
        loginLogic.initialize();
        return loginLogic;
    }

    private void initialize() {
        activitiesModelPort.setLogic(this);
    }

    public void loadTaskLists() {
        String token = dataModulePort.getToken();
        if (token != null) {
            activitiesModelPort.loadTaskLists(token);
        } else {
            activitiesViewPort.notifyError(ErrorType.TOKEN_FAIL);
        }
    }

    public void createTask(int projectId, int taskList, String name, String description) {
        String token = dataModulePort.getToken();
        if (token != null) {
            activitiesModelPort.createTask(token, projectId, taskList, name, description);
        } else {
            activitiesViewPort.notifyError(ErrorType.TOKEN_FAIL);
        }
    }

    public void notifyError(ErrorType errorType) {
        activitiesViewPort.notifyError(errorType);
    }

    public void notifyTaskLists(ArrayList<TaskListResponse> taskListResponses) {
        activitiesViewPort.notifyTaskLists(TaskListMapper.map(taskListResponses));
    }

    public void notifySuccess(String message, ActionSuccess actionSuccess) {
        activitiesViewPort.notifySuccess(message, actionSuccess);
    }
}
