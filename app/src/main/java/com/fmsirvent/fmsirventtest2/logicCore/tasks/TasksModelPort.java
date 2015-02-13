package com.fmsirvent.fmsirventtest2.logicCore.tasks;

import com.fmsirvent.fmsirventtest2.logicCore.task.TasksLogic;

/**
 * Created by narf on 12/02/15.
 */
public interface TasksModelPort {
    void setLogic(TasksLogic activitiesLogic);

    void loadTasks(String token);
}
