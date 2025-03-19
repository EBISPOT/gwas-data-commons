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
public class OLSTermApiResponse implements Serializable {

    private static final long serialVersionUID = 6812654964752390997L;

    @JsonProperty("_embedded")
    private OLSResponse olsResponse;


    @JsonProperty("_links")
    private Links links;
}
