package com.innova.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.innova.BO.RatingsBO;
import com.innova.dao.RatingsDAO;
import com.innova.entity.RatingsEntity;

@RestController
@CrossOrigin
public class RatingsCotroller {
	
	@Autowired
	private RatingsDAO ratingsDAO;     
	
	@ResponseBody
	@PostMapping("/ratings")
	public ResponseEntity<String> save(@RequestBody RatingsBO[] values){
		ratingsDAO.saveAll(translateVO(values));
		return new ResponseEntity<String>(HttpStatus.OK);
		    
	}

	private List<RatingsEntity> translateVO(RatingsBO[] values) {
		List<RatingsEntity> ratings = new ArrayList<RatingsEntity>();
		for (RatingsBO ratingsBO : values) {
			RatingsEntity entity = new RatingsEntity();
			entity.setFeed1(Integer.valueOf(ratingsBO.getValue1()));
			entity.setFeed2(Integer.valueOf(ratingsBO.getValue2()));
			entity.setFeed3(Integer.valueOf(ratingsBO.getValue3()));
			entity.setFeed4(Integer.valueOf(ratingsBO.getValue4()));
			entity.setFeed5(Integer.valueOf(ratingsBO.getValue5()));
			entity.setFeed6(Integer.valueOf(ratingsBO.getValue6()));
			ratings.add(entity);
		}
		
		return ratings;

}
}