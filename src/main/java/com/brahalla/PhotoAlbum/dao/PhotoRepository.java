package com.brahalla.PhotoAlbum.dao;

import com.brahalla.PhotoAlbum.domain.entity.Photo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PhotoRepository extends CrudRepository<Photo, Long> {

  public List<Photo> findByAlbumId(Long albumId);

}
