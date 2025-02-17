package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import java.io.Serializable;

@JsonPropertyOrder({
        "trait",
        "uri",
        "efoId",
        "_links"
})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Relation(collectionRelation = "efo_traits", itemRelation = "efo_trait")
public class EFOTraitDTO extends RepresentationModel<EFOTraitDTO> {

    @JsonProperty("trait")
    private String trait;

    @JsonProperty("uri")
    private String uri;

    @JsonProperty("efoId")
    private String shortForm;


}
