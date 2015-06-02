package com.brahalla.PhotoAlbum.factory;

import com.brahalla.PhotoAlbum.domain.Photo;
import com.brahalla.PhotoAlbum.model.PhotoInfo;

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
