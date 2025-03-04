package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Relation(value = "gene", collectionRelation = "genes")
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
