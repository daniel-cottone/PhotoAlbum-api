package com.brahalla.PhotoAlbum.domain.factory;

import com.brahalla.PhotoAlbum.domain.entity.Photo;
import com.brahalla.PhotoAlbum.model.json.request.PhotoRequest;

import java.util.Date;

public class PhotoFactory {

  public static Photo createPhoto(PhotoRequest photoRequest) {
    return new Photo(
      photoRequest.getTitle(),
      new Date(),
      photoRequest.getFilePath(),
      photoRequest.getAlbumId()
    );
  }

}
