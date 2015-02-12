package com.fmsirvent.fmsirventtest2.logicCore.data;

/**
 * Created by narf on 12/02/15.
 */
public interface DataModulePort {
    void saveToken(String access_token, String token_type, String expires_in);

    String getToken();
}
