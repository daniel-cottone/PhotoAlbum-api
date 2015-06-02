package com.brahalla.PhotoAlbum.service.impl;

import com.brahalla.PhotoAlbum.dao.AlbumDao;
import com.brahalla.PhotoAlbum.domain.Album;
import com.brahalla.PhotoAlbum.service.AlbumService;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AlbumServiceImpl implements AlbumService {

	@Autowired
	private AlbumDao albumDao;

  @Override
  public Album createAlbum(Album album) {
    return this.albumDao.createAlbum(album);
  }

  @Override
  public Album getAlbumById(Long id) {
    return this.albumDao.getAlbumById(id);
  }

  @Override
  public List<Album> getAlbumList() {
    return this.albumDao.getAlbumList();
  }

  @Override
  public Album deleteAlbum(Long id) {
    return this.albumDao.deleteAlbum(id);
  }

}
