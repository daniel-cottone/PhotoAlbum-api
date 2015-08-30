package com.brahalla.PhotoAlbum.service;

import com.brahalla.PhotoAlbum.domain.entity.Photo;
import com.brahalla.PhotoAlbum.model.json.request.PhotoRequest;

import java.util.List;

public interface PhotoService {

  public Photo createPhoto(PhotoRequest photoRequest);

  public Photo getPhotoById(Long id);

  public List<Photo> getPhotoList();

  public List<Photo> getPhotoListByAlbumId(Long albumId);

  public Photo updatePhoto(Long id, PhotoRequest photoRequest);

  public Photo deletePhoto(Long id);

}
