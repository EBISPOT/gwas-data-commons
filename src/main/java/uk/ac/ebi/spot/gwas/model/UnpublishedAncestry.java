package uk.ac.ebi.spot.gwas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class UnpublishedAncestry {
    @Id
    @GeneratedValue
    @JsonIgnore
    private Long id;

    @JsonProperty("study_tag")
    private String studyTag;
    private String stage;
    private Integer sampleSize;
    private Integer cases;
    private Integer controls;
    @JsonProperty("sample_description")
    private String sampleDescription;
    @JsonProperty("ancestry_category")
    private String ancestryCategory;
    private String ancestry;

    @JsonProperty("ancestry_description")
    private String ancestryDescription;
    @JsonProperty("country_recruitment")
    private String countryRecruitment;

    @OneToOne
    @JoinColumn(name = "study_id", unique = true)
    @EqualsAndHashCode.Exclude
    private UnpublishedStudy study;


}