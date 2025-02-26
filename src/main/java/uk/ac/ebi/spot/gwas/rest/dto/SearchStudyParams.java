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
    @Parameter(name = "pubmed_id", description = "Publication Id", example = "39644095")
    String pubmedId = null;

    @GWASParamName("disease_trait")
    @Parameter(name = "disease_trait")
    String diseaseTrait = null;

    @GWASParamName("full_pvalue_set")
    @Parameter(name = "full_pvalue_set")
    Boolean fullPvalueSet = null;


    @GWASParamName("efo_id")
    @Parameter(name ="efo_id")
    private String shortForm = null;


    @GWASParamName("efo_trait")
    @Parameter(name ="efo_trait")
    String efoTrait = null;

    @GWASParamName("accession_id")
    @Parameter(name ="accession_id")
    String accessionId = null;

    String cohort = null;

    Boolean gxe = null;

    @GWASParamName("ancestral_group")
    @Parameter(name ="ancestral_group")
    String ancestralGroup = null;

    @GWASParamName("no_of_individuals")
    @Parameter(name ="no_of_individuals")
    Integer noOfIndividuals = null;
}

