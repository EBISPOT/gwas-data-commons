package uk.ac.ebi.spot.gwas.rest.dto;

import lombok.Data;

@Data
public class SearchSnpParams {

    String rsId = null;

    Integer bpLocation = null;

    String chromosome = null;

    Long bpStart = null;

    Long bpEnd = null;

    String pubmedId = null;

    String gene =  null;

}
