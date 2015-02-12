package com.fmsirvent.fmsirventtest2.view;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.fmsirvent.fmsirventtest2.R;

import butterknife.ButterKnife;


public class ActivitiesActivity extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configureViews(savedInstanceState);
    }

    private void configureViews(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            setContentView(R.layout.activity_main);
            ButterKnife.inject(this);
            getFragmentManager().beginTransaction().add(R.id.container, new ActivitiesFragment()).commit();
        }
    }
}
