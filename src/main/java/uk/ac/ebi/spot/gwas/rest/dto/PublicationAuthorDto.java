package uk.ac.ebi.spot.gwas.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@EqualsAndHashCode
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PublicationAuthorDto implements Serializable {

    private static final long serialVersionUID = -4616993986872050853L;

    @JsonProperty("fullName")
    private String fullName;

    @JsonProperty("fullNameStandard")
    private String fullNameStandard;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("initials")
    private String initials;

    @JsonProperty("affiliation")
    private String affiliation;

    @JsonProperty("orcid")
    private String orcid;
}
