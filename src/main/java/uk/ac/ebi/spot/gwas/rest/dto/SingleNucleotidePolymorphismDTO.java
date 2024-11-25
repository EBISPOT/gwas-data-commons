package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SingleNucleotidePolymorphismDTO extends RepresentationModel<SingleNucleotidePolymorphismDTO> implements Serializable {

    private static final long serialVersionUID = -6860683785709875719L;

    @JsonProperty("rsId")
    private String rsId;

    @JsonProperty("merged")
    private Long merged;

    @JsonProperty("functionalClass")
    private String functionalClass;

    @JsonProperty("currentSnp")
    private String currentSnp;

    @JsonProperty("lastUpdateDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastUpdateDate;

    @JsonProperty("locations")
    private List<LocationDTO> locations;

}
