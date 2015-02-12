package com.fmsirvent.fmsirventtest2.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fmsirvent.fmsirventtest2.R;
import com.fmsirvent.fmsirventtest2.logicCore.activities.ActivityModel;

import java.util.ArrayList;

/**
 * Created by narf on 12/02/15.
 */
public class ActivitiesAdapter extends RecyclerView.Adapter<ActivitiesAdapter.ActivityHolder> {
    private ArrayList<ActivityModel> activityModels;

    public ActivitiesAdapter(ArrayList<ActivityModel> activityModels) {
        this.activityModels = activityModels;
    }


    @Override
    public ActivityHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.cell_activity, viewGroup, false);

        return new ActivityHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ActivityHolder activityHolder, int i) {
        ActivityModel activityModel = activityModels.get(i);
        activityHolder.title.setText((activityModel.getTitle() != null) ? activityModel.getTitle() : "null");
    }

    @Override
    public int getItemCount() {
        return activityModels.size();
    }

    /**
     * Created by narf on 12/02/15.
     */
    public static class ActivityHolder extends RecyclerView.ViewHolder {
        TextView title;

        public ActivityHolder(View itemView) {
            super(itemView);
            title =  (TextView) itemView.findViewById(R.id.title);
        }
    }
}
