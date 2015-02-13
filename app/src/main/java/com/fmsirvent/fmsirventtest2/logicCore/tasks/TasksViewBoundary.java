package com.fmsirvent.fmsirventtest2.logicCore.tasks;

import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;
import com.fmsirvent.fmsirventtest2.logicCore.LogicFactory;
import com.fmsirvent.fmsirventtest2.logicCore.task.TaskModel;
import com.fmsirvent.fmsirventtest2.logicCore.task.TasksLogic;

import java.util.ArrayList;

/**
 * Created by narf on 12/02/15.
 */
public class TasksViewBoundary implements TasksViewPort {
    private TasksView view;
    private TasksLogic logic;

    public TasksViewBoundary(TasksView view) {
        this.view = view;
    }

    public static TasksViewBoundary newInstance(TasksView activitiesView) {
        TasksViewBoundary tasksViewBoundary = new TasksViewBoundary(activitiesView);
        tasksViewBoundary.setLogic(LogicFactory.getTasksCore(tasksViewBoundary));
        return tasksViewBoundary;
    }

    public void loadTasks() {
        logic.loadTasks();
    }

    public void setLogic(TasksLogic logic) {
        this.logic = logic;
    }

    @Override
    public void notifyTasks(ArrayList<TaskModel> taskModels) {
        view.notifyTasks(taskModels);
    }

    @Override
    public void notifyError(ErrorType errorType, String message) {
        view.notifyError(errorType, message);
    }
}
