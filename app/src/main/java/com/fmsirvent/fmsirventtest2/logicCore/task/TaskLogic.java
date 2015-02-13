package com.fmsirvent.fmsirventtest2.logicCore.task;

import com.fmsirvent.fmsirventtest2.apiModule.response.TaskResponse;
import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;
import com.fmsirvent.fmsirventtest2.logicCore.data.DataModulePort;

/**
 * Created by narf on 13/02/15.
 */
public class TaskLogic {
    private final TaskViewPort activitiesViewPort;
    private final TaskModelPort activitiesModelPort;
    private final DataModulePort dataModulePort;

    public TaskLogic(TaskViewPort activitiesViewPort, TaskModelPort activitiesModelPort, DataModulePort dataModulePort) {
        this.activitiesViewPort = activitiesViewPort;
        this.activitiesModelPort = activitiesModelPort;
        this.dataModulePort = dataModulePort;
    }

    public static TaskLogic newInstance(TaskViewPort logicViewPort, TaskModelPort loginModelPort, DataModulePort dataModulePort) {
        TaskLogic loginLogic = new TaskLogic(logicViewPort, loginModelPort, dataModulePort);
        loginLogic.initialize();
        return loginLogic;
    }

    private void initialize() {
        activitiesModelPort.setLogic(this);
    }

    public void loadTask(int taskId) {
        String token = dataModulePort.getToken();
        if (token != null) {
            activitiesModelPort.loadTask(token, taskId);
        } else {
            activitiesViewPort.notifyError(ErrorType.TOKEN_FAIL, null);
        }
    }

    public void notifyTask(TaskResponse taskResponse) {
        activitiesViewPort.notifyTask(TaskMapper.map(taskResponse));
    }

    public void notifyError(ErrorType errorType, String message) {
        activitiesViewPort.notifyError(errorType, message);
    }
}
