package com.innova.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TECHTALK_TEAMS")
public class TechTalk_Teams {
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Long id;
	
	
	@Column(name = "TEAM_NAME", nullable = false)
	private String team_name;
	
//	@Column(name = "TEAM_MEMBER_DETAILS_ID", nullable = false)
//	private Long team_members_details_id;

//	@OneToOne
//	@JoinColumn(name = "ID")
//	private TeamDetailsEntity teamDetailsEntity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}


//	public TeamDetailsEntity getTeamDetailsEntity() {
//		return teamDetailsEntity;
//	}
//
//	public void setTeamDetailsEntity(TeamDetailsEntity teamDetailsEntity) {
//		this.teamDetailsEntity = teamDetailsEntity;
//	}
//	@OneToOne(cascade = CascadeType.ALL)
//	public Long getTeam_members_details_id() {
//		return team_members_details_id;
//	}
//
//	public void setTeam_members_details_id(Long team_members_details_id) {
//		this.team_members_details_id = team_members_details_id;
//	}
	
	
	
}																																							