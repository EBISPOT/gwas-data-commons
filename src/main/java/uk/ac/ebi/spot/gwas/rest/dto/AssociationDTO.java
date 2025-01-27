package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
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
        "associationId",
        "riskFrequency",
        "pvalueDescription",
        "pvalueMantissa",
        "pvalueExponent",
        "multiSnpHaplotype",
        "snpInteraction",
        "snpType",
        "standardError",
        "range",
        "description",
        "orPerCopyNum",
        "orValue",
        "betaNum",
        "betaUnit",
        "betaDirection",
        "beta",
        "lastMappingDate",
        "lastUpdateDate",
        "pValue",
        "efoTraits",
        "reportedTrait",
        "accessionID",
        "locations",
        "mappedGenes",
        "riskAllele",
        "bgEfoTraits",
        "pubmedId",
        "firstAuthor",
        "_links"
})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Relation(collectionRelation = "associations", itemRelation = "association")
public class AssociationDTO  extends RepresentationModel<AssociationDTO> implements Serializable {

    private static final long serialVersionUID = 7742504070749122740L;

    @JsonProperty("associationId")
    private Long associationId;

    @JsonProperty("riskFrequency")
    private String riskFrequency;

    @JsonProperty("pvalueDescription")
    private String pvalueDescription;

    @JsonProperty("pvalueMantissa")
    private Integer pvalueMantissa;

    @JsonProperty("pvalueExponent")
    private Integer pvalueExponent;

    @JsonProperty("multiSnpHaplotype")
    private Boolean multiSnpHaplotype;

    @JsonProperty("snpInteraction")
    private Boolean snpInteraction;

    @JsonProperty("snpType")
    private String snpType;

    @JsonProperty("standardError")
    private Float standardError;

    @JsonProperty("range")
    private String range;

    @JsonProperty("description")
    private String description;

    @JsonProperty("orPerCopyNum")
    private Float orPerCopyNum;

    @JsonProperty("orValue")
    private String orValue;

    @JsonProperty("betaNum")
    private Float betaNum;

    @JsonProperty("betaUnit")
    private String betaUnit;

    @JsonProperty("betaDirection")
    private String betaDirection;

    @JsonProperty("beta")
    private String beta;

    @JsonProperty("lastMappingDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastMappingDate;

    @JsonProperty("lastUpdateDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastUpdateDate;

    @JsonProperty("pValue")
    private Double pValue;

    @JsonProperty("efoTraits")
    private List<EFOWrapperDTO> efoTraits;

    @JsonProperty("reportedTrait")
    private List<String> reportedTrait;

    @JsonProperty("accessionID")
    private String accessionID;

    @JsonProperty("locations")
    private List<String> locations;

    @JsonProperty("mappedGenes")
    private List<String> mappedGenes;

    @JsonProperty("riskAllele")
    private List<String> riskAllele;

    @JsonProperty("bgEfoTraits")
    private List<EFOWrapperDTO> bgEfoTraits;

    @JsonProperty("pubmedId")
    private String pubmedId;

    @JsonProperty("firstAuthor")
    private String firstAuthor;


}
