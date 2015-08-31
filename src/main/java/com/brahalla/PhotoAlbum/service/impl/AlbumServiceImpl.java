package com.brahalla.PhotoAlbum.service.impl;

import com.brahalla.PhotoAlbum.dao.AlbumRepository;
import com.brahalla.PhotoAlbum.domain.entity.Album;
import com.brahalla.PhotoAlbum.domain.factory.AlbumFactory;
import com.brahalla.PhotoAlbum.model.factory.AlbumResponseFactory;
import com.brahalla.PhotoAlbum.model.json.request.AlbumRequest;
import com.brahalla.PhotoAlbum.model.json.response.AlbumResponse;
import com.brahalla.PhotoAlbum.service.AlbumService;

import java.util.LinkedList;
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
  public AlbumResponse createAlbum(AlbumRequest albumRequest) {
		Album album = AlbumFactory.create(albumRequest);
    album = this.albumRepository.save(album);
		AlbumResponse albumResponse = AlbumResponseFactory.create(album);
		return albumResponse;
  }

  @Override
  public AlbumResponse getAlbumById(Long id) {
    Album album = this.albumRepository.findOne(id);
		AlbumResponse albumResponse = AlbumResponseFactory.create(album);
		return albumResponse;
  }

  @Override
  public List<AlbumResponse> getAlbumList() {
    List<Album> albumList = (List<Album>) this.albumRepository.findAll();
		List<AlbumResponse> albumResponseList = new LinkedList<AlbumResponse>();

		for (Album album : albumList) {
			AlbumResponse albumResponse = AlbumResponseFactory.create(album);
			albumResponseList.add(albumResponse);
		}

		return albumResponseList;
  }

	@Override
	@Transactional
	public AlbumResponse updateAlbum(Long id, AlbumRequest albumRequest) {
		Album album = this.albumRepository.findOne(id);
		BeanUtils.copyProperties(albumRequest, album);
		album = this.albumRepository.save(album);
		AlbumResponse albumResponse = AlbumResponseFactory.create(album);
		return albumResponse;
	}

  @Override
	@Transactional
  public void deleteAlbum(Long id) {
    this.albumRepository.delete(id);
  }

}
