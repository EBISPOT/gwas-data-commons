package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import java.io.Serializable;

@JsonPropertyOrder({
        "isIntergenic",
        "isUpstream",
        "isDownstream",
        "distance",
        "gene",
        "location",
        "source",
        "mappingMethod",
        "isClosestGene",
        "_links"
})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Relation(collectionRelation = "genomic_contexts", itemRelation = "genomic_context")
public class GenomicContextDTO extends RepresentationModel<GenomicContextDTO> {

    @JsonProperty("isIntergenic")
    private Boolean isIntergenic;

    @JsonProperty("isUpstream")
    private Boolean isUpstream;

    @JsonProperty("isDownstream")
    private Boolean isDownstream;

    @JsonProperty("distance")
    private Long distance;

    @JsonProperty("gene")
    private GeneDTO geneDTO;

    @JsonProperty("location")
    private LocationDTO locationDTO;

    @JsonProperty("source")
    private String source;

    @JsonProperty("mappingMethod")
    private String mappingMethod;

    @JsonProperty("isClosestGene")
    private Boolean isClosestGene;

}
