package com.fmsirvent.fmsirventtest2.logicCore.tasks;

import com.fmsirvent.fmsirventtest2.apiModule.response.TaskResponse;
import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;

import java.util.ArrayList;

/**
 * Created by narf on 12/02/15.
 */
public interface TasksModelPort {
    void setLogic(TasksLogic activitiesLogic);

    public void loadTasks(String token);

    void notifyTasks(ArrayList<TaskResponse> activitiesResponse);

    void notifyError(ErrorType errorType);
}
