package com.brahalla.PhotoAlbum.domain.factory;

import com.brahalla.PhotoAlbum.domain.entity.Album;
import com.brahalla.PhotoAlbum.model.json.request.AlbumRequest;

import java.util.Date;

public class AlbumFactory {

  public static Album create(AlbumRequest albumRequest) {
    return new Album(
      albumRequest.getTitle(),
      new Date(),
      albumRequest.getCoverPhotoId()
    );
  }

}
