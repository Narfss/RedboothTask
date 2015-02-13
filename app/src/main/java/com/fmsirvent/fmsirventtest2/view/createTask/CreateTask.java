package com.fmsirvent.fmsirventtest2.view.createTask;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

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
