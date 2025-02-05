package uk.ac.ebi.spot.gwas.rest.dto;

import lombok.Data;

@Data
public class SearchStudyParams {

    String pubmedId = null;

    String diseaseTrait = null;

    Boolean fullPvalueSet = null;

    Boolean userRequested = null;

    String shortForm = null;

    String efoTrait = null;

    String accessionId = null;

    String cohort = null;

    Boolean gxe = null;

}
