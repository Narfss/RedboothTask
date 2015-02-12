package com.fmsirvent.fmsirventtest2.logicCore.login;

import com.fmsirvent.fmsirventtest2.logicCore.data.DataModulePort;

/**
 * Created by narf on 10/02/15.
 */
public class LoginLogic{

    private final LoginViewPort logicViewPort;
    private final LoginModelPort loginModelPort;
    private final DataModulePort dataModulePort;

    public LoginLogic(LoginViewPort logicViewPort, LoginModelPort loginModelPort, DataModulePort dataModulePort) {
        this.logicViewPort = logicViewPort;
        this.loginModelPort = loginModelPort;
        this.dataModulePort = dataModulePort;
    }

    public static LoginLogic newInstance(LoginViewPort logicViewPort, LoginModelPort loginModelPort, DataModulePort dataModulePort) {
        LoginLogic loginLogic = new LoginLogic(logicViewPort, loginModelPort, dataModulePort);
        loginLogic.initialize();
        return loginLogic;
    }

    private void initialize() {
        loginModelPort.setLogic(this);
    }

    public void saveToken(String accessToken, String tokenType, String expiresIn) {
        dataModulePort.saveToken(accessToken,
                tokenType,
                expiresIn);
    }
}
