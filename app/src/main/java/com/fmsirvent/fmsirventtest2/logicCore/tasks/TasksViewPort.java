package com.fmsirvent.fmsirventtest2.logicCore.tasks;

import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;
import com.fmsirvent.fmsirventtest2.logicCore.task.TaskModel;

import java.util.ArrayList;

/**
 * Created by narf on 12/02/15.
 */
public interface TasksViewPort {
    void notifyTasks(ArrayList<TaskModel> taskModels);

    void notifyError(ErrorType errorType, String message);
}
