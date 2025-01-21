package com.felipe.workshopmongo.dto;

import java.io.Serializable;

import com.felipe.workshopmongo.domain.User;

public class AuthotDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	
	public AuthotDTO() {
		
	}
	
	public AuthotDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
