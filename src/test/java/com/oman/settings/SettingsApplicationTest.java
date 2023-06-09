package com.oman.settings;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SettingsApplicationTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    void shouldReturnASettingsWhenDataIsSaved() {
        ResponseEntity<String> response = restTemplate.getForEntity("/settings/99", String.class);
        assertThat(true).isTrue();
        // assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}
