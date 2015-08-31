package com.brahalla.PhotoAlbum.model.json.request;

import com.brahalla.PhotoAlbum.model.base.ModelBase;

import java.util.Date;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class AlbumRequest extends ModelBase {

	private static final long serialVersionUID = -7086382610728542290L;
	private String title;
	private Long coverPhotoId;

	public AlbumRequest() {
		super();
	}

	public AlbumRequest(String title, Long coverPhotoId) {
		this.setTitle(title);
		this.setCoverPhotoId(coverPhotoId);
	}

	@NotEmpty
	@Length(max = 50)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Min(value = 1)
	public Long getCoverPhotoId() {
		return this.coverPhotoId;
	}

	public void setCoverPhotoId(Long coverPhotoId) {
		this.coverPhotoId = coverPhotoId;
	}

}
