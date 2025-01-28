package uk.ac.ebi.spot.gwas.rest.dto;

import lombok.Data;

@Data
public class SearchAssociationParams {

    String pubmedId = null;

    String rsId = null;

    Boolean fullPvalueSet = null;

    String accessionId = null;

    String efoTrait = null;

    String shortForm = null;

}
