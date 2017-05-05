package org.todoapp.app.web.task;

import java.util.List;

/**
 * @author ryohei
 */
public class TaskListResult {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    public List<TaskResult> list;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TaskListResult(List<TaskResult> list) {
        this.list = list;
    }
}
