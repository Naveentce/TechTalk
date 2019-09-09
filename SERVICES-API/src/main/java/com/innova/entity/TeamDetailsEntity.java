package com.innova.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEAM_DETAILS")
public class TeamDetailsEntity {

    @Id
    @GeneratedValue
    @Column(name = "Id1", nullable = false)
    private Long id;

    @Column(name = "EMPNAME", nullable = false)
    private String fullName;
    
    @Column(name = "EMPID", nullable = false)
    private String fullId;
    
    @Column()

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


}