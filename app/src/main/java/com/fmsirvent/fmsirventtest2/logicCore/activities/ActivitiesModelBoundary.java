package com.fmsirvent.fmsirventtest2.logicCore.activities;

import com.fmsirvent.fmsirventtest2.apiModule.ApiServiceManager;
import com.fmsirvent.fmsirventtest2.apiModule.response.ActivityResponse;
import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;

import java.util.ArrayList;

/**
 * Created by narf on 12/02/15.
 */
public class ActivitiesModelBoundary implements ActivitiesModelPort {
    private ActivitiesLogic activitiesLogic;
    private ApiServiceManager apiServiceManager;

    public static ActivitiesModelBoundary newInstance() {
        ActivitiesModelBoundary loginModelBoundary = new ActivitiesModelBoundary();
        loginModelBoundary.initialize();
        return loginModelBoundary;
    }

    private void initialize() {
        apiServiceManager = new ApiServiceManager();
    }

    @Override
    public void setLogic(ActivitiesLogic activitiesLogic) {
        this.activitiesLogic = activitiesLogic;
    }


    @Override
    public void loadActivities(String token) {
        apiServiceManager.loadActivities(this, token);
    }

    public void notifyActivities(ArrayList<ActivityResponse> activitiesResponse) {
        activitiesLogic.notifyActivities(activitiesResponse);
    }

    public void notifyError(ErrorType errorType) {
        activitiesLogic.notifyError(errorType);
    }
}
