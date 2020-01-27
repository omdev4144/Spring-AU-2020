package com.example.Exercise;
import java.util.ArrayList;
import java.util.List;

public class MessageService {
	
	public List<Message> getAllMessages(){
		List<Message> list = new ArrayList<>();
		
		Message m1 = new Message(1L, "Hello Omdev", "Omdev");
		Message m2 = new Message(2L, "Heelo Virat", "Virat");
		
		list.add(m1);
		list.add(m2);
		
		return list;
	}



}
