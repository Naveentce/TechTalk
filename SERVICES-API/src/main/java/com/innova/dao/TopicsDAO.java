package com.innova.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.innova.entity.TopicsEntity;

@Repository
public interface TopicsDAO extends CrudRepository<TopicsEntity, Long> {

	public List<TopicsEntity> findByTitleLike(String name);
	

}
