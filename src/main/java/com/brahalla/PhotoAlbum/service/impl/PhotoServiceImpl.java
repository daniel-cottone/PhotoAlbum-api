package com.brahalla.PhotoAlbum.service.impl;

import com.brahalla.PhotoAlbum.dao.PhotoDao;
import com.brahalla.PhotoAlbum.domain.Photo;
import com.brahalla.PhotoAlbum.service.PhotoService;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PhotoServiceImpl implements PhotoService {

	@Autowired
	private PhotoDao photoDao;

  @Override
  public Photo createPhoto(Photo photo) {
    return this.photoDao.createPhoto(photo);
  }

  @Override
  public Photo getPhotoById(Long id) {
    return this.photoDao.getPhotoById(id);
  }

  @Override
  public List<Photo> getPhotoList() {
    return this.photoDao.getPhotoList();
  }

  @Override
  public Photo deletePhoto(Long id) {
    return this.photoDao.deletePhoto(id);
  }

}
