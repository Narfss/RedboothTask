package com.fmsirvent.fmsirventtest2.logicCore.tasks;

import com.fmsirvent.fmsirventtest2.apiModule.response.TaskResponse;
import com.fmsirvent.fmsirventtest2.logicCore.task.TaskMapper;
import com.fmsirvent.fmsirventtest2.logicCore.task.TaskModel;

import java.util.ArrayList;

/**
 * Created by narf on 12/02/15.
 */
public class TasksMapper {
    public static ArrayList<TaskModel> map(ArrayList<TaskResponse> tasksResponse) {
        ArrayList<TaskModel> taskModels = new ArrayList<>();
        for (TaskResponse taskResponse : tasksResponse) {
            taskModels.add(TaskMapper.map(taskResponse));
        }
        return taskModels;
    }
}
