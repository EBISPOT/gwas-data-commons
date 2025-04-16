package uk.ac.ebi.spot.gwas.exception;

public class IllegalArgumentException extends RuntimeException {
    public IllegalArgumentException(String message, String data) {
        super(String.format("%s %s is not allowed",message, data));
    }
}
