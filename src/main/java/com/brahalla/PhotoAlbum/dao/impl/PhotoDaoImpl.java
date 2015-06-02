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

  private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return this.entityManager;
	}

  @PersistenceContext
  public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
  }

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
    String sql = "select p from Photo as p";
    Query query = this.entityManager.createQuery(sql);
    return query.getResultList();
  }

  @Override
  public Photo deletePhoto(Long id) {
    Photo photo = this.getPhotoById(id);
    this.entityManager.remove(photo);
    return photo;
  }

}
