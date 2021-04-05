package com.financemanager.dao;

import java.util.List;
import java.util.Map;

import com.financemanager.po.BatchInfo;

public interface BatchMapper {
	List<Map<String, Object>> queryBtachBook(int carId);
	
	int addBatch(BatchInfo batchInfo);
	
	int updateBatch(BatchInfo batchInfo);
	
	void deleteBatch(int batchId);
}
