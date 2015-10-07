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
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AlbumServiceImpl implements AlbumService {

	@Autowired
	private AlbumFactory albumFactory;

	@Autowired
	private AlbumResponseFactory albumResponseFactory;

	@Autowired
	private AlbumRepository albumRepository;

  @Override
	@Transactional
  public AlbumResponse createAlbum(AlbumRequest albumRequest) {
		Album album = this.albumFactory.create(albumRequest);
    album = this.albumRepository.save(album);
		return this.albumResponseFactory.create(album);
  }

  @Override
  public AlbumResponse getAlbumById(Long id) {
    Album album = this.albumRepository.findOne(id);
		return this.albumResponseFactory.create(album);
  }

	@Override
	@SuppressWarnings("unchecked")
	public List<AlbumResponse> getAlbumList(String page, String count, String sortDirection, String sortBy) {
    Page result = this.albumRepository.findAll(
			new PageRequest(
				Integer.valueOf(page),
				Integer.valueOf(count),
				new Sort(Sort.Direction.fromStringOrNull(sortDirection), sortBy)
			)
		);
		List<Album> albumList = result.getContent();
		return this.albumResponseFactory.create(albumList);
  }

	@Override
	@Transactional
	public AlbumResponse updateAlbum(Long id, AlbumRequest albumRequest) {
		Album album = this.albumRepository.findOne(id);
		BeanUtils.copyProperties(albumRequest, album);
		album = this.albumRepository.save(album);
		return this.albumResponseFactory.create(album);
	}

  @Override
	@Transactional
  public void deleteAlbum(Long id) {
    this.albumRepository.delete(id);
  }

}
