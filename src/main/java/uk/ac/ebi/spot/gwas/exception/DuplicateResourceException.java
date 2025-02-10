package uk.ac.ebi.spot.gwas.exception;

public class DuplicateResourceException extends RuntimeException {

    public DuplicateResourceException(String message) {
        super(message);
    }

    public DuplicateResourceException(String resourceName, String entry) {
        super(String.format("Duplicate entry %s not allowed for resource %s", entry, resourceName));
    }
}
