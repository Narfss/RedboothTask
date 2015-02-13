package com.fmsirvent.fmsirventtest2.apiModule.response;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by narf on 13/02/15.
 */
public class ErrorResponse {
    @JsonProperty("error")
    BaseErrorResponse error;

    public ErrorResponse(){

    }

    public BaseErrorResponse getError() {
        return error;
    }

    public void setError(BaseErrorResponse error) {
        this.error = error;
    }

    public String getFirstError() {
        return getError().getFirstError();
    }
}
