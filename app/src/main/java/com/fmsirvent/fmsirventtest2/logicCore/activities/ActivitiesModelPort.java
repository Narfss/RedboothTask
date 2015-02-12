package com.fmsirvent.fmsirventtest2.logicCore.activities;

import com.fmsirvent.fmsirventtest2.apiModule.response.ActivityResponse;

import java.util.ArrayList;

/**
 * Created by narf on 12/02/15.
 */
public interface ActivitiesModelPort {
    void setLogic(ActivitiesLogic activitiesLogic);

    void loadActivities(String token);

    void notifyActivities(ArrayList<ActivityResponse> activitiesResponse);
}
