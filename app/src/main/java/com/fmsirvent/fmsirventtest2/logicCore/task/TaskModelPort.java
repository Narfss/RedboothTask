package com.fmsirvent.fmsirventtest2.logicCore.task;

/**
 * Created by narf on 13/02/15.
 */
public interface TaskModelPort {
    void setLogic(TaskLogic taskLogic);

    void loadTask(String token,int taskId);
}
