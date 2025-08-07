package uk.ac.ebi.spot.gwas.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;

@Slf4j
@ControllerAdvice
public class ExceptionHandlerAdvice extends ResponseEntityExceptionHandler {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFound(EntityNotFoundException ex, HttpServletRequest req) {
        ErrorResponse error = ErrorResponse.basicResponse(HttpStatus.NOT_FOUND, ex, req, dateFormat);
        log.error(error.toString());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(FormatException.class)
    public ResponseEntity<ErrorResponse> handleParseException(FormatException ex, HttpServletRequest req) {
        ErrorResponse error = ErrorResponse.basicResponse(HttpStatus.BAD_REQUEST, ex, req, dateFormat);
        log.error(error.toString());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ForbiddenException.class)
    public ResponseEntity<ErrorResponse> handleForbidden(ForbiddenException ex, HttpServletRequest req) {
        ErrorResponse error = ErrorResponse.basicResponse(HttpStatus.CONFLICT, ex, req, dateFormat);
        log.error(error.toString());
        return new ResponseEntity<>(error, HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(FileNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleFileException(FileNotFoundException ex, HttpServletRequest req) {
        ErrorResponse error = ErrorResponse.basicResponse(HttpStatus.NOT_FOUND, ex, req, dateFormat);
        log.error(error.toString());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(java.lang.IllegalArgumentException.class)
    public ResponseEntity<ErrorResponse> handleIllegalArgumentExceptionException(java.lang.IllegalArgumentException ex, HttpServletRequest req) {
        ErrorResponse error = ErrorResponse.basicResponse(HttpStatus.NOT_ACCEPTABLE, ex, req, dateFormat);
        log.error("Exception stacktrace "+ ex.getMessage(), ex);
        log.error(error.toString());
        return new ResponseEntity<>(error, HttpStatus.NOT_ACCEPTABLE);
    }


}
