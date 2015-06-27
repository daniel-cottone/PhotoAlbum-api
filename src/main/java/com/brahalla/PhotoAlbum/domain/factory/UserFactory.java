package com.brahalla.PhotoAlbum.domain.factory;

import com.brahalla.PhotoAlbum.domain.entity.User;
import com.brahalla.PhotoAlbum.model.json.UserInfo;

public class UserFactory {

  public static User createUser(UserInfo userInfo) {
    return new User(
      userInfo.getUsername(),
      userInfo.getPassword()
    );
  }

}
