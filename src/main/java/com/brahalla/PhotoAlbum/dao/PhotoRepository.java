package com.brahalla.PhotoAlbum.dao;

import com.brahalla.PhotoAlbum.domain.entity.Photo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface PhotoRepository extends JpaRepository<Photo, Long>, QueryDslPredicateExecutor<Photo> {

}
