package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.sql.Date;

@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BodyOfWorkDTO extends RepresentationModel<BodyOfWorkDTO> implements Serializable {

    private static final long serialVersionUID = 4039413000981023870L;

    @JsonProperty("gcpId")
    private String gcpId;

    @JsonProperty("title")
    private String title;

    @JsonProperty("firstAuthor")
    private String firstAuthor;

    @JsonProperty("publicationDate")
    private Date publicationDate;

    @JsonProperty("doi")
    private String doi;



}
