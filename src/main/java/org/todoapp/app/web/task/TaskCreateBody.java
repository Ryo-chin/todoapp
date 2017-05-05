package org.todoapp.app.web.task;

import org.lastaflute.web.validation.Required;

/**
 * @author ryohei
 */
public class TaskCreateBody {

    @Required
    public String description;
}
