package com.financemanager.service.Impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.financemanager.dao.FamilyMapper;
import com.financemanager.po.Family;
import com.financemanager.service.FamilyService;

@Service("familyService")
public class FamilyServiceImpl implements FamilyService {
	@Autowired
	FamilyMapper familyMapper;

	public List<Family> selectFimaly(Map<String, Integer> param) {
		return familyMapper.selectFimaly(param);
	}

	public int addFamily(Family family) {
		Date date = new Date();
		family.setCreateTime(date);
		return familyMapper.addFamily(family);
	}

	public void updateFamily(Family family) {
		// TODO Auto-generated method stub

	}

}
