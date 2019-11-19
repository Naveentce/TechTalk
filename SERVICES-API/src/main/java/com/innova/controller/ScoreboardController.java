package com.innova.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.innova.dao.TechTalkTeamsDAO;
import com.innova.entity.RatingsEntity;
import com.innova.entity.TeamDetailsEntity;
import com.innova.entity.TechTalkTeamsEntity;
import com.innova.entity.TopicsEntity;
import com.innova.views.ScoreDetails;

@RestController
@CrossOrigin
public class ScoreboardController {

	@Autowired
	private TechTalkTeamsDAO teamDao;

	@ResponseBody
	@GetMapping("/score")
	public List<ScoreDetails> getscore() {
		List<ScoreDetails> scores = new ArrayList<ScoreDetails>();
		List<TechTalkTeamsEntity> teams = teamDao.findAllTeamsByCurrentVersion();
		for (TechTalkTeamsEntity team : teams) {
			ScoreDetails score = new ScoreDetails();
			score.setTeamId(team.getId());
			score.setTeamName(team.getTeamName());
			int totalScore = 0;

			for (TeamDetailsEntity teamDetails : team.getTeamDetails()) {
				for (TopicsEntity topics : teamDetails.getTopics()) {
					for (RatingsEntity rating : topics.getRatings()) {
						totalScore = totalScore + rating.getFeed1() + rating.getFeed2() + rating.getFeed3()
								+ rating.getFeed4() + rating.getFeed5() + rating.getFeed6();
					}
				}
			}
			score.setScore(totalScore);
			scores.add(score);
		}
		return scores;
	}

}
