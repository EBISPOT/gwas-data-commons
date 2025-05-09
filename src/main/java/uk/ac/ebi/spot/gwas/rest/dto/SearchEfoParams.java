package uk.ac.ebi.spot.gwas.rest.dto;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.Data;
import org.springdoc.api.annotations.ParameterObject;
import uk.ac.ebi.spot.gwas.annotation.GWASParamName;

@Data
@ParameterObject
public class SearchEfoParams {

    @GWASParamName("efo_trait")
    @Parameter(name = "efo_trait" ,  description = "The trait name or label <br/> <br/>" +
            "<i> Example </i> : celiac disease")
    private String trait;

    @Parameter(name = "uri", description = "The trait URI or unique identifier <br/> <br/>" +
            "<i> Example </i> : http://www.ebi.ac.uk/efo/EFO_0001060")
    private String uri;

    @GWASParamName("efo_id")
    @Parameter(name = "efo_id", description = "The trait URI shortform <br/> <br/>" +
            "<i> Example </i> : EFO_0001060")
    private String shortForm;

    @GWASParamName("pubmed_id")
    @Parameter(name = "pubmed_id", description = "pubmedId of the publication <br/> <br/>" +
            "<i> Example </i> : 35241825")
    private String pubmedId;
}
