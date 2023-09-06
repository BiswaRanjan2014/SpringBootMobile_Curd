package com.dakr.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = " MobileDtl ")
public class MobileEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mid;
	private String mname;
	private String compny;
	
	//Setter and getter method::
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getCompny() {
		return compny;  
	}
	public void setCompny(String compny) {
		this.compny = compny;
	}
	
	//Noargconstructor::
	public MobileEntity() {
		
	}

}
