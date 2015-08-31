package com.brahalla.PhotoAlbum.domain.factory;

import com.brahalla.PhotoAlbum.domain.entity.Album;
import com.brahalla.PhotoAlbum.model.json.request.AlbumRequest;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class AlbumFactory implements FactoryBean<Album> {

  public Album create(AlbumRequest albumRequest) {
    return new Album(
      albumRequest.getTitle(),
      new Date(),
      albumRequest.getCoverPhotoId()
    );
  }

  @Override
  public Album getObject() {
    return new Album();
  }

  @Override
  public Class<Album> getObjectType() {
    return Album.class;
  }

  @Override
  public boolean isSingleton() {
    return false;
  }

}
