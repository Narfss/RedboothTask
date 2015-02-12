package com.fmsirvent.fmsirventtest2.logicCore.tasks;

import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;

import java.util.ArrayList;

/**
 * Created by narf on 12/02/15.
 */
public interface TasksView {
    public void notifyTasks(ArrayList<TaskModel> tasksModels);
    void notifyError(ErrorType errorType);
}
