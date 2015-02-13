package com.fmsirvent.fmsirventtest2.logicCore.task;

import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;

/**
 * Created by narf on 13/02/15.
 */
public interface TaskViewPort {
    void notifyTask(TaskModel taskModel);

    void notifyError(ErrorType errorType, String message);
}
