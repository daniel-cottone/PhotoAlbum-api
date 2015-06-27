package com.brahalla.PhotoAlbum.service;

import com.brahalla.PhotoAlbum.domain.entity.User;
import com.brahalla.PhotoAlbum.model.json.UserInfo;

import java.util.List;

public interface UserService {

  public User createUser(UserInfo userInfo);

  public User getUserById(Long id);

  public List<User> getUserList();

  public User updateUser(Long id, UserInfo userInfo);

  public User deleteUser(Long id);

}
