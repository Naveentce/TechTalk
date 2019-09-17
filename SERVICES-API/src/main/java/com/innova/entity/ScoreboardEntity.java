package com.innova.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SCOREBOARD")
public class ScoreboardEntity {
	

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;
    
    @Column(name = "WEEK_NO", nullable = false)
    private Long week_no;
    
    @Column(name = "PRESENTER", nullable = false)
    private Long presenter;
    
    @Column(name = "SCORE", nullable = false)
    private Long score;
    
    @Column(name = "TOPIC_ID", nullable = false)
    private Long topic_id;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getWeek_no() {
		return week_no;
	}

	public void setWeek_no(Long week_no) {
		this.week_no = week_no;
	}

	public Long getPresenter() {
		return presenter;
	}

	public void setPresenter(Long presenter) {
		this.presenter = presenter;
	}

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public Long getTopic_id() {
		return topic_id;
	}

	public void setTopic_id(Long topic_id) {
		this.topic_id = topic_id;
	}

	
    
	

}
