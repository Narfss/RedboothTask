package com.fmsirvent.fmsirventtest2.logicCore.createTask;

import com.fmsirvent.fmsirventtest2.logicCore.ActionSuccess;
import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;
import com.fmsirvent.fmsirventtest2.logicCore.LogicFactory;

import java.util.ArrayList;

/**
 * Created by narf on 12/02/15.
 */
public class CreateTaskViewBoundary implements CreateTaskViewPort {
    private CreateTaskView view;
    private CreateTaskLogic logic;

    public CreateTaskViewBoundary(CreateTaskView view) {
        this.view = view;
    }

    public static CreateTaskViewBoundary newInstance(CreateTaskView activitiesView) {
        CreateTaskViewBoundary activitiesViewBoundary = new CreateTaskViewBoundary(activitiesView);
        activitiesViewBoundary.setLogic(LogicFactory.getCreateTaskCore(activitiesViewBoundary));
        return activitiesViewBoundary;
    }

    public void loadTaskLists() {
        logic.loadTaskLists();
    }

    public void createTask(int projectId, int taskListId, String name, String description) {
        logic.createTask(projectId, taskListId, name, description);
    }

    public void setLogic(CreateTaskLogic logic) {
        this.logic = logic;
    }

    @Override
    public void notifySuccess(String message, ActionSuccess actionSuccess) {
        view.notifySuccess(message, actionSuccess);
    }

    @Override
    public void notifyError(ErrorType errorType, String message) {
        view.notifyError(errorType, message);
    }

    @Override
    public void notifyTaskLists(ArrayList<TaskListModel> taskListModels) {
        view.notifyTaskLists(taskListModels);
    }

}
