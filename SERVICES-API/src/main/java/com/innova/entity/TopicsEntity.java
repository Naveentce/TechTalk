package com.innova.entity;

import java.sql.Blob;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TOPICS")
@NamedQuery(name = "TopicsEntity.findCurrentTopics", query = "SELECT topics FROM TopicsEntity topics order by topics.presentedOn")
public class TopicsEntity {

	@Id
	@GeneratedValue
	@Column(name = "Id", nullable = false)
	private Long id;

	@Column(name = "TITLE", nullable = false)
	private String title;

	@Column(name = "ATTACHEMENT ", nullable = true)
	private Blob attachement;

//	@Column(name = "PRESENTED_BY", nullable = false)
	@JoinColumn(name = "PRESENTED_BY")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private TeamDetailsEntity presentedBy;

	@Column(name = "PRESENTED_ON", nullable = false)
	private Date presentedOn;

	@OneToMany(mappedBy = "topic")
	private List<RatingsEntity> ratings;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Blob getAttachement() {
		return attachement;
	}

	public void setAttachement(Blob attachement) {
		this.attachement = attachement;
	}

	/*
	 * public Long getPresentedBy() { return presentedBy; }
	 * 
	 * public void setPresentedBy(Long presentedBy) { this.presentedBy =
	 * presentedBy; }
	 */

	public Date getPresentedOn() {
		return presentedOn;
	}

	public void setPresentedOn(Date presentedOn) {
		this.presentedOn = presentedOn;
	}

	public void setPresentedBy(TeamDetailsEntity presentedBy) {
		this.presentedBy = presentedBy;
	}

	public TeamDetailsEntity getPresentedBy() {
		return presentedBy;
	}

	public List<RatingsEntity> getRatings() {
		return ratings;
	}

	public void setRatings(List<RatingsEntity> ratings) {
		this.ratings = ratings;
	}

}
