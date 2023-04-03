package com.oman.setting;

// import com.oman.common.AbstractRestHandler;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private SettingService settingService;

    private final ModelMapper mapper = new ModelMapper();

    @GetMapping
    public List<SettingDto> getSeettings() {
        Iterable<Setting> settings = this.settingService.findAllSettings();
        var settingsList = StreamSupport.stream(settings.spliterator(), false).collect(Collectors.toList());
        return settingsList.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public SettingDto getSetting(@PathVariable Long id) {
        return convertToDto(settingService.findSettingById(id));
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

    private SettingDto convertToDto(Setting entity) {
        return mapper.map(entity, SettingDto.class);
    }

    private Setting convertToEntity(SettingDto dto) {
        return mapper.map(dto, Setting.class);
    }

}
