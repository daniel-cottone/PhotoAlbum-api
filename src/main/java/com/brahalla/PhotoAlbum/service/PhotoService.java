package com.brahalla.PhotoAlbum.service;

import com.brahalla.PhotoAlbum.domain.entity.Photo;
import com.brahalla.PhotoAlbum.model.json.request.PhotoRequest;

import org.springframework.data.domain.Pageable;

public interface PhotoService {

  Photo createPhoto(PhotoRequest photoRequest);

  Photo getPhotoById(Long id);

  Iterable<Photo> getPhotos(String search, Pageable pageable);

  Photo updatePhoto(Long id, PhotoRequest photoRequest);

  void deletePhoto(Long id);

}
