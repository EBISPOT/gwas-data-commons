package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

@JsonPropertyOrder({
        "is_intergenic",
        "is_upstream",
        "is_downstream",
        "distance",
        "gene",
        "location",
        "source",
        "mapping_method",
        "is_closest_gene",
        "_links"
})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(collectionRelation = "genomic_contexts", itemRelation = "genomic_context")
public class GenomicContextDTO extends RepresentationModel<GenomicContextDTO> {

    @JsonProperty("is_intergenic")
    private Boolean isIntergenic;

    @JsonProperty("is_upstream")
    private Boolean isUpstream;

    @JsonProperty("is_downstream")
    private Boolean isDownstream;

    @JsonProperty("distance")
    private Long distance;

    @JsonProperty("gene")
    private GeneDTO geneDTO;

    @JsonProperty("location")
    private LocationDTO locationDTO;

    @JsonProperty("source")
    private String source;

    @JsonProperty("mapping_method")
    private String mappingMethod;

    @JsonProperty("is_closest_gene")
    private Boolean isClosestGene;

}
