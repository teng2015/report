package com.gfan.report.frame.dao;

import com.gfan.report.frame.module.UiFwModule;
import com.gfan.report.frame.module.UiFwModuleExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class UiFwModuleDAOImpl extends SqlMapClientDaoSupport implements UiFwModuleDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    public UiFwModuleDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    public int countByExample(UiFwModuleExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("UI_FW_MODULE.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    public int deleteByExample(UiFwModuleExample example) {
        int rows = getSqlMapClientTemplate().delete("UI_FW_MODULE.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    public int deleteByPrimaryKey(Integer id) {
        UiFwModule key = new UiFwModule();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("UI_FW_MODULE.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    public void insert(UiFwModule record) {
        getSqlMapClientTemplate().insert("UI_FW_MODULE.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    public void insertSelective(UiFwModule record) {
        getSqlMapClientTemplate().insert("UI_FW_MODULE.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    public List selectByExample(UiFwModuleExample example) {
        List list = getSqlMapClientTemplate().queryForList("UI_FW_MODULE.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    public UiFwModule selectByPrimaryKey(Integer id) {
        UiFwModule key = new UiFwModule();
        key.setId(id);
        UiFwModule record = (UiFwModule) getSqlMapClientTemplate().queryForObject("UI_FW_MODULE.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    public int updateByExampleSelective(UiFwModule record, UiFwModuleExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("UI_FW_MODULE.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    public int updateByExample(UiFwModule record, UiFwModuleExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("UI_FW_MODULE.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    public int updateByPrimaryKeySelective(UiFwModule record) {
        int rows = getSqlMapClientTemplate().update("UI_FW_MODULE.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    public int updateByPrimaryKey(UiFwModule record) {
        int rows = getSqlMapClientTemplate().update("UI_FW_MODULE.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table UI_FW_MODULE
     *
     * @ibatorgenerated Thu Sep 25 15:11:52 CST 2014
     */
    private static class UpdateByExampleParms extends UiFwModuleExample {
        private Object record;

        public UpdateByExampleParms(Object record, UiFwModuleExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }

	@Override
	public List selectByUserId(Integer userId) {
		UiFwModule key = new UiFwModule();
        key.setId(userId);
        List list = getSqlMapClientTemplate().queryForList("UI_FW_MODULE.ibatorgenerated_selectByUserId", key);
        return list;
	}
}