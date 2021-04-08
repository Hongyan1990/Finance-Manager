package com.financemanager.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.financemanager.po.Family;
import com.financemanager.service.FamilyService;

@Controller
public class FamilyController {
	@Autowired
	FamilyService familyService;
	// 根据id查询家庭
	@RequestMapping(value="/family/{fid}", method= {RequestMethod.GET})
	@ResponseBody
	public List<Family> queryFamilyInfo(ModelMap modelMap, @PathVariable int fid) {
		Map<String, Integer> param = new HashMap<String, Integer>();
		param.put("fid", fid);
		List<Family> familys = familyService.selectFimaly(param);
		return familys;
	}
	
	@RequestMapping(value="/family", method= {RequestMethod.GET})
	@ResponseBody
	public List<Family> queryFamilysInfo(ModelMap modelMap) {
		Map<String, Integer> param = new HashMap<String, Integer>();
		param.put("fid", null);
		List<Family> familys = familyService.selectFimaly(param);
		return familys;
	}
	
	@RequestMapping(value="/family", method= {RequestMethod.POST} )
	@ResponseBody
	public Map<String, Integer> addFamily(Model model, @RequestBody Family family) {
		familyService.addFamily(family);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("fid", family.getFid());
		return map;
	}
	
	@RequestMapping(value="/member", method= {RequestMethod.POST} )
	@ResponseBody
	public Map<String, Integer> addMember(Model model, @RequestBody Map<String, Object> member) {
		int mid = familyService.addMember(member);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("mid", mid);
		return map;
	}
	
	@RequestMapping(value="/member", method= {RequestMethod.DELETE} )
	@ResponseBody
	public Map<String, String> removeMember(Model model, @RequestBody Map<String, Object> member) {
		familyService.removeMember(member);
		Map<String, String> map = new HashMap<String, String>();
		map.put("mid", "SUCCESS");
		return map;
	}
}
