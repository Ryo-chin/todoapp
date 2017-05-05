package org.todoapp.app.web.task;

import org.todoapp.dbflute.exentity.Task;

/**
 * @author ryohei
 */
public class TaskResult {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    public Long taskId;
    public String description;
    public Boolean doneFlg;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TaskResult(Task task) {
        this.taskId = task.getTaskId();
        this.description = task.getDescription();
        this.doneFlg = task.isDoneFlgTrue();
    }
}
