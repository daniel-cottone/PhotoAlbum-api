package com.brahalla.PhotoAlbum.service.impl;

import com.brahalla.PhotoAlbum.dao.AlbumDao;
import com.brahalla.PhotoAlbum.model.Album;
import com.brahalla.PhotoAlbum.service.AlbumService;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AlbumServiceImpl implements AlbumService {

	/*@Autowired
	private AlbumDao albumDao;*/

  @Override
  public Album createAlbum(Album album) {
    return new Album();
  }

  @Override
  public Album getAlbumById(Integer id) {
    return new Album();
  }

  @Override
  public List<Album> getAlbumList() {
    return new LinkedList<Album>();
  }

  @Override
  public Album deleteAlbum(Integer id) {
    return new Album();
  }

}
