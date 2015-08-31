package com.brahalla.PhotoAlbum.domain.entity;

import com.brahalla.PhotoAlbum.domain.base.DomainBase;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "albums")
public class Album extends DomainBase {

	private static final long serialVersionUID = -3236876036458097243L;
	private Long id;
	private String title;
	private Date createdDate;
	private Long coverPhotoId;

	public Album() {
		super();
	}

	public Album(String title, Date createdDate, Long coverPhotoId) {
		this.setTitle(title);
		this.setCreatedDate(createdDate);
		this.setCoverPhotoId(coverPhotoId);
	}

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "albums_seq")
	@SequenceGenerator(name = "albums_seq", sequenceName = "albums_seq", allocationSize = 1)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "title")
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "created_date")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "cover_photo_id")
	public Long getCoverPhotoId() {
		return this.coverPhotoId;
	}

	public void setCoverPhotoId(Long coverPhotoId) {
		this.coverPhotoId = coverPhotoId;
	}

}
