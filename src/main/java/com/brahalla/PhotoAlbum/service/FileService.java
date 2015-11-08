package com.brahalla.PhotoAlbum.service;

public interface FileService {

  public byte[] serveFile(String filename);

  public void deleteFile(Long id);

}
