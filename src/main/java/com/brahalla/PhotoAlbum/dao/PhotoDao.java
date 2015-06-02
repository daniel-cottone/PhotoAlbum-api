package com.brahalla.PhotoAlbum.dao;

import com.brahalla.PhotoAlbum.domain.Photo;

import java.util.List;

public interface PhotoDao {

  public Photo createPhoto(Photo photo);

  public Photo getPhotoById(Long id);

  public List<Photo> getPhotoList();

  public Photo deletePhoto(Long id);

}
