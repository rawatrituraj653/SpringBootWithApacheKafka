package com.msg.store;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class MessageStorage {

	private List <String> list=new ArrayList<>();

	public void save(String msg) {
			list.add(msg);
	}
	
	public String  getAll() {
		
		return list.toString();
	}
	
}
