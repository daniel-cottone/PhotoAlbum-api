package com.brahalla.PhotoAlbum.dao.impl;

import com.brahalla.PhotoAlbum.dao.AlbumDao;
import com.brahalla.PhotoAlbum.model.Album;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class AlbumDaoImpl implements AlbumDao {

  private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return this.entityManager;
	}

  @PersistenceContext
  public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
  }

  @Override
  public Album createAlbum(Album album) {
    return new Album();
  }

  @Override
  public Album getAlbumById(Long id) {
    return this.entityManager.find(Album.class, id);
  }

  @Override
  public List<Album> getAlbumList() {
    return new LinkedList<Album>();
  }

  @Override
  public Album deleteAlbum(Long id) {
    return new Album();
  }

}
