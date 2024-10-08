package uk.ac.ebi.spot.gwas.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

/**
 * Created by Dani on 13/04/2017.
 */

@Entity
public class AncestralGroup {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String ancestralGroup;

    @ManyToMany(mappedBy = "ancestralGroups")
    private Collection<Ancestry> ancestries;

    // JPA no-args constructor
    public AncestralGroup() {
    }

    public AncestralGroup(String ancestralGroup,
                          Collection<Ancestry> ancestries) {
        this.ancestralGroup = ancestralGroup;
        this.ancestries = ancestries;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAncestralGroup() {
        return ancestralGroup;
    }

    public void setAncestralGroup(String ancestralGroup) {
        this.ancestralGroup = ancestralGroup;
    }

    public Collection<Ancestry> getAncestries() {
        return ancestries;
    }

    public void setAncestries(Collection<Ancestry> ancestries) {
        this.ancestries = ancestries;
    }

    @Override
    public String toString() {
        return ancestralGroup;
    }
}
