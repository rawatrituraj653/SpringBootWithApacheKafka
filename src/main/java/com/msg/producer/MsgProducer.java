package com.msg.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MsgProducer {
	@Value("${my-msg-tpc}")
	private String topic;
	@Autowired
	KafkaTemplate<String, String> kt;
	
	public void send(String msg) {
	kt.send(topic, msg);	
	System.out.println("Message Sent from Producer");	
	}
}
