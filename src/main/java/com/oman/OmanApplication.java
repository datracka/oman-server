package com.oman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.oman.campaign.Campaign;
import com.oman.campaign.CampaignRepo;
import com.oman.enduser.EndUser;
import com.oman.enduser.EndUserRepo;
import com.oman.setting.Setting;
import com.oman.setting.SettingRepo;
import com.oman.todoitem.TodoItem;
import com.oman.todoitem.TodoItemRepo;

import jakarta.persistence.EntityManager;

@SpringBootApplication
public class OmanApplication implements CommandLineRunner {

	@Autowired
	private EndUserRepo endUserRepo;

	@Autowired
	private SettingRepo settingRepo;

	@Autowired
	private CampaignRepo campaignRepo;

	public static void main(String[] args) {
		SpringApplication.run(OmanApplication.class, args);
	}

	@Override
	public void run(String... args) {

		var enduser = new EndUser("Oman", "aa@aaa.es", "1234");

		// var enduser1 = endUserRepo.save();
		// settingRepo.save(
		Setting setting = new Setting("linkedinCookie", "dropContactApiKey", "zohoApiKey",
				"openAIApiKey", "openAIOrganizationId",
				"emailBounceAddress",
				"emailDomain", "emailSender",
				"emailTestSender", "emailTestRecipient", true);
		setting.setEnduser(enduser);
		settingRepo.save(setting);

	}

}
