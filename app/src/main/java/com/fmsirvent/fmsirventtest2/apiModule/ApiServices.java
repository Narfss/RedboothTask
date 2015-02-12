package com.fmsirvent.fmsirventtest2.apiModule;

import com.fmsirvent.fmsirventtest2.apiModule.response.ActivityResponse;
import com.fmsirvent.fmsirventtest2.apiModule.response.TaskResponse;

import java.util.ArrayList;

import ly.apps.android.rest.client.Callback;
import ly.apps.android.rest.client.annotations.GET;
import ly.apps.android.rest.client.annotations.QueryParam;
import ly.apps.android.rest.client.annotations.RestService;

/**
 * Created by narf on 11/02/15.
 */
@RestService
public interface ApiServices {

    @GET("api/3/activities")
    void loadActivities(
            @QueryParam("access_token") String token,
            Callback<ArrayList<ActivityResponse>> callback);

    @GET("api/3/tasks")
    void loadTasks(
            @QueryParam("access_token") String token,
            Callback<ArrayList<TaskResponse>> callback);

}
