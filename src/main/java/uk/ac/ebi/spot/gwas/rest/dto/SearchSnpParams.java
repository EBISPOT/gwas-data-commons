package uk.ac.ebi.spot.gwas.rest.dto;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.Data;
import org.springdoc.api.annotations.ParameterObject;
import uk.ac.ebi.spot.gwas.annotation.GWASParamName;

@Data
@ParameterObject
public class SearchSnpParams {

    @GWASParamName("rs_id")
    @Parameter(name = "rs_id", description = "Strongest SNP; if a haplotype it may include more than one" +
            " rs number (multiple SNPs comprising the haplotype) <br/> <br/>" +
            "<i> Example </i> : rs3093017 ")
    String rsId = null;

    @GWASParamName("bp_location")
    @Parameter(name = "bp_location" , description = "search for SNPs via their base pair location <br/> <br/>" +
            "<i> Example </i> : 95000000")
    Integer bpLocation = null;

    @GWASParamName("bp_start")
    @Parameter(name = "bp_start", description = "Search for SNPs on a certain chromosome " +
            "and within a given base pair location range <br/> <br/>" +
                     "<i> Example </i> : 95000000")
    Long bpStart = null;

    @GWASParamName("bp_end")
    @Parameter(name = "bp_end", description = "Search for SNPs on a certain chromosome " +
            "and within a given base pair location range <br/> <br/>" +
            "<i> Example </i> : 95000000")
    Long bpEnd = null;

    @GWASParamName("pubmed_id")
    @Parameter(name = "pubmed_id", description = "pubmedId of the publication <br/> <br/>" +
            "<i> Example </i> : 35241825")
    String pubmedId = null;

    @Parameter(name = "chromosome", description = "Search for SNPs on a certain chromosome <br/> <br/>" +
            "<i> Example </i> : 13")
    String chromosome = null;

    @Parameter(name = "gene", description = "Search for SNPs via a gene using parameter geneName <br/> <br/>" +
            "<i> Example </i> : 13")
    String gene =  null;

}
