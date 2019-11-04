package com.innova.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RATINGS")
public class RatingsEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;
	
	@Column(name = "FEED1", nullable = false)
	private Long feed1;
	
	@Column(name = "FEED2", nullable = false)
	private Long feed2;

	@Column(name = "FEED3", nullable = false)
	private Long feed3;

	@Column(name = "FEED4", nullable = false)
	private Long feed4;

	@Column(name = "FEED5", nullable = false)
	private Long feed5;

	@Column(name = "FEED6", nullable = false)
	private Long feed6;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "TOPIC_ID", nullable = false)
	private Long topic_id;
	
	@Column(name = "SUBMITER_NAME", nullable = false)
	private String submiter_id;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "TECHTALK_TEAMS_ID")
	private Long techtalk_teams_id;
	
	public Long getTechtalk_teams_id() {
		return techtalk_teams_id;
	}

	public void setTechtalk_teams_id(Long techtalk_teams_id) {
		this.techtalk_teams_id = techtalk_teams_id;
	}

	public String getSubmiter_id() {
		return submiter_id;
	}

	public void setSubmiter_id(String submiter_id) {
		this.submiter_id = submiter_id;
	}

	public Long getTopic_id() {
		return topic_id;
	}

	public void setTopic_id(Long topic_id) {
		this.topic_id = topic_id;
	}

	public Long getFeed2() {
		return feed2;
	}

	public void setFeed2(Long feed2) {
		this.feed2 = feed2;
	}

	public Long getFeed3() {
		return feed3;
	}

	public void setFeed3(Long feed3) {
		this.feed3 = feed3;
	}

	public Long getFeed4() {
		return feed4;
	}

	public void setFeed4(Long feed4) {
		this.feed4 = feed4;
	}

	public Long getFeed5() {
		return feed5;
	}

	public void setFeed5(Long feed5) {
		this.feed5 = feed5;
	}

	public Long getFeed6() {
		return feed6;
	}

	public void setFeed6(Long feed6) {
		this.feed6 = feed6;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getFeed1() {
		return feed1;
	}

	public void setFeed1(Long feed1) {
		this.feed1 = feed1;
	}

		
}
