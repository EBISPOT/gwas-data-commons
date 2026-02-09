package uk.ac.ebi.spot.gwas.annotation.nextflow.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
        "jobId",
        "jobCommand"
})
public class JobMapperDTO {


    private String jobId;

    private String jobCommand;
}
