package com.innova.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innova.entity.RatingsEntity;

@Repository
public interface RatingsDAO extends JpaRepository<RatingsEntity, Long> {
	
	

}
