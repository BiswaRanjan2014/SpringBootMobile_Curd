package com.dakr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.entity.MobileEntity;
import com.dakr.repository.MobileRepo;

@Service
public class MobileServiceImpl implements MobileService{

	@Autowired
	private MobileRepo repo;
	
	@Override
	public String insertMObData(MobileEntity mob) {
		
		repo.save(mob);
		String stmt="";
		if(mob==null)
		{
			stmt="Data Is Failed To Insert...";
		}
		else
		{
			stmt="Data Is Inserted Successfully....";
		}
		return stmt;
	}

	@Override
	public Optional<MobileEntity> retriveData(Integer mid) {
		
		 return repo.findById(mid);
	}
	
	@Override
	public List<MobileEntity> retriveAllData() {
		
		return repo.findAll();
	}


	@Override
	public String updateData(MobileEntity mid) {
		repo.save(mid);
		String stmt="";
		if(mid==null)
		{
			stmt="Data Is Failed To Updat...";
		}
		else
		{
			stmt="Data Is Updated Successfully....";
		}
		return stmt;
	}

	@Override
	public String deleteData(Integer mid) {
		String stmt="";
		if(mid==null)
		{
			stmt="Data Is Failed To Delete for Invalid id";
		}
		else
		{
			repo.deleteById(mid);
			stmt="Data is Deleted Successfully";
		}
		return stmt;
	}

}
