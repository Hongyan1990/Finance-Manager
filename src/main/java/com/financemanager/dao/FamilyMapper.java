package com.financemanager.dao;

import java.util.List;
import java.util.Map;

import com.financemanager.po.Family;

public interface FamilyMapper {
	List<Family> selectFimaly(Map<String, Integer> param);
	
	int addFamily(Family family);
	
	void updateFamily(Family family);
}
