package org.todoapp.app.web.task;

import org.lastaflute.web.validation.Required;

/**
 * @author ryohei
 */
public class TaskUpdateBody {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Required
    public Long taskId;
    @Required
    public String description;
    @Required
    public String statusCode;
}
