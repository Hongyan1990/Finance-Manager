package com.financemanager.dao;

import com.financemanager.po.CarModel;

public interface CarMapper {
	CarModel queryDoCar(int uId);
	int addCar(CarModel carModel);
	int updateCar(CarModel carModel);
	
}
