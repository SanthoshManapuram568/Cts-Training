package com.pixogram.mediaservice.controller;

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

import com.pixogram.mediaservice.entity.Media;
import com.pixogram.mediaservice.model.MediaData;
import com.pixogram.mediaservice.repository.MediaServiceRepository;

@RestController
public class MediaServiceController {
	
	@Autowired
	private MediaServiceRepository mediaServiceRepository;
	@GetMapping("/media")
	public ResponseEntity<MediaData> getAllMedia()
	{
		List<Media> details=this.mediaServiceRepository.findAll();
		MediaData mediaData=new MediaData();
		mediaData.setMedia(details);
		ResponseEntity<MediaData> response=new ResponseEntity<MediaData>(mediaData,HttpStatus.OK);
		return response;
	}
	@PostMapping("media")
	public ResponseEntity<Media> addMedia(@RequestBody Media media)
	{
		this.mediaServiceRepository.save(media);
		ResponseEntity<Media> response=new ResponseEntity<Media>(media,HttpStatus.OK);
		return response;
	}
	@DeleteMapping("/media/{id}")
	public ResponseEntity<Media> deleteMedia(@PathVariable Integer id)
	{
		Optional<Media> record=this.mediaServiceRepository.findById(id);
		Media media=null;
		if(record.isPresent())
		{
			media=record.get();
		}
		 this.mediaServiceRepository.deleteById(id);
		 ResponseEntity<Media> response=new  ResponseEntity<Media>(media,HttpStatus.OK);
		 return response;
	}
}
