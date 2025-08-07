package uk.ac.ebi.spot.gwas.rest.dto;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.Data;
import org.springdoc.api.annotations.ParameterObject;
import uk.ac.ebi.spot.gwas.annotation.GWASParamName;

@Data
@ParameterObject
public class SearchEfoParams {

    @GWASParamName("efo_trait")
    @Parameter(name = "efo_trait" )
    private String trait;

    @Parameter(name = "uri")
    private String uri;

    @GWASParamName("efo_id")
    @Parameter(name = "efo_id")
    private String shortForm;

    @GWASParamName("pubmed_id")
    @Parameter(name = "pubmed_id")
    private String pubmedId;

    @GWASParamName("mapped_gene")
    @Parameter(name = "mapped_gene")
    String mappedGene = null;

    @GWASParamName("extended_geneset")
    @Parameter(name = "extended_geneset")
    Boolean extendedGeneSet = null;
}
