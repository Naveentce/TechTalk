package com.innova.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.Mapping;

@Entity
@Table(name = "TEAM_MEMBER_DETAILS")
public class TeamDetailsEntity {

    
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "EMPNAME", nullable = false)
    private String empname;
    
    @Column(name = "EMPID", nullable = false)
    private String empID;
    
    @Column(name = "DESIGNATION", nullable = false)
    private String designation;
    
    @Column(name = "TEAM_NAME", nullable = false)
    private String team_name;
    
    @Column(name = "BU", nullable = false)
    private String bu;
    
    @Column(name = "TOPIC_ID", nullable = true)
    private Long topic_id;
    
    
//    @OneToOne(mappedBy = "TEAMDETAILSENTITY")
//    private TechTalk_Teams techtalk_teams;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public String getBu() {
		return bu;
	}

	public void setBu(String bu) {
		this.bu = bu;
	}

//	public TechTalk_Teams getTechtalk_teams() {
//		return techtalk_teams;
//	}
//
//	public void setTechtalk_teams(TechTalk_Teams techtalk_teams) {
//		this.techtalk_teams = techtalk_teams;
//	}
	public Long getTopic_id() {
		return topic_id;
	}

	public void setTopic_id(Long topic_id) {
		this.topic_id = topic_id;
	}

    
 
}