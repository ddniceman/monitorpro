package com.gcexe.monitor.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcexe.monitor.persistence.dao.PicSearchMapper;
import com.gcexe.monitor.persistence.dao.SysPicMapper;
import com.gcexe.monitor.persistence.entity.PicSearch;
import com.gcexe.monitor.persistence.entity.SysPic;
import com.gcexe.monitor.utils.ResultCodeVo;

@Service
public class PicServiceImpl extends BaseServiceCompnent implements PicService {

	@Autowired
	private SysPicMapper sysPicMapper;
	@Autowired
	private PicSearchMapper picSearchMapp;

	@Override
	public ResultCodeVo insert(String json) {
		// 封装json
		// 封装对象
		SysPic sysPic = new SysPic();
		// 执行添加
		int cnt = sysPicMapper.insertSelective(sysPic);
		if (cnt > 0) {
			// 获取监控数据
			PicSearch picSearch = this.getPicData();
			// 持久化保存
			int datacnt = picSearchMapp.insertSelective(picSearch);
			if (datacnt > 0) {
				return new ResultCodeVo(true, 0, "success", null);
			}
		}
		return new ResultCodeVo(false, -1, "failed", null);
	}

	public ResultCodeVo selectbyid(String json) {
		// 封装json 获取id
		Integer id = 0;
		SysPic sysPic = sysPicMapper.selectByPrimaryKey(id);
		return new ResultCodeVo(true, 0, "success", sysPic);
	}

	public ResultCodeVo update(String json) {
		// 封装json
		// 封装对象
		SysPic sysPic = new SysPic();
		int cnt = sysPicMapper.updateByPrimaryKeySelective(sysPic);
		if (cnt > 0) {
			return new ResultCodeVo(true, 0, "success", null);
		}
		return new ResultCodeVo(false, -1, "failed", null);
	}

	public ResultCodeVo delete(String json) {
		// 封装json 获取id
		Integer id = 0;
		int cnt = sysPicMapper.deleteByPrimaryKey(id);
		if (cnt > 0) {
			return new ResultCodeVo(true, 0, "success", null);
		}
		return new ResultCodeVo(false, -1, "failed", null);
	}

	@Override
	public ResultCodeVo search(String json) {
		// 封装json
		// 设定参数主要是分页
		Map<String, Object> map = new HashMap<String, Object>();
		return new ResultCodeVo(true, 0, "success", sysPicMapper.search(map));
	}

	@Override
	public ResultCodeVo searchdata(String json) {
		// 封装json
		// 设定参数主要是分页
		Map<String, Object> map = new HashMap<String, Object>();
		return new ResultCodeVo(true, 0, "success", this.picSearchMapp.search(map));
	}

}
