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

import org.dbflute.cbean.AbstractConditionQuery;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.chelper.HpQDRFunction;
import org.dbflute.cbean.chelper.HpSLCCustomized;
import org.dbflute.cbean.chelper.HpSLCFunction;
import org.dbflute.cbean.chelper.HpSLCSetupper;
import org.dbflute.cbean.ckey.ConditionKey;
import org.dbflute.cbean.coption.ConditionOptionCall;
import org.dbflute.cbean.coption.DerivedReferrerOption;
import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.cbean.coption.RangeOfOption;
import org.dbflute.cbean.coption.ScalarConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.ManualOrderOptionCall;
import org.dbflute.cbean.scoping.SubQuery;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.todoapp.dbflute.allcommon.CDef;
import org.todoapp.dbflute.allcommon.DBMetaInstanceHandler;
import org.todoapp.dbflute.cbean.TaskCB;
import org.todoapp.dbflute.cbean.cq.TaskCQ;

import java.util.Collection;
import java.util.Date;

/**
 * The abstract condition-query of TASK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTaskCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTaskCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "TASK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TASK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param taskId The value of taskId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskId_Equal(Long taskId) {
        doSetTaskId_Equal(taskId);
    }

    protected void doSetTaskId_Equal(Long taskId) {
        regTaskId(CK_EQ, taskId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TASK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param taskId The value of taskId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskId_NotEqual(Long taskId) {
        doSetTaskId_NotEqual(taskId);
    }

    protected void doSetTaskId_NotEqual(Long taskId) {
        regTaskId(CK_NES, taskId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TASK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param taskId The value of taskId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskId_GreaterThan(Long taskId) {
        regTaskId(CK_GT, taskId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TASK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param taskId The value of taskId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskId_LessThan(Long taskId) {
        regTaskId(CK_LT, taskId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TASK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param taskId The value of taskId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskId_GreaterEqual(Long taskId) {
        regTaskId(CK_GE, taskId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TASK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param taskId The value of taskId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaskId_LessEqual(Long taskId) {
        regTaskId(CK_LE, taskId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TASK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of taskId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of taskId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTaskId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTaskId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TASK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of taskId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of taskId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTaskId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTaskId(), "TASK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TASK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param taskIdList The collection of taskId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTaskId_InScope(Collection<Long> taskIdList) {
        doSetTaskId_InScope(taskIdList);
    }

    protected void doSetTaskId_InScope(Collection<Long> taskIdList) {
        regINS(CK_INS, cTL(taskIdList), xgetCValueTaskId(), "TASK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TASK_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param taskIdList The collection of taskId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setTaskId_NotInScope(Collection<Long> taskIdList) {
        doSetTaskId_NotInScope(taskIdList);
    }

    protected void doSetTaskId_NotInScope(Collection<Long> taskIdList) {
        regINS(CK_NINS, cTL(taskIdList), xgetCValueTaskId(), "TASK_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TASK_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setTaskId_IsNull() { regTaskId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TASK_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setTaskId_IsNotNull() { regTaskId(CK_ISNN, DOBJ); }

    protected void regTaskId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTaskId(), "TASK_ID"); }
    protected abstract ConditionValue xgetCValueTaskId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESCRIPTION: {NotNull, TEXT(65535)}
     * @param description The value of description as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDescription_Equal(String description) {
        doSetDescription_Equal(fRES(description));
    }

    protected void doSetDescription_Equal(String description) {
        regDescription(CK_EQ, description);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, TEXT(65535)} <br>
     * <pre>e.g. setDescription_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param description The value of description as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_LikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, TEXT(65535)} <br>
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
     * DESCRIPTION: {NotNull, TEXT(65535)}
     * @param description The value of description as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDescription_NotLikeSearch(String description, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDescription_NotLikeSearch(description, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESCRIPTION: {NotNull, TEXT(65535)}
     * @param description The value of description as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDescription_NotLikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(description), xgetCValueDescription(), "DESCRIPTION", likeSearchOption);
    }

    protected void regDescription(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDescription(), "DESCRIPTION"); }
    protected abstract ConditionValue xgetCValueDescription();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TASK_STATUS_CODE: {IX, NotNull, CHAR(3), FK to TASK_STATUS, classification=TaskStatus}
     * @param taskStatusCode The value of taskStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    protected void setTaskStatusCode_Equal(String taskStatusCode) {
        doSetTaskStatusCode_Equal(fRES(taskStatusCode));
    }

    /**
     * Equal(=). As TaskStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TASK_STATUS_CODE: {IX, NotNull, CHAR(3), FK to TASK_STATUS, classification=TaskStatus} <br>
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
     * TASK_STATUS_CODE: {IX, NotNull, CHAR(3), FK to TASK_STATUS, classification=TaskStatus}
     * @param taskStatusCode The value of taskStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    protected void setTaskStatusCode_NotEqual(String taskStatusCode) {
        doSetTaskStatusCode_NotEqual(fRES(taskStatusCode));
    }

    /**
     * NotEqual(&lt;&gt;). As TaskStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TASK_STATUS_CODE: {IX, NotNull, CHAR(3), FK to TASK_STATUS, classification=TaskStatus} <br>
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
     * TASK_STATUS_CODE: {IX, NotNull, CHAR(3), FK to TASK_STATUS, classification=TaskStatus}
     * @param taskStatusCodeList The collection of taskStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    protected void setTaskStatusCode_InScope(Collection<String> taskStatusCodeList) {
        doSetTaskStatusCode_InScope(taskStatusCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As TaskStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TASK_STATUS_CODE: {IX, NotNull, CHAR(3), FK to TASK_STATUS, classification=TaskStatus} <br>
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
     * TASK_STATUS_CODE: {IX, NotNull, CHAR(3), FK to TASK_STATUS, classification=TaskStatus}
     * @param taskStatusCodeList The collection of taskStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    protected void setTaskStatusCode_NotInScope(Collection<String> taskStatusCodeList) {
        doSetTaskStatusCode_NotInScope(taskStatusCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As TaskStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TASK_STATUS_CODE: {IX, NotNull, CHAR(3), FK to TASK_STATUS, classification=TaskStatus} <br>
     * status of task
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setTaskStatusCode_NotInScope_AsTaskStatus(Collection<CDef.TaskStatus> cdefList) {
        doSetTaskStatusCode_NotInScope(cTStrL(cdefList));
    }

    protected void doSetTaskStatusCode_NotInScope(Collection<String> taskStatusCodeList) {
        regINS(CK_NINS, cTL(taskStatusCodeList), xgetCValueTaskStatusCode(), "TASK_STATUS_CODE");
    }

    protected void regTaskStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTaskStatusCode(), "TASK_STATUS_CODE"); }
    protected abstract ConditionValue xgetCValueTaskStatusCode();

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
    public HpSLCFunction<TaskCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TaskCB.class);
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
    public HpSLCFunction<TaskCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TaskCB.class);
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
    public HpSLCFunction<TaskCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TaskCB.class);
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
    public HpSLCFunction<TaskCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TaskCB.class);
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
    public HpSLCFunction<TaskCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TaskCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TaskCB&gt;() {
     *     public void query(TaskCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TaskCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TaskCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TaskCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TaskCQ sq);

    protected TaskCB xcreateScalarConditionCB() {
        TaskCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TaskCB xcreateScalarConditionPartitionByCB() {
        TaskCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TaskCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TaskCB cb = new TaskCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TASK_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TaskCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TaskCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TaskCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TaskCB cb = new TaskCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TASK_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TaskCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TaskCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TaskCB cb = new TaskCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TaskCQ sq);

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
    protected TaskCB newMyCB() {
        return new TaskCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TaskCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
