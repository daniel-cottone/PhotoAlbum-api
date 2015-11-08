package com.brahalla.PhotoAlbum.service.impl;

import com.brahalla.PhotoAlbum.dao.FileRepository;
import com.brahalla.PhotoAlbum.domain.entity.File;
import com.brahalla.PhotoAlbum.domain.factory.FileFactory;
import com.brahalla.PhotoAlbum.service.FileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileServiceImpl implements FileService {

  @Autowired
  private FileRepository fileRepository;

  @Override
  public byte[] serveFile(String filename) {
    File file = this.fileRepository.findByFilename(filename);
    return file.getData();
  }

  @Override
  @Transactional
  public void deleteFile(Long id) {
    this.fileRepository.delete(id);
  }

}
