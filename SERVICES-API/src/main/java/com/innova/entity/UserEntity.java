package com.innova.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class UserEntity {


	@Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private Long id;
	
	@Column(name= "EMPID", nullable = false)
	private String empId;
	
	@Column(name = "PASSWORD", nullable = false)
	private String passWord;
	
	@Column(name = "TEAM_MEMBER_ID", nullable = false)
	private Long teamMemberId;
	
	@Column(name = "IS_ACTIVE", nullable = false)
	private Long isActive;

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

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Long getTeamMemberId() {
		return teamMemberId;
	}

	public void setTeamMemberId(Long teamMemberId) {
		this.teamMemberId = teamMemberId;
	}

	public Long getIsActive() {
		return isActive;
	}

	public void setIsActive(Long isActive) {
		this.isActive = isActive;
	}
	
}
