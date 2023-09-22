package com.ovenfo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import ohSolutions.ohRest.util.bean.Response;

@ControllerAdvice
public class SpringExceptionHandler extends ResponseEntityExceptionHandler {
	
	public SpringExceptionHandler() {
	}
	
	@ExceptionHandler({ Exception.class })
	public ResponseEntity<Object> handleAll(Exception ex, WebRequest request) {
		
	    Response 	objRespuesta = new Response();
					objRespuesta.setCorrect(false);
					objRespuesta.setMessage(ex.getMessage());
	    
	    return new ResponseEntity<Object>(objRespuesta, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
