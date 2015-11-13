package com.brahalla.PhotoAlbum.model.factory;

import com.brahalla.PhotoAlbum.model.json.error.ErrorMessage;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class ErrorMessageFactory implements FactoryBean<ErrorMessage> {

  public ErrorMessage create(HttpStatus status, Exception e, List<String> errors) {
    return new ErrorMessage(
      status.toString(),
      status.getReasonPhrase(),
      e.getClass().getName(),
      errors
    );
  }

  @Override
  public ErrorMessage getObject() {
    return new ErrorMessage();
  }

  @Override
  public Class<ErrorMessage> getObjectType() {
    return ErrorMessage.class;
  }

  @Override
  public boolean isSingleton() {
    return true;
  }

}
