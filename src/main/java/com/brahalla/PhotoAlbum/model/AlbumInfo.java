package com.brahalla.PhotoAlbum.model;

import java.io.Serializable;
import java.util.Date;


public class AlbumInfo implements Serializable {

	//private static final long serialVersionUID = ;
	private String title;
	private Long coverPhotoId;

	public AlbumInfo() {
		super();
	}

	public AlbumInfo(String title, Long coverPhotoId) {
		this.setTitle(title);
		this.setCoverPhotoId(coverPhotoId);
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getCoverPhotoId() {
		return this.coverPhotoId;
	}

	public void setCoverPhotoId(Long coverPhotoId) {
		this.coverPhotoId = coverPhotoId;
	}

	public String toString() {

		final String tab = "    ";

		StringBuilder retValue = new StringBuilder();

		retValue.append("AlbumInfo ( ")
			.append(super.toString()).append(tab)
			.append("title = ").append(this.title).append(tab)
			.append("coverPhotoId = ").append(this.coverPhotoId).append(tab)
			.append(" )");

		return retValue.toString();
	}


}
