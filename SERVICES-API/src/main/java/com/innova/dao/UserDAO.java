package com.innova.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.innova.entity.UserEntity;

@Repository
public interface UserDAO extends CrudRepository<UserEntity, Long>{
	
	

}
