package com.fmsirvent.fmsirventtest2.view.tasks;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

import com.fmsirvent.fmsirventtest2.R;

import butterknife.ButterKnife;

/**
 * Created by narf on 12/02/15.
 */
public class TasksActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configureViews(savedInstanceState);
    }

    private void configureViews(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        getFragmentManager().beginTransaction().add(R.id.container, new TasksFragment()).commit();

        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowCustomEnabled(true);
            supportActionBar.setCustomView(R.layout.ab_layout);
        }
    }
}
