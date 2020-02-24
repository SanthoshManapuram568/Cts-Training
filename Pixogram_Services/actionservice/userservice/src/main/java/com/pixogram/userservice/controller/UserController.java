package com.pixogram.userservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pixogram.userservice.entity.User;
import com.pixogram.userservice.model.UserData;
import com.pixogram.userservice.repository.UserRepository;


@RestController
@CrossOrigin("http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	@GetMapping("/users")
	public ResponseEntity<UserData> getUserDetails(){
		List<User> details=this.userRepository.findAll();
		UserData userData=new UserData();
		userData.setData(details);
		ResponseEntity<UserData> response=new ResponseEntity<UserData>(userData, HttpStatus.OK);
		return response;
	}
	@PostMapping("/users")
	public ResponseEntity<User> addUsers(@RequestBody User user)
	{
		this.userRepository.save(user);
		ResponseEntity<User> response = new ResponseEntity<User>(user,HttpStatus.OK);
		return response;
	}
	@DeleteMapping("/users/{userId}")
	public ResponseEntity<User> deleteUser(@PathVariable Integer userId)
	{
		Optional<User> record=this.userRepository.findById(userId);
		User user=null;
		if(record.isPresent())
		{
			user=record.get();
		}
		this.userRepository.deleteById(userId);
		ResponseEntity<User> response=new ResponseEntity<User>(user,HttpStatus.OK);
		return response;
		
	}
	
}
