package com.fmsirvent.fmsirventtest2.logicCore.data;

import com.fmsirvent.fmsirventtest2.dataModule.SharePreferencesManager;

/**
 * Created by narf on 12/02/15.
 */
public class DataModuleBoundary implements DataModulePort {

    private static SharePreferencesManager sharePreferencesManager;

    public static DataModuleBoundary newInstance() {
        DataModuleBoundary dataModuleBoundary = new DataModuleBoundary();
        DataModuleBoundary.initialize();
        return dataModuleBoundary;
    }

    private static void initialize() {
        sharePreferencesManager = new SharePreferencesManager();
    }

    @Override
    public void saveToken(String access_token, String token_type, String expires_in) {
        sharePreferencesManager.setString(sharePreferencesManager.ACCESS_TOKEN, access_token);
        sharePreferencesManager.setString(sharePreferencesManager.TOKEN_TYPE, token_type);
        sharePreferencesManager.setString(sharePreferencesManager.EXPIRES_IN, expires_in);
    }

    @Override
    public String getToken() {
        return sharePreferencesManager.getString(sharePreferencesManager.ACCESS_TOKEN, null);
    }
}
