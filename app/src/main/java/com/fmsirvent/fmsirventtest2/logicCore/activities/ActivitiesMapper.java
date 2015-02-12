package com.fmsirvent.fmsirventtest2.logicCore.activities;

import com.fmsirvent.fmsirventtest2.apiModule.response.ActivityResponse;

import java.util.ArrayList;

/**
 * Created by narf on 12/02/15.
 */
public class ActivitiesMapper {
    public static ArrayList<ActivityModel> map(ArrayList<ActivityResponse> activitiesResponse) {
        ArrayList<ActivityModel> activitiesModels = new ArrayList<>();
        for (ActivityResponse activityResponse : activitiesResponse) {
            ActivityModel activityModel = new ActivityModel();
            activityModel.setTitle(activityResponse.getTitle());
            activitiesModels.add(activityModel);
        }
        return activitiesModels;
    }
}
