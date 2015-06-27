package com.brahalla.PhotoAlbum.dao;

import com.brahalla.PhotoAlbum.domain.entity.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
