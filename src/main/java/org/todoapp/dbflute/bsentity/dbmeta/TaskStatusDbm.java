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
package org.todoapp.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.todoapp.dbflute.allcommon.*;
import org.todoapp.dbflute.exentity.*;

/**
 * The DB meta of TASK_STATUS. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TaskStatusDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TaskStatusDbm _instance = new TaskStatusDbm();
    private TaskStatusDbm() {}
    public static TaskStatusDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((TaskStatus)et).getTaskStatusCode(), (et, vl) -> {
            CDef.TaskStatus cls = (CDef.TaskStatus)gcls(et, columnTaskStatusCode(), vl);
            if (cls != null) {
                ((TaskStatus)et).setTaskStatusCodeAsTaskStatus(cls);
            } else {
                ((TaskStatus)et).mynativeMappingTaskStatusCode((String)vl);
            }
        }, "taskStatusCode");
        setupEpg(_epgMap, et -> ((TaskStatus)et).getTaskStatusName(), (et, vl) -> ((TaskStatus)et).setTaskStatusName((String)vl), "taskStatusName");
        setupEpg(_epgMap, et -> ((TaskStatus)et).getDescription(), (et, vl) -> ((TaskStatus)et).setDescription((String)vl), "description");
        setupEpg(_epgMap, et -> ((TaskStatus)et).getDisplayOrder(), (et, vl) -> ((TaskStatus)et).setDisplayOrder(cti(vl)), "displayOrder");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "TASK_STATUS";
    protected final String _tableDispName = "TASK_STATUS";
    protected final String _tablePropertyName = "taskStatus";
    protected final TableSqlName _tableSqlName = new TableSqlName("TASK_STATUS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTaskStatusCode = cci("TASK_STATUS_CODE", "TASK_STATUS_CODE", null, null, String.class, "taskStatusCode", null, true, false, true, "CHAR", 3, 0, null, false, null, null, null, "taskList", CDef.DefMeta.TaskStatus, false);
    protected final ColumnInfo _columnTaskStatusName = cci("TASK_STATUS_NAME", "TASK_STATUS_NAME", null, null, String.class, "taskStatusName", null, false, false, true, "VARCHAR", 50, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDescription = cci("DESCRIPTION", "DESCRIPTION", null, null, String.class, "description", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, null, Integer.class, "displayOrder", null, false, false, true, "INT", 10, 0, null, false, null, null, null, null, null, false);

    /**
     * TASK_STATUS_CODE: {PK, NotNull, CHAR(3), classification=TaskStatus}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTaskStatusCode() { return _columnTaskStatusCode; }
    /**
     * TASK_STATUS_NAME: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTaskStatusName() { return _columnTaskStatusName; }
    /**
     * DESCRIPTION: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDescription() { return _columnDescription; }
    /**
     * DISPLAY_ORDER: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnTaskStatusCode());
        ls.add(columnTaskStatusName());
        ls.add(columnDescription());
        ls.add(columnDisplayOrder());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnTaskStatusCode()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * TASK by TASK_STATUS_CODE, named 'taskList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerTaskList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnTaskStatusCode(), TaskDbm.getInstance().columnTaskStatusCode());
        return cri("FK_TASK_TASK_STATUS_TASK_STATUS_CODE", "taskList", this, TaskDbm.getInstance(), mp, false, "taskStatus");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.todoapp.dbflute.exentity.TaskStatus"; }
    public String getConditionBeanTypeName() { return "org.todoapp.dbflute.cbean.TaskStatusCB"; }
    public String getBehaviorTypeName() { return "org.todoapp.dbflute.exbhv.TaskStatusBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TaskStatus> getEntityType() { return TaskStatus.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TaskStatus newEntity() { return new TaskStatus(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TaskStatus)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TaskStatus)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
