package com.fmsirvent.fmsirventtest2.logicCore.tasks;

import com.fmsirvent.fmsirventtest2.logicCore.BaseView;
import com.fmsirvent.fmsirventtest2.logicCore.task.TaskModel;

import java.util.ArrayList;

/**
 * Created by narf on 12/02/15.
 */
public interface TasksView  extends BaseView {
    public void notifyTasks(ArrayList<TaskModel> tasksModels);
}
