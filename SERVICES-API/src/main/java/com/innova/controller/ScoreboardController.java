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

import com.innova.dao.RatingsDAO;
import com.innova.entity.RatingsEntity;
import com.innova.entity.TeamDetailsEntity;

@RestController
@CrossOrigin(origins= "http://localhost:4200")
public class ScoreboardController {

	@Autowired
	private RatingsDAO ratingsDAO;
	
	@ResponseBody
	@GetMapping("/score")
	public Iterable<RatingsEntity> getscore(){
		List <RatingsEntity> all = (List<RatingsEntity>) ratingsDAO.findAll();
		return all;
		    
	}

}



