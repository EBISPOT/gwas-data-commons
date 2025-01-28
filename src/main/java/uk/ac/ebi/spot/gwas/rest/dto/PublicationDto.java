package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PublicationDto extends RepresentationModel<PublicationDto> implements Serializable {

    private static final long serialVersionUID = -4455708767044282206L;

    @JsonProperty("pubmedId")
    private String pubmedId;

    @JsonProperty("publicationDate")
    @JsonFormat(pattern="YYYY-MM-dd")
    private Date publicationDate;

    @JsonProperty("journal")
    private String journal;

    @JsonProperty("title")
    private String title;

    @JsonProperty("authors")
    private List<PublicationAuthorDto> authors;

    @JsonProperty("firstAuthor")
    private PublicationAuthorDto firstAuthor;

}
