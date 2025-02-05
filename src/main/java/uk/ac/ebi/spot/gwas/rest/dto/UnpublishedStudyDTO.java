package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;


@JsonPropertyOrder({
        "genotyping_technology",
        "study_accession",
        "array_manufacturer",
        "imputation",
        "variant_count",
        "summary_statistics_assembly",
        "agreedToCc0",
        "fullSummaryStats",
        "study_tag",
        "array_information",
        "sample_description",
        "statistical_model",
        "study_description",
        "trait",
        "efo_trait",
        "background_trait",
        "background_efo_trait",
        "cohort",
        "cohort_id",
        "_links"
})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(collectionRelation = "unpublished_studies", itemRelation = "unpublished_study")
public class UnpublishedStudyDTO extends RepresentationModel<UnpublishedStudyDTO> {

    @JsonProperty("study_tag")
    private String studyTag;

    @JsonProperty("study_accession")
    private String accession;

    @JsonProperty("genotyping_technology")
    private String genotypingTechnology;

    @JsonProperty("array_manufacturer")
    private String arrayManufacturer;

    @JsonProperty("array_information")
    private String arrayInformation;

    @JsonProperty("imputation")
    private Boolean imputation;

    @JsonProperty("variant_count")
    private Integer variantCount;

    @JsonProperty("sample_description")
    private String sampleDescription;

    @JsonProperty("statistical_model")
    private String statisticalModel;

    @JsonProperty("study_description")
    private String studyDescription;

    @JsonProperty("trait")
    private String trait;

    @JsonProperty("efo_trait")
    private String efoTrait;

    @JsonProperty("background_trait")
    private String backgroundTrait;

    @JsonProperty("background_efo_trait")
    private String backgroundEfoTrait;

    @JsonProperty("summary_statistics_assembly")
    private String sumStatsAssembly;

    @JsonProperty("cohort")
    private String cohort;

    @JsonProperty("cohort_id")
    private String cohortId;

    @JsonProperty("agreedToCc0")
    private Boolean agreedToCc0;

    @JsonProperty("fullSummaryStats")
    private String fullSummaryStats;


}
