package com.fmsirvent.fmsirventtest2.apiModule.response;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by narf on 12/02/15.
 */
public class ActivityResponse {
    /*
    {
        type: "DenormalizedActivity",
        created_at: 1423521210,
        updated_at: 1423521211,
        id: 78599537,
        user_id: 787710,
        project_id: 1367628,
        target_id: 16790184,
        target_type: "Task",
        comment_target_id: null,
        action: "create",
        last_activity_id: 78599537,
        is_private: false,
        title: "Crear app",
        body: "Client ID 61e53f179fa7849edb35f0a70f15199ae52bdab1b53e247f5bad24e00b7527bc Client Secret 4ee0e4d8cc52edf0c5e6476fddfa30a33b7f36df3230adf9017728640be4ef8f Return URI http://fmsirvent.com",
        assigned_id: null,
        previous_assigned_id: null,
        due_on: null,
        previous_due_on: null,
        urgent: false,
        previous_urgent: null,
        time_tracking_on: null
     }
     */
    @JsonProperty("title")
    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
