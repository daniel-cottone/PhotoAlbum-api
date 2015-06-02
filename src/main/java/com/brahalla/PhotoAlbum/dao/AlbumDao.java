package com.brahalla.PhotoAlbum.dao;

import com.brahalla.PhotoAlbum.model.Album;

import java.util.List;

public interface AlbumDao {

  public Album createAlbum(Album album);

  public Album getAlbumById(Integer id);

  public List<Album> getAlbumList();

  public Album deleteAlbum(Integer id);

}
