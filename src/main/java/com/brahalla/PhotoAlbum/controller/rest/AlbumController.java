package com.brahalla.PhotoAlbum.controller.rest;

import com.brahalla.PhotoAlbum.domain.entity.Album;
import com.brahalla.PhotoAlbum.model.json.AlbumInfo;
import com.brahalla.PhotoAlbum.service.AlbumService;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
  public Album createAlbum(@Valid @RequestBody AlbumInfo albumInfo) {
    return this.albumService.createAlbum(albumInfo);
  }

	/* READ - read an album
	 * REQUEST: GET /api/albums/{id}
	 */
  @RequestMapping(value = "{id}", method = RequestMethod.GET)
  public Album getAlbumById(@PathVariable("id") Long id) {
    return this.albumService.getAlbumById(id);
  }

	/* READ - read all albums
	 * REQUEST: GET /api/albums
	 */
	@RequestMapping(method = RequestMethod.GET)
	public List<Album> getAlbumList() {
		return this.albumService.getAlbumList();
	}

	/* UPDATE - update an album
	 * REQUEST: PUT /api/albums/{id}
	 */
	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
  public Album updateAlbum(@PathVariable("id") Long id, @Valid @RequestBody AlbumInfo albumInfo) {
    return this.albumService.updateAlbum(id, albumInfo);
  }

	/* DELETE - delete an album
	 * REQUEST: DELETE /api/albums/{id}
	 */
  @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
  public Album deleteAlbum(@PathVariable("id") Long id) {
    this.albumService.deleteAlbum(id);
		return new Album();
  }

}
