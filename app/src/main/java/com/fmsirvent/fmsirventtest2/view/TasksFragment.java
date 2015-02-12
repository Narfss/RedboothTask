package com.fmsirvent.fmsirventtest2.view;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fmsirvent.fmsirventtest2.R;
import com.fmsirvent.fmsirventtest2.logicCore.tasks.TaskModel;
import com.fmsirvent.fmsirventtest2.logicCore.tasks.TasksView;
import com.fmsirvent.fmsirventtest2.logicCore.tasks.TasksViewBoundary;
import com.fmsirvent.fmsirventtest2.view.BaseFragment;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by narf on 12/02/15.
 */
public class TasksFragment extends BaseFragment implements TasksView {

    private TasksViewBoundary activitiesViewBoundary;

    @InjectView(R.id.activities_list)
    RecyclerView recyclerView;

    private ArrayList<TaskModel> tasksModels;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activities_fragment, container, false);
        ButterKnife.inject(this, view);

        configureViews();
        configureBusiness();
        loadData();

        return view;
    }

    private void configureViews() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);
    }

    private void configureBusiness() {
        activitiesViewBoundary = TasksViewBoundary.newInstance(this);
    }

    @Override
    void loadData() {
        activitiesViewBoundary.loadTasks();
    }

    @Override
    public void notifyTasks(ArrayList<TaskModel> tasksModels) {
        this.tasksModels = tasksModels;
        recyclerView.setAdapter(new TasksAdapter(this.tasksModels));
    }

}