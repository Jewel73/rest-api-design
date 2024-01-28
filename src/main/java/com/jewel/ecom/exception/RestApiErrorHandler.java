package com.jewel.ecom.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Locale;

@ControllerAdvice
public class RestApiErrorHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> handleException(HttpServletRequest request, Exception e, Locale locale){
        Error error = ErrorUtils.createError(ErrorCode.GENERIC_ERROR.getErrorCode(), ErrorCode.GENERIC_ERROR.getErrorMsgKey(), HttpStatus.INTERNAL_SERVER_ERROR.value());
        error.setUrl(request.getRequestURI());
        error.setReqMethod(request.getMethod());
        return new ResponseEntity<Error>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public ResponseEntity<Error> handleHttpMediaTypeNotSupportedException(HttpServletRequest request, Exception e, Locale locale){
        Error error = ErrorUtils.createError( ErrorCode.HTTP_MEDIATYPE_NOT_SUPPORTED.getErrorCode(), ErrorCode.HTTP_MEDIATYPE_NOT_SUPPORTED.getErrorMsgKey(), HttpStatus.UNSUPPORTED_MEDIA_TYPE.value());
        error.setUrl(request.getRequestURI());
        error.setReqMethod(request.getMethod());
        return new ResponseEntity<>(error, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }
}
