package com.soap.consumer.exception;

import javax.validation.ValidationException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends ValidationException{

	public BadRequestException() {
	}

	public BadRequestException(String message) {
		super(message);
	}

}
