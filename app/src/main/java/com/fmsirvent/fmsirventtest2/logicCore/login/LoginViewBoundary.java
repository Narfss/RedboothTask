package com.fmsirvent.fmsirventtest2.logicCore.login;

import com.fmsirvent.fmsirventtest2.logicCore.LogicFactory;

/**
 * Created by narf on 10/02/15.
 */
public class LoginViewBoundary implements LoginViewPort {
    private LoginView view;
    private LoginLogic logic;

    public LoginViewBoundary(LoginView LoginView) {
        this.view = LoginView;
    }

    public static LoginViewBoundary newInstance(LoginView LoginView) {
        LoginViewBoundary loginViewBoundary = new LoginViewBoundary(LoginView);
        loginViewBoundary.setLogic(LogicFactory.getLoginCore(loginViewBoundary));
        return loginViewBoundary;
    }

    public void setLogic(LoginLogic logic) {
        this.logic = logic;
    }

    public void saveToken(String accessToken, String tokenType, String expiresIn) {
        logic.saveToken(accessToken, tokenType, expiresIn);
    }
}
