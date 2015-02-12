package com.fmsirvent.fmsirventtest2.logicCore.tasks;

import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;
import com.fmsirvent.fmsirventtest2.logicCore.LogicFactory;

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
        TasksViewBoundary activitiesViewBoundary = new TasksViewBoundary(activitiesView);
        activitiesViewBoundary.setLogic(LogicFactory.getTasksCore(activitiesViewBoundary));
        return activitiesViewBoundary;
    }

    public void loadTasks() {
        logic.loadTasks();
    }

    public void setLogic(TasksLogic logic) {
        this.logic = logic;
    }

    @Override
    public void notifyTasks(ArrayList<TaskModel> activityModels) {
        view.notifyTasks(activityModels);
    }

    @Override
    public void notifyError(ErrorType errorType) {
        view.notifyError(errorType);
    }
}
