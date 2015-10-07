package com.brahalla.PhotoAlbum.model.factory;

import com.brahalla.PhotoAlbum.domain.entity.Photo;
import com.brahalla.PhotoAlbum.model.json.response.PhotoResponse;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.ObjectUtils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class PhotoResponseFactory implements FactoryBean<PhotoResponse> {

  @Value("${photoalbum.date.format}")
  private String dateFormat;

  public PhotoResponse create(Photo photo) {
    return new PhotoResponse(
      photo.getId().toString(),
      photo.getTitle(),
      new SimpleDateFormat(this.dateFormat).format(photo.getCreatedDate()),
      photo.getFilePath(),
      ObjectUtils.toString(photo.getAlbumId())
    );
  }

  public List<PhotoResponse> create(List<Photo> photoList) {
    List<PhotoResponse> photoResponseList = new LinkedList<PhotoResponse>();
    photoList.forEach(p -> photoResponseList.add(this.create(p)));
    return photoResponseList;
  }

  public String getDateFormat() {
    return this.dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }

  @Override
  public PhotoResponse getObject() {
    return new PhotoResponse();
  }

  @Override
  public Class<PhotoResponse> getObjectType() {
    return PhotoResponse.class;
  }

  @Override
  public boolean isSingleton() {
    return false;
  }

}
