package com.fmsirvent.fmsirventtest2.apiModule;

import com.fmsirvent.fmsirventtest2.apiModule.response.ActivityResponse;
import com.fmsirvent.fmsirventtest2.apiModule.response.TaskResponse;
import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;
import com.fmsirvent.fmsirventtest2.logicCore.activities.ActivitiesModelPort;
import com.fmsirvent.fmsirventtest2.logicCore.tasks.TasksModelPort;

import org.apache.http.Header;

import java.util.ArrayList;

import ly.apps.android.rest.client.Callback;
import ly.apps.android.rest.client.Response;
import ly.apps.android.rest.client.RestClient;
import ly.apps.android.rest.client.RestClientFactory;
import ly.apps.android.rest.client.RestServiceFactory;

import static com.fmsirvent.fmsirventtest2.App.getAppContext;

/**
 * Created by narf on 11/02/15.
 */
public class ApiServiceManager {

    private ApiServices getInstance() {
        RestClient client = RestClientFactory.defaultClient(getAppContext());
        String baseUrl = "https://redbooth.com/";
        ApiServices api = RestServiceFactory.getService(baseUrl, ApiServices.class, client);
        return api;
    }

    public void loadActivities(final ActivitiesModelPort activitiesModelPort, String token) {
        getInstance().loadActivities(token,
                new BaseCallback<ArrayList<ActivityResponse>>() {
                    @Override
                    public void onResponse(Response response) {
                        activitiesModelPort.notifyActivities((ArrayList<ActivityResponse>) response.getResult());
                    }

                    @Override
                    protected void notifyError(ErrorType errorType) {
                        activitiesModelPort.notifyError(errorType);
                    }
                }
        );

    }

    public void loadTasks(final TasksModelPort tasksModelPort, String token) {
        getInstance().loadTasks(token,
                new BaseCallback<ArrayList<TaskResponse>>() {
                    @Override
                    public void onResponse(Response response) {
                        tasksModelPort.notifyTasks((ArrayList<TaskResponse>) response.getResult());
                    }

                    @Override
                    protected void notifyError(ErrorType errorType) {
                        tasksModelPort.notifyError(errorType);
                    }
                }
        );

    }
}
