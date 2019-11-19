package com.innova.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.innova.dao.TopicsDAO;
import com.innova.entity.TopicsEntity;
import com.innova.views.TopicDetails;

@RestController
@CrossOrigin
public class TopicsController {
	
	@Autowired
	private TopicsDAO topicsDAO;
	
	@ResponseBody
	@GetMapping("/topics")
	public List<TopicDetails> sec(){
		List<TopicDetails> topics = new ArrayList<TopicDetails>();
		int count = 0;
		List<TopicsEntity> currentTopics = topicsDAO.findCurrentTopics();
		for (TopicsEntity topicsEntity : currentTopics) {
			if (count > 1) {
				break;
			}
			TopicDetails topic = new TopicDetails();
			topic.setTopicId(topicsEntity.getId());
			topic.setTitle(topicsEntity.getTitle());
			topic.setTeamName(topicsEntity.getPresentedBy().getTeam().getTeamName());
			topics.add(topic);
			count++;
		}
		return topics;
	}

}
