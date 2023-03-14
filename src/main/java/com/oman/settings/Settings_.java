package com.oman.settings;

public class Settings_ {

    private String linkedinCookie;
    private String dropContactApiKey;
    private String zohoApiKey;
    private String emailBounceAddress;
    private String emailDomain;
    private String emailSender;
    private String emailTestSender;
    private String emailTestRecipient;

    public Settings_() {
    }

    public Settings_(String linkedinCookie, String dropContactApiKey, String zohoApiKey, String emailBounceAddress,
                     String emailDomain, String emailSender, String emailTestSender, String emailTestRecipient) {
        this.linkedinCookie = linkedinCookie;
        this.dropContactApiKey = dropContactApiKey;
        this.zohoApiKey = zohoApiKey;
        this.emailBounceAddress = emailBounceAddress;
        this.emailDomain = emailDomain;
        this.emailSender = emailSender;
        this.emailTestSender = emailTestSender;
        this.emailTestRecipient = emailTestRecipient;
    }

    public String getLinkedinCookie() {
        return linkedinCookie;
    }

    public String getDropContactApiKey() {
        return dropContactApiKey;
    }

    public String getZohoApiKey() {
        return zohoApiKey;
    }

    public String getEmailBounceAddress() {
        return emailBounceAddress;
    }

    public String getEmailDomain() {
        return emailDomain;
    }

    public String getEmailSender() {
        return emailSender;
    }

    public String getEmailTestSender() {
        return emailTestSender;
    }

    public String getEmailTestRecipient() {
        return emailTestRecipient;
    }

}
