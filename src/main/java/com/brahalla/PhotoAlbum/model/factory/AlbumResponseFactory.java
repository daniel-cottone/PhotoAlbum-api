package com.brahalla.PhotoAlbum.model.factory;

import com.brahalla.PhotoAlbum.domain.entity.Album;
import com.brahalla.PhotoAlbum.model.json.response.AlbumResponse;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.ObjectUtils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class AlbumResponseFactory implements FactoryBean<AlbumResponse> {

  @Value("${photoalbum.date.format}")
  private String dateFormat;

  public AlbumResponse create(Album album) {
    return new AlbumResponse(
      album.getId().toString(),
      album.getTitle(),
      new SimpleDateFormat(this.dateFormat).format(album.getCreatedDate()),
      ObjectUtils.toString(album.getCoverPhotoId())
    );
  }

  public String getDateFormat() {
    return this.dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }

  @Override
  public AlbumResponse getObject() {
    return new AlbumResponse();
  }

  @Override
  public Class<AlbumResponse> getObjectType() {
    return AlbumResponse.class;
  }

  @Override
  public boolean isSingleton() {
    return false;
  }

}
