package com.brahalla.PhotoAlbum.model.error;

import com.brahalla.PhotoAlbum.model.base.CommonModelBase;

public class ErrorResponse extends CommonModelBase {

  private static final long serialVersionUID = -5418511377272830807L;
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

}
