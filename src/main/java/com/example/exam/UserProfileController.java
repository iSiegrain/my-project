package com.example.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@SpringBootApplication
@RestController
@RequestMapping(path = "api/users")
public class UserProfileController {

    private final UserProfileService userProfileService;

    public static void main(String[] args) {
        SpringApplication.run(UserProfileController.class, args);
    }

    @Autowired
    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    @GetMapping
    public List<UserProfileDTO> getAllProfiles() {
        return userProfileService.getAllProfiles();
    }

    @GetMapping("/{id}")
    public UserProfileDTO getProfileById(@PathVariable Long id) {
            return userProfileService.getProfileById(id);
    }

    @PostMapping
    public UserProfile createProfile(@RequestBody UserProfile userProfile) {
        return userProfileService.createProfile(userProfile);
    }

    @PutMapping("/{id}")
    public UserProfile updateProfile(@PathVariable Long id, @RequestBody UserProfile userProfile) {
        return userProfileService.updateProfile(id, userProfile);
    }

    @DeleteMapping("/{id}")
    public void deleteProfile(@PathVariable Long id) {
        userProfileService.deleteProfile(id);
    }
}
