package com.brahalla.PhotoAlbum.service.impl;

import com.brahalla.PhotoAlbum.dao.AlbumDao;
import com.brahalla.PhotoAlbum.domain.entity.Album;
import com.brahalla.PhotoAlbum.domain.factory.AlbumFactory;
import com.brahalla.PhotoAlbum.model.json.AlbumInfo;
import com.brahalla.PhotoAlbum.service.AlbumService;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AlbumServiceImpl implements AlbumService {

	@Autowired
	private AlbumDao albumDao;

  @Override
	@Transactional
  public Album createAlbum(AlbumInfo albumInfo) {
		Album album = AlbumFactory.createAlbum(albumInfo);
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
	@Transactional
	public Album updateAlbum(Long id, AlbumInfo albumInfo) {
		Album album = this.albumDao.getAlbumById(id);
		BeanUtils.copyProperties(albumInfo, album);
		return this.albumDao.updateAlbum(album);
	}

  @Override
	@Transactional
  public Album deleteAlbum(Long id) {
    return this.albumDao.deleteAlbum(id);
  }

}
