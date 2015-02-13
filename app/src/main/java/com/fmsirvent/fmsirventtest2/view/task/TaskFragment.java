package com.fmsirvent.fmsirventtest2.view.task;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fmsirvent.fmsirventtest2.R;
import com.fmsirvent.fmsirventtest2.logicCore.task.TaskModel;
import com.fmsirvent.fmsirventtest2.logicCore.task.TaskView;
import com.fmsirvent.fmsirventtest2.logicCore.task.TaskViewBoundary;
import com.fmsirvent.fmsirventtest2.view.BaseFragment;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by narf on 12/02/15.
 */
public class TaskFragment extends BaseFragment implements TaskView {

    private static final String EXTRA_TASK_ID = "extraTaskId";

    @InjectView(R.id.title)
    TextView title;
    @InjectView(R.id.description)
    TextView description;

    private TaskViewBoundary taskViewBoundary;
    private int taskId;

    public static Fragment createFragment(int taskId) {
        TaskFragment taskFragment = new TaskFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(EXTRA_TASK_ID, taskId);
        taskFragment.setArguments(bundle);
        return taskFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.task_fragment, container, false);
        ButterKnife.inject(this, view);

        configureArguments();
        configureViews();
        configureBusiness();
        loadData();

        return view;
    }

    private void configureArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            taskId = arguments.getInt(EXTRA_TASK_ID);
        }
    }

    private void configureViews() {
    }

    private void configureBusiness() {
        taskViewBoundary = TaskViewBoundary.newInstance(this);
    }

    @Override
    protected void loadData() {
        enableLoading(true);
        taskViewBoundary.loadTask(taskId);
    }

    @Override
    public void notifyTask(TaskModel taskModel) {
        enableLoading(false);
        title.setText((taskModel.getName() != null) ? taskModel.getName() : getString(R.string.task_title));
        description.setText(Html.fromHtml((taskModel.getDescriptionHtml() != null) ? taskModel.getDescriptionHtml() : ""));
    }

}