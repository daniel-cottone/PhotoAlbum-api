package com.brahalla.PhotoAlbum.controller.rest;

import com.brahalla.PhotoAlbum.service.FileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("${photoalbum.route.files}")
public class FileController {

  @Autowired
  FileService fileService;

  @RequestMapping(value = "{filename:.+}", method = RequestMethod.GET)
  public byte[] serveFile(@PathVariable("filename") String filename) {
    return this.fileService.serveFile(filename);
  }

}
