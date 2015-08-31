package com.brahalla.PhotoAlbum.controller.rest;

import com.brahalla.PhotoAlbum.model.json.request.AlbumRequest;
import com.brahalla.PhotoAlbum.model.json.response.AlbumResponse;
import com.brahalla.PhotoAlbum.service.AlbumService;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${photoalbum.route.albums}")
public class AlbumController {

	@Autowired
	AlbumService albumService;

	/* CREATE - create an album
	 * POST /api/albums
	 */
  @RequestMapping(method = RequestMethod.POST)
  public ResponseEntity<?> createAlbum(@Valid @RequestBody AlbumRequest albumRequest) {
    return ResponseEntity.ok(this.albumService.createAlbum(albumRequest));
  }

	/* READ - read an album
	 * REQUEST: GET /api/albums/{id}
	 */
  @RequestMapping(value = "{id}", method = RequestMethod.GET)
  public ResponseEntity<?> getAlbumById(@PathVariable("id") Long id) {
    return ResponseEntity.ok(this.albumService.getAlbumById(id));
  }

	/* READ - read all albums
	 * REQUEST: GET /api/albums
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> getAlbumList() {
		return ResponseEntity.ok(this.albumService.getAlbumList());
	}

	/* UPDATE - update an album
	 * REQUEST: PUT /api/albums/{id}
	 */
	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
  public ResponseEntity<?> updateAlbum(@PathVariable("id") Long id, @Valid @RequestBody AlbumRequest albumRequest) {
    return ResponseEntity.ok(this.albumService.updateAlbum(id, albumRequest));
  }

	/* DELETE - delete an album
	 * REQUEST: DELETE /api/albums/{id}
	 */
  @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
  public ResponseEntity<?> deleteAlbum(@PathVariable("id") Long id) {
    this.albumService.deleteAlbum(id);
		return ResponseEntity.ok(null);
  }

}
