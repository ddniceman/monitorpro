package com.gcexe.monitor.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcexe.monitor.persistence.dao.KeySearchMapper;
import com.gcexe.monitor.persistence.dao.SysKeyMapper;
import com.gcexe.monitor.persistence.entity.KeySearch;
import com.gcexe.monitor.persistence.entity.SysIP;
import com.gcexe.monitor.persistence.entity.SysKey;
import com.gcexe.monitor.utils.ResultCodeVo;

@Service
public class KeyServiceImpl extends BaseServiceCompnent implements KeyService {

	@Autowired
	private SysKeyMapper sysKeyMapper;
	@Autowired
	private KeySearchMapper keySearchMapper;

	public ResultCodeVo insert(String json) {
		// 封装json
		// 封装对象
		SysKey sysKey = new SysKey();
		// 执行添加
		int cnt = sysKeyMapper.insertSelective(sysKey);
		if (cnt > 0) {
			// 获取监控数据
			KeySearch keySearch = this.getKeyData();
			// 持久化保存
			int datacnt = keySearchMapper.insertSelective(keySearch);
			if (datacnt > 0) {
				return new ResultCodeVo(true, 0, "success", null);
			}
		}
		return new ResultCodeVo(false, -1, "failed", null);
	}

	public ResultCodeVo selectbyid(String json) {
		// 封装json 获取id
		Integer id = 0;
		SysKey sysKey = sysKeyMapper.selectByPrimaryKey(id);
		return new ResultCodeVo(true, 0, "success", sysKey);
	}

	public ResultCodeVo update(String json) {
		// 封装json
		// 封装对象
		SysKey sysKey = new SysKey();
		int cnt = sysKeyMapper.updateByPrimaryKeySelective(sysKey);
		if (cnt > 0) {
			return new ResultCodeVo(true, 0, "success", null);
		}
		return new ResultCodeVo(false, -1, "failed", null);
	}

	public ResultCodeVo delete(String json) {
		// 封装json 获取id
		Integer id = 0;
		int cnt = sysKeyMapper.deleteByPrimaryKey(id);
		if (cnt > 0) {
			return new ResultCodeVo(true, 0, "success", null);
		}
		return new ResultCodeVo(false, -1, "failed", null);
	}

	public ResultCodeVo search(String json) {
		// 封装json
		// 设定参数主要是分页
		Map<String, Object> map = new HashMap<String, Object>();
		return new ResultCodeVo(true, 0, "success", sysKeyMapper.search(map));
	}

	public ResultCodeVo searchdata(String json) {

		// 封装json
		// 设定参数主要是分页
		Map<String, Object> map = new HashMap<String, Object>();
		return new ResultCodeVo(true, 0, "success", this.keySearchMapper.search(map));
	}

	public ResultCodeVo keyorder(String json) {
		return new ResultCodeVo(true, 0, "success", this.sysKeyMapper.keyorder());
	}

	public ResultCodeVo siteorder(String json) {
		return new ResultCodeVo(true, 0, "success", this.sysKeyMapper.siteorder());
	}

	public ResultCodeVo map(String json) {
		return new ResultCodeVo(true, 0, "success", this.sysKeyMapper.map());
	}

}
