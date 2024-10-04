package uk.ac.ebi.spot.gwas.rest.dto;

import lombok.Data;

@Data
public class SearchStudyParams {

    String pubmedId;

    String diseaseTrait;

    String fullPvalueSet;

    String userRequested;

    String shortForm;

    String efoTrait;

    String accessionId;

}
