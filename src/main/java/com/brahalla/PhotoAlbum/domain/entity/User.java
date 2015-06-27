package com.brahalla.PhotoAlbum.domain.entity;

import com.brahalla.PhotoAlbum.domain.base.CommonDomainBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User extends CommonDomainBase {

	//private static final long serialVersionUID = ;
	private Long id;
	private String username;
	private String password;

	public User() {
		super();
	}

	public User(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_user_id_seq")
	@SequenceGenerator(name = "users_user_id_seq", sequenceName = "users_user_id_seq", allocationSize = 1)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "username")
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
