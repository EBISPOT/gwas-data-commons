package uk.ac.ebi.spot.gwas.ols;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class OLSResponse implements Serializable {

    private static final long serialVersionUID = -6197000973447042259L;

    @JsonProperty("terms")
    private List<TermApi> terms = null;

}
