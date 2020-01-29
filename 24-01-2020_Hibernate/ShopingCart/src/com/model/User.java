package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="UserDetails")
@Inheritance(strategy=InheritanceType.JOINED)
public class User {
	
	@Id
	private String UserId;
	private String Password;
	
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int verifypassword(String uname, String password2) {
		this.UserId = uname;
		this.Password = password2;
		int token;
		token = (UserId.equals("omdev") && Password.equals("pass")) ? 1234 : 9870;
		return token;
	}

	
}
