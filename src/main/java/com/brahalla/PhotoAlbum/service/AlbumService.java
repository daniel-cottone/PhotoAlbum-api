package com.brahalla.PhotoAlbum.service;

import com.brahalla.PhotoAlbum.domain.entity.Album;
import com.brahalla.PhotoAlbum.model.json.request.AlbumRequest;

import java.util.List;

public interface AlbumService {

  public Album createAlbum(AlbumRequest albumRequest);

  public Album getAlbumById(Long id);

  public List<Album> getAlbumList();

  public Album updateAlbum(Long id, AlbumRequest albumRequest);

  public Album deleteAlbum(Long id);

}
