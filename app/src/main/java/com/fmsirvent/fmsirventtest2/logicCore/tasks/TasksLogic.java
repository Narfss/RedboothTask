package com.fmsirvent.fmsirventtest2.logicCore.tasks;

import com.fmsirvent.fmsirventtest2.apiModule.response.TaskResponse;
import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;
import com.fmsirvent.fmsirventtest2.logicCore.data.DataModulePort;

import java.util.ArrayList;

/**
 * Created by narf on 12/02/15.
 */
public class TasksLogic {
    private final TasksViewPort activitiesViewPort;
    private final TasksModelPort activitiesModelPort;
    private final DataModulePort dataModulePort;

    public TasksLogic(TasksViewPort activitiesViewPort, TasksModelPort activitiesModelPort, DataModulePort dataModulePort) {
        this.activitiesViewPort = activitiesViewPort;
        this.activitiesModelPort = activitiesModelPort;
        this.dataModulePort = dataModulePort;
    }

    public static TasksLogic newInstance(TasksViewPort logicViewPort, TasksModelPort loginModelPort, DataModulePort dataModulePort) {
        TasksLogic loginLogic = new TasksLogic(logicViewPort, loginModelPort, dataModulePort);
        loginLogic.initialize();
        return loginLogic;
    }

    private void initialize() {
        activitiesModelPort.setLogic(this);
    }

    public void loadTasks() {
        String token = dataModulePort.getToken();
        if (token != null) {
            activitiesModelPort.loadTasks(token);
        } else {
            activitiesViewPort.notifyError(ErrorType.TOKEN_FAIL);
        }
    }

    public void notifyTasks(ArrayList<TaskResponse> tasksResponse) {
        activitiesViewPort.notifyTasks(TasksMapper.map(tasksResponse));
    }

    public void notifyError(ErrorType errorType) {
        activitiesViewPort.notifyError(errorType);
    }
}
