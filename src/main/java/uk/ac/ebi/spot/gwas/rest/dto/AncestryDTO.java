package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AncestryDTO extends RepresentationModel<AncestryDTO> implements Serializable {

    private static final long serialVersionUID = -8788148068723768947L;

    @JsonProperty("type")
    private String type;

    @JsonProperty("numberOfIndividuals")
    private Integer numberOfIndividuals;

    @JsonProperty("ancestralGroups")
    private List<AncestralGroupDTO>  ancestralGroups;

    @JsonProperty("countryOfOrigin")
    private List<CountryDTO> countryOfOrigin;

    @JsonProperty("countryOfRecruitment")
    private List<CountryDTO> countryOfRecruitment;


}
