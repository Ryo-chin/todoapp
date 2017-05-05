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
package org.todoapp.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.todoapp.dbflute.allcommon.*;
import org.todoapp.dbflute.cbean.*;
import org.todoapp.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of TASK_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTaskStatusCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTaskStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "TASK_STATUS";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TASK_STATUS_CODE: {PK, NotNull, CHAR(3), classification=TaskStatus}
     * @param taskStatusCode The value of taskStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    protected void setTaskStatusCode_Equal(String taskStatusCode) {
        doSetTaskStatusCode_Equal(fRES(taskStatusCode));
    }

    /**
     * Equal(=). As TaskStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TASK_STATUS_CODE: {PK, NotNull, CHAR(3), classification=TaskStatus} <br>
     * status of task
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskStatusCode_Equal_AsTaskStatus(CDef.TaskStatus cdef) {
        doSetTaskStatusCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As NotStartedYet (YET). And OnlyOnceRegistered. <br>
     * NotStartedYet: 未着手
     */
    public void setTaskStatusCode_Equal_NotStartedYet() {
        setTaskStatusCode_Equal_AsTaskStatus(CDef.TaskStatus.NotStartedYet);
    }

    /**
     * Equal(=). As WorkInProgress2 (WIP). And OnlyOnceRegistered. <br>
     * WorkInProgress2: 進行中
     */
    public void setTaskStatusCode_Equal_WorkInProgress2() {
        setTaskStatusCode_Equal_AsTaskStatus(CDef.TaskStatus.WorkInProgress2);
    }

    /**
     * Equal(=). As Completed (CMP). And OnlyOnceRegistered. <br>
     * Completed: 完了
     */
    public void setTaskStatusCode_Equal_Completed() {
        setTaskStatusCode_Equal_AsTaskStatus(CDef.TaskStatus.Completed);
    }

    /**
     * Equal(=). As Deleted (DEL). And OnlyOnceRegistered. <br>
     * Deleted: 削除
     */
    public void setTaskStatusCode_Equal_Deleted() {
        setTaskStatusCode_Equal_AsTaskStatus(CDef.TaskStatus.Deleted);
    }

    protected void doSetTaskStatusCode_Equal(String taskStatusCode) {
        regTaskStatusCode(CK_EQ, taskStatusCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TASK_STATUS_CODE: {PK, NotNull, CHAR(3), classification=TaskStatus}
     * @param taskStatusCode The value of taskStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    protected void setTaskStatusCode_NotEqual(String taskStatusCode) {
        doSetTaskStatusCode_NotEqual(fRES(taskStatusCode));
    }

    /**
     * NotEqual(&lt;&gt;). As TaskStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TASK_STATUS_CODE: {PK, NotNull, CHAR(3), classification=TaskStatus} <br>
     * status of task
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskStatusCode_NotEqual_AsTaskStatus(CDef.TaskStatus cdef) {
        doSetTaskStatusCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As NotStartedYet (YET). And OnlyOnceRegistered. <br>
     * NotStartedYet: 未着手
     */
    public void setTaskStatusCode_NotEqual_NotStartedYet() {
        setTaskStatusCode_NotEqual_AsTaskStatus(CDef.TaskStatus.NotStartedYet);
    }

    /**
     * NotEqual(&lt;&gt;). As WorkInProgress2 (WIP). And OnlyOnceRegistered. <br>
     * WorkInProgress2: 進行中
     */
    public void setTaskStatusCode_NotEqual_WorkInProgress2() {
        setTaskStatusCode_NotEqual_AsTaskStatus(CDef.TaskStatus.WorkInProgress2);
    }

    /**
     * NotEqual(&lt;&gt;). As Completed (CMP). And OnlyOnceRegistered. <br>
     * Completed: 完了
     */
    public void setTaskStatusCode_NotEqual_Completed() {
        setTaskStatusCode_NotEqual_AsTaskStatus(CDef.TaskStatus.Completed);
    }

    /**
     * NotEqual(&lt;&gt;). As Deleted (DEL). And OnlyOnceRegistered. <br>
     * Deleted: 削除
     */
    public void setTaskStatusCode_NotEqual_Deleted() {
        setTaskStatusCode_NotEqual_AsTaskStatus(CDef.TaskStatus.Deleted);
    }

    protected void doSetTaskStatusCode_NotEqual(String taskStatusCode) {
        regTaskStatusCode(CK_NES, taskStatusCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TASK_STATUS_CODE: {PK, NotNull, CHAR(3), classification=TaskStatus}
     * @param taskStatusCodeList The collection of taskStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    protected void setTaskStatusCode_InScope(Collection<String> taskStatusCodeList) {
        doSetTaskStatusCode_InScope(taskStatusCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As TaskStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TASK_STATUS_CODE: {PK, NotNull, CHAR(3), classification=TaskStatus} <br>
     * status of task
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setTaskStatusCode_InScope_AsTaskStatus(Collection<CDef.TaskStatus> cdefList) {
        doSetTaskStatusCode_InScope(cTStrL(cdefList));
    }

    protected void doSetTaskStatusCode_InScope(Collection<String> taskStatusCodeList) {
        regINS(CK_INS, cTL(taskStatusCodeList), xgetCValueTaskStatusCode(), "TASK_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TASK_STATUS_CODE: {PK, NotNull, CHAR(3), classification=TaskStatus}
     * @param taskStatusCodeList The collection of taskStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    protected void setTaskStatusCode_NotInScope(Collection<String> taskStatusCodeList) {
        doSetTaskStatusCode_NotInScope(taskStatusCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As TaskStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TASK_STATUS_CODE: {PK, NotNull, CHAR(3), classification=TaskStatus} <br>
     * status of task
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setTaskStatusCode_NotInScope_AsTaskStatus(Collection<CDef.TaskStatus> cdefList) {
        doSetTaskStatusCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetTaskStatusCode_NotInScope(Collection<String> taskStatusCodeList) {
        regINS(CK_NINS, cTL(taskStatusCodeList), xgetCValueTaskStatusCode(), "TASK_STATUS_CODE");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select TASK_STATUS_CODE from TASK where ...)} <br>
     * TASK by TASK_STATUS_CODE, named 'taskAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTask</span>(taskCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     taskCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TaskList for 'exists'. (NotNull)
     */
    public void existsTask(SubQuery<TaskCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TaskCB cb = new TaskCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTaskStatusCode_ExistsReferrer_TaskList(cb.query());
        registerExistsReferrer(cb.query(), "TASK_STATUS_CODE", "TASK_STATUS_CODE", pp, "taskList");
    }
    public abstract String keepTaskStatusCode_ExistsReferrer_TaskList(TaskCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select TASK_STATUS_CODE from TASK where ...)} <br>
     * TASK by TASK_STATUS_CODE, named 'taskAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTask</span>(taskCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     taskCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TaskStatusCode_NotExistsReferrer_TaskList for 'not exists'. (NotNull)
     */
    public void notExistsTask(SubQuery<TaskCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TaskCB cb = new TaskCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTaskStatusCode_NotExistsReferrer_TaskList(cb.query());
        registerNotExistsReferrer(cb.query(), "TASK_STATUS_CODE", "TASK_STATUS_CODE", pp, "taskList");
    }
    public abstract String keepTaskStatusCode_NotExistsReferrer_TaskList(TaskCQ sq);

    public void xsderiveTaskList(String fn, SubQuery<TaskCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TaskCB cb = new TaskCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepTaskStatusCode_SpecifyDerivedReferrer_TaskList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "TASK_STATUS_CODE", "TASK_STATUS_CODE", pp, "taskList", al, op);
    }
    public abstract String keepTaskStatusCode_SpecifyDerivedReferrer_TaskList(TaskCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from TASK where ...)} <br>
     * TASK by TASK_STATUS_CODE, named 'taskAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTask()</span>.<span style="color: #CC4747">max</span>(taskCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     taskCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     taskCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TaskCB> derivedTask() {
        return xcreateQDRFunctionTaskList();
    }
    protected HpQDRFunction<TaskCB> xcreateQDRFunctionTaskList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTaskList(fn, sq, rd, vl, op));
    }
    public void xqderiveTaskList(String fn, SubQuery<TaskCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TaskCB cb = new TaskCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepTaskStatusCode_QueryDerivedReferrer_TaskList(cb.query()); String prpp = keepTaskStatusCode_QueryDerivedReferrer_TaskListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "TASK_STATUS_CODE", "TASK_STATUS_CODE", sqpp, "taskList", rd, vl, prpp, op);
    }
    public abstract String keepTaskStatusCode_QueryDerivedReferrer_TaskList(TaskCQ sq);
    public abstract String keepTaskStatusCode_QueryDerivedReferrer_TaskListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TASK_STATUS_CODE: {PK, NotNull, CHAR(3), classification=TaskStatus}
     */
    public void setTaskStatusCode_IsNull() { regTaskStatusCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TASK_STATUS_CODE: {PK, NotNull, CHAR(3), classification=TaskStatus}
     */
    public void setTaskStatusCode_IsNotNull() { regTaskStatusCode(CK_ISNN, DOBJ); }

    protected void regTaskStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTaskStatusCode(), "TASK_STATUS_CODE"); }
    protected abstract ConditionValue xgetCValueTaskStatusCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TASK_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @param taskStatusName The value of taskStatusName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setTaskStatusName_Equal(String taskStatusName) {
        doSetTaskStatusName_Equal(fRES(taskStatusName));
    }

    protected void doSetTaskStatusName_Equal(String taskStatusName) {
        regTaskStatusName(CK_EQ, taskStatusName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TASK_STATUS_NAME: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setTaskStatusName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param taskStatusName The value of taskStatusName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTaskStatusName_LikeSearch(String taskStatusName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTaskStatusName_LikeSearch(taskStatusName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TASK_STATUS_NAME: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setTaskStatusName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param taskStatusName The value of taskStatusName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTaskStatusName_LikeSearch(String taskStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(taskStatusName), xgetCValueTaskStatusName(), "TASK_STATUS_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TASK_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @param taskStatusName The value of taskStatusName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTaskStatusName_NotLikeSearch(String taskStatusName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTaskStatusName_NotLikeSearch(taskStatusName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TASK_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @param taskStatusName The value of taskStatusName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTaskStatusName_NotLikeSearch(String taskStatusName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(taskStatusName), xgetCValueTaskStatusName(), "TASK_STATUS_NAME", likeSearchOption);
    }

    protected void regTaskStatusName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTaskStatusName(), "TASK_STATUS_NAME"); }
    protected abstract ConditionValue xgetCValueTaskStatusName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(200)}
     * @param description The value of description as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_Equal(String description) {
        doSetDescription_Equal(fRES(description));
    }

    protected void doSetDescription_Equal(String description) {
        regDescription(CK_EQ, description);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(200)}
     * @param description The value of description as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_NotEqual(String description) {
        doSetDescription_NotEqual(fRES(description));
    }

    protected void doSetDescription_NotEqual(String description) {
        regDescription(CK_NES, description);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(200)}
     * @param descriptionList The collection of description as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_InScope(Collection<String> descriptionList) {
        doSetDescription_InScope(descriptionList);
    }

    protected void doSetDescription_InScope(Collection<String> descriptionList) {
        regINS(CK_INS, cTL(descriptionList), xgetCValueDescription(), "DESCRIPTION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(200)}
     * @param descriptionList The collection of description as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_NotInScope(Collection<String> descriptionList) {
        doSetDescription_NotInScope(descriptionList);
    }

    protected void doSetDescription_NotInScope(Collection<String> descriptionList) {
        regINS(CK_NINS, cTL(descriptionList), xgetCValueDescription(), "DESCRIPTION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setDescription_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param description The value of description as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_LikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setDescription_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param description The value of description as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDescription_LikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(description), xgetCValueDescription(), "DESCRIPTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(200)}
     * @param description The value of description as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_NotLikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_NotLikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, VARCHAR(200)}
     * @param description The value of description as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDescription_NotLikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(description), xgetCValueDescription(), "DESCRIPTION", likeSearchOption);
    }

    protected void regDescription(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDescription(), "DESCRIPTION"); }
    protected abstract ConditionValue xgetCValueDescription();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_ORDER: {NotNull, INT(10)}
     * @param displayOrder The value of displayOrder as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDisplayOrder_Equal(Integer displayOrder) {
        doSetDisplayOrder_Equal(displayOrder);
    }

    protected void doSetDisplayOrder_Equal(Integer displayOrder) {
        regDisplayOrder(CK_EQ, displayOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_ORDER: {NotNull, INT(10)}
     * @param minNumber The min number of displayOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of displayOrder. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDisplayOrder_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DISPLAY_ORDER: {NotNull, INT(10)}
     * @param minNumber The min number of displayOrder. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of displayOrder. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDisplayOrder(), "DISPLAY_ORDER", rangeOfOption);
    }

    protected void regDisplayOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDisplayOrder(), "DISPLAY_ORDER"); }
    protected abstract ConditionValue xgetCValueDisplayOrder();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TaskStatusCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TaskStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TaskStatusCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TaskStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TaskStatusCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TaskStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TaskStatusCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TaskStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TaskStatusCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TaskStatusCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TaskStatusCB&gt;() {
     *     public void query(TaskStatusCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TaskStatusCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TaskStatusCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TaskStatusCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TaskStatusCQ sq);

    protected TaskStatusCB xcreateScalarConditionCB() {
        TaskStatusCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TaskStatusCB xcreateScalarConditionPartitionByCB() {
        TaskStatusCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TaskStatusCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TaskStatusCB cb = new TaskStatusCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TASK_STATUS_CODE";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TaskStatusCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TaskStatusCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TaskStatusCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TaskStatusCB cb = new TaskStatusCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TASK_STATUS_CODE";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TaskStatusCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TaskStatusCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TaskStatusCB cb = new TaskStatusCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TaskStatusCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected TaskStatusCB newMyCB() {
        return new TaskStatusCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TaskStatusCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
