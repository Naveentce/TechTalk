package com.innova.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TECHTALK_TEAM1")
public class Team1Entity {
	@Id
	@GeneratedValue
	@Column(name = "ID2", nullable = false)
	private Long id;
	
	@Column(name = "TEAM_NAME", nullable = false)
	private String team_name;
	
	@Column(name = "ID1", nullable = false)
	private Long teamdetails_fk;

	@OneToOne(mappedBy = "team1")
	private TeamDetailsEntity teamDetailsEntity;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTeamdetails_fk() {
		return teamdetails_fk;
	}

	public void setTeamdetails_fk(Long teamdetails_fk) {
		this.teamdetails_fk = teamdetails_fk;
	}

	public TeamDetailsEntity getTeamDetailsEntity() {
		return teamDetailsEntity;
	}

	public void setTeamDetailsEntity(TeamDetailsEntity teamDetailsEntity) {
		this.teamDetailsEntity = teamDetailsEntity;
	}


	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public Long getId1() {
		return teamdetails_fk;
	}

	public void setId1(Long id1) {
		this.teamdetails_fk = id1;
	}

		
	
	

}
