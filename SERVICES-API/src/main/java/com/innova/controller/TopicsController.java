package com.innova.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.innova.dao.TopicsDAO;
import com.innova.entity.TeamDetailsEntity;
import com.innova.entity.TopicsEntity;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class TopicsController {
	
	@Autowired
	private TopicsDAO topicsDAO;
	
	@ResponseBody
	@GetMapping("/topics")
	public Iterable<TopicsEntity> sec(){
		List<TopicsEntity> topics = (List<TopicsEntity>) topicsDAO.findAll();

		return topics;
		
	}

}
