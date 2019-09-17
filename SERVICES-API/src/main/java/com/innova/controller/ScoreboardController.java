package com.innova.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.innova.dao.ScoreboardDAO;
import com.innova.entity.ScoreboardEntity;
import com.innova.entity.TeamDetailsEntity;
import com.innova.entity.TopicsEntity;

@RestController
//@CrossOrigin(origins= "http://localhost:4200")
public class ScoreboardController {
	
	@Autowired
	private ScoreboardDAO scoreboardDAO;
	
	@ResponseBody
	@PostMapping("/score")
	public ResponseEntity<String> save(@RequestBody ScoreboardEntity scoreboard){
		scoreboardDAO.save(scoreboard);
		return new ResponseEntity<String>(HttpStatus.OK);
		    
	}

}


