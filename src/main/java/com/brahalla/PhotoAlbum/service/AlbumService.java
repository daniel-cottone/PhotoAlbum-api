package com.brahalla.PhotoAlbum.service;

import com.brahalla.PhotoAlbum.model.Album;

import java.util.List;

public interface AlbumService {

  public Album createAlbum(Album album);

  public Album getAlbumById(Integer id);

  public List<Album> getAlbumList();

  public Album deleteAlbum(Integer id);

}
