package com.fmsirvent.fmsirventtest2.dataModule;

import android.content.SharedPreferences;

import static com.fmsirvent.fmsirventtest2.App.getAppContext;

/**
 * Created by narf on 12/02/15.
 */
public class SharePreferencesManager {

    public static final String SHARE_PREFERENCES_ID = "comProyectobsRandomCupcakeApp";

    public static final String ACCESS_TOKEN = "access_token";
    public static final String TOKEN_TYPE = "token_type";
    public static final String EXPIRES_IN = "expires_in";

    private static SharedPreferences sharePref() {
        return (getAppContext().getApplicationContext().getSharedPreferences(SHARE_PREFERENCES_ID, 0));
    }

    public static String getString(String key, String defaultValue) {
        return sharePref().getString(key, defaultValue);
    }

    public static void setString(String key, String value) {
        SharedPreferences.Editor editor = sharePref().edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static boolean getBool(String key, boolean defaultValue) {
        return sharePref().getBoolean(key, defaultValue);
    }

    public static void setBool(String key, boolean value) {
        SharedPreferences.Editor editor = sharePref().edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public static int getInt(String key, int defaultValue) {
        return sharePref().getInt(key, defaultValue);
    }

    public static void setInt(String key, int value) {
        SharedPreferences.Editor editor = sharePref().edit();
        editor.putInt(key, value);
        editor.apply();
    }

}
