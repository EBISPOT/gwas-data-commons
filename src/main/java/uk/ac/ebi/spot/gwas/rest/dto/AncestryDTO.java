package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
        "type",
        "number_of_individuals",
        "ancestral_groups",
        "country_of_origin",
        "country_of_recruitment",
        "_links"
})
@Relation(collectionRelation = "ancestries", itemRelation = "ancestry")
public class AncestryDTO extends RepresentationModel<AncestryDTO> {

    @JsonProperty("type")
    private String type;

    @JsonProperty("number_of_individuals")
    private Integer numberOfIndividuals;

    @JsonProperty("ancestral_groups")
    private List<AncestralGroupDTO>  ancestralGroups;

    @JsonProperty("country_of_origin")
    private List<CountryDTO> countryOfOrigin;

    @JsonProperty("country_of_recruitment")
    private List<CountryDTO> countryOfRecruitment;


}
