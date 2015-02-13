package com.fmsirvent.fmsirventtest2.logicCore.createTask;

import com.fmsirvent.fmsirventtest2.logicCore.BaseView;

import java.util.ArrayList;

/**
 * Created by narf on 12/02/15.
 */
public interface CreateTaskView extends BaseView {

    void notifyTaskLists(ArrayList<TaskListModel> taskListModels);

}
