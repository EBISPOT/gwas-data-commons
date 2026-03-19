package uk.ac.ebi.spot.gwas.exception;

public class SlurmProcessException extends RuntimeException{

    public SlurmProcessException(String message) {
        super(message);
    }
}
