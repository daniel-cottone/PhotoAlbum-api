package com.brahalla.PhotoAlbum.model.criteria;

import java.util.Date;

import com.brahalla.PhotoAlbum.model.base.ModelBase;

public class AlbumSearchCriteria extends ModelBase {

  //private static final long serialVersionUID = ;
  private Long id;
  private String title;
  private Date createdDate;
  private Long coverPhotoId;

  public AlbumSearchCriteria() {
    super();
  }

  public AlbumSearchCriteria(Long id, String title, Date createdDate, Long coverPhotoId) {
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

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Long getCoverPhotoId() {
		return this.coverPhotoId;
	}

	public void setCoverPhotoId(Long coverPhotoId) {
		this.coverPhotoId = coverPhotoId;
	}

}
