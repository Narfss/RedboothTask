package com.fmsirvent.fmsirventtest2.logicCore.activities;

import com.fmsirvent.fmsirventtest2.logicCore.BaseView;

import java.util.ArrayList;

/**
 * Created by narf on 12/02/15.
 */
public interface ActivitiesView  extends BaseView {
    void notifyActivities(ArrayList<ActivityModel> activityModels);
}
