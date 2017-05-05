/*
 * Copyright 2015-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.todoapp.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.todoapp.dbflute.exbhv.*;
import org.todoapp.dbflute.exentity.*;
import org.todoapp.dbflute.cbean.*;

/**
 * The referrer loader of TASK_STATUS as TABLE. <br>
 * <pre>
 * [primary key]
 *     TASK_STATUS_CODE
 *
 * [column]
 *     TASK_STATUS_CODE, TASK_STATUS_NAME, DESCRIPTION, DISPLAY_ORDER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     TASK
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     taskList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTaskStatus {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TaskStatus> _selectedList;
    protected BehaviorSelector _selector;
    protected TaskStatusBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTaskStatus ready(List<TaskStatus> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TaskStatusBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TaskStatusBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Task> _referrerTask;

    /**
     * Load referrer of taskList by the set-upper of referrer. <br>
     * TASK by TASK_STATUS_CODE, named 'taskList'.
     * <pre>
     * <span style="color: #0000C0">taskStatusBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">taskStatusList</span>, <span style="color: #553000">statusLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">statusLoader</span>.<span style="color: #CC4747">loadTask</span>(<span style="color: #553000">taskCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">taskCB</span>.setupSelect...
     *         <span style="color: #553000">taskCB</span>.query().set...
     *         <span style="color: #553000">taskCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">taskLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    taskLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TaskStatus taskStatus : <span style="color: #553000">taskStatusList</span>) {
     *     ... = taskStatus.<span style="color: #CC4747">getTaskList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTaskStatusCode_InScope(pkList);
     * cb.query().addOrderBy_TaskStatusCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTask> loadTask(ReferrerConditionSetupper<TaskCB> refCBLambda) {
        myBhv().loadTask(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTask = refLs);
        return hd -> hd.handle(new LoaderOfTask().ready(_referrerTask, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TaskStatus> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
