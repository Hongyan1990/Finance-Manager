package com.financemanager.dao;

import java.util.List;

import com.financemanager.po.BaseModel;
import com.financemanager.po.ManagerModel;

public interface ManagerMapper {
	int addManager(ManagerModel manager);
	ManagerModel queryManagerById(int id);
	List<ManagerModel> queryManagers(BaseModel baseModel);
	int queryManagerCount(BaseModel param);
	void updateManager(ManagerModel manager);
}
