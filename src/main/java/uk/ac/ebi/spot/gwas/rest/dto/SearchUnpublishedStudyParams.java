package uk.ac.ebi.spot.gwas.rest.dto;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.Data;
import org.springdoc.api.annotations.ParameterObject;
import uk.ac.ebi.spot.gwas.annotation.GWASParamName;

@Data
@ParameterObject
public class SearchUnpublishedStudyParams {

    @GWASParamName("disease_trait")
    @Parameter(name = "disease_trait")
    String diseaseTrait = null;

    @GWASParamName("accession_id")
    @Parameter(name = "accession_id")
    String accessionId = null;

    @Parameter(name = "title")
    String title = null;

    @GWASParamName("first_author")
    @Parameter(name = "first_author")
    String firstAuthor = null;

    @GWASParamName("cohort")
    @Parameter(name = "cohort")
    String cohort = null;



}
