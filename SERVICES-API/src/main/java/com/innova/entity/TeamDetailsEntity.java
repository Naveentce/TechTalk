package com.innova.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TEAM_MEMBER_DETAILS")
public class TeamDetailsEntity {

    
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;
	
	@Column(name = "EMPID", nullable = false)
	private String empId;
	
	@Column(name = "EMPNAME", nullable = false)
	private String empName;
	
	@Column(name = "DESIGNATION", nullable = false)
	private String designation;
	
	/*
	 * @Column(name = "TEAM_ID", nullable = false) private Long teamId;
	 */
	
	@OneToMany(mappedBy = "team")
	private List<RatingsEntity> ratings;
	
	@OneToMany(mappedBy =  "presentedBy")
	private List<TopicsEntity> topics; 
	
	@JoinColumn(name = "TEAM_ID")
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private TechTalkTeamsEntity team;
	
	@Column(name = "BU", nullable = false)
	private String bu;
	
	@Column(name = "EMAIL", nullable = false)
	private String eMail;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/*
	 * public Long getTeamId() { return teamId; }
	 * 
	 * public void setTeamId(Long teamId) { this.teamId = teamId; }
	 */

	public String getBu() {
		return bu;
	}

	public void setBu(String bu) {
		this.bu = bu;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public TechTalkTeamsEntity getTeam() {
		return team;
	}

	public void setTeam(TechTalkTeamsEntity team) {
		this.team = team;
	}

	public List<TopicsEntity> getTopics() {
		return topics;
	}

	public void setTopics(List<TopicsEntity> topics) {
		this.topics = topics;
	}

	public List<RatingsEntity> getRatings() {
		return ratings;
	}

	public void setRatings(List<RatingsEntity> ratings) {
		this.ratings = ratings;
	}

}