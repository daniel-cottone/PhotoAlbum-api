package com.brahalla.PhotoAlbum.model.json;

import com.brahalla.PhotoAlbum.model.base.CommonModelBase;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class UserInfo extends CommonModelBase {

	//private static final long serialVersionUID = ;
	private String username;
	private String password;

	public UserInfo() {
		super();
	}

	public UserInfo(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	@NotEmpty
	@Length(max = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@NotEmpty
	@Length(max = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
