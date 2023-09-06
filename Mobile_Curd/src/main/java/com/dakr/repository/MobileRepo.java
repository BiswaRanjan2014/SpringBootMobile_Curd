package com.dakr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dakr.entity.MobileEntity;

@Repository
public interface MobileRepo extends JpaRepository<MobileEntity, Integer> {

}
