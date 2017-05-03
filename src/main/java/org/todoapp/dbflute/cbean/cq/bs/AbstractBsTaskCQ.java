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
     * DONE_FLG: {NotNull, CHAR(1), classification=Flg}
     * @param doneFlg The value of doneFlg as equal. (NullAllowed: if null (or empty), no condition)
     */
    protected void setDoneFlg_Equal(String doneFlg) {
        doSetDoneFlg_Equal(fRES(doneFlg));
    }

    /**
     * Equal(=). As Flg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DONE_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDoneFlg_Equal_AsFlg(CDef.Flg cdef) {
        doSetDoneFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As boolean for Flg. <br>
     * DONE_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param determination The determination, true or false. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoneFlg_Equal_AsBoolean(Boolean determination) {
        setDoneFlg_Equal_AsFlg(CDef.Flg.codeOf(determination));
    }

    /**
     * Equal(=). As True (1). And OnlyOnceRegistered. <br>
     * Checked: means yes
     */
    public void setDoneFlg_Equal_True() {
        setDoneFlg_Equal_AsFlg(CDef.Flg.True);
    }

    /**
     * Equal(=). As False (0). And OnlyOnceRegistered. <br>
     * Unchecked: means no
     */
    public void setDoneFlg_Equal_False() {
        setDoneFlg_Equal_AsFlg(CDef.Flg.False);
    }

    protected void doSetDoneFlg_Equal(String doneFlg) {
        regDoneFlg(CK_EQ, doneFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DONE_FLG: {NotNull, CHAR(1), classification=Flg}
     * @param doneFlg The value of doneFlg as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    protected void setDoneFlg_NotEqual(String doneFlg) {
        doSetDoneFlg_NotEqual(fRES(doneFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As Flg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DONE_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDoneFlg_NotEqual_AsFlg(CDef.Flg cdef) {
        doSetDoneFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As True (1). And OnlyOnceRegistered. <br>
     * Checked: means yes
     */
    public void setDoneFlg_NotEqual_True() {
        setDoneFlg_NotEqual_AsFlg(CDef.Flg.True);
    }

    /**
     * NotEqual(&lt;&gt;). As False (0). And OnlyOnceRegistered. <br>
     * Unchecked: means no
     */
    public void setDoneFlg_NotEqual_False() {
        setDoneFlg_NotEqual_AsFlg(CDef.Flg.False);
    }

    protected void doSetDoneFlg_NotEqual(String doneFlg) {
        regDoneFlg(CK_NES, doneFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DONE_FLG: {NotNull, CHAR(1), classification=Flg}
     * @param doneFlgList The collection of doneFlg as inScope. (NullAllowed: if null (or empty), no condition)
     */
    protected void setDoneFlg_InScope(Collection<String> doneFlgList) {
        doSetDoneFlg_InScope(doneFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As Flg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DONE_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setDoneFlg_InScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetDoneFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetDoneFlg_InScope(Collection<String> doneFlgList) {
        regINS(CK_INS, cTL(doneFlgList), xgetCValueDoneFlg(), "DONE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DONE_FLG: {NotNull, CHAR(1), classification=Flg}
     * @param doneFlgList The collection of doneFlg as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    protected void setDoneFlg_NotInScope(Collection<String> doneFlgList) {
        doSetDoneFlg_NotInScope(doneFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As Flg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DONE_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setDoneFlg_NotInScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetDoneFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetDoneFlg_NotInScope(Collection<String> doneFlgList) {
        regINS(CK_NINS, cTL(doneFlgList), xgetCValueDoneFlg(), "DONE_FLG");
    }

    protected void regDoneFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDoneFlg(), "DONE_FLG"); }
    protected abstract ConditionValue xgetCValueDoneFlg();

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
