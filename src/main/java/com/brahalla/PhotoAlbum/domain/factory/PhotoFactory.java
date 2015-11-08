package com.brahalla.PhotoAlbum.domain.factory;

import com.brahalla.PhotoAlbum.domain.entity.Photo;
import com.brahalla.PhotoAlbum.model.json.request.PhotoRequest;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

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

  public List<Photo> create(List<PhotoRequest> photoRequestList) {
    List<Photo> photoList = new LinkedList<Photo>();
    if (photoRequestList != null) {
      photoRequestList.forEach(p -> photoList.add(this.create(p)));
    }
    return photoList;
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
    return true;
  }

}
