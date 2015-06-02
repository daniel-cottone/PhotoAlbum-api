package gov.tn.portal.vserv.controller.advice;

import com.brahalla.PhotoAlbum.model.ErrorResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

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

	private static final Log log = LogFactory.getLog(GlobalExceptionhandlerController.class);

  // Bad JSON request
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler({HttpMessageNotReadableException.class})
	@ResponseBody
	public ResponseEntity<ErrorResponse> httpMessageNotReadableExceptionHandler(HttpMessageNotReadableException e) {
		log.debug("httpMessageNotReadableExceptionHandler: ", e);
		return new ResponseEntity<>(
			new ErrorResponse(
				"400 - Bad Request",
				"Message not readable, improperly formatted request"
			),
			HttpStatus.BAD_REQUEST
		);
	}

  // Generic exception
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({Exception.class})
  @ResponseBody
	public ResponseEntity<ErrorResponse> exceptionHandler(Exception e) {
		log.debug("exceptionHandler: ", e);
		return new ResponseEntity<>(
			new ErrorResponse(
				"500 - Internal Server Error",
				"Internal server error"
			),
			HttpStatus.BAD_REQUEST
		);
	}

}
