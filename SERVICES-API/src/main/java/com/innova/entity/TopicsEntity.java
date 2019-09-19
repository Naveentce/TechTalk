package com.innova.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TOPICS")
public class TopicsEntity {

	@Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private Long id;
	
	@Column(name = "TITLE", nullable = false)
    private String title;
	
	@Column(name = "ATTACHEMENT ", nullable = true)
	private Blob attachement;

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
	
}
