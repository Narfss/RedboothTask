package com.fmsirvent.fmsirventtest2.logicCore;

import com.fmsirvent.fmsirventtest2.logicCore.activities.ActivitiesLogic;
import com.fmsirvent.fmsirventtest2.logicCore.activities.ActivitiesModelBoundary;
import com.fmsirvent.fmsirventtest2.logicCore.activities.ActivitiesViewPort;
import com.fmsirvent.fmsirventtest2.logicCore.createTask.CreateTaskLogic;
import com.fmsirvent.fmsirventtest2.logicCore.createTask.CreateTaskModelBoundary;
import com.fmsirvent.fmsirventtest2.logicCore.createTask.CreateTaskViewPort;
import com.fmsirvent.fmsirventtest2.logicCore.data.DataModuleBoundary;
import com.fmsirvent.fmsirventtest2.logicCore.login.LoginLogic;
import com.fmsirvent.fmsirventtest2.logicCore.login.LoginModelBoundary;
import com.fmsirvent.fmsirventtest2.logicCore.login.LoginViewPort;
import com.fmsirvent.fmsirventtest2.logicCore.task.TaskLogic;
import com.fmsirvent.fmsirventtest2.logicCore.task.TaskModelBoundary;
import com.fmsirvent.fmsirventtest2.logicCore.task.TaskViewBoundary;
import com.fmsirvent.fmsirventtest2.logicCore.task.TaskViewPort;
import com.fmsirvent.fmsirventtest2.logicCore.task.TasksLogic;
import com.fmsirvent.fmsirventtest2.logicCore.tasks.TasksModelBoundary;
import com.fmsirvent.fmsirventtest2.logicCore.tasks.TasksViewPort;

/**
 * Created by narf on 11/02/15.
 */
public class LogicFactory {
    public static LoginLogic getLoginCore(LoginViewPort logicViewPort) {
        return LoginLogic.newInstance(logicViewPort,
                                        LoginModelBoundary.newInstance(),
                                        DataModuleBoundary.newInstance());
    }

    public static ActivitiesLogic getActivitiesCore(ActivitiesViewPort activitiesViewPort) {
        return ActivitiesLogic.newInstance(activitiesViewPort,
                                ActivitiesModelBoundary.newInstance(),
                                DataModuleBoundary.newInstance());
    }

    public static TasksLogic getTasksCore(TasksViewPort taskViewPort) {
        return TasksLogic.newInstance(taskViewPort,
                TasksModelBoundary.newInstance(),
                DataModuleBoundary.newInstance());
    }

    public static CreateTaskLogic getCreateTaskCore(CreateTaskViewPort createTaskViewPort) {
        return CreateTaskLogic.newInstance(createTaskViewPort,
                CreateTaskModelBoundary.newInstance(),
                DataModuleBoundary.newInstance());
    }

    public static TaskLogic getTaskCore(TaskViewPort taskViewPort) {
        return TaskLogic.newInstance(taskViewPort,
                TaskModelBoundary.newInstance(),
                DataModuleBoundary.newInstance());
    }
}
