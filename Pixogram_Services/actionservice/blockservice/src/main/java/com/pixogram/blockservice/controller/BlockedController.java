package com.pixogram.blockservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pixogram.blockservice.repository.BlockedRepository;

@RestController
public class BlockedController {
		@Autowired
		private BlockedRepository blockedRepository;
		
		//@GetMapping("/blocked")
}
