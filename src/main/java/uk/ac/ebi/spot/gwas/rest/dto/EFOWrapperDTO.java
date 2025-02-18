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
public class EFOWrapperDTO implements Serializable {

    private static final long serialVersionUID = -8177440499904411890L;

    @JsonProperty("efo_id")
    private String shortForm;

    @JsonProperty("efo_trait")
    private String efoTrait;


}


