package com.financemanager.service;

import java.util.List;
import java.util.Map;

import com.financemanager.po.OrderModel;
import com.financemanager.po.ResBaseModel;

public interface OrderService {
	ResBaseModel queryOrder(Map<String, Object> order);
	ResBaseModel addOrder(Map<String, Object> order);
	ResBaseModel updateOrder(Map<String, Object> order);
}
