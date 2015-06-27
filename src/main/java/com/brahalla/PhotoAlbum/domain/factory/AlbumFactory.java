package com.brahalla.PhotoAlbum.domain.factory;

import com.brahalla.PhotoAlbum.domain.entity.Album;
import com.brahalla.PhotoAlbum.model.json.AlbumInfo;

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
