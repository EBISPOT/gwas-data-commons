package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(callSuper = false)
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
public class RiskAlleleWrapperDTO {

    private String riskAlleleName;

    private String riskFrequency;
}
