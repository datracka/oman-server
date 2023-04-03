package com.oman.setting;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SettingService {

    private final SettingRepo settingRepo;

    public Iterable<Setting> findAllSettings() {
        return settingRepo.findAll();
    }

    public Setting findSettingById(Long id) {
        return settingRepo.findById(id).orElse(null);
    }

    public Setting saveSetting(Setting setting) {
        return settingRepo.save(setting);
    }

    public void deleteSettingById(Long id) {
        settingRepo.deleteById(id);
    }

    public Setting updateSetting(Setting setting) {
        return null;
    }

}
