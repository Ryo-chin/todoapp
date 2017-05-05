package org.todoapp.app.web.task;

import org.lastaflute.web.Execute;
import org.lastaflute.web.login.AllowAnyoneAccess;
import org.lastaflute.web.response.JsonResponse;
import org.lastaflute.web.servlet.request.ResponseManager;
import org.todoapp.app.web.base.TodoappBaseAction;
import org.todoapp.dbflute.allcommon.CDef;
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
    @Resource
    private ResponseManager responseManager;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======

    @Execute
    public JsonResponse<TaskResult> index(Long taskId) {
        return taskBhv.selectEntity(cb -> cb.acceptPK(taskId))
                .map(TaskResult::new)
                .map(this::asJson)
                .orElse(JsonResponse.asEmptyBody());
    }

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
        task.setTaskStatusCode_NotStartedYet();
        taskBhv.insert(task);
        return asJson(new TaskResult(task));
    }

    @Execute
    public JsonResponse<TaskResult> update(TaskUpdateBody body) {
        String targetStatusCode = body.statusCode;

        validateApi(body, messages -> {
            List<String> statusList = CDef.TaskStatus.listAll().stream().map(CDef.TaskStatus::code).collect(Collectors.toList());
            if (!statusList.contains(targetStatusCode)) {
                throw responseManager.new400(String.format("invalid task status code: %s", targetStatusCode));
            }
        });

        CDef.TaskStatus status = CDef.TaskStatus.codeOf(targetStatusCode);
        Task task = new Task();
        task.setTaskId(body.taskId);
        task.setDescription(body.description);
        task.setTaskStatusCodeAsTaskStatus(status);
        taskBhv.update(task);
        return asJson(new TaskResult(task));
    }
}
