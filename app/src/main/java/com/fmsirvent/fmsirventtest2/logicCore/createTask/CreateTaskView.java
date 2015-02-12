package com.fmsirvent.fmsirventtest2.logicCore.createTask;

import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;

/**
 * Created by narf on 12/02/15.
 */
public interface CreateTaskView {
    void notifyError(ErrorType errorType);

    void notifyCreateTask();

}
