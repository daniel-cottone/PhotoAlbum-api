package com.brahalla.PhotoAlbum.service.impl;

import com.brahalla.PhotoAlbum.dao.PhotoRepository;
import com.brahalla.PhotoAlbum.domain.entity.Photo;
import com.brahalla.PhotoAlbum.domain.factory.PhotoFactory;
import com.brahalla.PhotoAlbum.domain.predicate.builder.PhotoPredicateBuilder;
import com.brahalla.PhotoAlbum.model.json.request.PhotoRequest;
import com.brahalla.PhotoAlbum.service.PhotoService;

import com.mysema.query.types.expr.BooleanExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PhotoServiceImpl implements PhotoService {

	@Autowired
	private PhotoFactory photoFactory;

	@Autowired
	private PhotoRepository photoRepository;

  @Override
	@Transactional
  public Photo createPhoto(PhotoRequest photoRequest) {
		Photo photo = this.photoFactory.create(photoRequest);
		return this.photoRepository.save(photo);
  }

  @Override
  public Photo getPhotoById(Long id) {
    return this.photoRepository.findOne(id);
  }

  @Override
  public Iterable<Photo> getPhotos(String search, Pageable pageable) {
		PhotoPredicateBuilder builder = new PhotoPredicateBuilder();

		if (search != null) {
			Pattern pattern = Pattern.compile("(\\w+?)(:|<|>)(\\w+?),");
			Matcher matcher = pattern.matcher(search + ",");
			while (matcher.find()) {
				builder.with(matcher.group(1), matcher.group(2), matcher.group(3));
			}
		}
		BooleanExpression exp = builder.build();

		return this.photoRepository.findAll(exp, pageable).getContent();
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
  public void deletePhoto(Long id) {
    this.photoRepository.delete(id);
  }

}
