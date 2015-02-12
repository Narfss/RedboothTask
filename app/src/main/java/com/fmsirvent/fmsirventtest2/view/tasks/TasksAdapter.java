package com.fmsirvent.fmsirventtest2.view.tasks;

import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fmsirvent.fmsirventtest2.R;
import com.fmsirvent.fmsirventtest2.logicCore.tasks.TaskModel;

import java.util.ArrayList;

/**
 * Created by narf on 12/02/15.
 */
public class TasksAdapter extends RecyclerView.Adapter<TasksAdapter.TaskHolder> {
    private ArrayList<TaskModel> tasksModels;

    public TasksAdapter(ArrayList<TaskModel> tasksModels) {
        this.tasksModels = tasksModels;
    }

    @Override
    public TaskHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.cell_task, viewGroup, false);

        return new TaskHolder(itemView);
    }

    @Override
    public void onBindViewHolder(TaskHolder taskHolder, int i) {
        TaskModel taskModel = tasksModels.get(i);
        taskHolder.title.setText((taskModel.getName() != null) ? taskModel.getName() : "Task");
        taskHolder.description.setText(Html.fromHtml((taskModel.getDescriptionHtml() != null) ? taskModel.getDescriptionHtml() : ""));
     }

    @Override
    public int getItemCount() {
        return tasksModels.size();
    }

    /**
    * Created by narf on 12/02/15.
    */
    public static class TaskHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView description;

        public TaskHolder(View itemView) {
            super(itemView);
            title =  (TextView) itemView.findViewById(R.id.title);
            description =  (TextView) itemView.findViewById(R.id.description);
        }
    }
}
