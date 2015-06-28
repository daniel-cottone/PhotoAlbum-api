package com.brahalla.PhotoAlbum.model.json.response;

import com.brahalla.PhotoAlbum.model.base.CommonModelBase;

public class LoginResponse extends CommonModelBase {

  //private static final long serialVersionUID = ;
  private String token;

  public LoginResponse() {
    super();
  }

  public LoginResponse(String token) {
    this.setToken(token);
  }

  public String getToken() {
    return this.token;
  }

  public void setToken(String token) {
    this.token = token;
  }

}
