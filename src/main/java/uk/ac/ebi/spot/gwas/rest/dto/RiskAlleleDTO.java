package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(callSuper = false)
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
public class RiskAlleleDTO {

    @JsonProperty("riskAlleleName")
    private String riskAlleleName;

    @JsonProperty("riskFrequency")
    private String riskFrequency;

    @JsonProperty("genomeWide")
    private Boolean genomeWide = false;

    @JsonProperty("limitedList")
    private Boolean limitedList = false;

    @JsonProperty("source")
    private String source;

    @JsonProperty("mappingMethod")
    private String mappingMethod;

    @JsonProperty("isClosestGene")
    private Boolean isClosestGene;
}
