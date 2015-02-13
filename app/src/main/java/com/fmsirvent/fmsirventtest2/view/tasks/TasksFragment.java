package com.fmsirvent.fmsirventtest2.view.tasks;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fmsirvent.fmsirventtest2.R;
import com.fmsirvent.fmsirventtest2.logicCore.tasks.TaskModel;
import com.fmsirvent.fmsirventtest2.logicCore.tasks.TasksView;
import com.fmsirvent.fmsirventtest2.logicCore.tasks.TasksViewBoundary;
import com.fmsirvent.fmsirventtest2.view.BaseFragment;
import com.fmsirvent.fmsirventtest2.view.createTask.CreateTask;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by narf on 12/02/15.
 */
public class TasksFragment extends BaseFragment implements TasksView {


    private TasksViewBoundary tasksViewBoundary;

    @InjectView(R.id.activities_list)
    RecyclerView recyclerView;
    private ArrayList<TaskModel> tasksModels;
    private TasksAdapter tasksAdapter;

    @OnClick(R.id.fab)
    void addNewTask() {
        startActivityForResult(CreateTask.createIntent(getActivity()), CREATE_ELEMENT);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tasks_fragment, container, false);
        ButterKnife.inject(this, view);

        configureViews();
        configureBusiness();
        loadData();

        return view;
    }

    private void configureViews() {
        StaggeredGridLayoutManager llm = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);
        this.tasksModels = new ArrayList<>();
        tasksAdapter = new TasksAdapter(tasksModels);
        recyclerView.setAdapter(tasksAdapter);
    }

    private void configureBusiness() {
        tasksViewBoundary = TasksViewBoundary.newInstance(this);
    }

    @Override
    protected void loadData() {
        tasksViewBoundary.loadTasks();
    }

    @Override
    public void notifyTasks(ArrayList<TaskModel> tasksModels) {
        this.tasksModels.clear();
        this.tasksModels.addAll(tasksModels);
        tasksAdapter.notifyDataSetChanged();
    }

}