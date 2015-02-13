package com.fmsirvent.fmsirventtest2.logicCore.createTask;

import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;
import com.fmsirvent.fmsirventtest2.logicCore.LogicFactory;

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

    public void createTask(String name, String description) {
        logic.createTask(name, description);
    }

    public void setLogic(CreateTaskLogic logic) {
        this.logic = logic;
    }

    @Override
    public void notifyCreateTask() {
        view.notifyCreateTask();
    }

    @Override
    public void notifyError(ErrorType errorType) {
        view.notifyError(errorType);
    }
}
