package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@JsonPropertyOrder({
        "rsId",
        "merged",
        "functionalClass",
        "currentSnp",
        "lastUpdateDate",
        "locations",
        "MAF",
        "minor_allele",
        "alleles",
        "most_severe_consequence",
        "mappedGenes",
        "_links"
})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Relation(collectionRelation = "snps", itemRelation = "snp")
public class SingleNucleotidePolymorphismDTO extends RepresentationModel<SingleNucleotidePolymorphismDTO> {

    @JsonProperty("rsId")
    private String rsId;

    @JsonProperty("merged")
    private Long merged;

    @JsonProperty("functionalClass")
    private String functionalClass;

    @JsonProperty("currentSnp")
    private String currentSnp;

    @JsonProperty("lastUpdateDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastUpdateDate;

    @JsonProperty("locations")
    private List<LocationDTO> locations;

    @JsonProperty("MAF")
    public Double maf;

    @JsonProperty("minor_allele")
    public String minorAllele;

    @JsonProperty("alleles")
    public String alleles;

    @JsonProperty("most_severe_consequence")
    public String mostSevereConsequence;

    @JsonProperty("mappedGenes")
    private List<String> mappedGenes;

}
