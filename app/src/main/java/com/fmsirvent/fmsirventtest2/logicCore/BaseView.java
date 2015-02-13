package com.fmsirvent.fmsirventtest2.logicCore;

/**
 * Created by fmsirvent on 13/2/15.
 */
public interface BaseView {

    void notifyError(ErrorType errorType, String message);

    void notifySuccess(String message, ActionSuccess actionSuccess);
}
