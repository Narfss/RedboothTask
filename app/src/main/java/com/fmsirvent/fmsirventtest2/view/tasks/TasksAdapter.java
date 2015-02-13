package com.fmsirvent.fmsirventtest2.view.tasks;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fmsirvent.fmsirventtest2.R;
import com.fmsirvent.fmsirventtest2.logicCore.task.TaskModel;
import com.fmsirvent.fmsirventtest2.view.BaseFragment;
import com.fmsirvent.fmsirventtest2.view.task.TaskActivity;

import java.lang.ref.Reference;
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
        taskHolder.title.setText((taskModel.getName() != null) ? taskModel.getName() : taskHolder.title.getContext().getString(R.string.task_title));
        taskHolder.description.setText(Html.fromHtml((taskModel.getDescriptionHtml() != null) ? taskModel.getDescriptionHtml() : ""));
    }

    public ArrayList<TaskModel> getTasksModels() {
        return tasksModels;
    }

    @Override
    public int getItemCount() {
        return tasksModels.size();
    }

    /**
    * Created by narf on 12/02/15.
    */
    public class TaskHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title;
        TextView description;

        public TaskHolder(View itemView) {
            super(itemView);
            title =  (TextView) itemView.findViewById(R.id.title);
            description =  (TextView) itemView.findViewById(R.id.description);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Activity context = (Activity) itemView.getContext();
            context.startActivityForResult(TaskActivity.createIntent(context, getTasksModels().get(getPosition()).getId()), BaseFragment.EDIT_EVENT);
            context.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        }
    }
}
