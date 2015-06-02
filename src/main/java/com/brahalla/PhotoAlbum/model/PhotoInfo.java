package com.brahalla.PhotoAlbum.model;

import java.io.Serializable;
import java.util.Date;


public class PhotoInfo implements Serializable {

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
		System.out.println(albumId);
		System.out.println(this.albumId);
	}

	public String toString() {

		final String tab = "    ";

		StringBuilder retValue = new StringBuilder();

		retValue.append("PhotoInfo ( ")
			.append(super.toString()).append(tab)
			.append("title = ").append(this.title).append(tab)
			.append("filePath = ").append(this.filePath).append(tab)
			.append("albumId = ").append(this.albumId).append(tab)
			.append(" )");

		return retValue.toString();
	}


}
