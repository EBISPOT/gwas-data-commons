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
public class CountryDTO implements Serializable {

    @JsonProperty("majorArea")
    private String majorArea;

    @JsonProperty("region")
    private String region;

    @JsonProperty("countryName")
    private String countryName;
}
