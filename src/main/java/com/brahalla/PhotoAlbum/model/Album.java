package com.brahalla.PhotoAlbum.model;

import java.io.Serializable;

public class Album implements Serializable {

	//private static final long serialVersionUID = ;
	private Integer id;
	private String title;

	public Album() {
		super();
	}

	public Album(Integer id, String title) {
		this.setId(id);
		this.setTitle(title);
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {

		final String tab = "    ";

		StringBuilder retValue = new StringBuilder();

		retValue.append("Album ( ")
			.append(super.toString()).append(tab)
			.append("id = ").append(this.id).append(tab)
			.append("title = ").append(this.title).append(tab)
			.append(" )");

		return retValue.toString();
	}


}
