package com.financemanager.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.financemanager.po.BaseModel;
import com.financemanager.po.BookInfo;
import com.financemanager.po.ManagerModel;
import com.financemanager.po.ResBaseModel;
import com.financemanager.service.ManagerService;

@Controller
public class ManagerController {
	@Autowired
	ManagerService managerService;
	
	// 根据id查询
	@RequestMapping(value="/manager/{id}", method= {RequestMethod.GET})
	@ResponseBody
	public ManagerModel queryManagerInfo(ModelMap modelMap, @PathVariable int id) {
		ManagerModel manager = managerService.queryManagerById(id);
		return manager;
	}
	
	@RequestMapping(value="/manager", method= {RequestMethod.POST} )
	@ResponseBody
	public Map<String, Integer> addManager(Model model, @RequestBody ManagerModel manager) {
		managerService.addManager(manager);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("id", manager.getId());
		return map;
	}
	
	@RequestMapping(value="/manager", method= {RequestMethod.GET})
	@ResponseBody
	public ResBaseModel queryManagers(Model model,@RequestParam Map<String, Object> param) {
		Integer fid = param.get("fid") == null ? null : Integer.parseInt(param.get("fid").toString());
		Integer uid = param.get("uid") == null ? null : Integer.parseInt(param.get("uid").toString());
		Integer pageNo = param.get("pageNo") == null ? null :  Integer.parseInt(param.get("pageNo").toString());
		Integer pageSize = param.get("pageSize") == null ? null :  Integer.parseInt(param.get("pageSize").toString());
		BaseModel manager = new BaseModel();
		manager.setFid(fid);
		manager.setUid(uid);
		manager.setPageNo(pageNo);
		manager.setPageSize(pageSize);
		ResBaseModel res = managerService.queryManagers(manager);
		return res;
	}
	
	@RequestMapping(value="/manager", method= {RequestMethod.PUT})
	@ResponseBody
	public Map<String, String> editManager(Model model, @RequestBody ManagerModel manager) {
		managerService.updateManager(manager);
		Map<String, String> map = new HashMap<String, String>();
		map.put("msg", "SUCCESS");
		return map;
	}
}
