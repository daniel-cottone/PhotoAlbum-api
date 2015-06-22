package com.brahalla.PhotoAlbum.service;

import com.brahalla.PhotoAlbum.domain.Photo;
import com.brahalla.PhotoAlbum.model.PhotoInfo;

import java.util.List;

public interface PhotoService {

  public Photo createPhoto(PhotoInfo photoInfo);

  public Photo getPhotoById(Long id);

  public List<Photo> getPhotoList();

  public List<Photo> getPhotoListByAlbumId(Long albumId);

  public Photo updatePhoto(Long id, PhotoInfo photoInfo);

  public Photo deletePhoto(Long id);

}
