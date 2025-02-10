package uk.ac.ebi.spot.gwas.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String entity, Integer id) {
        super(String.format("%s Id: %s not found",entity, id));
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, String detail) {
        super(String.format("%s: %s", message, detail));
    }
}
