package com.brahalla.PhotoAlbum.controller.rest;

import com.brahalla.PhotoAlbum.model.Photo;
import com.brahalla.PhotoAlbum.service.PhotoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/api/photos")
public class PhotoController {

	@Autowired
	PhotoService photoService;

  @RequestMapping(value = "/api/photos", method = RequestMethod.POST)
  @ResponseBody
  public Photo createPhoto(@RequestBody Photo photo) {
    return this.photoService.createPhoto(photo);
  }

  @RequestMapping(value = "/api/photos/{id}", method = RequestMethod.GET)
  @ResponseBody
  public Photo getPhotoById(@PathVariable("id") Integer id) {
    return this.photoService.getPhotoById(id);
  }

	@RequestMapping(value = "/api/photos", method = RequestMethod.GET)
	@ResponseBody
	public List<Photo> getPhotoList() {
		return this.photoService.getPhotoList();
	}

  @RequestMapping(value = "/api/photos/{id}", method = RequestMethod.DELETE)
  @ResponseBody
  public Photo deletePhoto(@PathVariable("id") Integer id) {
    return this.photoService.deletePhoto(id);
  }

}
