package com.innova.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.innova.entity.TechTalkTeamsEntity;

@Repository
public interface TechTalkTeamsDAO extends CrudRepository<TechTalkTeamsEntity, Long>{

}
