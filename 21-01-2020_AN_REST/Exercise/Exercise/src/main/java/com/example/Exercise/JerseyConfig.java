package com.example.Exercise;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig{
	
	public JerseyConfig() {
		register(EmployeeMessage.class);
		register(Message.class);
		register(MessageService.class);
	}

}
