package com.brahalla.PhotoAlbum.service;

import com.brahalla.PhotoAlbum.domain.entity.Album;
import com.brahalla.PhotoAlbum.model.json.AlbumInfo;

import java.util.List;

public interface AlbumService {

  public Album createAlbum(AlbumInfo albumInfo);

  public Album getAlbumById(Long id);

  public List<Album> getAlbumList();

  public Album updateAlbum(Long id, AlbumInfo albumInfo);

  public Album deleteAlbum(Long id);

}
