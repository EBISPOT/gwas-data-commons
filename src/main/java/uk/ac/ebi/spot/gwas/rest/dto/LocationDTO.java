package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = false)
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
public class LocationDTO implements Serializable {

    private static final long serialVersionUID = 7950117053236772236L;

    @JsonProperty("chromosome_name")
    private String chromosomeName;

    @JsonProperty("chromosome_position")
    private Integer chromosomePosition;

    @JsonProperty("region")
    private RegionDTO region;
}
