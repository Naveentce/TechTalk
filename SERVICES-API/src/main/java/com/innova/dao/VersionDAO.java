package com.innova.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.innova.entity.VersionEntity;

@Repository
public interface VersionDAO extends CrudRepository<VersionEntity, Long>{

	
}
