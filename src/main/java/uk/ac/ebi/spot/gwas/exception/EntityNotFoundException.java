package uk.ac.ebi.spot.gwas.exception;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String message) {
        super(message);
    }

    public EntityNotFoundException(String entity, Integer id) {
        super(String.format("%s Id: %s not found",entity, id));
    }

    public EntityNotFoundException(String message, String detail) {
        super(String.format("%s: %s", message, detail));
    }
}
