package com.brahalla.PhotoAlbum.controller.rest;

import com.brahalla.PhotoAlbum.model.Album;
import com.brahalla.PhotoAlbum.service.AlbumService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/api/albums")
public class AlbumController {

	@Autowired
	AlbumService albumService;

  @RequestMapping(value = "/api/albums", method = RequestMethod.POST)
  @ResponseBody
  public Album createAlbum(@RequestBody Album album) {
    return this.albumService.createAlbum(album);
  }

  @RequestMapping(value = "/api/albums/{id}", method = RequestMethod.GET)
  @ResponseBody
  public Album getAlbumById(@PathVariable("id") Integer id) {
    return this.albumService.getAlbumById(id);
  }

	@RequestMapping(value = "/api/albums", method = RequestMethod.GET)
	@ResponseBody
	public List<Album> getAlbumList() {
		return this.albumService.getAlbumList();
	}

  @RequestMapping(value = "/api/albums/{id}", method = RequestMethod.DELETE)
  @ResponseBody
  public Album deleteAlbum(@PathVariable("id") Integer id) {
    return this.albumService.deleteAlbum(id);
  }

}
