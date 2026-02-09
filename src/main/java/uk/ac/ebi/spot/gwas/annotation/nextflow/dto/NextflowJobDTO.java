package uk.ac.ebi.spot.gwas.annotation.nextflow.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NextflowJobDTO {

    private String studyIds;

    private String pmid;

    private String submissionId;

    private String submissionType;

    private String curatorEmail;
}
