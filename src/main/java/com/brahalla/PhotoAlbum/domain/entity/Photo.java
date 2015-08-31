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
@Table(name = "photos")
public class Photo extends DomainBase {

	private static final long serialVersionUID = 4223487423467416073L;
	private Long id;
	private String title;
	private Date createdDate;
	private String filePath;
	private Long albumId;

	public Photo() {
		super();
	}

	public Photo(String title, Date createdDate, String filePath, Long albumId) {
		this.setTitle(title);
		this.setCreatedDate(createdDate);
		this.setFilePath(filePath);
		this.setAlbumId(albumId);
	}

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "photos_seq")
	@SequenceGenerator(name = "photos_seq", sequenceName = "photos_seq", allocationSize = 1)
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

	@Column(name = "file_path")
	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Column(name = "album_id")
	public Long getAlbumId() {
		return this.albumId;
	}

	public void setAlbumId(Long albumId) {
		this.albumId = albumId;
	}

}
