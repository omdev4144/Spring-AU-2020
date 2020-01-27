package com.example.Exercise;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	private long id;
	private String message;
	private Date created;
	private String author;
	private List<Message> Message1= new ArrayList<>();
	
	public Message(long id, String message, String author) {
		this.id = id;
		this.message = message;
		this.created = new Date();
		this.author = author;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Date getCreated() {
		return created;
	}
	
	public void setCreated(Date created) {
		this.created = created;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	public List<Message> getMessage1() {
		return Message1;
	}

	public void setMessage1(List<Message> message1) {
		Message1 = message1;
	}
	
	public void runstart(List<Message> message1) {
		Message m1 = new Message(1, "Hi Hello How are you", "Omde");
		Message m2 = new Message(2, "I am Fine You tell Omdev", "Dharam");
		Message1.add(m1);
		Message1.add(m2);
	}

	public Message getMessagebyId(Long messageId) {
		Message m_re = null;
		for(Message message: Message1) {
			if(messageId==message.getId()) {
				m_re = new Message(message.getId(),message.getAuthor(),message.getMessage());
			}
			else {
				m_re = new Message(404,"Message Not Found","Unauthorised Access");
			}
		}
		return m_re;
		
	}

	public Message addMessages(long l, String messageVal, String messageaurthr) {
		Message m3 = new Message(l,messageVal,messageaurthr);
		Message1.add(m3);
		return null;
	}

	
	

}
