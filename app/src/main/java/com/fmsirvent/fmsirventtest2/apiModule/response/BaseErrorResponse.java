package com.fmsirvent.fmsirventtest2.apiModule.response;

import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by narf on 13/02/15.
 */
public class BaseErrorResponse implements Serializable {
    @JsonProperty("message")
    String message;

    @JsonProperty("errors")
    ErrorsResponse errors;

    public BaseErrorResponse() {

    }

    public String getMessage() {
        return message;
    }

    public ErrorsResponse getErrors() {
        return errors;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setErrors(ErrorsResponse errors) {
        this.errors = errors;
    }

    public String getFirstError(){
        return (getErrors() != null) ? getErrors().getFirstDescription() : getMessage();
    }

    private class ErrorsResponse implements Serializable {
        @JsonProperty("name")
        ArrayList<String> name;

        @JsonProperty("description")
        ArrayList<String> description;

        public ErrorsResponse(){

        }

        public ArrayList<String> getName() {
            return name;
        }

        public ArrayList<String> getDescription() {
            return description;
        }

        public void setName(ArrayList<String> name) {
            this.name = name;
        }

        public void setDescription(ArrayList<String> description) {
            this.description = description;
        }

        public String getFirstDescription() {
            return (getDescription() != null) ? getDescription().get(0) : getFirstName();
        }

        private String getFirstName() {
            return (getName() != null) ? getName().get(0) : null;
        }
    }
}
