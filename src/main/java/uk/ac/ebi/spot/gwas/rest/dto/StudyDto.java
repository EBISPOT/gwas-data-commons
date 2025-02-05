package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;


import java.io.Serializable;
import java.util.List;
import java.util.Set;

@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
public  class StudyDto extends RepresentationModel<StudyDto> implements Serializable {

    private static final long serialVersionUID = 3422704024513384455L;

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
