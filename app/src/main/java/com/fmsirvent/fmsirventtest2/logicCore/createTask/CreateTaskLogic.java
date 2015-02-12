package com.fmsirvent.fmsirventtest2.logicCore.createTask;

import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;
import com.fmsirvent.fmsirventtest2.logicCore.data.DataModulePort;

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

    public void createTask() {
        String token = dataModulePort.getToken();
        if (token != null) {
            activitiesModelPort.createTask(token);
        } else {
            activitiesViewPort.notifyError(ErrorType.TOKEN_FAIL);
        }
    }

    public void notifyCreateTask() {
        activitiesViewPort.notifyCreateTask();
    }

    public void notifyError(ErrorType errorType) {
        activitiesViewPort.notifyError(errorType);
    }
}
