package com.pixogram.actionservice.controller;

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

import com.pixogram.actionservice.entity.Action;
import com.pixogram.actionservice.model.ActionData;
import com.pixogram.actionservice.repository.ActionRepository;

@RestController
@CrossOrigin("localhost:4200")
public class ActionController {

	@Autowired
	private ActionRepository actionRepository;
	@GetMapping("/actions")
	public ResponseEntity<ActionData> getActionDetails()
	{
		List<Action> details=this.actionRepository.findAll();
		ActionData actionData=new ActionData();
		actionData.setActions(details);
		ResponseEntity<ActionData> response= new ResponseEntity<ActionData>(actionData,HttpStatus.OK);
		return response;
	}
	@PostMapping("/actions")
	public ResponseEntity<Action> addActions(@RequestBody Action action)
	{
		this.actionRepository.save(action);
		ResponseEntity<Action> response =new ResponseEntity<Action>(action,HttpStatus.OK);
		return response;
		
	}
	@DeleteMapping("/actions/{id}")
	public ResponseEntity<Action> deleteAction(@PathVariable Integer id)
	{
		Optional<Action> record=this.actionRepository.findById(id);
		Action action=null;
		if(record.isPresent())
		{
			action=record.get();
		}
		this.actionRepository.deleteById(id);
		ResponseEntity<Action> response=new ResponseEntity<Action>(action,HttpStatus.OK);
		
		return response;
	}
	
}
