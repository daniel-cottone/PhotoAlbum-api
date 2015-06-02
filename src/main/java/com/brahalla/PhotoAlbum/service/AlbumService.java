package com.brahalla.PhotoAlbum.service;

import com.brahalla.PhotoAlbum.domain.Album;
import com.brahalla.PhotoAlbum.model.AlbumInfo;

import java.util.List;

public interface AlbumService {

  public Album createAlbum(AlbumInfo albumInfo);

  public Album getAlbumById(Long id);

  public List<Album> getAlbumList();

  public Album deleteAlbum(Long id);

}
