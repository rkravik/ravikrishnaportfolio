package com.example.portfolio.model;

public class Contact {
    private String phone;
    private String email;
    private String address;
    private String linkedin;
    private String github;

    public Contact() {
    }

    public Contact(String phone, String email, String address, String linkedin, String github) {
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.linkedin = linkedin;
        this.github = github;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }
}
