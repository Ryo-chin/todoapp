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
package org.todoapp.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.todoapp.dbflute.allcommon.DBMetaInstanceHandler;
import org.todoapp.dbflute.allcommon.CDef;
import org.todoapp.dbflute.exentity.*;

/**
 * The entity of TASK_STATUS as TABLE. <br>
 * <pre>
 * [primary-key]
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String taskStatusCode = entity.getTaskStatusCode();
 * String taskStatusName = entity.getTaskStatusName();
 * String description = entity.getDescription();
 * Integer displayOrder = entity.getDisplayOrder();
 * entity.setTaskStatusCode(taskStatusCode);
 * entity.setTaskStatusName(taskStatusName);
 * entity.setDescription(description);
 * entity.setDisplayOrder(displayOrder);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTaskStatus extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TASK_STATUS_CODE: {PK, NotNull, CHAR(3), classification=TaskStatus} */
    protected String _taskStatusCode;

    /** TASK_STATUS_NAME: {NotNull, VARCHAR(50)} */
    protected String _taskStatusName;

    /** DESCRIPTION: {NotNull, VARCHAR(200)} */
    protected String _description;

    /** DISPLAY_ORDER: {NotNull, INT(10)} */
    protected Integer _displayOrder;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "TASK_STATUS";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_taskStatusCode == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of taskStatusCode as the classification of TaskStatus. <br>
     * TASK_STATUS_CODE: {PK, NotNull, CHAR(3), classification=TaskStatus} <br>
     * status of task
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.TaskStatus getTaskStatusCodeAsTaskStatus() {
        return CDef.TaskStatus.codeOf(getTaskStatusCode());
    }

    /**
     * Set the value of taskStatusCode as the classification of TaskStatus. <br>
     * TASK_STATUS_CODE: {PK, NotNull, CHAR(3), classification=TaskStatus} <br>
     * status of task
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setTaskStatusCodeAsTaskStatus(CDef.TaskStatus cdef) {
        setTaskStatusCode(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of taskStatusCode as NotStartedYet (YET). <br>
     * NotStartedYet: 未着手
     */
    public void setTaskStatusCode_NotStartedYet() {
        setTaskStatusCodeAsTaskStatus(CDef.TaskStatus.NotStartedYet);
    }

    /**
     * Set the value of taskStatusCode as WorkInProgress2 (WIP). <br>
     * WorkInProgress2: 進行中
     */
    public void setTaskStatusCode_WorkInProgress2() {
        setTaskStatusCodeAsTaskStatus(CDef.TaskStatus.WorkInProgress2);
    }

    /**
     * Set the value of taskStatusCode as Completed (CMP). <br>
     * Completed: 完了
     */
    public void setTaskStatusCode_Completed() {
        setTaskStatusCodeAsTaskStatus(CDef.TaskStatus.Completed);
    }

    /**
     * Set the value of taskStatusCode as Deleted (DEL). <br>
     * Deleted: 削除
     */
    public void setTaskStatusCode_Deleted() {
        setTaskStatusCodeAsTaskStatus(CDef.TaskStatus.Deleted);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of taskStatusCode NotStartedYet? <br>
     * NotStartedYet: 未着手
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTaskStatusCodeNotStartedYet() {
        CDef.TaskStatus cdef = getTaskStatusCodeAsTaskStatus();
        return cdef != null ? cdef.equals(CDef.TaskStatus.NotStartedYet) : false;
    }

    /**
     * Is the value of taskStatusCode WorkInProgress2? <br>
     * WorkInProgress2: 進行中
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTaskStatusCodeWorkInProgress2() {
        CDef.TaskStatus cdef = getTaskStatusCodeAsTaskStatus();
        return cdef != null ? cdef.equals(CDef.TaskStatus.WorkInProgress2) : false;
    }

    /**
     * Is the value of taskStatusCode Completed? <br>
     * Completed: 完了
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTaskStatusCodeCompleted() {
        CDef.TaskStatus cdef = getTaskStatusCodeAsTaskStatus();
        return cdef != null ? cdef.equals(CDef.TaskStatus.Completed) : false;
    }

    /**
     * Is the value of taskStatusCode Deleted? <br>
     * Deleted: 削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isTaskStatusCodeDeleted() {
        CDef.TaskStatus cdef = getTaskStatusCodeAsTaskStatus();
        return cdef != null ? cdef.equals(CDef.TaskStatus.Deleted) : false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** TASK by TASK_STATUS_CODE, named 'taskList'. */
    protected List<Task> _taskList;

    /**
     * [get] TASK by TASK_STATUS_CODE, named 'taskList'.
     * @return The entity list of referrer property 'taskList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Task> getTaskList() {
        if (_taskList == null) { _taskList = newReferrerList(); }
        return _taskList;
    }

    /**
     * [set] TASK by TASK_STATUS_CODE, named 'taskList'.
     * @param taskList The entity list of referrer property 'taskList'. (NullAllowed)
     */
    public void setTaskList(List<Task> taskList) {
        _taskList = taskList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTaskStatus) {
            BsTaskStatus other = (BsTaskStatus)obj;
            if (!xSV(_taskStatusCode, other._taskStatusCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _taskStatusCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_taskList != null) { for (Task et : _taskList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "taskList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_taskStatusCode));
        sb.append(dm).append(xfND(_taskStatusName));
        sb.append(dm).append(xfND(_description));
        sb.append(dm).append(xfND(_displayOrder));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_taskList != null && !_taskList.isEmpty())
        { sb.append(dm).append("taskList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public TaskStatus clone() {
        return (TaskStatus)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TASK_STATUS_CODE: {PK, NotNull, CHAR(3), classification=TaskStatus} <br>
     * @return The value of the column 'TASK_STATUS_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getTaskStatusCode() {
        checkSpecifiedProperty("taskStatusCode");
        return convertEmptyToNull(_taskStatusCode);
    }

    /**
     * [set] TASK_STATUS_CODE: {PK, NotNull, CHAR(3), classification=TaskStatus} <br>
     * @param taskStatusCode The value of the column 'TASK_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    protected void setTaskStatusCode(String taskStatusCode) {
        checkClassificationCode("TASK_STATUS_CODE", CDef.DefMeta.TaskStatus, taskStatusCode);
        registerModifiedProperty("taskStatusCode");
        _taskStatusCode = taskStatusCode;
    }

    /**
     * [get] TASK_STATUS_NAME: {NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'TASK_STATUS_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getTaskStatusName() {
        checkSpecifiedProperty("taskStatusName");
        return convertEmptyToNull(_taskStatusName);
    }

    /**
     * [set] TASK_STATUS_NAME: {NotNull, VARCHAR(50)} <br>
     * @param taskStatusName The value of the column 'TASK_STATUS_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setTaskStatusName(String taskStatusName) {
        registerModifiedProperty("taskStatusName");
        _taskStatusName = taskStatusName;
    }

    /**
     * [get] DESCRIPTION: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'DESCRIPTION'. (basically NotNull if selected: for the constraint)
     */
    public String getDescription() {
        checkSpecifiedProperty("description");
        return convertEmptyToNull(_description);
    }

    /**
     * [set] DESCRIPTION: {NotNull, VARCHAR(200)} <br>
     * @param description The value of the column 'DESCRIPTION'. (basically NotNull if update: for the constraint)
     */
    public void setDescription(String description) {
        registerModifiedProperty("description");
        _description = description;
    }

    /**
     * [get] DISPLAY_ORDER: {NotNull, INT(10)} <br>
     * @return The value of the column 'DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDisplayOrder() {
        checkSpecifiedProperty("displayOrder");
        return _displayOrder;
    }

    /**
     * [set] DISPLAY_ORDER: {NotNull, INT(10)} <br>
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayOrder(Integer displayOrder) {
        registerModifiedProperty("displayOrder");
        _displayOrder = displayOrder;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param taskStatusCode The value of the column 'TASK_STATUS_CODE'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingTaskStatusCode(String taskStatusCode) {
        setTaskStatusCode(taskStatusCode);
    }
}
