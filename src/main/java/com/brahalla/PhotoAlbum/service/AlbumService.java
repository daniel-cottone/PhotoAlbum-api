package com.brahalla.PhotoAlbum.service;

import com.brahalla.PhotoAlbum.domain.entity.Album;
import com.brahalla.PhotoAlbum.model.json.request.AlbumRequest;

import org.springframework.data.domain.Pageable;

public interface AlbumService {

  Album createAlbum(AlbumRequest albumRequest);

  Album getAlbumById(Long id);

  Iterable<Album> getAlbums(String search, Pageable pageable);

  Album updateAlbum(Long id, AlbumRequest albumRequest);

  void deleteAlbum(Long id);

}
