package com.brahalla.PhotoAlbum.domain.factory;

import com.brahalla.PhotoAlbum.domain.entity.Photo;
import com.brahalla.PhotoAlbum.model.json.PhotoInfo;

import java.util.Date;

public class PhotoFactory {

  public static Photo createPhoto(PhotoInfo photoInfo) {
    return new Photo(
      photoInfo.getTitle(),
      new Date(),
      photoInfo.getFilePath(),
      photoInfo.getAlbumId()
    );
  }

}
