package com.fmsirvent.fmsirventtest2.view.tasks;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.fmsirvent.fmsirventtest2.R;
import com.fmsirvent.fmsirventtest2.logicCore.task.TaskModel;
import com.fmsirvent.fmsirventtest2.logicCore.tasks.TasksView;
import com.fmsirvent.fmsirventtest2.logicCore.tasks.TasksViewBoundary;
import com.fmsirvent.fmsirventtest2.view.BaseFragment;
import com.fmsirvent.fmsirventtest2.view.createTask.CreateTask;
import com.fmsirvent.fmsirventtest2.view.task.TaskActivity;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import butterknife.OnItemSelected;

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
        startActivityForResult(CreateTask.createIntent(getActivity()), EDIT_EVENT);
        getActivity().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    void itemSelected(int position) {
        startActivityForResult(TaskActivity.createIntent(getActivity(), tasksModels.get(position).getId()), EDIT_EVENT);
        getActivity().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
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
        enableLoading(true);
        tasksViewBoundary.loadTasks();
    }

    @Override
    public void notifyTasks(ArrayList<TaskModel> tasksModels) {
        enableLoading(false);
        this.tasksModels.clear();
        this.tasksModels.addAll(tasksModels);
        tasksAdapter.notifyDataSetChanged();
    }

}