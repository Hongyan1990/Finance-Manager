package com.financemanager.service;

import com.financemanager.po.BaseModel;
import com.financemanager.po.ManagerModel;
import com.financemanager.po.ResBaseModel;

public interface ManagerService {
	int addManager(ManagerModel manager);
	ManagerModel queryManagerById(int id);
	ResBaseModel queryManagers(BaseModel param);
	int queryManagerCount(BaseModel param);
	void updateManager(ManagerModel manager);
}
