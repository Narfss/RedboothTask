package com.fmsirvent.fmsirventtest2.logicCore;

import com.fmsirvent.fmsirventtest2.logicCore.activities.ActivitiesLogic;
import com.fmsirvent.fmsirventtest2.logicCore.activities.ActivitiesModelBoundary;
import com.fmsirvent.fmsirventtest2.logicCore.activities.ActivitiesViewPort;
import com.fmsirvent.fmsirventtest2.logicCore.data.DataModuleBoundary;
import com.fmsirvent.fmsirventtest2.logicCore.login.LoginLogic;
import com.fmsirvent.fmsirventtest2.logicCore.login.LoginModelBoundary;
import com.fmsirvent.fmsirventtest2.logicCore.login.LoginViewPort;
import com.fmsirvent.fmsirventtest2.logicCore.tasks.TasksLogic;
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
}