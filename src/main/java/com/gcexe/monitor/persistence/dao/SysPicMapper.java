package com.gcexe.monitor.persistence.dao;

import java.util.List;
import java.util.Map;

import com.gcexe.monitor.persistence.entity.SysPic;

public interface SysPicMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_pic
	 * @mbggenerated  Wed Apr 25 19:24:06 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_pic
	 * @mbggenerated  Wed Apr 25 19:24:06 CST 2018
	 */
	int insert(SysPic record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_pic
	 * @mbggenerated  Wed Apr 25 19:24:06 CST 2018
	 */
	int insertSelective(SysPic record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_pic
	 * @mbggenerated  Wed Apr 25 19:24:06 CST 2018
	 */
	SysPic selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_pic
	 * @mbggenerated  Wed Apr 25 19:24:06 CST 2018
	 */
	int updateByPrimaryKeySelective(SysPic record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_pic
	 * @mbggenerated  Wed Apr 25 19:24:06 CST 2018
	 */
	int updateByPrimaryKeyWithBLOBs(SysPic record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_pic
	 * @mbggenerated  Wed Apr 25 19:24:06 CST 2018
	 */
	int updateByPrimaryKey(SysPic record);

	List<SysPic> search(Map<String,Object> map);
    
    
    
    
    
    
    
    
    
    
    
    
    
}