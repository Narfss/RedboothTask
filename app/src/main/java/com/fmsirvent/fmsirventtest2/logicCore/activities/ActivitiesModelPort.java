package com.fmsirvent.fmsirventtest2.logicCore.activities;

/**
 * Created by narf on 12/02/15.
 */
public interface ActivitiesModelPort {
    void setLogic(ActivitiesLogic activitiesLogic);

    void loadActivities(String token);
}
