package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.ResourceSupport;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StudyDto extends ResourceSupport implements Serializable {

    private static final long serialVersionUID = 3422704024513384455L;

    @JsonProperty("initialSampleSize")
    private String initialSampleSize;

    @JsonProperty("replicationSampleSize")
    private String replicationSampleSize;

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
    private Boolean pubmedId;

    @JsonProperty("platforms")
    private List<String> platforms;

    @JsonProperty("diseaseTrait")
    private String diseaseTrait;

    @JsonProperty("genotypingTechnologies")
    private List<String>  genotypingTechnologies;

    @JsonProperty("efoTraits")
    private List<EFOWrapperDTO> efoTraits;

    @JsonProperty("discovery_ancestry")
    private String discoveryAncestry;

    @JsonProperty("replication_ancestry")
    private String replicationAncestry;

    @JsonProperty("fullSummaryStats")
    private String fullSummaryStats;

    @JsonProperty("termsOfLicense")
    private String termsOfLicense;

    @JsonProperty("bgEfoTraits")
    private List<EFOWrapperDTO> bgEfoTraits;

}
