package com.gcexe.monitor.persistence.dao;

import java.util.List;
import java.util.Map;

import com.gcexe.monitor.persistence.entity.IPData;


public interface IPDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ip_data
     *
     * @mbggenerated Wed Apr 25 16:28:44 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ip_data
     *
     * @mbggenerated Wed Apr 25 16:28:44 CST 2018
     */
    int insert(IPData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ip_data
     *
     * @mbggenerated Wed Apr 25 16:28:44 CST 2018
     */
    int insertSelective(IPData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ip_data
     *
     * @mbggenerated Wed Apr 25 16:28:44 CST 2018
     */
    IPData selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ip_data
     *
     * @mbggenerated Wed Apr 25 16:28:44 CST 2018
     */
    int updateByPrimaryKeySelective(IPData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ip_data
     *
     * @mbggenerated Wed Apr 25 16:28:44 CST 2018
     */
    int updateByPrimaryKey(IPData record);
    
    
    /**
	 * 查询
	 */
	public List<IPData> search(Map<String,Object> map);
    
	public int getRowCount();
    
    
    
    
    
    
    
    
    
}