package uk.ac.ebi.spot.gwas.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class PmidImportReporting {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Publication publication;

    private Integer studiesImported;

    private Integer studiesTotal;

    private String associationMapping;

    private String associationApproved;

    private String studiesPublished;

    private Date startDate;

    private Date completionDate;

    private String submissionId;

    private String status;

    private String curatorEmail;

    private String submissionType;
}
