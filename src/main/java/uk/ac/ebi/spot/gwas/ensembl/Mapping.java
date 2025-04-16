package uk.ac.ebi.spot.gwas.ensembl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Mapping {

    @JsonProperty("strand")
    public Integer strand;

    @JsonProperty("end")
    public Integer end;

    @JsonProperty("assembly_name")
    public String assemblyName;

    @JsonProperty("ancestral_allele")
    public String ancestralAllele;

    @JsonProperty("seq_region_name")
    public String seqRegionName;

    @JsonProperty("allele_string")
    public String alleleString;

    @JsonProperty("coord_system")
    public String coordSystem;

    @JsonProperty("start")
    public Integer start;

    @JsonProperty("location")
    public String location;

}
