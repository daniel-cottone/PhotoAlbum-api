package com.brahalla.PhotoAlbum.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "albums")
public class Album implements Serializable {

	private static final long serialVersionUID = -3236876036458097243L;

	@Id
	@Column(name = "album_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "albums_album_id_seq")
	@SequenceGenerator(name = "albums_album_id_seq", sequenceName = "albums_album_id_seq", allocationSize = 1)
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "cover_photo_id")
	private Long coverPhotoId;

	public Album() {
		super();
	}

	public Album(String title, Date createdDate, Long coverPhotoId) {
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

	public String toString() {

		final String tab = "    ";

		StringBuilder retValue = new StringBuilder();

		retValue.append("Album ( ")
			.append(super.toString()).append(tab)
			.append("id = ").append(this.id).append(tab)
			.append("title = ").append(this.title).append(tab)
			.append("createdDate = ").append(this.createdDate).append(tab)
			.append("coverPhotoId = ").append(this.coverPhotoId).append(tab)
			.append(" )");

		return retValue.toString();
	}


}
