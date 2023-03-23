package com.oman;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.oman.setting.Setting;
import com.oman.setting.SettingRepo;

@SpringBootApplication
public class OmanApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(OmanApplication.class);

	@Autowired
	private SettingRepo settingRepo;

	public static void main(String[] args) {
		SpringApplication.run(OmanApplication.class, args);
	}

	@Override
	public void run(String... args) {
		settingRepo.save(
				new Setting("linkedinCookie 11 ",
						"dropContactApiKey",
						"zohoApikey", "openAAPiKey",
						"OpenAIOrganizationID",
						"EmailBouncedAddress", "emailSender", "emailTestSender", "emailTestRecipient", false));

		settingRepo.save(
				new Setting("linkedinCookie 22 ",
						"dropContactApiKey",
						"zohoApikey", "openAAPiKey",
						"OpenAIOrganizationID",
						"EmailBouncedAddress", "emailSender", "emailTestSender", "emailTestRecipient", false));

		// Fetch all cars and log to console
		for (var setting : settingRepo.findAll()) {
			logger.info(setting.getLinkedinCookie());
		}
	}

}
