package com.brahalla.PhotoAlbum.service;

import com.brahalla.PhotoAlbum.model.Photo;

import java.util.List;

public interface PhotoService {

  public Photo createPhoto(Photo photo);

  public Photo getPhotoById(Integer id);

  public List<Photo> getPhotoList();

  public Photo deletePhoto(Integer id);

}
