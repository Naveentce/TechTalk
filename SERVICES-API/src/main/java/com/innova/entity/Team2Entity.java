package com.innova.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TECHTALK_TEAM2")
public class Team2Entity {

	@Id
	@GeneratedValue
	@Column(name = "ID3", nullable = false)
	private Long id3;
	
	@Column(name = "TEAM_NAME", nullable = false)
	private String team_name;
	
	@Column(name = "ID1", nullable = false)
	private Long id1;
	
	public Long getId3() {
		return id3;
	}

	public void setId3(Long id3) {
		this.id3 = id3;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public Long getId1() {
		return id1;
	}

	public void setId1(Long id1) {
		this.id1 = id1;
	}

	public TeamDetailsEntity getTeamDetailsEntity() {
		return teamDetailsEntity;
	}

	public void setTeamDetailsEntity(TeamDetailsEntity teamDetailsEntity) {
		this.teamDetailsEntity = teamDetailsEntity;
	}

	@OneToOne(mappedBy = "team2")
	private TeamDetailsEntity teamDetailsEntity;
	
}
