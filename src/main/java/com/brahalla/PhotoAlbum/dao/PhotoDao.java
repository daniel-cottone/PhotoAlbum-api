package com.brahalla.PhotoAlbum.dao;

import com.brahalla.PhotoAlbum.model.Photo;

import java.util.List;

public interface PhotoDao {

  public Photo createPhoto(Photo photo);

  public Photo getPhotoById(Integer id);

  public List<Photo> getPhotoList();

  public Photo deletePhoto(Integer id);

}
