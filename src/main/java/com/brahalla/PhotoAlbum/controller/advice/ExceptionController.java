package gov.tn.portal.vserv.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionController {

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({HttpMessageNotReadableException.class})
	@ResponseBody
	public Error handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
		Error error = new Error("HttpMessageNotReadableException");
		return error;
	}

  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({Exception.class})
  @ResponseBody
	public Error handleException(Exception e) {
    Error error = new Error("Exception");
		return error;
	}

}
