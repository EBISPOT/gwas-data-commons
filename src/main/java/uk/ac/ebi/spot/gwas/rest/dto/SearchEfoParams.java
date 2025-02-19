package uk.ac.ebi.spot.gwas.rest.dto;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.Data;
import org.springdoc.api.annotations.ParameterObject;
import uk.ac.ebi.spot.gwas.annotation.GWASParamName;

@Data
@ParameterObject
public class SearchEfoParams {

    private String trait;

    private String uri;

    @GWASParamName("short_form")
    @Parameter(name = "short_form")
    private String shortForm;

    @GWASParamName("pubmed_id")
    @Parameter(name = "pubmed_id")
    private String pubmedId;
}
