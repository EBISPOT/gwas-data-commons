package uk.ac.ebi.spot.gwas.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by emma on 26/01/15.
 *
 * @author emma
 *         <p>
 *         Locus object holds links to associated risk alleles and author reported genes
 */
@Entity
public class Locus {
    @Id
    @GeneratedValue
    private Long id;

    private Integer haplotypeSnpCount;

    private String description;

    @ManyToMany
    @JoinTable(name = "LOCUS_RISK_ALLELE",
               joinColumns = @JoinColumn(name = "LOCUS_ID"),
               inverseJoinColumns = @JoinColumn(name = "RISK_ALLELE_ID"))
    private Collection<RiskAllele> strongestRiskAlleles = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "AUTHOR_REPORTED_GENE",
               joinColumns = @JoinColumn(name = "LOCUS_ID"),
               inverseJoinColumns = @JoinColumn(name = "REPORTED_GENE_ID"))
    private Collection<Gene> authorReportedGenes = new ArrayList<>();

    @ManyToOne
    @JoinTable(name = "ASSOCIATION_LOCUS",
               joinColumns = @JoinColumn(name = "LOCUS_ID"),
               inverseJoinColumns = @JoinColumn(name = "ASSOCIATION_ID"))
    private Association association;

    // JPA no-args constructor
    public Locus() {
    }

    public Locus(Integer haplotypeSnpCount,
                 String description,
                 Collection<RiskAllele> strongestRiskAlleles,
                 Collection<Gene> authorReportedGenes) {
        this.haplotypeSnpCount = haplotypeSnpCount;
        this.description = description;
        this.strongestRiskAlleles = strongestRiskAlleles;
        this.authorReportedGenes = authorReportedGenes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getHaplotypeSnpCount() {
        return haplotypeSnpCount;
    }

    public void setHaplotypeSnpCount(Integer haplotypeSnpCount) {
        this.haplotypeSnpCount = haplotypeSnpCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<RiskAllele> getStrongestRiskAlleles() {
        return strongestRiskAlleles;
    }

    public void setStrongestRiskAlleles(Collection<RiskAllele> strongestRiskAlleles) {
        this.strongestRiskAlleles = strongestRiskAlleles;
    }

    public Collection<Gene> getAuthorReportedGenes() {
        return authorReportedGenes;
    }

    public void setAuthorReportedGenes(Collection<Gene> authorReportedGenes) {
        this.authorReportedGenes = authorReportedGenes;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }

    @Override public String toString() {
        return "Locus{" +
                "id=" + id +
                ", haplotypeSnpCount=" + haplotypeSnpCount +
                ", description='" + description + '\'' +
                '}';
    }
}
