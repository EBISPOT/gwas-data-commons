package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import java.io.Serializable;
import java.sql.Date;

@JsonPropertyOrder({
        "gcp_id",
        "title",
        "first_author",
        "publication_date",
        "doi",
        "_links"
})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Relation(collectionRelation = "body_of_works", itemRelation = "body_of_work")
public class BodyOfWorkDTO extends RepresentationModel<BodyOfWorkDTO> {

    @JsonProperty("gcp_id")
    private String gcpId;

    @JsonProperty("title")
    private String title;

    @JsonProperty("first_author")
    private String firstAuthor;

    @JsonProperty("publication_date")
    private Date publicationDate;

    @JsonProperty("doi")
    private String doi;



}
