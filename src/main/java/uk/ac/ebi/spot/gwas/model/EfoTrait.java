package uk.ac.ebi.spot.gwas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by emma on 04/12/14.
 *
 * @author emma
 * <p>
 * Model object representing an EFO trait which is normally assigned at the SNP level
 */

@Entity
public class EfoTrait {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String trait;

    @NotBlank
    private String uri;

    private String shortForm;

    private String mongoSeqId;

    @ManyToMany(mappedBy = "efoTraits")
    private Collection<Study> studies;

    @ManyToMany(mappedBy = "mappedBackgroundTraits")
    private Collection<Study> studiesBkg;

    @ManyToMany(mappedBy = "efoTraits")
    private Collection<Association> associations;

    @ManyToMany(mappedBy = "bkgEfoTraits")
    private Collection<Association> associationsBkg;

    @ManyToMany(mappedBy = "parentEfoTraits")
    private Collection<Association> associationsParentEfo;

    @ManyToMany(mappedBy = "parentStudyEfoTraits")
    private Collection<Study> studiesParentEfo;


    @JsonIgnore
    @OneToMany
    @JoinTable(name = "PARENT_CHILD_EFO_TRAIT",
            joinColumns = @JoinColumn(name = "PARENT_EFO_TRAIT_ID"),
            inverseJoinColumns = @JoinColumn(name = "CHILD_EFO_TRAIT_ID"))
    private Collection<EfoTrait> parentChildEfoTraits;


    // JPA no-args constructor
    public EfoTrait() {
    }

    public EfoTrait(String trait,
                    String uri,
                    String shortForm,
                    Collection<Study> studies,
                    Collection<Association> associations) {
        this.trait = trait;
        this.uri = uri;
        this.shortForm = shortForm;
        this.studies = studies;
        this.associations = associations;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrait() {
        return trait;
    }

    public void setTrait(String trait) {
        this.trait = trait;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Collection<Study> getStudies() {
        return studies;
    }

    public void setStudies(Collection<Study> studies) {
        this.studies = studies;
    }

    public Collection<Study> getStudiesBkg() {
        return studiesBkg;
    }

    public void setStudiesBkg(Collection<Study> studiesBkg) {
        this.studiesBkg = studiesBkg;
    }

    public Collection<Association> getAssociations() {
        return associations;
    }

    public void setAssociations(Collection<Association> associations) {
        this.associations = associations;
    }

    public Collection<Association> getAssociationsBkg() {
        return associationsBkg;
    }

    public void setAssociationsBkg(Collection<Association> associationsBkg) {
        this.associationsBkg = associationsBkg;
    }

    public String getShortForm() {
        return shortForm;
    }

    public void setShortForm(String shortForm) {
        this.shortForm = shortForm;
    }

    public String getMongoSeqId() {
        return mongoSeqId;
    }

    public void setMongoSeqId(String mongoSeqId) {
        this.mongoSeqId = mongoSeqId;
    }

    public Collection<Association> getAssociationsParentEfo() {
        return associationsParentEfo;
    }

    public void setAssociationsParentEfo(Collection<Association> associationsParentEfo) {
        this.associationsParentEfo = associationsParentEfo;
    }

    public Collection<EfoTrait> getParentChildEfoTraits() {
        return parentChildEfoTraits;
    }

    public void setParentChildEfoTraits(Collection<EfoTrait> parentChildEfoTraits) {
        this.parentChildEfoTraits = parentChildEfoTraits;
    }

    public Collection<Study> getStudiesParentEfo() {
        return studiesParentEfo;
    }

    public void setStudiesParentEfo(Collection<Study> studiesParentEfo) {
        this.studiesParentEfo = studiesParentEfo;
    }

    @Override
    public String toString() {
        return uri + " (" + trait + ")";
    }
}
