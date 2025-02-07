package com.example.exam;

import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserProfileService {

    private final UserProfileRepository userProfileRepository;

    @Autowired
    public UserProfileService(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    public List<UserProfileDTO> getAllProfiles() {
        return userProfileRepository.findAll().stream().map(UserProfileDTO::new).collect(Collectors.toList());
    }

    public UserProfileDTO getProfileById(Long id) {
        if (!userProfileRepository.existsById(id)) {
            return null;
        }
        return userProfileRepository.findById(id).map(UserProfileDTO::new).get();
    }

    public UserProfile createProfile(UserProfile userProfile) {
        return userProfileRepository.save(userProfile);
    }

    public UserProfile updateProfile(Long id, UserProfile userProfile) {
        if (userProfileRepository.existsById(id)) {
            userProfile.setId(id);
            return userProfileRepository.save(userProfile);
        }
        return null;
    }

    public void deleteProfile(Long id) {
        userProfileRepository.deleteById(id);
    }

}
