package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@JsonPropertyOrder({
        "pubmedId",
        "publication_date",
        "journal",
        "title",
        "authors",
        "first_author",
        "_links"
})
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Relation(collectionRelation = "publications", itemRelation = "publication")
public class PublicationDto extends RepresentationModel<PublicationDto> implements Serializable {

    private static final long serialVersionUID = -4455708767044282206L;

    @JsonProperty("pubmedId")
    private String pubmedId;

    @JsonProperty("publication_date")
    @JsonFormat(pattern="YYYY-MM-dd")
    private Date publicationDate;

    @JsonProperty("journal")
    private String journal;

    @JsonProperty("title")
    private String title;

    @JsonProperty("authors")
    private List<PublicationAuthorDto> authors;

    @JsonProperty("first_author")
    private PublicationAuthorDto firstAuthor;

}
