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
 * The entity of TASK as TABLE. <br>
 * <pre>
 * [primary-key]
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long taskId = entity.getTaskId();
 * String description = entity.getDescription();
 * String doneFlg = entity.getDoneFlg();
 * entity.setTaskId(taskId);
 * entity.setDescription(description);
 * entity.setDoneFlg(doneFlg);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTask extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TASK_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _taskId;

    /** DESCRIPTION: {NotNull, TEXT(65535)} */
    protected String _description;

    /** DONE_FLG: {NotNull, CHAR(1), classification=Flg} */
    protected String _doneFlg;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "TASK";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_taskId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of doneFlg as the classification of Flg. <br>
     * DONE_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Flg getDoneFlgAsFlg() {
        return CDef.Flg.codeOf(getDoneFlg());
    }

    /**
     * Set the value of doneFlg as the classification of Flg. <br>
     * DONE_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDoneFlgAsFlg(CDef.Flg cdef) {
        setDoneFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Set the value of doneFlg as boolean. <br>
     * DONE_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param determination The determination, true or false. (NullAllowed: if null, null value is set to the column)
     */
    public void setDoneFlgAsBoolean(Boolean determination) {
        setDoneFlgAsFlg(CDef.Flg.codeOf(determination));
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of doneFlg as True (1). <br>
     * Checked: means yes
     */
    public void setDoneFlg_True() {
        setDoneFlgAsFlg(CDef.Flg.True);
    }

    /**
     * Set the value of doneFlg as False (0). <br>
     * Unchecked: means no
     */
    public void setDoneFlg_False() {
        setDoneFlgAsFlg(CDef.Flg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of doneFlg True? <br>
     * Checked: means yes
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDoneFlgTrue() {
        CDef.Flg cdef = getDoneFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.True) : false;
    }

    /**
     * Is the value of doneFlg False? <br>
     * Unchecked: means no
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDoneFlgFalse() {
        CDef.Flg cdef = getDoneFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.False) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'doneFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDoneFlgName() {
        CDef.Flg cdef = getDoneFlgAsFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'doneFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getDoneFlgAlias() {
        CDef.Flg cdef = getDoneFlgAsFlg();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTask) {
            BsTask other = (BsTask)obj;
            if (!xSV(_taskId, other._taskId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _taskId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_taskId));
        sb.append(dm).append(xfND(_description));
        sb.append(dm).append(xfND(_doneFlg));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public Task clone() {
        return (Task)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TASK_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'TASK_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTaskId() {
        checkSpecifiedProperty("taskId");
        return _taskId;
    }

    /**
     * [set] TASK_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param taskId The value of the column 'TASK_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTaskId(Long taskId) {
        registerModifiedProperty("taskId");
        _taskId = taskId;
    }

    /**
     * [get] DESCRIPTION: {NotNull, TEXT(65535)} <br>
     * @return The value of the column 'DESCRIPTION'. (basically NotNull if selected: for the constraint)
     */
    public String getDescription() {
        checkSpecifiedProperty("description");
        return convertEmptyToNull(_description);
    }

    /**
     * [set] DESCRIPTION: {NotNull, TEXT(65535)} <br>
     * @param description The value of the column 'DESCRIPTION'. (basically NotNull if update: for the constraint)
     */
    public void setDescription(String description) {
        registerModifiedProperty("description");
        _description = description;
    }

    /**
     * [get] DONE_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * @return The value of the column 'DONE_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDoneFlg() {
        checkSpecifiedProperty("doneFlg");
        return convertEmptyToNull(_doneFlg);
    }

    /**
     * [set] DONE_FLG: {NotNull, CHAR(1), classification=Flg} <br>
     * @param doneFlg The value of the column 'DONE_FLG'. (basically NotNull if update: for the constraint)
     */
    protected void setDoneFlg(String doneFlg) {
        checkClassificationCode("DONE_FLG", CDef.DefMeta.Flg, doneFlg);
        registerModifiedProperty("doneFlg");
        _doneFlg = doneFlg;
    }

    /**
     * For framework so basically DON'T use this method.
     * @param doneFlg The value of the column 'DONE_FLG'. (basically NotNull if update: for the constraint)
     */
    public void mynativeMappingDoneFlg(String doneFlg) {
        setDoneFlg(doneFlg);
    }
}
