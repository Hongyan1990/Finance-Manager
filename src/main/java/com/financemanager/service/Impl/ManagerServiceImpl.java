package com.financemanager.service.Impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financemanager.dao.ManagerMapper;
import com.financemanager.po.BaseModel;
import com.financemanager.po.ManagerModel;
import com.financemanager.po.ResBaseModel;
import com.financemanager.service.ManagerService;

@Service("managerService")
public class ManagerServiceImpl implements ManagerService {
	
	@Autowired
	ManagerMapper managerMapper;

	public int addManager(ManagerModel manager) {
		Date date = new Date();
		manager.setCreateTime(date);
		manager.setUpdateTime(date);
		return managerMapper.addManager(manager);
	}

	public ManagerModel queryManagerById(int id) {
		return managerMapper.queryManagerById(id);
	}

	public ResBaseModel queryManagers(BaseModel param) {
		param.setStartNum(param.getPageNo()>0 ? (param.getPageNo()-1)*param.getPageSize() : 0);
		ResBaseModel res = new ResBaseModel();
		Map<String, Object> page = new HashMap<String, Object>();
		List<ManagerModel> list = managerMapper.queryManagers(param);
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("list", list);
		long count = managerMapper.queryManagerCount(param);
		page.put("pageNo", param.getPageNo());
		page.put("total", count);
		res.setData(data);
		res.setState("SUCCESS");
		res.setPageination(page);
		return res;
	}

	public int queryManagerCount(BaseModel param) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void updateManager(ManagerModel manager) {
		Date date = new Date();
		manager.setUpdateTime(date);
		managerMapper.updateManager(manager);
	}

}
