package com.fmsirvent.fmsirventtest2.logicCore.activities;


import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;
import com.fmsirvent.fmsirventtest2.logicCore.LogicFactory;

import java.util.ArrayList;

/**
 * Created by narf on 12/02/15.
 */
public class ActivitiesViewBoundary implements ActivitiesViewPort {
    private ActivitiesView view;
    private ActivitiesLogic logic;

    public ActivitiesViewBoundary(ActivitiesView view) {
        this.view = view;
    }

    public static ActivitiesViewBoundary newInstance(ActivitiesView activitiesView) {
        ActivitiesViewBoundary activitiesViewBoundary = new ActivitiesViewBoundary(activitiesView);
        activitiesViewBoundary.setLogic(LogicFactory.getActivitiesCore(activitiesViewBoundary));
        return activitiesViewBoundary;
    }

    public void loadActivities() {
        logic.loadActivities();
    }

    public void setLogic(ActivitiesLogic logic) {
        this.logic = logic;
    }

    @Override
    public void notifyActivities(ArrayList<ActivityModel> activityModels) {
        view.notifyActivities(activityModels);
    }

    @Override
    public void notifyError(ErrorType errorType) {
        view.notifyError(errorType);
    }
}
