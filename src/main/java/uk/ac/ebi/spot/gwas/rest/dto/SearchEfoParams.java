package uk.ac.ebi.spot.gwas.rest.dto;

import lombok.Data;

@Data
public class SearchEfoParams {

    private String trait;

    private String uri;

    private String shortForm;

    private String pubmedId;
}
