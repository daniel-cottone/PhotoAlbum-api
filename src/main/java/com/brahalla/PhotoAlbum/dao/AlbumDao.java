package com.brahalla.PhotoAlbum.dao;

import com.brahalla.PhotoAlbum.model.Album;

import java.util.List;

public interface AlbumDao {

  public Album createAlbum(Album album);

  public Album getAlbumById(Long id);

  public List<Album> getAlbumList();

  public Album deleteAlbum(Long id);

}
