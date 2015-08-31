package com.brahalla.PhotoAlbum.service;

import com.brahalla.PhotoAlbum.model.json.request.AlbumRequest;
import com.brahalla.PhotoAlbum.model.json.response.AlbumResponse;

import java.util.List;

public interface AlbumService {

  public AlbumResponse createAlbum(AlbumRequest albumRequest);

  public AlbumResponse getAlbumById(Long id);

  public List<AlbumResponse> getAlbumList();

  public AlbumResponse updateAlbum(Long id, AlbumRequest albumRequest);

  public void deleteAlbum(Long id);

}
