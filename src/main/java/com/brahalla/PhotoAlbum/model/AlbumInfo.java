package com.brahalla.PhotoAlbum.model;

import java.util.Date;

public class AlbumInfo extends CommonModelBase {

	private static final long serialVersionUID = -7086382610728542290L;
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

}
