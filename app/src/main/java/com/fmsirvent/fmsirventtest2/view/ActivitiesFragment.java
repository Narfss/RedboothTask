package com.fmsirvent.fmsirventtest2.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fmsirvent.fmsirventtest2.R;
import com.fmsirvent.fmsirventtest2.logicCore.activities.ActivitiesView;
import com.fmsirvent.fmsirventtest2.logicCore.activities.ActivitiesViewBoundary;
import com.fmsirvent.fmsirventtest2.logicCore.activities.ActivityModel;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by narf on 12/02/15.
 */
public class ActivitiesFragment extends BaseFragment implements ActivitiesView {

    private ActivitiesViewBoundary activitiesViewBoundary;

    @InjectView(R.id.activities_list)
    RecyclerView recyclerView;
    private ArrayList<ActivityModel> activityModels;

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
        activitiesViewBoundary = ActivitiesViewBoundary.newInstance(this);
    }

    @Override
    void loadData() {
        activitiesViewBoundary.loadActivities();
    }

    @Override
    public void notifyActivities(ArrayList<ActivityModel> activityModels) {
        this.activityModels = activityModels;
        recyclerView.setAdapter(new ActivitiesAdapter(this.activityModels));
        for (ActivityModel activityModel : activityModels) {
            Log.d("Activity", (activityModel.getTitle() != null) ? activityModel.getTitle() : "null");
        }
    }

}
