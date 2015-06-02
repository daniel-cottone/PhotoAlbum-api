package com.brahalla.PhotoAlbum.service.impl;

import com.brahalla.PhotoAlbum.dao.PhotoDao;
import com.brahalla.PhotoAlbum.model.Photo;
import com.brahalla.PhotoAlbum.service.PhotoService;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PhotoServiceImpl implements PhotoService {

	/*@Autowired
	private PhotoDao photoDao;*/

  @Override
  public Photo createPhoto(Photo photo) {
    return new Photo();
  }

  @Override
  public Photo getPhotoById(Integer id) {
    return new Photo();
  }

  @Override
  public List<Photo> getPhotoList() {
    return new LinkedList<Photo>();
  }

  @Override
  public Photo deletePhoto(Integer id) {
    return new Photo();
  }

}
