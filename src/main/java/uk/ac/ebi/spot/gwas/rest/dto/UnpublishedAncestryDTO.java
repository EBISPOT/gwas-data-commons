package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

@JsonPropertyOrder({
        "study_tag",
        "stage",
        "sampleSize",
        "cases",
        "controls",
        "sample_description",
        "ancestry_category",
        "ancestry",
        "ancestry_description",
        "country_recruitment",
        "_links"
})
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Relation(collectionRelation = "unpublished_ancestries", itemRelation = "unpublished_ancestry")
public class UnpublishedAncestryDTO extends RepresentationModel<UnpublishedAncestryDTO> {

    @JsonProperty("study_tag")
    private String studyTag;

    @JsonProperty("stage")
    private String stage;

    @JsonProperty("sampleSize")
    private Integer sampleSize;

    @JsonProperty("cases")
    private Integer cases;

    @JsonProperty("controls")
    private Integer controls;

    @JsonProperty("sample_description")
    private String sampleDescription;

    @JsonProperty("ancestry_category")
    private String ancestryCategory;

    @JsonProperty("ancestry")
    private String ancestry;

    @JsonProperty("ancestry_description")
    private String ancestryDescription;

    @JsonProperty("country_recruitment")
    private String countryRecruitment;

}
