package com.innova.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.innova.dao.TechTalkTeamsDAO;
import com.innova.entity.TechTalkTeamsEntity;

@RestController
@CrossOrigin
public class TechTalkTeamsController {
	
	@Autowired
	private TechTalkTeamsDAO techTalkTeamsDAO;
	
	@ResponseBody
	@GetMapping("/teams")
	private List<TechTalkTeamsEntity> cont(){
		return null;
	}

}
