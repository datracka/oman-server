package com.oman.setting;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SettingDto {

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
    private UUID uuid;
}
