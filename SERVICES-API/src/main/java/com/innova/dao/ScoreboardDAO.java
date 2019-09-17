package com.innova.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.innova.entity.ScoreboardEntity;
import com.innova.entity.TeamDetailsEntity;

@Repository
public interface ScoreboardDAO extends CrudRepository<ScoreboardEntity, Long> {

//    public List<ScoreboardEntity> findByScoreLike(String name);
}
