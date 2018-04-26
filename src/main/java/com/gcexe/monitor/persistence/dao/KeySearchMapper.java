package com.gcexe.monitor.persistence.dao;

import java.util.List;
import java.util.Map;

import com.gcexe.monitor.persistence.entity.KeySearch;

public interface KeySearchMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table key_search
     *
     * @mbggenerated Wed Apr 25 16:28:44 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table key_search
     *
     * @mbggenerated Wed Apr 25 16:28:44 CST 2018
     */
    int insert(KeySearch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table key_search
     *
     * @mbggenerated Wed Apr 25 16:28:44 CST 2018
     */
    int insertSelective(KeySearch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table key_search
     *
     * @mbggenerated Wed Apr 25 16:28:44 CST 2018
     */
    KeySearch selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table key_search
     *
     * @mbggenerated Wed Apr 25 16:28:44 CST 2018
     */
    int updateByPrimaryKeySelective(KeySearch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table key_search
     *
     * @mbggenerated Wed Apr 25 16:28:44 CST 2018
     */
    int updateByPrimaryKey(KeySearch record);
    
    List<KeySearch> search(Map<String,Object> map);
    
    int getRowCount();
    
    
    
    
    
    
    
    
    
    
    
    
}