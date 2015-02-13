package com.fmsirvent.fmsirventtest2.view.createTask;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.fmsirvent.fmsirventtest2.R;
import com.fmsirvent.fmsirventtest2.logicCore.createTask.CreateTaskView;
import com.fmsirvent.fmsirventtest2.logicCore.createTask.CreateTaskViewBoundary;
import com.fmsirvent.fmsirventtest2.view.BaseFragment;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by narf on 12/02/15.
 */
public class CreateTaskFragment extends BaseFragment implements CreateTaskView {

    private CreateTaskViewBoundary createTaskViewBoundary;

    @InjectView(R.id.create_task_name)
    EditText name;
    @InjectView(R.id.create_task_description)
    EditText description;

    @OnClick(R.id.fab)
    void createTask() {
        //Todo: check empty edittext
        createTaskViewBoundary.createTask(name.getText().toString(), description.getText().toString());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.create_tasks_fragment, container, false);
        ButterKnife.inject(this, view);

        configureViews();
        configureBusiness();
        loadData();

        return view;
    }

    private void configureViews() {
    }

    private void configureBusiness() {
        createTaskViewBoundary = CreateTaskViewBoundary.newInstance(this);
    }

    @Override
    protected void loadData() {
    }

    @Override
    public void notifyCreateTask() {

    }
}
