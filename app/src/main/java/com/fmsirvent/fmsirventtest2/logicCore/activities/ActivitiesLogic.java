package com.fmsirvent.fmsirventtest2.logicCore.activities;

import com.fmsirvent.fmsirventtest2.apiModule.response.ActivityResponse;
import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;
import com.fmsirvent.fmsirventtest2.logicCore.data.DataModulePort;

import java.util.ArrayList;

/**
 * Created by narf on 12/02/15.
 */
public class ActivitiesLogic {
    private final ActivitiesViewPort activitiesViewPort;
    private final ActivitiesModelPort activitiesModelPort;
    private final DataModulePort dataModulePort;

    public ActivitiesLogic(ActivitiesViewPort activitiesViewPort, ActivitiesModelPort activitiesModelPort, DataModulePort dataModulePort) {
        this.activitiesViewPort = activitiesViewPort;
        this.activitiesModelPort = activitiesModelPort;
        this.dataModulePort = dataModulePort;
    }

    public static ActivitiesLogic newInstance(ActivitiesViewPort logicViewPort, ActivitiesModelPort loginModelPort, DataModulePort dataModulePort) {
        ActivitiesLogic loginLogic = new ActivitiesLogic(logicViewPort, loginModelPort, dataModulePort);
        loginLogic.initialize();
        return loginLogic;
    }

    private void initialize() {
        activitiesModelPort.setLogic(this);
    }

    public void loadActivities() {
        String token = dataModulePort.getToken();
        if (token != null) {
            activitiesModelPort.loadActivities(token);
        } else {
            activitiesViewPort.notifyError(ErrorType.TOKEN_FAIL);
        }
    }

    public void notifyActivities(ArrayList<ActivityResponse> activitiesResponse) {
        activitiesViewPort.notifyActivities(ActivitiesMapper.map(activitiesResponse));
    }

    public void notifyError(ErrorType errorType) {
        activitiesViewPort.notifyError(errorType);
    }
}
