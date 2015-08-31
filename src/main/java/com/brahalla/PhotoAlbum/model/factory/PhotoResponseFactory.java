package com.brahalla.PhotoAlbum.model.factory;

import com.brahalla.PhotoAlbum.domain.entity.Photo;
import com.brahalla.PhotoAlbum.model.json.response.PhotoResponse;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PhotoResponseFactory {

  private static final String dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

  public static PhotoResponse create(Photo photo) {
    return new PhotoResponse(
      photo.getId(),
      photo.getTitle(),
      new SimpleDateFormat(dateFormat).format(photo.getCreatedDate()),
      photo.getFilePath(),
      photo.getAlbumId()
    );
  }

}
