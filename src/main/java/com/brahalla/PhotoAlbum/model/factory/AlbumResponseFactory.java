package com.brahalla.PhotoAlbum.model.factory;

import com.brahalla.PhotoAlbum.domain.entity.Album;
import com.brahalla.PhotoAlbum.model.json.response.AlbumResponse;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AlbumResponseFactory {

  private static final String dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

  public static AlbumResponse create(Album album) {
    return new AlbumResponse(
      album.getId(),
      album.getTitle(),
      new SimpleDateFormat(dateFormat).format(album.getCreatedDate()),
      album.getCoverPhotoId()
    );
  }

}
