package com.innova.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.innova.BO.RatingsBO;
import com.innova.dao.VersionDAO;
import com.innova.entity.TopicsEntity;
import com.innova.entity.VersionEntity;

@RestController
@CrossOrigin
public class VersionController {

	@Autowired
	private VersionDAO versionDAO;
	
	@ResponseBody
	@GetMapping("/version")
	private List<VersionEntity> index(){
		return null;
		
	}
	
}
