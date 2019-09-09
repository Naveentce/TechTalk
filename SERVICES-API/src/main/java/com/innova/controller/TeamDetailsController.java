package com.innova.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.innova.dao.TeamDetailsDAO;
import com.innova.entity.TeamDetailsEntity;

@RestController
public class TeamDetailsController {

    @Autowired
    private TeamDetailsDAO teamdetailsDAO;

    @ResponseBody
    @GetMapping("/getUsers")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<TeamDetailsEntity> getDetails() {
        List<TeamDetailsEntity> all = (List<TeamDetailsEntity>) teamdetailsDAO.findAll();
        return all;
    }

}