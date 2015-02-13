package com.fmsirvent.fmsirventtest2.logicCore.createTask;

/**
 * Created by narf on 13/02/15.
 */
public interface CreateTaskModelPort {
    void setLogic(CreateTaskLogic createTaskLogic);

    public void createTask(String token, int projectId, int taskListId, String name, String description);

    void loadTaskLists(String token);
}
