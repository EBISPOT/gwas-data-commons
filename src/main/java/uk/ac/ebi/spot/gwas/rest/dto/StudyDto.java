package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;


import java.util.List;
import java.util.Set;

@JsonPropertyOrder({
        "initial_sample_size",
        "replication_sample_size",
        "study_id",
        "gxe",
        "gxg",
        "snp_count",
        "qualifier",
        "imputed",
        "pooled",
        "study_design_comment",
        "accession_id",
        "full_summary_stats_available",
        "user_requested",
        "pubmed_id",
        "platforms",
        "disease_trait",
        "genotyping_technologies",
        "efo_traits",
        "discovery_ancestry",
        "replication_ancestry",
        "full_summary_stats",
        "terms_of_license",
        "bg_efo_traits",
        "cohort",
        "array_manufacturer",
        "_links"
})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(collectionRelation = "studies", itemRelation = "study")
public  class StudyDto extends RepresentationModel<StudyDto> {

    @JsonProperty("initial_sample_size")
    private String initialSampleSize;

    @JsonProperty("replication_sample_size")
    private String replicationSampleSize;

    @JsonProperty("study_id")
    private Long studyId;

    @JsonProperty("gxe")
    private Boolean gxe;

    @JsonProperty("gxg")
    private Boolean gxg;

    @JsonProperty("snp_count")
    private Integer snpCount;

    @JsonProperty("qualifier")
    private String qualifier;

    @JsonProperty("imputed")
    private Boolean imputed;

    @JsonProperty("pooled")
    private Boolean pooled;

    @JsonProperty("study_design_comment")
    private String studyDesignComment;

    @JsonProperty("accession_id")
    private String accessionId;


    @JsonProperty("full_summary_stats_available")
    private Boolean fullPvalueSet;

    @JsonProperty("user_requested")
    private Boolean userRequested;

    @JsonProperty("pubmed_id")
    private Integer pubmedId;

    @JsonProperty("platforms")
    private String platforms;

    @JsonProperty("disease_trait")
    private String diseaseTrait;

    @JsonProperty("genotyping_technologies")
    private Set<String>  genotypingTechnologies;

    @JsonProperty("efo_traits")
    private List<EFOWrapperDTO> efoTraits;

    @JsonProperty("discovery_ancestry")
    private Set<String> discoveryAncestry;

    @JsonProperty("replication_ancestry")
    private Set<String> replicationAncestry;

    @JsonProperty("full_summary_stats")
    private String fullSummaryStats;

    @JsonProperty("terms_of_license")
    private String termsOfLicense;

    @JsonProperty("bg_efo_traits")
    private List<EFOWrapperDTO> bgEfoTraits;

    @JsonProperty("cohort")
    private List<String> cohort;

    @JsonProperty("array_manufacturer")
    private List<String> arrayManufacturer;

}
