package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import java.util.Date;
import java.util.List;

@JsonPropertyOrder({
        "association_id",
        "risk_frequency",
        "pvalue_description",
        "pvalue_mantissa",
        "pvalue_exponent",
        "multi_snp_haplotype",
        "snp_interaction",
        "snp_type",
        "standard_error",
        "range",
        "description",
        "or_per_copy_num",
        "or_value",
        "beta_num",
        "beta_unit",
        "beta_direction",
        "beta",
        "last_mapping_date",
        "last_update_date",
        "p_value",
        "efo_traits",
        "reported_trait",
        "accession_id",
        "locations",
        "mapped_genes",
        "snp_risk_allele",
        "effect_allele",
        "bg_efo_traits",
        "pubmed_id",
        "first_author",
        "ci_lower",
        "ci_upper",
        "_links"
})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(collectionRelation = "associations", itemRelation = "association")
public class AssociationDTO  extends RepresentationModel<AssociationDTO> {

    @JsonProperty("association_id")
    private Long associationId;

    @JsonProperty("risk_frequency")
    private String riskFrequency;

    @JsonProperty("pvalue_description")
    private String pvalueDescription;

    @JsonProperty("pvalue_mantissa")
    private Integer pvalueMantissa;

    @JsonProperty("pvalue_exponent")
    private Integer pvalueExponent;

    @JsonProperty("multi_snp_haplotype")
    private Boolean multiSnpHaplotype;

    @JsonProperty("snp_interaction")
    private Boolean snpInteraction;

    @JsonProperty("snp_type")
    private String snpType;

    @JsonProperty("standard_error")
    private Float standardError;

    @JsonProperty("range")
    private String range;

    @JsonProperty("description")
    private String description;

    @JsonProperty("or_per_copy_num")
    private Float orPerCopyNum;

    @JsonProperty("or_value")
    private String orValue;

    @JsonProperty("beta_num")
    private Float betaNum;

    @JsonProperty("beta_unit")
    private String betaUnit;

    @JsonProperty("beta_direction")
    private String betaDirection;

    @JsonProperty("beta")
    private String beta;

    @JsonProperty("last_mapping_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastMappingDate;

    @JsonProperty("last_update_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastUpdateDate;

    @JsonProperty("p_value")
    private Double pValue;

    @JsonProperty("efo_traits")
    private List<EFOWrapperDTO> efoTraits;

    @JsonProperty("reported_trait")
    private List<String> reportedTrait;

    @JsonProperty("accession_id")
    private String accessionID;

    @JsonProperty("locations")
    private List<String> locations;

    @JsonProperty("mapped_genes")
    private List<String> mappedGenes;

    @JsonProperty("snp_risk_allele")
    private List<String> riskAllele;

    @JsonProperty("effect_allele")
    private List<RiskAlleleWrapperDTO> effectAlleles;

    @JsonProperty("bg_efo_traits")
    private List<EFOWrapperDTO> bgEfoTraits;

    @JsonProperty("pubmed_id")
    private String pubmedId;

    @JsonProperty("first_author")
    private String firstAuthor;

    @JsonProperty("ci_lower")
    private Float ciLower;

    @JsonProperty("ci_upper")
    private Float ciUpper;


}
