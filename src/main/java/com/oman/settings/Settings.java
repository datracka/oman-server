package com.oman.settings;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@Table(name = "settings")
public class Settings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

}
