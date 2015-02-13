package com.fmsirvent.fmsirventtest2.view.task;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;

import com.fmsirvent.fmsirventtest2.R;

import butterknife.ButterKnife;

/**
 * Created by narf on 12/02/15.
 */
public class TaskActivity extends ActionBarActivity {

    private static final String EXTRA_TASK_ID = "extraTaskId";
    private int taskId;

    public static Intent createIntent(Context context, int taskId) {
        Intent intent = new Intent(context, TaskActivity.class);
        intent.putExtra(EXTRA_TASK_ID, taskId);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configureExtras();
        configureViews(savedInstanceState);
    }

    private void configureExtras() {
        Bundle extras = getIntent().getExtras();
        if (extras!= null) {
            taskId = extras.getInt(EXTRA_TASK_ID);
        }
    }

    private void configureViews(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        getFragmentManager().beginTransaction().add(R.id.container, TaskFragment.createFragment(taskId)).commit();

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar!= null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeButtonEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

}
