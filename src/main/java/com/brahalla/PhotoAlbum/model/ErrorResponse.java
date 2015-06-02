package com.brahalla.PhotoAlbum.model;

import java.io.Serializable;


public class ErrorResponse implements Serializable {

  //private static final long serialVersionUID = ;
  private String error;

  public ErrorResponse() {
    this();
  }

  public ErrorResponse(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public String toString() {

		final String tab = "    ";

		StringBuilder retValue = new StringBuilder();

		retValue.append("ErrorResponse ( ")
			.append(super.toString()).append(tab)
			.append("error = ").append(this.error).append(tab)
			.append(" )");

		return retValue.toString();
	}

}
