package com.oman.setting;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.lang.NonNull;

import com.oman.enduser.EndUser;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "setting")
public class Setting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(name = "linkedin_cookie")
    private String linkedinCookie;

    @NonNull
    @Column(name = "dropcontact_api_key")
    private String dropContactApiKey;

    @NonNull
    @Column(name = "zoho_api_key")
    private String zohoApiKey;

    @NonNull
    @Column(name = "openai_api_key")
    private String openAIApiKey;

    @NonNull
    @Column(name = "openai_organization_id")
    private String openAIOrganizationId;

    @NonNull
    @Column(name = "email_bounce_address")
    private String emailBounceAddress;

    @NonNull
    @Column(name = "email_domain")
    private String emailDomain;

    @NonNull
    @Column(name = "email_sender")
    private String emailSender;

    @NonNull
    @Column(name = "email_test_sender")
    private String emailTestSender;

    @NonNull
    @Column(name = "email_test_recipient")
    private String emailTestRecipient;

    @NonNull
    @Column(name = "test_mode")
    private Boolean testMode;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    @OneToOne()
    @JoinColumn(name = "enduser_id", referencedColumnName = "id")
    private EndUser enduser;

}
