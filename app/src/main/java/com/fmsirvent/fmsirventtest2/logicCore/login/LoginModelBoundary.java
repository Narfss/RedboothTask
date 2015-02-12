package com.fmsirvent.fmsirventtest2.logicCore.login;

import com.fmsirvent.fmsirventtest2.apiModule.ApiServiceManager;

/**
 * Created by narf on 11/02/15.
 */
public class LoginModelBoundary implements LoginModelPort {
    private LoginLogic loginLogic;
    private ApiServiceManager apiServiceManager;

    public static LoginModelBoundary newInstance() {
        LoginModelBoundary loginModelBoundary = new LoginModelBoundary();
        loginModelBoundary.initialize();
        return loginModelBoundary;
    }

    private void initialize() {
        apiServiceManager = new ApiServiceManager();
    }

    @Override
    public void setLogic(LoginLogic loginLogic) {
        this.loginLogic = loginLogic;
    }

}
