package com.felipe.workshopmongo.dto;

import java.io.Serializable;
import java.sql.Date;

public class CommentDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String text;
	private Date date;
	private AuthotDTO author;

	public CommentDTO() {
	}

	public CommentDTO(String text, Date date, AuthotDTO author) {
		super();
		this.text = text;
		this.date = date;
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AuthotDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthotDTO author) {
		this.author = author;
	}
}
