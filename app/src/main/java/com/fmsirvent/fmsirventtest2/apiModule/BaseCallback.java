package com.fmsirvent.fmsirventtest2.apiModule;

import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;

import org.apache.http.Header;

import ly.apps.android.rest.client.Callback;

/**
 * Created by narf on 12/02/15.
 */
public abstract class BaseCallback<Response> extends Callback<Response> {
    @Override
    public void onSuccess(int statusCode, Header[] headers, String rawResponse, Response response) {
        if (response == null) {
            notifyError(ErrorType.TOKEN_FAIL);
        } else {
            super.onSuccess(statusCode, headers, rawResponse, response);
        }
    }

    @Override
    public void onFailure(int statusCode, Header[] headers, Throwable e, String responseBody, Response errorResponse) {
        //super.onFailure(statusCode, headers, e, responseBody, errorResponse);
        switch (statusCode) {
            case 401:
                notifyError(ErrorType.TOKEN_FAIL);
                break;
            default:
                notifyError(ErrorType.CONNECTION);
        }
    }

    protected abstract void notifyError(ErrorType tokenFail);
}
