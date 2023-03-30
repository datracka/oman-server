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
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@SpringBootApplication
public class OmanApplication implements CommandLineRunner {

	@Autowired
	private SettingRepo settingRepo;

	@Autowired
	private EndUserRepo endUserRepo;

	public static void main(String[] args) {
		SpringApplication.run(OmanApplication.class, args);
	}

	@Override
	public void run(String... args) {

		var enduser = endUserRepo.save(new EndUser("Muni", "aa@aaa.es", "1234"));

		var setting = new Setting();
		setting.setLinkedinCookie("XLinkedinCookie");
		setting.setDropContactApiKey("XDContact");
		setting.setZohoApiKey("XZohoApiKey");
		setting.setOpenAIApiKey("XopenAIApiKey");
		setting.setOpenAIOrganizationId("XopenAIOrganizationId");
		setting.setEmailBounceAddress("XemailBounceAddress");
		setting.setEmailDomain("XEmailDomain");
		setting.setEmailSender("XEmailSender");
		setting.setEmailTestSender("XEmailTestSender");
		setting.setEmailTestRecipient("XEmailTestRecipient");
		setting.setTestMode(true);

		setting.setEnduser(enduser);
		settingRepo.save(setting);

	}

}
