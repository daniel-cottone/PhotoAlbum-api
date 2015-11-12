package com.brahalla.PhotoAlbum.model.factory;

import com.brahalla.PhotoAlbum.model.json.error.ErrorMessage;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class ErrorMessageFactory implements FactoryBean<ErrorMessage> {

  public ErrorMessage create(List<String> errors) {
    return new ErrorMessage(
      errors
    );
  }

  /*public List<ErrorMessage> create(List<List<String>> errorsList) {
    List<ErrorMessage> errorMessageList = new LinkedList<ErrorMessage>();
    if (errorsList != null) {
      errorsList.forEach(e -> errorMessageList.add(this.create(e)));
    }
    return errorMessageList;
  }*/

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
