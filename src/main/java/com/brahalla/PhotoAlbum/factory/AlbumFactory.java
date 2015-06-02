package com.brahalla.PhotoAlbum.factory;

import com.brahalla.PhotoAlbum.domain.Album;
import com.brahalla.PhotoAlbum.model.AlbumInfo;

import java.util.Date;


public class AlbumFactory {

  public static Album createAlbum(AlbumInfo albumInfo) {
    return new Album(
      albumInfo.getTitle(),
      new Date(),
      albumInfo.getCoverPhotoId()
    );
  }

}
