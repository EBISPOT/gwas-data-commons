package uk.ac.ebi.spot.gwas.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SearchStudyParams {

    String pubmedId = null;

    String diseaseTrait = null;

    Boolean fullPvalueSet = null;

    Boolean userRequested = null;

    private String shortForm = null;

    String efoTrait = null;

    String accessionId = null;

    String cohort = null;

    Boolean gxe = null;

    String ancestralGroup = null;

    Integer noOfIndividuals = null;



}

