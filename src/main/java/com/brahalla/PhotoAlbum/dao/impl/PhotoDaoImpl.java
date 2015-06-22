package com.brahalla.PhotoAlbum.dao.impl;

import com.brahalla.PhotoAlbum.dao.PhotoDao;
import com.brahalla.PhotoAlbum.domain.Photo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class PhotoDaoImpl implements PhotoDao {

  @PersistenceContext
  private EntityManager entityManager;

  @Override
  public Photo createPhoto(Photo photo) {
    if (photo.getId() == null) {
			entityManager.persist(photo);
		}
		else {
			// TODO
		}
		return photo;
  }

  @Override
  public Photo getPhotoById(Long id) {
    return this.entityManager.find(Photo.class, id);
  }

  @Override
  public List<Photo> getPhotoList() {
    String jpql = "select p from Photo as p";
    Query query = this.entityManager.createQuery(jpql);
    return query.getResultList();
  }

  @Override
  public List<Photo> getPhotoListByAlbumId(Long albumId) {
    String jpql = "select p from Photo as p where p.albumId = :albumId";
    Query query = this.entityManager.createQuery(jpql);
    query.setParameter("albumId", albumId);
    return query.getResultList();
  }

  @Override
  public Photo updatePhoto(Photo photo) {
    if (photo.getId() != null) {
      entityManager.merge(photo);
    }
    else {
      // TODO
    }
    return photo;
  }

  @Override
  public Photo deletePhoto(Long id) {
    Photo photo = this.getPhotoById(id);
    this.entityManager.remove(photo);
    return photo;
  }

}
