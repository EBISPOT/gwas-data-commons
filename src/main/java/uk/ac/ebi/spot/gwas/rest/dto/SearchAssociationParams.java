package uk.ac.ebi.spot.gwas.rest.dto;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.Data;
import org.springdoc.api.annotations.ParameterObject;
import uk.ac.ebi.spot.gwas.annotation.GWASParamName;

@Data
@ParameterObject
public class SearchAssociationParams {

    @GWASParamName("pubmed_id")
    @Parameter(name = "pubmed_id")
    String pubmedId = null;

    @GWASParamName("rs_id")
    @Parameter(name = "rs_id")
    String rsId = null;

    @GWASParamName("full_pvalue_set")
    @Parameter(name = "full_pvalue_set")
    Boolean fullPvalueSet = null;

    @GWASParamName("accession_id")
    @Parameter(name = "accession_id")
    String accessionId = null;

    @GWASParamName("efo_trait")
    @Parameter(name = "efo_trait")
    String efoTrait = null;

    @GWASParamName("short_form")
    @Parameter(name = "short_form")
    String shortForm = null;

    @GWASParamName("show_child_trait")
    @Parameter(name = "show_child_trait")
    Boolean showChildTrait = null;

}
