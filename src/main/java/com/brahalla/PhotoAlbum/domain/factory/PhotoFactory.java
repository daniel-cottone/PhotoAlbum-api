package com.brahalla.PhotoAlbum.domain.factory;

import com.brahalla.PhotoAlbum.domain.entity.Photo;
import com.brahalla.PhotoAlbum.model.json.request.PhotoRequest;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class PhotoFactory implements FactoryBean<Photo> {

  public Photo create(PhotoRequest photoRequest) {
    return new Photo(
      photoRequest.getTitle(),
      new Date(),
      photoRequest.getFilePath(),
      photoRequest.getAlbumId()
    );
  }

  @Override
  public Photo getObject() {
    return new Photo();
  }

  @Override
  public Class<Photo> getObjectType() {
    return Photo.class;
  }

  @Override
  public boolean isSingleton() {
    return false;
  }

}
