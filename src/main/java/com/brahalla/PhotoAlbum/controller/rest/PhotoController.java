package com.brahalla.PhotoAlbum.controller.rest;

import com.brahalla.PhotoAlbum.model.json.request.PhotoRequest;
import com.brahalla.PhotoAlbum.model.json.response.PhotoResponse;
import com.brahalla.PhotoAlbum.service.PhotoService;

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
@RequestMapping("photos")
public class PhotoController {

	@Autowired
	PhotoService photoService;

	/* CREATE - create a photo
	 * REQUEST: POST /api/photos
	 */
  @RequestMapping(method = RequestMethod.POST)
  public ResponseEntity<?> createPhoto(@Valid @RequestBody PhotoRequest photoRequest) {
    return ResponseEntity.ok(this.photoService.createPhoto(photoRequest));
  }

	/* READ - read a photo
	 * REQUEST: GET /api/photos/{id}
	 */
  @RequestMapping(value = "{id}", method = RequestMethod.GET)
  public ResponseEntity<?> getPhotoById(@PathVariable("id") Long id) {
    return ResponseEntity.ok(this.photoService.getPhotoById(id));
  }

	/* READ - read a list of photos matching request params
	 * REQUEST: GET /api/photos
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> getPhotoList(@RequestParam(value = "albumId", required = false) Long albumId) {
		if (albumId != null) {
			return ResponseEntity.ok(this.photoService.getPhotoListByAlbumId(albumId));
		} else {
			return ResponseEntity.ok(this.photoService.getPhotoList());
		}
	}

	/* UPDATE - update a photo
	 * REQUEST: PUT /api/photos/{id}
	 */
	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
  public ResponseEntity<?> updatePhoto(@PathVariable("id") Long id, @Valid @RequestBody PhotoRequest photoRequest) {
    return ResponseEntity.ok(this.photoService.updatePhoto(id, photoRequest));
  }

	/* DELETE - delete a photo
	 * REQUEST: DELETE /api/photos/{id}
	 */
  @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
  public ResponseEntity<?> deletePhoto(@PathVariable("id") Long id) {
    this.photoService.deletePhoto(id);
		return ResponseEntity.ok(null);
  }

}
