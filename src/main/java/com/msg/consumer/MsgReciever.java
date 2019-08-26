package com.msg.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.msg.store.MessageStorage;

@Component
public class MsgReciever {

		@Autowired
		private MessageStorage store;
	
	@KafkaListener(topics = "${my-msg-tpc}" ,groupId ="group-id")
	public void recieveMsg(String msg) {
		System.out.println("Consumer is Executed.....");
			store.save(msg);
	}
}
