package com.brahalla.PhotoAlbum.controller.advice;

import com.brahalla.PhotoAlbum.model.factory.ErrorMessageFactory;
import com.brahalla.PhotoAlbum.model.json.error.ErrorMessage;

import java.util.Locale;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ValidationControllerAdvice {

  @Autowired
  private MessageSource messageSource;

  @Autowired
  private ErrorMessageFactory errorMessageFactory;

  @ExceptionHandler(MethodArgumentNotValidException.class)
  @ResponseBody
  public ResponseEntity<?> processValidationErrors(MethodArgumentNotValidException exception) {
    BindingResult result = exception.getBindingResult();
    List<FieldError> errors = result.getFieldErrors();
    List<String> errorMessages = new LinkedList<String>();
    Locale currentLocale = LocaleContextHolder.getLocale();

    if (errors != null) {
      errors.forEach(e -> errorMessages.add(messageSource.getMessage(e.getDefaultMessage(), null, currentLocale)));
    }

    return new ResponseEntity<>(this.errorMessageFactory.create(errorMessages), HttpStatus.BAD_REQUEST);
  }

}
