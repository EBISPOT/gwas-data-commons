package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = false)
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EFOTraitDTO extends RepresentationModel<EFOTraitDTO> implements Serializable {

    private static final long serialVersionUID = -2324937934189184000L;

    @JsonProperty("trait")
    private String trait;

    @JsonProperty("uri")
    private String uri;

    @JsonProperty("shortForm")
    private String shortForm;


}
