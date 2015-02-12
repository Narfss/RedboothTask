package com.fmsirvent.fmsirventtest2;

import android.app.Application;
import android.content.Context;

/**
 * Created by narf on 11/02/15.
 */
public class App extends Application {
    private static Context appContext;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();
    }

    public static Context getAppContext(){
        return appContext;
    }
}
