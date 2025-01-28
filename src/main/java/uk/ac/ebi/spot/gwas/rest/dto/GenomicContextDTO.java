package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;

@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GenomicContextDTO extends RepresentationModel<GenomicContextDTO> implements Serializable {

    private static final long serialVersionUID = 5629069919999897289L;

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
