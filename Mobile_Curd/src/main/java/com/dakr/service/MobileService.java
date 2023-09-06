package com.dakr.service;

import java.util.List;
import java.util.Optional;

import com.dakr.entity.MobileEntity;

public interface MobileService {

	String insertMObData(MobileEntity mob);
	
	Optional<MobileEntity> retriveData(Integer mid);
	
	String updateData(MobileEntity mid);
	
	String deleteData(Integer mid);
	
	List<MobileEntity> retriveAllData();


}
