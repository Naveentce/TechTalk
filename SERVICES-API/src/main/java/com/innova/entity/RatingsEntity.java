package com.innova.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RATINGS")
public class RatingsEntity {

	@Id
	@GeneratedValue
	private String feed1;

	public String getFeed1() {
		return feed1;
	}

	public void setFeed1(String feed1) {
		this.feed1 = feed1;
	}
	
}
