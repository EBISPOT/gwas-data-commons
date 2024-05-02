package uk.ac.ebi.spot.gwas.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PublicationExtension {
    @Id
    @GeneratedValue
    private Long id;

    private String correspondingAuthorName;

    private String correspondingAuthorEmail;

    private String correspondingAuthorOrcId;

    @OneToOne(cascade = {CascadeType.ALL})
    @JsonManagedReference("publicationInfo")
    @JoinColumn(name = "publication_id")
    private Publication publicationId;


}
