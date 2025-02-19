package uk.ac.ebi.spot.gwas.exception;

public class MethodArgumentNotValidException extends RuntimeException {
    public MethodArgumentNotValidException() {
        super("There is an error");
    }
}
