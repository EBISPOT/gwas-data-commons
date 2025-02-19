package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import java.util.Date;
import java.util.List;

@JsonPropertyOrder({
        "rs_id",
        "merged",
        "functional_class",
        "current_snp",
        "last_update_date",
        "locations",
        "maf",
        "minor_allele",
        "alleles",
        "most_severe_consequence",
        "mapped_genes",
        "_links"
})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Relation(collectionRelation = "snps", itemRelation = "snp")
public class SingleNucleotidePolymorphismDTO extends RepresentationModel<SingleNucleotidePolymorphismDTO> {

    @JsonProperty("rs_id")
    private String rsId;

    @JsonProperty("merged")
    private Long merged;

    @JsonProperty("functional_class")
    private String functionalClass;

    @JsonProperty("current_snp")
    private String currentSnp;

    @JsonProperty("last_update_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastUpdateDate;

    @JsonProperty("locations")
    private List<LocationDTO> locations;

    @JsonProperty("maf")
    public Double maf;

    @JsonProperty("minor_allele")
    public String minorAllele;

    @JsonProperty("alleles")
    public String alleles;

    @JsonProperty("most_severe_consequence")
    public String mostSevereConsequence;

    @JsonProperty("mapped_genes")
    private List<String> mappedGenes;

}
