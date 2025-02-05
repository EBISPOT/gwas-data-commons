package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.hateoas.RepresentationModel;

import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
public class GeneDTO extends RepresentationModel<GeneDTO> {

    @JsonProperty("geneName")
    private String geneName;

    @JsonProperty("ensemblGeneIds")
    private List<String> ensemblGeneIds;

    @JsonProperty("entrezGeneIds")
    private List<String> entrezGeneIds;

    @JsonProperty("geneDescription")
    private String geneDescription;

    @JsonProperty("location")
    private String location;

    @JsonProperty("cytogenicRegion")
    private String cytogenicRegion;

    @JsonProperty("biotype")
    private String biotype;
}
