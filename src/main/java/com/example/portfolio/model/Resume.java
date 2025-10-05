package com.example.portfolio.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "resumes")
public class Resume {

    @Id
    private String id;
    private String name;
    private String about;
    private Contact contact;
    private String profileImagePath;
    private List<String> expertise;
    private List<Education> education;
    private List<Experience> experience;
    private List<Project> projects;
    private List<String> certifications;
    private List<String> languages;

    // ✅ Technical Proficiency Section
    private List<TechnicalSkill> technicalProficiency;

    public Resume() {
    }

    public Resume(String id, String name, String about, Contact contact, String profileImagePath,
            List<String> expertise, List<Education> education, List<Experience> experience,
            List<Project> projects, List<String> certifications, List<String> languages,
            List<TechnicalSkill> technicalProficiency) {
        this.id = id;
        this.name = name;
        this.about = about;
        this.contact = contact;
        this.profileImagePath = profileImagePath;
        this.expertise = expertise;
        this.education = education;
        this.experience = experience;
        this.projects = projects;
        this.certifications = certifications;
        this.languages = languages;
        this.technicalProficiency = technicalProficiency;
    }

    // ====== Getters & Setters ======
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getProfileImagePath() {
        return profileImagePath;
    }

    public void setProfileImagePath(String profileImagePath) {
        this.profileImagePath = profileImagePath;
    }

    public List<String> getExpertise() {
        return expertise;
    }

    public void setExpertise(List<String> expertise) {
        this.expertise = expertise;
    }

    public List<Education> getEducation() {
        return education;
    }

    public void setEducation(List<Education> education) {
        this.education = education;
    }

    public List<Experience> getExperience() {
        return experience;
    }

    public void setExperience(List<Experience> experience) {
        this.experience = experience;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<String> getCertifications() {
        return certifications;
    }

    public void setCertifications(List<String> certifications) {
        this.certifications = certifications;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<TechnicalSkill> getTechnicalProficiency() {
        return technicalProficiency;
    }

    public void setTechnicalProficiency(List<TechnicalSkill> technicalProficiency) {
        this.technicalProficiency = technicalProficiency;
    }
}
