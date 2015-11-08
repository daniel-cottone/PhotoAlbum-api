package com.brahalla.PhotoAlbum.controller.rest;

import com.brahalla.PhotoAlbum.model.json.request.PhotoRequest;
import com.brahalla.PhotoAlbum.service.PhotoService;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${photoalbum.route.photos}")
public class PhotoController {

	@Autowired
	PhotoService photoService;

	/* CREATE - create a photo
	 * REQUEST: POST /api/photos
	 */
  @RequestMapping(method = RequestMethod.POST)
  public ResponseEntity<?> createPhoto(@Valid @RequestBody PhotoRequest photoRequest) {
    return new ResponseEntity<>(this.photoService.createPhoto(photoRequest), HttpStatus.CREATED);
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
	public ResponseEntity<?> getPhotos(
		@RequestParam(value = "search", required = false) String search,
		@PageableDefault(sort = "createdDate") Pageable pageable) {
			return ResponseEntity.ok(this.photoService.getPhotos(search, pageable));
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
