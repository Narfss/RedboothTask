package com.fmsirvent.fmsirventtest2.logicCore.createTask;

/**
 * Created by narf on 13/02/15.
 */
public interface CreateTaskModelPort {
    void setLogic(CreateTaskLogic createTaskLogic);

    void createTask(String token, String name, String description);
}
