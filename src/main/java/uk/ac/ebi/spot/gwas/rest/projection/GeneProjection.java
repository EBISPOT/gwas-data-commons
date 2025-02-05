package uk.ac.ebi.spot.gwas.rest.projection;

public interface GeneProjection {

    String getGeneName();

    Boolean getIsUpstream();

    Boolean getIsDownstream();

    Boolean getIsIntergenic();

    Boolean getIsClosestGene();

    Long getDistance();

    String getChromosomeName();

    Integer getChromosomePosition();

}
