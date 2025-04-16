package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.hateoas.RepresentationModel;

import java.util.List;


@JsonPropertyOrder({
        "gene_name",
        "gene_description",
        "location",
        "cytogenic_region",
        "biotype",
        "ensembl_gene_ids",
        "entrez_gene_ids",
        "_links"
})

@EqualsAndHashCode(callSuper = false)
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
public class GeneDTO extends RepresentationModel<GeneDTO> {

    @JsonProperty("gene_name")
    private String geneName;

    @JsonProperty("ensembl_gene_ids")
    private List<String> ensemblGeneIds;

    @JsonProperty("entrez_gene_ids")
    private List<String> entrezGeneIds;

    @JsonProperty("gene_description")
    private String geneDescription;

    @JsonProperty("location")
    private String location;

    @JsonProperty("cytogenic_region")
    private String cytogenicRegion;

    @JsonProperty("biotype")
    private String biotype;
}
