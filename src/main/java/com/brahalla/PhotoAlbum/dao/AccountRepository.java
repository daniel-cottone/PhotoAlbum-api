package com.brahalla.PhotoAlbum.dao;

import com.brahalla.PhotoAlbum.domain.entity.Account;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {

  public Account findByUsername(String username);

}
