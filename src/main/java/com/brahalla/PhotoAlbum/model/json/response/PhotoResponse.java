package com.brahalla.PhotoAlbum.model.json.response;

import com.brahalla.PhotoAlbum.model.base.ModelBase;

public class PhotoResponse extends ModelBase {

	//private static final long serialVersionUID = ;
	private Long id;
	private String title;
	private String createdDate;
	private String filePath;
	private Long albumId;

	public PhotoResponse() {
		super();
	}

	public PhotoResponse(Long id, String title, String createdDate, String filePath, Long albumId) {
		this.setId(id);
		this.setTitle(title);
		this.setCreatedDate(createdDate);
		this.setFilePath(filePath);
		this.setAlbumId(albumId);
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
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
