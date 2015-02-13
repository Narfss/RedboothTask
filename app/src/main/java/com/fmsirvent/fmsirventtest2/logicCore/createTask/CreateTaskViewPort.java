package com.fmsirvent.fmsirventtest2.logicCore.createTask;

import com.fmsirvent.fmsirventtest2.logicCore.ActionSuccess;
import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;

import java.util.ArrayList;

/**
 * Created by narf on 12/02/15.
 */
public interface CreateTaskViewPort {
    void notifyError(ErrorType errorType);

    void notifyTaskLists(ArrayList<TaskListModel> taskListModels);

    void notifySuccess(String message, ActionSuccess actionSuccess);
}
