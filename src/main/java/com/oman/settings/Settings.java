package com.oman.settings;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Settings {

    private Long id;
    private String linkedinCookie;
    private String dropContactApiKey;
    private String zohoApiKey;
    private String openAIApiKey;

    private String openAIOrganizationId;

    private String emailBounceAddress;
    private String emailDomain;
    private String emailSender;
    private String emailTestSender;
    private String emailTestRecipient;
    private Boolean testMode;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @GeneratedValue(generator = "UUID")
    private UUID uuid;

    public Settings() {
    }

    public Settings(Long id, String linkedinCookie, String dropContactApiKey, String zohoApiKey,
            String openAIApiKey, String openAIOrganizationId,
            String emailBounceAddress,
            String emailDomain, String emailSender, String emailTestSender, String emailTestRecipient, Boolean testMode,
            LocalDateTime createdAt, LocalDateTime updatedAt, UUID uuid) {

        this.linkedinCookie = linkedinCookie;
        this.dropContactApiKey = dropContactApiKey;
        this.zohoApiKey = zohoApiKey;
        this.openAIApiKey = openAIApiKey;
        this.openAIOrganizationId = openAIOrganizationId;
        this.emailBounceAddress = emailBounceAddress;
        this.emailDomain = emailDomain;
        this.emailSender = emailSender;
        this.emailTestSender = emailTestSender;
        this.emailTestRecipient = emailTestRecipient;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLinkedinCookie() {
        return linkedinCookie;
    }

    public void setLinkedinCookie(String linkedinCookie) {
        this.linkedinCookie = linkedinCookie;
    }

    public String getDropContactApiKey() {
        return dropContactApiKey;
    }

    public void setDropContactApiKey(String dropContactApiKey) {
        this.dropContactApiKey = dropContactApiKey;
    }

    public String getZohoApiKey() {
        return zohoApiKey;
    }

    public void setZohoApiKey(String zohoApiKey) {
        this.zohoApiKey = zohoApiKey;
    }

    public String getEmailBounceAddress() {
        return emailBounceAddress;
    }

    public void setEmailBounceAddress(String emailBounceAddress) {
        this.emailBounceAddress = emailBounceAddress;
    }

    public String getEmailDomain() {
        return emailDomain;
    }

    public void setEmailDomain(String emailDomain) {
        this.emailDomain = emailDomain;
    }

    public String getEmailSender() {
        return emailSender;
    }

    public void setEmailSender(String emailSender) {
        this.emailSender = emailSender;
    }

    public String getEmailTestSender() {
        return emailTestSender;
    }

    public void setEmailTestSender(String emailTestSender) {
        this.emailTestSender = emailTestSender;
    }

    public String getEmailTestRecipient() {
        return emailTestRecipient;
    }

    public void setEmailTestRecipient(String emailTestRecipient) {
        this.emailTestRecipient = emailTestRecipient;
    }

    public String getOpenAIApiKey() {
        return openAIApiKey;
    }

    public void setOpenAIApiKey(String openAIApiKey) {
        this.openAIApiKey = openAIApiKey;
    }

    public String getOpenAIOrganizationId() {
        return openAIOrganizationId;
    }

    public void setOpenAIOrganizationId(String openAIOrganizationId) {
        this.openAIOrganizationId = openAIOrganizationId;
    }

    public Boolean getTestMode() {
        return testMode;
    }

    public void setTestMode(Boolean testMode) {
        this.testMode = testMode;
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
