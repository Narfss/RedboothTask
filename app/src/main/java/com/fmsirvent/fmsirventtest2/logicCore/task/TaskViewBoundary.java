package com.fmsirvent.fmsirventtest2.logicCore.task;

import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;
import com.fmsirvent.fmsirventtest2.logicCore.LogicFactory;

/**
 * Created by narf on 13/02/15.
 */
public class TaskViewBoundary implements TaskViewPort {
    private TaskView view;
    private TaskLogic logic;

    public TaskViewBoundary(TaskView view) {
        this.view = view;
    }

    public static TaskViewBoundary newInstance(TaskView activitiesView) {
        TaskViewBoundary taskViewBoundary = new TaskViewBoundary(activitiesView);
        taskViewBoundary.setLogic(LogicFactory.getTaskCore(taskViewBoundary));
        return taskViewBoundary;
    }

    public void loadTask(int taskId) {
        logic.loadTask(taskId);
    }

    public void setLogic(TaskLogic logic) {
        this.logic = logic;
    }

    @Override
    public void notifyTask(TaskModel taskModel) {
        view.notifyTask(taskModel);
    }

    @Override
    public void notifyError(ErrorType errorType, String message) {
        view.notifyError(errorType, message);
    }
}
