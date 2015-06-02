package com.brahalla.PhotoAlbum.service;

import com.brahalla.PhotoAlbum.domain.Photo;

import java.util.List;

public interface PhotoService {

  public Photo createPhoto(Photo photo);

  public Photo getPhotoById(Long id);

  public List<Photo> getPhotoList();

  public Photo deletePhoto(Long id);

}
