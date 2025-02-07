package com.example.exam;


import java.time.LocalDate;

public class UserProfileDTO {

    private Long id;
    private String name;
    private String email;
    private String gender;
    private LocalDate birthDate;
    private int age;

    public UserProfileDTO() {}

    public UserProfileDTO(UserProfile userProfile) {
        this.id = userProfile.getId();
        this.name = userProfile.getName();
        this.email = userProfile.getEmail();
        this.gender = userProfile.getGender();
        this.birthDate = userProfile.getBirthDate();
        this.age = userProfile.getAge();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

