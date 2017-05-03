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
import org.todoapp.dbflute.exbhv.*;
import org.todoapp.dbflute.exentity.*;

/**
 * The referrer loader of TASK as TABLE. <br>
 * <pre>
 * [primary key]
 *     TASK_ID
 *
 * [column]
 *     TASK_ID, DESCRIPTION, DONE_FLG
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TASK_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTask {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Task> _selectedList;
    protected BehaviorSelector _selector;
    protected TaskBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTask ready(List<Task> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TaskBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TaskBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Task> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
