package com.brahalla.PhotoAlbum.service;

import com.brahalla.PhotoAlbum.model.json.request.PhotoRequest;
import com.brahalla.PhotoAlbum.model.json.response.PhotoResponse;

import java.util.List;

public interface PhotoService {

  public PhotoResponse createPhoto(PhotoRequest photoRequest);

  public PhotoResponse getPhotoById(Long id);

  public List<PhotoResponse> getPhotoList();

  public List<PhotoResponse> getPhotoListByAlbumId(Long albumId);

  public PhotoResponse updatePhoto(Long id, PhotoRequest photoRequest);

  public void deletePhoto(Long id);

}
