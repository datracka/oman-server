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

    @NonNull
    private Boolean testMode;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    @OneToOne()
    @JoinColumn(name = "enduser_id", referencedColumnName = "id")
    private EndUser enduser;

}
