package com.fmsirvent.fmsirventtest2.apiModule;

import com.fmsirvent.fmsirventtest2.R;
import com.fmsirvent.fmsirventtest2.apiModule.response.ActivityResponse;
import com.fmsirvent.fmsirventtest2.apiModule.response.TaskListResponse;
import com.fmsirvent.fmsirventtest2.apiModule.response.TaskResponse;
import com.fmsirvent.fmsirventtest2.logicCore.ActionSuccess;
import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;
import com.fmsirvent.fmsirventtest2.logicCore.activities.ActivitiesModelBoundary;
import com.fmsirvent.fmsirventtest2.logicCore.createTask.CreateTaskModelBoundary;
import com.fmsirvent.fmsirventtest2.logicCore.tasks.TasksModelBoundary;

import java.util.ArrayList;

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

    public void loadActivities(final ActivitiesModelBoundary activitiesModelBoundary, String token) {
        getInstance().loadActivities(token,
                new BaseCallback<ArrayList<ActivityResponse>>() {
                    @Override
                    public void onResponse(Response response) {
                        activitiesModelBoundary.notifyActivities((ArrayList<ActivityResponse>) response.getResult());
                    }

                    @Override
                    protected void notifyError(ErrorType errorType, String message) {
                        activitiesModelBoundary.notifyError(errorType, message);
                    }
                }
        );

    }

    public void loadTasks(final TasksModelBoundary tasksModelBoundary, String token) {
        getInstance().loadTasks(token,
                new BaseCallback<ArrayList<TaskResponse>>() {
                    @Override
                    public void onResponse(Response response) {
                        tasksModelBoundary.notifyTasks((ArrayList<TaskResponse>) response.getResult());
                    }

                    @Override
                    protected void notifyError(ErrorType errorType, String message) {
                        tasksModelBoundary.notifyError(errorType, message);
                    }
                }
        );

    }

    public void createTask(final CreateTaskModelBoundary createTaskModelBoundary, String token, int projectId, int taskListId, String name, String description) {
        getInstance().createTask(token,
                projectId,
                taskListId,
                name,
                description,
                new BaseCallback<TaskResponse>() {
                    @Override
                    public void onResponse(Response response) {
                        createTaskModelBoundary.notifySuccess(getAppContext().getString(R.string.created_task), ActionSuccess.FINISH);
                    }

                    @Override
                    protected void notifyError(ErrorType errorType, String message) {
                        createTaskModelBoundary.notifyError(errorType, message);
                    }
                }
        );
    }

    public void loadTaskLists(final CreateTaskModelBoundary createTaskModelBoundary, String token) {
        getInstance().loadTaskLists(token,
                new BaseCallback<ArrayList<TaskListResponse>>() {
                    @Override
                    public void onResponse(Response response) {
                        createTaskModelBoundary.notifyTaskLists((ArrayList<TaskListResponse>) response.getResult());
                    }

                    @Override
                    protected void notifyError(ErrorType errorType, String message) {
                        createTaskModelBoundary.notifyError(errorType, message);
                    }
                }
        );
    }
}
