package com.oman.campaign;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.oman.enduser.EndUser;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

@Entity
public class Campaign {

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

    @JoinColumn(name = "end_user_id")
    private EndUser endUser;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLinkedinLeadsUrl() {
        return linkedinLeadsUrl;
    }

    public void setLinkedinLeadsUrl(String linkedinLeadsUrl) {
        this.linkedinLeadsUrl = linkedinLeadsUrl;
    }

    public String getEmailTemplateSubject() {
        return emailTemplateSubject;
    }

    public void setEmailTemplateSubject(String emailTemplateSubject) {
        this.emailTemplateSubject = emailTemplateSubject;
    }

    public String getEmailTemplateText() {
        return emailTemplateText;
    }

    public void setEmailTemplateText(String emailTemplateText) {
        this.emailTemplateText = emailTemplateText;
    }

    public Boolean getCrawlingStatus() {
        return crawlingStatus;
    }

    public void setCrawlingStatus(Boolean crawlingStatus) {
        this.crawlingStatus = crawlingStatus;
    }

    public Boolean getEmailFindingStatus() {
        return emailFindingStatus;
    }

    public void setEmailFindingStatus(Boolean emailFindingStatus) {
        this.emailFindingStatus = emailFindingStatus;
    }

    public Boolean getIntroGenerationStatus() {
        return introGenerationStatus;
    }

    public void setIntroGenerationStatus(Boolean introGenerationStatus) {
        this.introGenerationStatus = introGenerationStatus;
    }

    public Boolean getCampaignStatus() {
        return campaignStatus;
    }

    public void setCampaignStatus(Boolean campaignStatus) {
        this.campaignStatus = campaignStatus;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
