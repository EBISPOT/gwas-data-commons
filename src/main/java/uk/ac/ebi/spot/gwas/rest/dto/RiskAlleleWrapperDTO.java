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
public class RiskAlleleWrapperDTO {

    @JsonProperty("risk_allele_name")
    private String riskAlleleName;

    @JsonProperty("risk_frequency")
    private String riskFrequency;
}
