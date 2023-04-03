package com.oman.setting;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/settings")
public class SettingController {

    @GetMapping
    public List<ResponseEntity<SettingDto>> getSeettings() {
        // return new List<SettingDto>();
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<SettingDto> getSetting(@PathVariable Long id) {
        return null;
    }

    @PostMapping
    public ResponseEntity<SettingDto> createSetting(SettingDto settingDto) {
        return null;
    }

    @PutMapping("/{id}")
    public void updateSetting(SettingDto settingDto) {
    }

    @DeleteMapping("/{id}")
    public void deleteSettingById(Long id) {
    }

}
