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
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TECHTALK_TEAMS")
@NamedQuery(name = "TechTalkTeamsEntity.findAllTeamsByCurrentVersion", query = "SELECT team FROM TechTalkTeamsEntity team WHERE team.version.isCurrent = true")
public class TechTalkTeamsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Long id;

	@Column(name = "TEAM_NAME", nullable = false)
	private String teamName;

	@JoinColumn(name = "VERSION_ID")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private VersionEntity version;
	
	@OneToMany(mappedBy = "team")
	private List<TeamDetailsEntity> teamDetails;
	
	@OneToMany(mappedBy = "presentedBy")
	private List<TopicsEntity> topics;

	/*
	 * @Column(name = "VERSION_ID", nullable = false) private Long versionId;
	 */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public VersionEntity getVersion() {
		return version;
	}

	public void setVersion(VersionEntity version) {
		this.version = version;
	}

	public List<TeamDetailsEntity> getTeamDetails() {
		return teamDetails;
	}

	public void setTeamDetails(List<TeamDetailsEntity> teamDetails) {
		this.teamDetails = teamDetails;
	}

	public List<TopicsEntity> getTopics() {
		return topics;
	}

	public void setTopics(List<TopicsEntity> topics) {
		this.topics = topics;
	}

	/*
	 * public Long getVersionId() { return versionId; }
	 * 
	 * public void setVersionId(Long versionId) { this.versionId = versionId; }
	 */

}