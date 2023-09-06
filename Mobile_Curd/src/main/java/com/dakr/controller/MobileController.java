package com.dakr.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.entity.MobileEntity;
import com.dakr.service.MobileService;

@RestController
public class MobileController {

	@Autowired
	private MobileService ser;
	
	//Inserting Data::
		@PostMapping("/insert")
		public String setData(@RequestBody MobileEntity mob) {
	       return ser.insertMObData(mob);
	    }
		
		//Retrive Data Id (Single Row of Table By Given Id)::
		@GetMapping("/retrive")
		public Optional<MobileEntity> retriveData(@RequestParam Integer mid) {
			return ser.retriveData(mid);
			
		}
		
		//Retrive All Data (Complete Data of the Table)::
		@GetMapping("/retriveall")
		public List<MobileEntity> retriveAll(){
	        return ser.retriveAllData();
		}
		
		//Update Data::
		@PutMapping("/update")
		public String updateData(@RequestBody MobileEntity mid ) {
			return ser.updateData(mid);
			
		}	
			
		//Delete Data::
		@DeleteMapping("/delete")
		public String deleteData(@RequestParam Integer mid) {
			return ser.deleteData(mid);
			
		}
}
