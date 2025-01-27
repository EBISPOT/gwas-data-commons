package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
        "type",
        "numberOfIndividuals",
        "ancestralGroups",
        "countryOfOrigin",
        "countryOfRecruitment",
        "_links"
})
@Relation(collectionRelation = "ancestries", itemRelation = "ancestry")
public class AncestryDTO extends RepresentationModel<AncestryDTO> {

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
