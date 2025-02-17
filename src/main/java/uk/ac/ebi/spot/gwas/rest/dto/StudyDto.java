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
        "initialSampleSize",
        "replicationSampleSize",
        "studyId",
        "gxe",
        "gxg",
        "snpCount",
        "qualifier",
        "imputed",
        "pooled",
        "studyDesignComment",
        "accessionId",
        "fullPvalueSet",
        "userRequested",
        "pubmedId",
        "platforms",
        "diseaseTrait",
        "genotypingTechnologies",
        "efoTraits",
        "discovery_ancestry",
        "replication_ancestry",
        "fullSummaryStats",
        "termsOfLicense",
        "bgEfoTraits",
        "cohort",
        "arrayManufacturer",
        "_links"
})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(collectionRelation = "studies", itemRelation = "study")
public  class StudyDto extends RepresentationModel<StudyDto> {

    @JsonProperty("initialSampleSize")
    private String initialSampleSize;

    @JsonProperty("replicationSampleSize")
    private String replicationSampleSize;

    @JsonProperty("studyId")
    private Long studyId;

    @JsonProperty("gxe")
    private Boolean gxe;

    @JsonProperty("gxg")
    private Boolean gxg;

    @JsonProperty("snpCount")
    private Integer snpCount;

    @JsonProperty("qualifier")
    private String qualifier;

    @JsonProperty("imputed")
    private Boolean imputed;

    @JsonProperty("pooled")
    private Boolean pooled;

    @JsonProperty("studyDesignComment")
    private String studyDesignComment;

    @JsonProperty("accessionId")
    private String accessionId;

    @JsonProperty("fullPvalueSet")
    private Boolean fullPvalueSet;

    @JsonProperty("userRequested")
    private Boolean userRequested;

    @JsonProperty("pubmedId")
    private Integer pubmedId;

    @JsonProperty("platforms")
    private String platforms;

    @JsonProperty("diseaseTrait")
    private String diseaseTrait;

    @JsonProperty("genotypingTechnologies")
    private Set<String>  genotypingTechnologies;

    @JsonProperty("efoTraits")
    private List<EFOWrapperDTO> efoTraits;

    @JsonProperty("discovery_ancestry")
    private Set<String> discoveryAncestry;

    @JsonProperty("replication_ancestry")
    private Set<String> replicationAncestry;

    @JsonProperty("fullSummaryStats")
    private String fullSummaryStats;

    @JsonProperty("termsOfLicense")
    private String termsOfLicense;

    @JsonProperty("bgEfoTraits")
    private List<EFOWrapperDTO> bgEfoTraits;

    @JsonProperty("cohort")
    private String cohort;

    @JsonProperty("arrayManufacturer")
    private List<String> arrayManufacturer;

}
