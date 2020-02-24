package com.pixogram.commentservice.controller;

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

import com.pixogram.commentservice.entity.Comments;
import com.pixogram.commentservice.model.CommentsData;
import com.pixogram.commentservice.repository.CommentsRepository;


@RestController
public class CommentsController {
	
	@Autowired
	private CommentsRepository commentsRepository;
	@GetMapping("/comments")
	public ResponseEntity<CommentsData> getComments()
	{
		List<Comments> details=this.commentsRepository.findAll();
		CommentsData commentsData=new CommentsData();
		commentsData.setComments(details);
		ResponseEntity<CommentsData> response =new  ResponseEntity<CommentsData>(commentsData,HttpStatus.OK);
		return response;
	}
	@PostMapping("/comments")
	public ResponseEntity<Comments> addComments(@RequestBody Comments comments)
	{
		this.commentsRepository.save(comments);
		ResponseEntity<Comments> response=new ResponseEntity<Comments>(comments,HttpStatus.OK);
		return response;
	}
	@DeleteMapping("/comments/{id}")
	public ResponseEntity<Comments> deleteComments(@PathVariable Integer id)
	{
		Optional<Comments> record=this.commentsRepository.findById(id);
		Comments comments=null;
		if(record.isPresent())
		{
			comments=record.get();
		}
		 this.commentsRepository.deleteById(id);
		 ResponseEntity<Comments> response=new  ResponseEntity<Comments>(comments,HttpStatus.OK);
		 return response;
	}
}
