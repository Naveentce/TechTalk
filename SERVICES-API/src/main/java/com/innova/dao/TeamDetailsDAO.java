package com.innova.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.innova.entity.TeamDetailsEntity;

@Repository
public interface TeamDetailsDAO extends CrudRepository<TeamDetailsEntity, Long> {

   // public List<TeamDetailsEntity> findByFullNameLike(String name);

//    public List<TeamDetailsEntity> findByDateOfBirthGreaterThan(Date date);

}