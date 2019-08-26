package com.msg.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.msg.producer.MsgProducer;
import com.msg.store.MessageStorage;

@RestController
@RequestMapping("/kafka")
public class KafkaRestController {

	@Autowired
	private MessageStorage  messageStorage;
	
	@Autowired
	private MsgProducer  producer; 
	
	@GetMapping("/send")
	public String sendMessage(@RequestParam String message) {
		
		producer.send(message);
		return message+"===> This Messgae sent Successfully";
	}
	
	@GetMapping("/all")
	public String getAll() {
		
		return "All message From Consumer:  "+messageStorage.getAll();
	}
}
