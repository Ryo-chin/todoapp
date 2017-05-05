package org.todoapp.app.web.task;

import org.lastaflute.web.Execute;
import org.lastaflute.web.login.AllowAnyoneAccess;
import org.lastaflute.web.response.JsonResponse;
import org.todoapp.app.web.base.TodoappBaseAction;
import org.todoapp.dbflute.exbhv.TaskBhv;
import org.todoapp.dbflute.exentity.Task;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ryo-chin
 */
// TODO ログイン機能を実装後に削除 by ryo-chin (2017/05/04)
@AllowAnyoneAccess
public class TaskAction extends TodoappBaseAction {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========

    @Resource
    private TaskBhv taskBhv;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Execute
    public JsonResponse<List<TaskResult>> list() {
        // TODO ユーザーテーブル作成後にIDで絞り込み by ryo-chin (2017/05/04)
        List<TaskResult> tasks = taskBhv.selectList(cb -> {}).stream()
                .map(TaskResult::new)
                .collect(Collectors.toList());
        return asJson(tasks);
    }

    @Execute
    public JsonResponse<TaskResult> create(TaskCreateBody body) {
        validateApi(body, messages -> {});
        Task task = new Task();
        task.setDescription(body.description);
        task.setDoneFlg_False();
        taskBhv.insert(task);
        return asJson(new TaskResult(task));
    }
}
