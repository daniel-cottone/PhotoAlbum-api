package com.brahalla.PhotoAlbum.model.json.response;

import com.brahalla.PhotoAlbum.model.base.ModelBase;

public class AlbumResponse extends ModelBase {

	private static final String serialVersionUID = -1212519701332425024L;
	private String id;
	private String title;
	private String createdDate;
	private String coverPhotoId;

	public AlbumResponse() {
		super();
	}

	public AlbumResponse(String id, String title, String createdDate, String coverPhotoId) {
		this.setId(id);
		this.setTitle(title);
		this.setCreatedDate(createdDate);
		this.setCoverPhotoId(coverPhotoId);
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

	public String getCoverPhotoId() {
		return this.coverPhotoId;
	}

	public void setCoverPhotoId(String coverPhotoId) {
		this.coverPhotoId = coverPhotoId;
	}

}
