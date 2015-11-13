package com.brahalla.PhotoAlbum.model.json.error;

import com.brahalla.PhotoAlbum.model.base.ModelBase;

import java.util.Date;
import java.util.List;

public class ErrorMessage extends ModelBase {

	//private static final long serialVersionUID = ;
	private Date timestamp;
	private String status;
	private String error;
	private String exception;
	private List<String> messages;
	private String path;

	public ErrorMessage() {
		super();
	}

	public ErrorMessage(String status, String error, String exception, List<String> messages) {
		this.setTimestamp(new Date());
		this.setStatus(status);
		this.setError(error);
		this.setException(exception);
		this.setMessages(messages);
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getError() {
		return this.error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getException() {
		return this.exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public List<String> getMessages() {
		return this.messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
