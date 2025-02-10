package uk.ac.ebi.spot.gwas.exception;

public class FileNotFoundException extends RuntimeException {

    public FileNotFoundException(String fileName) {
        super(String.format("File : %s was not found",fileName));
    }

}
