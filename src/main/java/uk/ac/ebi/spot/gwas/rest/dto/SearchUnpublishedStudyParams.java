package uk.ac.ebi.spot.gwas.rest.dto;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.Data;
import org.springdoc.api.annotations.ParameterObject;
import uk.ac.ebi.spot.gwas.annotation.GWASParamName;

@Data
@ParameterObject
public class SearchUnpublishedStudyParams {

    @GWASParamName("disease_trait")
    @Parameter(name = "disease_trait", description = "Free text description of the trait investigated in this study <br/> <br/>" +
            "<i> Example </i> : Early-onset Parkinson's disease")
    String diseaseTrait = null;

    @GWASParamName("accession_id")
    @Parameter(name = "accession_id",  description = "The study’s GWAS Catalog accession ID <br/> <br/>" +
            "<i> Example </i> : GCST000854")
    String accessionId = null;

    @Parameter(name = "title",  description = "Title of manuscript the GWAS is included in <br/> <br/>" +
            "<i> Example </i> : Genome-wide association study")
    String title = null;

    @GWASParamName("first_author")
    @Parameter(name = "first_author", description = "Last name and initials of first author <br/> <br/>" +
            "<i> Example </i> : Doe John")
    String firstAuthor = null;

    @GWASParamName("cohort")
    @Parameter(name = "cohort", description = "Discovery stage cohorts used in this study <br/> <br/>" +
            "<i> Example </i> : <i> Example </i> : BioImage")
    String cohort = null;



}
