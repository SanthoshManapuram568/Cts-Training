package com.cts.training.product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalHandler {
	@ExceptionHandler  // ~catch
	public ResponseEntity<ProductErrorResponse> productNotFoundHandler(ProductNotFoundException ex) {
		// create error object
		ProductErrorResponse error = new ProductErrorResponse(ex.getMessage(), 
															  HttpStatus.NOT_FOUND.value(), 
															  System.currentTimeMillis());
		ResponseEntity<ProductErrorResponse> response =
										new ResponseEntity<ProductErrorResponse>(error, HttpStatus.NOT_FOUND);
		
		return response;
	}
	
	@ExceptionHandler  // ~catch
	public ResponseEntity<ProductErrorResponse> productOperationErrorHAndler(Exception ex) {
		// create error object
		ProductErrorResponse error = new ProductErrorResponse(ex.getMessage(), 
															  HttpStatus.BAD_REQUEST.value(), 
															  System.currentTimeMillis());
		ResponseEntity<ProductErrorResponse> response =
										new ResponseEntity<ProductErrorResponse>(error, HttpStatus.NOT_FOUND);
		
		return response;
	}


}
