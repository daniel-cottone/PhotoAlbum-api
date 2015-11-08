package com.brahalla.PhotoAlbum.domain.factory;

import com.brahalla.PhotoAlbum.domain.entity.Album;
import com.brahalla.PhotoAlbum.model.json.request.AlbumRequest;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

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

  public List<Album> create(List<AlbumRequest> albumRequestList) {
    List<Album> albumList = new LinkedList<Album>();
    if (albumRequestList != null) {
      albumRequestList.forEach(a -> albumList.add(this.create(a)));
    }
    return albumList;
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
    return true;
  }

}
