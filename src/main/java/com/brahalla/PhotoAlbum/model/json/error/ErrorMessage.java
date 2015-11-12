package com.brahalla.PhotoAlbum.model.json.error;

import com.brahalla.PhotoAlbum.model.base.ModelBase;

import java.util.List;

public class ErrorMessage extends ModelBase {

	//private static final long serialVersionUID = ;
	private List<String> messages;

	public ErrorMessage() {
		super();
	}

	public ErrorMessage(List<String> messages) {
		this.setMessages(messages);
	}

	public List<String> getMessages() {
		return this.messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

}
