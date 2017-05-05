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

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.todoapp.dbflute.cbean.cq.ciq.*;
import org.todoapp.dbflute.cbean.*;
import org.todoapp.dbflute.cbean.cq.*;

/**
 * The base condition-query of TASK_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public class BsTaskStatusCQ extends AbstractBsTaskStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TaskStatusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTaskStatusCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from TASK_STATUS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public TaskStatusCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected TaskStatusCIQ xcreateCIQ() {
        TaskStatusCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected TaskStatusCIQ xnewCIQ() {
        return new TaskStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join TASK_STATUS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public TaskStatusCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        TaskStatusCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _taskStatusCode;
    public ConditionValue xdfgetTaskStatusCode()
    { if (_taskStatusCode == null) { _taskStatusCode = nCV(); }
      return _taskStatusCode; }
    protected ConditionValue xgetCValueTaskStatusCode() { return xdfgetTaskStatusCode(); }

    public Map<String, TaskCQ> xdfgetTaskStatusCode_ExistsReferrer_TaskList() { return xgetSQueMap("taskStatusCode_ExistsReferrer_TaskList"); }
    public String keepTaskStatusCode_ExistsReferrer_TaskList(TaskCQ sq) { return xkeepSQue("taskStatusCode_ExistsReferrer_TaskList", sq); }

    public Map<String, TaskCQ> xdfgetTaskStatusCode_NotExistsReferrer_TaskList() { return xgetSQueMap("taskStatusCode_NotExistsReferrer_TaskList"); }
    public String keepTaskStatusCode_NotExistsReferrer_TaskList(TaskCQ sq) { return xkeepSQue("taskStatusCode_NotExistsReferrer_TaskList", sq); }

    public Map<String, TaskCQ> xdfgetTaskStatusCode_SpecifyDerivedReferrer_TaskList() { return xgetSQueMap("taskStatusCode_SpecifyDerivedReferrer_TaskList"); }
    public String keepTaskStatusCode_SpecifyDerivedReferrer_TaskList(TaskCQ sq) { return xkeepSQue("taskStatusCode_SpecifyDerivedReferrer_TaskList", sq); }

    public Map<String, TaskCQ> xdfgetTaskStatusCode_QueryDerivedReferrer_TaskList() { return xgetSQueMap("taskStatusCode_QueryDerivedReferrer_TaskList"); }
    public String keepTaskStatusCode_QueryDerivedReferrer_TaskList(TaskCQ sq) { return xkeepSQue("taskStatusCode_QueryDerivedReferrer_TaskList", sq); }
    public Map<String, Object> xdfgetTaskStatusCode_QueryDerivedReferrer_TaskListParameter() { return xgetSQuePmMap("taskStatusCode_QueryDerivedReferrer_TaskList"); }
    public String keepTaskStatusCode_QueryDerivedReferrer_TaskListParameter(Object pm) { return xkeepSQuePm("taskStatusCode_QueryDerivedReferrer_TaskList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * TASK_STATUS_CODE: {PK, NotNull, CHAR(3), classification=TaskStatus}
     * @return this. (NotNull)
     */
    public BsTaskStatusCQ addOrderBy_TaskStatusCode_Asc() { regOBA("TASK_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br>
     * TASK_STATUS_CODE: {PK, NotNull, CHAR(3), classification=TaskStatus}
     * @return this. (NotNull)
     */
    public BsTaskStatusCQ addOrderBy_TaskStatusCode_Desc() { regOBD("TASK_STATUS_CODE"); return this; }

    protected ConditionValue _taskStatusName;
    public ConditionValue xdfgetTaskStatusName()
    { if (_taskStatusName == null) { _taskStatusName = nCV(); }
      return _taskStatusName; }
    protected ConditionValue xgetCValueTaskStatusName() { return xdfgetTaskStatusName(); }

    /** 
     * Add order-by as ascend. <br>
     * TASK_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsTaskStatusCQ addOrderBy_TaskStatusName_Asc() { regOBA("TASK_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * TASK_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsTaskStatusCQ addOrderBy_TaskStatusName_Desc() { regOBD("TASK_STATUS_NAME"); return this; }

    protected ConditionValue _description;
    public ConditionValue xdfgetDescription()
    { if (_description == null) { _description = nCV(); }
      return _description; }
    protected ConditionValue xgetCValueDescription() { return xdfgetDescription(); }

    /** 
     * Add order-by as ascend. <br>
     * DESCRIPTION: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsTaskStatusCQ addOrderBy_Description_Asc() { regOBA("DESCRIPTION"); return this; }

    /**
     * Add order-by as descend. <br>
     * DESCRIPTION: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsTaskStatusCQ addOrderBy_Description_Desc() { regOBD("DESCRIPTION"); return this; }

    protected ConditionValue _displayOrder;
    public ConditionValue xdfgetDisplayOrder()
    { if (_displayOrder == null) { _displayOrder = nCV(); }
      return _displayOrder; }
    protected ConditionValue xgetCValueDisplayOrder() { return xdfgetDisplayOrder(); }

    /** 
     * Add order-by as ascend. <br>
     * DISPLAY_ORDER: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsTaskStatusCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br>
     * DISPLAY_ORDER: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsTaskStatusCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsTaskStatusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsTaskStatusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, TaskStatusCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(TaskStatusCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, TaskStatusCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(TaskStatusCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, TaskStatusCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(TaskStatusCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, TaskStatusCQ> _myselfExistsMap;
    public Map<String, TaskStatusCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(TaskStatusCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, TaskStatusCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(TaskStatusCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return TaskStatusCB.class.getName(); }
    protected String xCQ() { return TaskStatusCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
