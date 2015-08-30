package com.brahalla.PhotoAlbum.service.impl;

import com.brahalla.PhotoAlbum.dao.PhotoRepository;
import com.brahalla.PhotoAlbum.domain.entity.Photo;
import com.brahalla.PhotoAlbum.domain.factory.PhotoFactory;
import com.brahalla.PhotoAlbum.model.json.request.PhotoRequest;
import com.brahalla.PhotoAlbum.service.PhotoService;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PhotoServiceImpl implements PhotoService {

	@Autowired
	private PhotoRepository photoRepository;

  @Override
	@Transactional
  public Photo createPhoto(PhotoRequest photoRequest) {
		Photo photo = PhotoFactory.create(photoRequest);
		return this.photoRepository.save(photo);
  }

  @Override
  public Photo getPhotoById(Long id) {
    return this.photoRepository.findOne(id);
  }

  @Override
  public List<Photo> getPhotoList() {
    return (List<Photo>) this.photoRepository.findAll();
  }

	@Override
	public List<Photo> getPhotoListByAlbumId(Long albumId) {
		return this.photoRepository.findByAlbumId(albumId);
	}

	@Override
	@Transactional
	public Photo updatePhoto(Long id, PhotoRequest photoRequest) {
		Photo photo = this.photoRepository.findOne(id);
		BeanUtils.copyProperties(photoRequest, photo);
		return this.photoRepository.save(photo);
	}

  @Override
	@Transactional
  public Photo deletePhoto(Long id) {
    this.photoRepository.delete(id);
		return new Photo();
  }

}
