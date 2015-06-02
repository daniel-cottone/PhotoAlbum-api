package com.brahalla.PhotoAlbum.controller.rest;

import com.brahalla.PhotoAlbum.model.Photo;
import com.brahalla.PhotoAlbum.service.PhotoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/photos")
public class PhotoController {

	@Autowired
	PhotoService photoService;

  @RequestMapping(method = RequestMethod.POST)
  public Photo createPhoto(@RequestBody Photo photo) {
    return this.photoService.createPhoto(photo);
  }

  @RequestMapping(value = "{id}", method = RequestMethod.GET)
  public Photo getPhotoById(@PathVariable("id") Integer id) {
    return this.photoService.getPhotoById(id);
  }

	@RequestMapping(method = RequestMethod.GET)
	public List<Photo> getPhotoList() {
		return this.photoService.getPhotoList();
	}

  @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
  public Photo deletePhoto(@PathVariable("id") Integer id) {
    return this.photoService.deletePhoto(id);
  }

}
