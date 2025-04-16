package uk.ac.ebi.spot.gwas.ols;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TermApi implements Serializable {

    private static final long serialVersionUID = 5960236475279645466L;

    @JsonProperty("short_form")
    private String shortForm;
    @JsonProperty("label")
    private String label;
}
