package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import uk.ac.ebi.spot.gwas.model.Region;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = false)
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
public class LocationDTO implements Serializable {

    private static final long serialVersionUID = 7950117053236772236L;

    @JsonProperty("chromosomeName")
    private String chromosomeName;

    @JsonProperty("chromosomePosition")
    private Integer chromosomePosition;

    @JsonProperty("region")
    private RegionDTO region;
}
