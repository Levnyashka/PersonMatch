package ru.vtb.msa.person.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {



    @Override
    protected ResponseEntity<Object> handleNoHandlerFoundException(NoHandlerFoundException ex, HttpHeaders headers,
                                                                   HttpStatus status, WebRequest request) {
        return new ResponseEntity<>(new ApiError(status, "METHOD_ERROR", ex), HttpStatus.METHOD_NOT_ALLOWED);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers, HttpStatus status, WebRequest request) {

        return new ResponseEntity<>(new ApiError(status, "FORMAT_ERROR", ex), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(FormatError.class)
    protected ResponseEntity<Object> handleEntityNotFoundEx(FormatError ex) {
        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, "FORMAT_ERROR", ex);
        return new ResponseEntity<>(apiError, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(SystemTimeout.class)
    protected ResponseEntity<Object> handleSoapTimeOutEx(SystemTimeout ex) {
        ApiError apiError = new ApiError(HttpStatus.REQUEST_TIMEOUT, "SYSTEM_TIMEOUT", ex);
        return new ResponseEntity<>(apiError, HttpStatus.REQUEST_TIMEOUT);
    }

    @ExceptionHandler(SystemOffline.class)
    protected ResponseEntity<Object> handleConnectionEx(SystemOffline ex) {
        ApiError apiError = new ApiError(HttpStatus.SERVICE_UNAVAILABLE, "SYSTEM_OFFLINE", ex);
        return new ResponseEntity<>(apiError, HttpStatus.SERVICE_UNAVAILABLE);
    }



}
