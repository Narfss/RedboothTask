package com.fmsirvent.fmsirventtest2.view;

import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;

/**
 * Created by narf on 12/02/15.
 */
public interface BaseError {
    void notifyError(ErrorType errorType);
}
