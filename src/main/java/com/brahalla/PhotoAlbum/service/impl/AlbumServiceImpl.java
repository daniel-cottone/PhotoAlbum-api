package com.brahalla.PhotoAlbum.service.impl;

import com.brahalla.PhotoAlbum.dao.AlbumRepository;
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
	private AlbumRepository albumRepository;

  @Override
	@Transactional
  public Album createAlbum(AlbumInfo albumInfo) {
		Album album = AlbumFactory.createAlbum(albumInfo);
    return this.albumRepository.save(album);
  }

  @Override
  public Album getAlbumById(Long id) {
    return this.albumRepository.findOne(id);
  }

  @Override
  public List<Album> getAlbumList() {
    return this.albumRepository.findAll();
  }

	@Override
	@Transactional
	public Album updateAlbum(Long id, AlbumInfo albumInfo) {
		Album album = this.albumRepository.findOne(id);
		BeanUtils.copyProperties(albumInfo, album);
		return this.albumRepository.save(album);
	}

  @Override
	@Transactional
  public void deleteAlbum(Long id) {
    this.albumRepository.delete(id);
  }

}
