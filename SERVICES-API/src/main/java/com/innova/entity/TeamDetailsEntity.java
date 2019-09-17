package com.innova.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TEAM_DETAILS")
public class TeamDetailsEntity {

    @Id
    @GeneratedValue
    @Column(name = "Id1", nullable = false)
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
    
    @OneToOne
    @JoinColumn(name="ID1")
    private Team1Entity team1;
    
    @OneToOne
    @JoinColumn(name="ID1")
    private Team2Entity team2;
    
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Team1Entity getTeam1() {
		return team1;
	}

	public void setTeam1(Team1Entity team1) {
		this.team1 = team1;
	}


}