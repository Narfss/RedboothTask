package com.fmsirvent.fmsirventtest2.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.fmsirvent.fmsirventtest2.R;

/**
 * Created by narf on 12/02/15.
 */
public class ActivityHolder extends RecyclerView.ViewHolder {
    TextView title;

    public ActivityHolder(View itemView) {
        super(itemView);
        title =  (TextView) itemView.findViewById(R.id.title);
    }
}
