package gov.tn.portal.vserv.controller.advice;

import com.brahalla.PhotoAlbum.model.ErrorResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandlerController {

  /*// No page mapping found
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler({NoHandlerFoundException.class})
  @ResponseBody
  public ResponseEntity<ErrorResponse> noHandlerFoundExceptionHandler(NoHandlerFoundException e) {
    //log.debug("noHandlerFound: stacktrace={}", ExceptionUtils.getStackTrace(e));

    String errorCode = "400 - Bad Request";
    String errorMsg = "Requested URL doesn't exist";

    return new ResponseEntity<>(new ErrorResponse(errorCode, errorMsg), HttpStatus.BAD_REQUEST);
  }*/

  // Bad JSON request
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({HttpMessageNotReadableException.class})
	@ResponseBody
	public Error httpMessageNotReadableExceptionHandler(HttpMessageNotReadableException e) {
		Error error = new Error("HttpMessageNotReadableException");
		return error;
	}

  // Generic exception
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({Exception.class})
  @ResponseBody
	public Error exceptionHandler(Exception e) {
    Error error = new Error("Exception");
		return error;
	}

}
