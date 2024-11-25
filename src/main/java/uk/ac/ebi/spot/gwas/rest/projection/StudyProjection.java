package uk.ac.ebi.spot.gwas.rest.projection;

import uk.ac.ebi.spot.gwas.model.*;

import java.util.Collection;
import java.util.List;

public interface StudyProjection {

    String getInitialSampleSize();

    String getReplicateSampleSize();

    Long getStudyId();

    Boolean getGxe();

    Boolean getGxg();

    Integer getSnpCount();

    String getQualifier();

    Boolean getImputed();

    Boolean  getPooled();

    String  getStudyDesignComment();

    String getAccessionId();

    Boolean getFullPvalueSet();

    Boolean getUserRequested();

    String getPubmedId();

    //Collection<Platform> getPlatforms();

    DiseaseTrait getDiseaseTrait();

    //Collection<GenotypingTechnology>   getGenotypingTechnologies();

    //Collection<EfoTrait> getEFOTraits();

    //Collection<Ancestry> getAncestries();

    //Collection<EfoTrait> getMappedBackgroundTraits();



}
