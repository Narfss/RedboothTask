package com.fmsirvent.fmsirventtest2.apiModule.request;

/**
 * Created by narf on 13/02/15.
 */
public class TaskRequest {
    private final String name;
    private final String description;

    public TaskRequest(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
