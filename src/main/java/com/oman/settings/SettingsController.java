package com.oman.settings;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SettingsController {

    @GetMapping("/settings/{id}")
    public ResponseEntity<Settings> findById(@PathVariable Long id) {
        Settings settings = new Settings("linkedinCookie", "dropContactApiKey", "zohoApiKey", "emailBounceAddress",
                "emailDomain", "emailSender", "emailTestSender", "emailTestRecipient");
        return ResponseEntity.ok(settings);
    }

}
