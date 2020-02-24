package com.pixogram.newsfeedservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pixogram.newsfeedservice.entity.NewsFeed;
import com.pixogram.newsfeedservice.model.NewsFeedData;
import com.pixogram.newsfeedservice.repository.NewsfeedRepository;

@RestController
public class NewsFeedController {

	@Autowired
	private NewsfeedRepository newsFeedRepository;
	@GetMapping("/newsfeeds")
	public ResponseEntity<NewsFeedData> getNewsFeeds()
	{
		List<NewsFeed> details=this.newsFeedRepository.findAll();
		NewsFeedData newsFeedData=new NewsFeedData();
		newsFeedData.setNewsFeeds(details);
		ResponseEntity<NewsFeedData> response=new ResponseEntity<NewsFeedData>(newsFeedData, HttpStatus.OK);
		return response;
	}
	@PostMapping("/newsfeeds")
	public ResponseEntity<NewsFeed> addNewsFeed(@RequestBody NewsFeed newsFeed)
	{
		this.newsFeedRepository.save(newsFeed);
		ResponseEntity<NewsFeed> response =new ResponseEntity<NewsFeed>(newsFeed,HttpStatus.OK);
		return response;
	}
	@DeleteMapping("newsfeeds/{newsFeedId}")
	public ResponseEntity<NewsFeed> deleteNewsFeed(@PathVariable Integer newsFeedId)
	{
		Optional<NewsFeed> record=this.newsFeedRepository.findById(newsFeedId);
		NewsFeed newsFeed=null;
		if(record.isPresent())
		{ 
			 newsFeed=record.get();
		}
		 this.newsFeedRepository.deleteById(newsFeedId);
		 ResponseEntity<NewsFeed> response =new  ResponseEntity<NewsFeed>(newsFeed,HttpStatus.OK);
		return response;
	}
	
}
