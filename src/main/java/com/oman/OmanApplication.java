package com.oman;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.oman.setting.SettingRepo;

@SpringBootApplication
public class OmanApplication implements CommandLineRunner {

	private final SettingRepo settingRepo;

	public static void main(String[] args) {
		SpringApplication.run(OmanApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
