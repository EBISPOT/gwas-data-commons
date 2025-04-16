package uk.ac.ebi.spot.gwas.ensembl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


import java.util.List;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Variant {

    @JsonProperty("name")
    public String name;

    @JsonProperty("ambiguity")
    public String ambiguity;

    @JsonProperty("source")
    public String source;

    @JsonProperty("mappings")
    public List<Mapping> mappings;

    @JsonProperty("var_class")
    public String varClass;

    @JsonProperty("minor_allele")
    public String minorAllele;

    @JsonProperty("evidence")
    public List<String> evidence;

    @JsonProperty("most_severe_consequence")
    public String mostSevereConsequence;

    @JsonProperty("MAF")
    public Double maf;

    @JsonProperty("synonyms")
    public List<String> synonyms;

    @JsonProperty("error")
    public String error;

    @JsonProperty("failed")
    public String failed;

    public Variant(String error) {
        this.error = error; // This is needed when API returns error only
    }
}
