package com.innova.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.innova.dao.TeamDetailsDAO;
import com.innova.entity.TeamDetailsEntity;
import com.innova.views.TeamDetails;

@RestController
@CrossOrigin
public class TeamDetailsController {

    @Autowired
    private TeamDetailsDAO teamdetailsDAO;

    @ResponseBody
    @GetMapping("/getUsers")
    public List<TeamDetails> index() {
		/*
		 * Iterable<TeamDetailsEntity> findAll = teamdetailsDAO.findAll(); for
		 * (TeamDetailsEntity teamDetailsEntity : ) {
		 * System.out.println(teamDetailsEntity.getTeam().getTeamName());
		 * System.out.println(teamDetailsEntity.getTeam().getVersion().getStartDate());
		 * }
		 */
    	
        return translateIntoVO((List<TeamDetailsEntity>) teamdetailsDAO.findAll());
    }
    
    private List<TeamDetails> translateIntoVO(List<TeamDetailsEntity> entities) {
    	List<TeamDetails> teams = new ArrayList<TeamDetails>();
    	for (TeamDetailsEntity entity : entities) {
    		TeamDetails team = new TeamDetails();
    		team.setId(entity.getId());
    		team.setEmpId(entity.getEmpId());
    		team.setEmpName(entity.getEmpName());
    		team.setDesignation(entity.getDesignation());
    		team.setTeamName(entity.getTeam().getTeamName());
    		team.setBu(entity.getBu());
    		team.setTopic(!entity.getTopics().isEmpty() ? entity.getTopics().get(0).getTitle():null);
    		teams.add(team);
		}
    	return teams;
    }

}