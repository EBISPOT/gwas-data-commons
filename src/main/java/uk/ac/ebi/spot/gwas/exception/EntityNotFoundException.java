package uk.ac.ebi.spot.gwas.exception;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String message) {
        super(message);
    }

    public EntityNotFoundException(String entity, Integer id) {
        super(String.format("%s with Id: %s not found",entity, id));
    }

    public EntityNotFoundException(String entity, String attribute, String id) {
        super(String.format("%s with %s: %s not found",entity, attribute, id));
    }

}
