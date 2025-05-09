package uk.ac.ebi.spot.gwas.rest.dto;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.Data;
import org.springdoc.api.annotations.ParameterObject;
import uk.ac.ebi.spot.gwas.annotation.GWASParamName;

@Data
@ParameterObject
public class SearchAssociationParams {

    @GWASParamName("pubmed_id")
    @Parameter(name = "pubmed_id" , description = "pubmedId of the publication <br/> <br/>" +
            "<i> Example </i> : 35241825")
    String pubmedId = null;

    @GWASParamName("rs_id")
    @Parameter(name = "rs_id" ,description = "Strongest SNP; if a haplotype it may include more than one" +
            " rs number (multiple SNPs comprising the haplotype) <br/> <br/>" +
            "<i> Example </i> : rs3093017 ")
    String rsId = null;

    @GWASParamName("full_pvalue_set")
    @Parameter(name = "full_pvalue_set",  description = "Whether full summary statistics are available for this study <br/> <br/>" +
            "<i> Example </i> : true/false")
    Boolean fullPvalueSet = null;

    @GWASParamName("accession_id")
    @Parameter(name = "accession_id", description = "The study’s GWAS Catalog accession ID <br/> <br/>" +
            "<i> Example </i> : GCST000854")
    String accessionId = null;

    @GWASParamName("efo_trait")
    @Parameter(name = "efo_trait",  description = "The trait name or label <br/> <br/>" +
            "<i> Example </i> : celiac disease")
    String efoTrait = null;

    @GWASParamName("efo_id")
    @Parameter(name = "efo_id", description = "The trait URI shortform <br/> <br/>" +
            "<i> Example </i> : EFO_0001060")
    String shortForm = null;

    @GWASParamName("show_child_trait")
    @Parameter(name = "show_child_trait" , description = "display entities for descendants of a parent Efo Trait Term <br/> <br/>" +
            "<i> Example </i> : true/false")
    Boolean showChildTrait = null;

}
