package com.pixogram.followservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pixogram.followservice.entity.Follow;
import com.pixogram.followservice.model.FollowData;
import com.pixogram.followservice.repository.FollowServiceRepository;

@RestController
public class FollowerServiceController {
	@Autowired
	private FollowServiceRepository followServiceRepository;
	@GetMapping("/follow")
	public ResponseEntity<FollowData> getAllFollowers(){
		List<Follow> details= this.followServiceRepository.findAll();
		FollowData followData = new FollowData();
		followData.setFollow(details);
		ResponseEntity<FollowData> response = new ResponseEntity<FollowData>(followData,HttpStatus.OK);
		return response;
	}
}
