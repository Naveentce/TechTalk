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
@CrossOrigin(origins = "http://localhost:4200")
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
			entity.setFeed1(Long.valueOf(ratingsBO.getValue1()));
			entity.setFeed2(Long.valueOf(ratingsBO.getValue2()));
			entity.setFeed3(Long.valueOf(ratingsBO.getValue3()));
			entity.setFeed4(Long.valueOf(ratingsBO.getValue4()));
			entity.setFeed5(Long.valueOf(ratingsBO.getValue5()));
			entity.setFeed6(Long.valueOf(ratingsBO.getValue6()));
			entity.setSubmiter_id(ratingsBO.getValue13()+"");
			ratings.add(entity);
		}
		
		return ratings;

}
}