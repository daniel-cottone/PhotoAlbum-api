package com.brahalla.PhotoAlbum.model.json.response;

import com.brahalla.PhotoAlbum.model.base.ModelBase;

public class PhotoResponse extends ModelBase {

	//private static final String serialVersionUID = ;
	private String id;
	private String title;
	private String createdDate;
	private String filePath;
	private String albumId;

	public PhotoResponse() {
		super();
	}

	public PhotoResponse(String id, String title, String createdDate, String filePath, String albumId) {
		this.setId(id);
		this.setTitle(title);
		this.setCreatedDate(createdDate);
		this.setFilePath(filePath);
		this.setAlbumId(albumId);
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
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

	public String getAlbumId() {
		return this.albumId;
	}

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

}
