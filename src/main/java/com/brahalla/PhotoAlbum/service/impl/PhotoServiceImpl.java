package com.brahalla.PhotoAlbum.service.impl;

import com.brahalla.PhotoAlbum.dao.PhotoRepository;
import com.brahalla.PhotoAlbum.domain.entity.Photo;
import com.brahalla.PhotoAlbum.domain.factory.PhotoFactory;
import com.brahalla.PhotoAlbum.model.factory.PhotoResponseFactory;
import com.brahalla.PhotoAlbum.model.json.request.PhotoRequest;
import com.brahalla.PhotoAlbum.model.json.response.PhotoResponse;
import com.brahalla.PhotoAlbum.service.PhotoService;

import java.util.LinkedList;
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
  public PhotoResponse createPhoto(PhotoRequest photoRequest) {
		Photo photo = PhotoFactory.create(photoRequest);
		photo = this.photoRepository.save(photo);
		PhotoResponse photoResponse = PhotoResponseFactory.create(photo);
		return photoResponse;
  }

  @Override
  public PhotoResponse getPhotoById(Long id) {
    Photo photo = this.photoRepository.findOne(id);
		PhotoResponse photoResponse = PhotoResponseFactory.create(photo);
		return photoResponse;
  }

  @Override
  public List<PhotoResponse> getPhotoList() {
    List<Photo> photoList = (List<Photo>) this.photoRepository.findAll();
		List<PhotoResponse> photoResponseList = new LinkedList<PhotoResponse>();

		for (Photo photo : photoList) {
			PhotoResponse photoResponse = PhotoResponseFactory.create(photo);
			photoResponseList.add(photoResponse);
		}

		return photoResponseList;
  }

	@Override
	public List<PhotoResponse> getPhotoListByAlbumId(Long albumId) {
		List<Photo> photoList = (List<Photo>) this.photoRepository.findByAlbumId(albumId);
		List<PhotoResponse> photoResponseList = new LinkedList<PhotoResponse>();

		for (Photo photo : photoList) {
			PhotoResponse photoResponse = PhotoResponseFactory.create(photo);
			photoResponseList.add(photoResponse);
		}

		return photoResponseList;
	}

	@Override
	@Transactional
	public PhotoResponse updatePhoto(Long id, PhotoRequest photoRequest) {
		Photo photo = this.photoRepository.findOne(id);
		BeanUtils.copyProperties(photoRequest, photo);
		photo = this.photoRepository.save(photo);
		PhotoResponse photoResponse = PhotoResponseFactory.create(photo);
		return photoResponse;
	}

  @Override
	@Transactional
  public void deletePhoto(Long id) {
    this.photoRepository.delete(id);
  }

}
