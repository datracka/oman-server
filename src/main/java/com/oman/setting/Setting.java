package com.oman.setting;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.lang.NonNull;

import com.oman.enduser.EndUser;

import jakarta.persistence.CascadeType;
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
    private String linkedinCookie;
    @NonNull
    private String dropContactApiKey;
    @NonNull
    private String zohoApiKey;
    @NonNull
    private String openAIApiKey;

    @NonNull
    private String openAIOrganizationId;

    @NonNull
    private String emailBounceAddress;
    @NonNull
    private String emailDomain;
    @NonNull
    private String emailSender;
    @NonNull
    private String emailTestSender;
    @NonNull
    private String emailTestRecipient;
    @NonNull
    private Boolean testMode;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "end_user_id", referencedColumnName = "id")
    private EndUser enduser;

    // public Setting(@NonNull String linkedinCookie, @NonNull String
    // dropContactApiKey, @NonNull String zohoApiKey,
    // @NonNull String openAIApiKey,
    // @NonNull String openAIOrganizationId, @NonNull String emailBounceAddress,
    // @NonNull String emailDomain,
    // @NonNull String emailSender,
    // @NonNull String emailTestSender, @NonNull String emailTestRecipient, @NonNull
    // Boolean testMode,
    // ) {
    // this.linkedinCookie = linkedinCookie;
    // this.dropContactApiKey = dropContactApiKey;
    // this.zohoApiKey = zohoApiKey;
    // this.openAIApiKey = openAIApiKey;
    // this.openAIOrganizationId = openAIOrganizationId;
    // this.emailBounceAddress = emailBounceAddress;
    // this.emailDomain = emailDomain;
    // this.emailSender = emailSender;
    // this.emailTestSender = emailTestSender;
    // this.emailTestRecipient = emailTestRecipient;
    // this.testMode = testMode;
    // }

}
