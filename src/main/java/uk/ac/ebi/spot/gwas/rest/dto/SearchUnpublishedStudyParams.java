package uk.ac.ebi.spot.gwas.rest.dto;

import lombok.Data;

@Data
public class SearchUnpublishedStudyParams {

    String diseaseTrait = null;

    String accessionId = null;

    String title = null;

    String firstAuthor = null;

    String cohort = null;



}
