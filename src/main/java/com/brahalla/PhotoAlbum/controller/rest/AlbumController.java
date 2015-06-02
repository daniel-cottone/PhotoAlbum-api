package com.brahalla.PhotoAlbum.controller.rest;

import com.brahalla.PhotoAlbum.domain.Album;
import com.brahalla.PhotoAlbum.model.AlbumInfo;
import com.brahalla.PhotoAlbum.service.AlbumService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("albums")
public class AlbumController {

	@Autowired
	AlbumService albumService;

	/* CREATE - create an album
	 * POST /api/albums
	 */
  @RequestMapping(method = RequestMethod.POST)
  public Album createAlbum(@RequestBody AlbumInfo albumInfo) {
    return this.albumService.createAlbum(albumInfo);
  }

	/* READ - read an album
	 * GET /api/albums/{id}
	 */
  @RequestMapping(value = "{id}", method = RequestMethod.GET)
  public Album getAlbumById(@PathVariable("id") Long id) {
    return this.albumService.getAlbumById(id);
  }

	/* READ - read all albums
	 * GET /api/albums
	 */
	@RequestMapping(method = RequestMethod.GET)
	public List<Album> getAlbumList() {
		return this.albumService.getAlbumList();
	}

	/* DELETE - delete an album
	 * DELETE /api/albums/{id}
	 */
  @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
  public Album deleteAlbum(@PathVariable("id") Long id) {
    return this.albumService.deleteAlbum(id);
  }

}
