package com.brahalla.PhotoAlbum.service.impl;

import com.brahalla.PhotoAlbum.dao.AlbumRepository;
import com.brahalla.PhotoAlbum.domain.entity.Album;
import com.brahalla.PhotoAlbum.domain.factory.AlbumFactory;
import com.brahalla.PhotoAlbum.domain.predicate.builder.AlbumPredicateBuilder;
import com.brahalla.PhotoAlbum.model.json.request.AlbumRequest;
import com.brahalla.PhotoAlbum.service.AlbumService;

import com.mysema.query.types.expr.BooleanExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AlbumServiceImpl implements AlbumService {

	@Autowired
	private AlbumFactory albumFactory;

	@Autowired
	private AlbumRepository albumRepository;

  @Override
	@Transactional
  public Album createAlbum(AlbumRequest albumRequest) {
		Album album = this.albumFactory.create(albumRequest);
    return this.albumRepository.save(album);
  }

  @Override
  public Album getAlbumById(Long id) {
    return this.albumRepository.findOne(id);
  }

	@Override
	public Iterable<Album> getAlbums(String search, Pageable pageable) {
		AlbumPredicateBuilder builder = new AlbumPredicateBuilder();

		if (search != null) {
			Pattern pattern = Pattern.compile("(\\w+?)(:|<|>)(\\w+?),");
			Matcher matcher = pattern.matcher(search + ",");
			while (matcher.find()) {
				builder.with(matcher.group(1), matcher.group(2), matcher.group(3));
			}
		}
		BooleanExpression exp = builder.build();

    return this.albumRepository.findAll(exp, pageable).getContent();
  }

	@Override
	@Transactional
	public Album updateAlbum(Long id, AlbumRequest albumRequest) {
		Album album = this.albumRepository.findOne(id);
		BeanUtils.copyProperties(albumRequest, album);
		return this.albumRepository.save(album);
	}

  @Override
	@Transactional
  public void deleteAlbum(Long id) {
    this.albumRepository.delete(id);
  }

}
