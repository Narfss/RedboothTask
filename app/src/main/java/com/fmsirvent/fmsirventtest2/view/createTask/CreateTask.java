package com.fmsirvent.fmsirventtest2.view.createTask;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.fmsirvent.fmsirventtest2.R;

import butterknife.ButterKnife;

/**
 * Created by narf on 12/02/15.
 */
public class CreateTask extends ActionBarActivity {
    public static Intent createIntent(Context context) {
        return new Intent(context, CreateTask.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configureViews(savedInstanceState);
    }

    private void configureViews(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            setContentView(R.layout.activity_main);
            ButterKnife.inject(this);
            getFragmentManager().beginTransaction().add(R.id.container, new CreateTaskFragment()).commit();
        }
    }

}
