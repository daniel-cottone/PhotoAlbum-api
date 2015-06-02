package com.brahalla.PhotoAlbum.model;

import java.io.Serializable;

public class Photo implements Serializable {

	//private static final long serialVersionUID = ;
	private Integer id;
	private String title;
	private Integer albumId;

	public Photo() {
		super();
	}

	public Photo(Integer id, String name, Integer albumId) {
		this.setId(id);
		this.setTitle(title);
		this.setAlbumId(albumId);
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

	public Integer getAlbumId() {
		return this.albumId;
	}

	public void setAlbumId(Integer id) {
		this.albumId = albumId;
	}

	public String toString() {

		final String tab = "    ";

		StringBuilder retValue = new StringBuilder();

		retValue.append("Photo ( ")
			.append(super.toString()).append(tab)
			.append("id = ").append(this.id).append(tab)
			.append("title = ").append(this.title).append(tab)
			.append(" )");

		return retValue.toString();
	}


}
