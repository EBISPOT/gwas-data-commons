package uk.ac.ebi.spot.gwas.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class BodyOfWork{
    @Id
    @GeneratedValue
    @EqualsAndHashCode.Exclude
    private Long id;
    @Column(name = "pub_id")
    @JsonProperty("publication_id")
    private String publicationId;
    private String pubMedId;
    private String journal;
    private String title;
    private String firstAuthor;
//    private DepositionAuthor correspondingAuthor;
    @Column(name = "pub_date")
    private Date publicationDate;
//    private String status;
    private String doi;

    @ManyToMany
    @JoinTable(name = "unpublished_study_to_work", joinColumns = @JoinColumn(name = "work_id"), inverseJoinColumns =
    @JoinColumn(name = "study_id"))
    @EqualsAndHashCode.Exclude
    private Set<UnpublishedStudy> studies;


}
