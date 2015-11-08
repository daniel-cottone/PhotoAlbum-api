package com.brahalla.PhotoAlbum.domain.predicate;

import com.brahalla.PhotoAlbum.domain.base.DomainBase;

public class SearchCriteria extends DomainBase {

  //private static final long serialVersionUID = ;
  private String key;
  private String operation;
  private Object value;

  public SearchCriteria() {
    super();
  }

  public SearchCriteria(String key, String operation, Object value) {
    this.setKey(key);
    this.setOperation(operation);
    this.setValue(value);
  }

  public String getKey() {
    return this.key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getOperation() {
    return this.operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public Object getValue() {
    return this.value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

}
