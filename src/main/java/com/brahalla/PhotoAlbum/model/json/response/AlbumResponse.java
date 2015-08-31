package com.brahalla.PhotoAlbum.model.json.response;

import com.brahalla.PhotoAlbum.model.base.ModelBase;

public class AlbumResponse extends ModelBase {

	//private static final long serialVersionUID = ;
	private Long id;
	private String title;
	private String createdDate;
	private Long coverPhotoId;

	public AlbumResponse() {
		super();
	}

	public AlbumResponse(Long id, String title, String createdDate, Long coverPhotoId) {
		this.setId(id);
		this.setTitle(title);
		this.setCreatedDate(createdDate);
		this.setCoverPhotoId(coverPhotoId);
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

	public Long getCoverPhotoId() {
		return this.coverPhotoId;
	}

	public void setCoverPhotoId(Long coverPhotoId) {
		this.coverPhotoId = coverPhotoId;
	}

}
