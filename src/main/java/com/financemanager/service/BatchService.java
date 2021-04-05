package com.financemanager.service;

import java.util.List;
import java.util.Map;

import com.financemanager.po.BatchInfo;
import com.financemanager.po.CarModel;

public interface BatchService {
	List<Map<String, Object>> queryBtachBook(int carId);
	
	int addBatch(BatchInfo batchInfo);
	
	int updateBatch(BatchInfo batchInfo);
	
	void deleteBatch(int batchId);
	
	CarModel queryDoCar(int uId);
}
