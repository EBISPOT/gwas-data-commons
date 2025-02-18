package uk.ac.ebi.spot.gwas.rest.dto;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.Data;
import org.springdoc.api.annotations.ParameterObject;
import uk.ac.ebi.spot.gwas.annotation.GWASParamName;

@Data
@ParameterObject
public class SearchSnpParams {

    @GWASParamName("rs_id")
    @Parameter(name = "rs_id")
    String rsId = null;

    @GWASParamName("bp_location")
    @Parameter(name = "bp_location")
    Integer bpLocation = null;

    @GWASParamName("bp_start")
    @Parameter(name = "bp_start")
    Long bpStart = null;

    @GWASParamName("bp_end")
    @Parameter(name = "bp_end")
    Long bpEnd = null;

    @GWASParamName("pubmed_id")
    @Parameter(name = "pubmed_id")
    String pubmedId = null;

    String chromosome = null;

    String gene =  null;

}
