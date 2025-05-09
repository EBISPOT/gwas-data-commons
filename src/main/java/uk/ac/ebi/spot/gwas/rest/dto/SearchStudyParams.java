package uk.ac.ebi.spot.gwas.rest.dto;


import io.swagger.v3.oas.annotations.Parameter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import uk.ac.ebi.spot.gwas.annotation.GWASParamName;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ParameterObject
public class SearchStudyParams {

    @GWASParamName("pubmed_id")
    @Parameter(name = "pubmed_id", description = "pubmedId of the publication <br/> <br/>" +
            "<i> Example </i> : 35241825")
    String pubmedId = null;

    @GWASParamName("disease_trait")
    @Parameter(name = "disease_trait", description = "Free text description of the trait investigated in this study <br/> <br/>" +
            "<i> Example </i> : Early-onset Parkinson's disease")
    String diseaseTrait = null;

    @GWASParamName("full_pvalue_set")
    @Parameter(name = "full_pvalue_set", description = "Whether full summary statistics are available for this study <br/> <br/>" +
            "<i> Example </i> : true/false")
    Boolean fullPvalueSet = null;


    @GWASParamName("efo_id")
    @Parameter(name ="efo_id", description = "The trait URI shortform <br/> <br/>" +
            "<i> Example </i> : EFO_0001060")
    private String shortForm = null;


    @GWASParamName("efo_trait")
    @Parameter(name ="efo_trait", description = "The trait name or label <br/> <br/>" +
            "<i> Example </i> : celiac disease")
    String efoTrait = null;

    @GWASParamName("accession_id")
    @Parameter(name ="accession_id", description = "The study’s GWAS Catalog accession ID <br/> <br/>" +
            "<i> Example </i> : GCST000854")
    String accessionId = null;

    @Parameter(name ="cohort", description = "Discovery stage cohorts used in this study <br/> <br/>" +
            "<i> Example </i> : BioImage")
    String cohort = null;

    @Parameter(name ="gxe", description = "Whether the study investigates a gene-environment interaction <br/> <br/>" +
            "<i> Example </i> : true/false ")
    Boolean gxe = null;

    @GWASParamName("ancestral_group")
    @Parameter(name ="ancestral_group", description = "Ancestry category group label, assigned to reduce complexity within the data sets and place samples in context <br/> <br/>" +
            "<i> Example </i> : European")
    String ancestralGroup = null;

    @GWASParamName("no_of_individuals")
    @Parameter(name ="no_of_individuals", description = " Number of individuals in this sample <br/> <br/>" +
            "<i> Example </i> : 4390")
    Integer noOfIndividuals = null;

    @GWASParamName("show_child_trait")
    @Parameter(name = "show_child_trait", description = "display entities for descendants of a parent Efo Trait Term <br/> <br/>" +
            "<i> Example </i> : MONDO_0005180")
    Boolean showChildTrait = null;
}

