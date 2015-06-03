package com.brahalla.PhotoAlbum.model;

import java.util.Date;

public class PhotoInfo extends CommonModelBase {

	private static final long serialVersionUID = 2817453290727069227L;
	private String title;
	private String filePath;
	private Long albumId;

	public PhotoInfo() {
		super();
	}

	public PhotoInfo(String title, String filePath, Long albumId) {
		this.setTitle(title);
		this.setFilePath(filePath);
		this.setAlbumId(albumId);
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Long getAlbumId() {
		return this.albumId;
	}

	public void setAlbumId(Long albumId) {
		this.albumId = albumId;
	}

}
