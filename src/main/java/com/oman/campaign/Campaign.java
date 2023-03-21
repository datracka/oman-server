package com.oman.campaign;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.oman.enduser.EndUser;
// import com.oman.lead.Lead;
import com.oman.lead.Lead;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@Table(name = "campaign")
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String linkedinLeadsUrl;
    private String emailTemplateSubject;
    private String emailTemplateText;
    private Boolean crawlingStatus;
    private Boolean emailFindingStatus;
    private Boolean introGenerationStatus;
    private Boolean campaignStatus;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @GeneratedValue(generator = "UUID")
    private UUID uuid;

    @ManyToOne
    @JoinColumn(name = "end_user_id")
    private EndUser endUser;

    // Mapping to the other table
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Lead> lead;

}
