package com.example.Exercise;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import java.util.List;
import javax.ws.rs.core.MediaType;

@Path("/employee")
public class EmployeeMessage {
		
	MessageService messageService = new MessageService();
	Message message_ser;
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessage() {
		return messageService.getAllMessages();
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message test(@PathParam("messageId") Long messageId) {
		return this.message_ser.getMessagebyId(messageId);
	}
	
	
	@PUT
	@Path("/{messageval}/{messageaurthr}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message getMsg(@PathParam("messageval") String messageVal, @PathParam("messageaurthr") String messageaurthr) {
		return this.message_ser.addMessages(this.message_ser.getId()+1,messageVal,messageaurthr);
	}
	
	@POST
	@Path("/{messageVal2}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String addMessage(@PathParam("messageval2") String messageVal2) {
		return messageVal2+" Post method Works";
	}
	
	@DELETE
	@Path("/del/{messageValdel}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message delUser(@PathParam("messageValdel") String messageDel) {
		int temp = Integer.parseInt(messageDel);
		return this.message_ser.getMessage1().remove(temp);
	}
		
//				@GET
//				@Produces("application/json")
//				public String[] getAllUsers() {
//					String str[] = { "Omdev", "Dalsaniya" };
//					return str;
//				}


}
