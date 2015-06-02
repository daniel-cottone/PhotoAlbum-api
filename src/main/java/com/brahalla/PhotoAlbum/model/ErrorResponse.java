package com.brahalla.PhotoAlbum.model;

import java.io.Serializable;


public class ErrorResponse implements Serializable {

  //private static final long serialVersionUID = ;
  private String errorCode;
  private String errorMessage;

  public ErrorResponse() {
    super();
  }

  public ErrorResponse(String errorCode, String errorMessage) {
    this.setErrorCode(errorCode);
    this.setErrorMessage(errorMessage);
  }

  public String getErrorCode() {
    return this.errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public String getErrorMessage() {
    return this.errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public String toString() {

		final String tab = "    ";

		StringBuilder retValue = new StringBuilder();

		retValue.append("ErrorResponse ( ")
			.append(super.toString()).append(tab)
			.append("errorCode = ").append(this.errorCode).append(tab)
      .append("errorMessage = ").append(this.errorMessage).append(tab)
			.append(" )");

		return retValue.toString();
	}

}
