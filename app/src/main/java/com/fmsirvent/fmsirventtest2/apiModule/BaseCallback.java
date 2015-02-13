package com.fmsirvent.fmsirventtest2.apiModule;

import com.fmsirvent.fmsirventtest2.apiModule.response.BaseErrorResponse;
import com.fmsirvent.fmsirventtest2.apiModule.response.ErrorResponse;
import com.fmsirvent.fmsirventtest2.logicCore.ErrorType;

import org.apache.http.Header;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

import ly.apps.android.rest.client.Callback;

/**
 * Created by narf on 12/02/15.
 */
public abstract class BaseCallback<Response> extends Callback<Response> {
    @Override
    public void onSuccess(int statusCode, Header[] headers, String rawResponse, Response response) {
        if (response == null) {
            notifyError(ErrorType.TOKEN_FAIL, null);
        } else {
            super.onSuccess(statusCode, headers, rawResponse, response);
        }
    }

    @Override
    public void onFailure(int statusCode, Header[] headers, Throwable e, String responseBody, Response errorResponse) {
        //super.onFailure(statusCode, headers, e, responseBody, errorResponse);
        ObjectMapper mapper = new ObjectMapper();
        ErrorResponse error = null;
        if (responseBody != null) {
            try {
                error = mapper.readValue(responseBody, ErrorResponse.class);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        String message = (error != null) ? error.getFirstError() : null;
        switch (statusCode) {
            case 400:
                notifyError(ErrorType.UNPROCESSABLE_ENTITY, message);
                break;
            case 401:
                notifyError(ErrorType.TOKEN_FAIL, message);
                break;
            default:
                notifyError(ErrorType.CONNECTION, message);
        }
    }

    protected abstract void notifyError(ErrorType tokenFail, String message);
}
