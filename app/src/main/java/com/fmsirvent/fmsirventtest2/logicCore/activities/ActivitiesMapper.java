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
            activityModel.setType(activityResponse.getType());
            activityModel.setCreatedAt(activityResponse.getCreatedAt());
            activityModel.setUpdatedAt(activityResponse.getUpdatedAt());
            activityModel.setActivityId(activityResponse.getActivityId());
            activityModel.setUserId(activityResponse.getUserId());
            activityModel.setProjectId(activityResponse.getProjectId());
            activityModel.setTargetId(activityResponse.getTargetId());
            activityModel.setTargetType(activityResponse.getTargetType());
            activityModel.setCommentTarget_id(activityResponse.getCommentTargetId());
            activityModel.setAction(activityResponse.getAction());
            activityModel.setLastActivity_id(activityResponse.getLastActivityId());
            activityModel.setIsPrivate(activityResponse.getIsPrivate());
            activityModel.setTitle(activityResponse.getTitle());
            activityModel.setBody(activityResponse.getBody());
            activityModel.setAssignedId(activityResponse.getAssignedId());
            activityModel.setPreviousAssignedId(activityResponse.getPreviousAssignedId());
            activityModel.setDueOn(activityResponse.getDueOn());
            activitiesModels.add(activityModel);
        }
        return activitiesModels;
    }
}
