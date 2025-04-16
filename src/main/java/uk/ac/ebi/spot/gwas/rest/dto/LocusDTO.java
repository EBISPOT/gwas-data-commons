package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import java.io.Serializable;
import java.util.List;

@JsonPropertyOrder({
        "haplotype_snp_count",
        "description",
        "strongest_risk_alleles",
        "author_reported_genes",
        "_links"
})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Relation(collectionRelation = "loci", itemRelation = "locus")
public class LocusDTO extends RepresentationModel<LocusDTO> implements Serializable {

    @JsonProperty("haplotype_snp_count")
    private Integer haplotypeSnpCount;

    @JsonProperty("description")
    private String description;

    @JsonProperty("strongest_risk_alleles")
    private List<RiskAlleleDTO> strongestRiskAlleles;

    @JsonProperty("author_reported_genes")
    private List<GeneDTO> authorReportedGenes;

}
