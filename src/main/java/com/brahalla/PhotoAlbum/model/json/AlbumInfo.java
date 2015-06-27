package com.brahalla.PhotoAlbum.model.json;

import com.brahalla.PhotoAlbum.model.base.CommonModelBase;

import java.util.Date;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

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
