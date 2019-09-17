//package com.innova.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.innova.dao.RatingsDAO;
//
//@RestController
//public class RatingsController {
//	
//	@Autowired
//	private RatingsDAO ratingsDAO;
//	
//	@ResponseBody
//	@PostMapping("/ratings")
//	public ResponseEntity<String> ratings(@RequestBody RatingsDAO ratingsDAO){
//		ratingsDAO.save(ratingsDAO);
//		return new ResponseEntity<String>(HttpStatus.OK);
//	}
//	
//	
//	
//
//}
