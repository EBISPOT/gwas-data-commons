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
public class LocusDTO extends RepresentationModel<LocusDTO> implements Serializable {

    private static final long serialVersionUID = -612620519836012985L;

    @JsonProperty("haplotypeSnpCount")
    private Integer haplotypeSnpCount;

    @JsonProperty("description")
    private String description;

    @JsonProperty("strongestRiskAlleles")
    private List<RiskAlleleDTO> strongestRiskAlleles;

    @JsonProperty("authorReportedGenes")
    private List<GeneDTO> authorReportedGenes;

}
