package com.fmsirvent.fmsirventtest2.logicCore.activities;

import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;

import java.util.ArrayList;

/**
 * Created by narf on 12/02/15.
 */
public interface ActivitiesView {
    void notifyActivities(ArrayList<ActivityModel> activityModels);

    void notifyError(ErrorType errorType);
}
