package com.example.portfolio.model;

public class Experience {
    private String period;
    private String company;
    private String role;
    private String description;

    public Experience() {}

    public Experience(String period, String company, String role, String description) {
        this.period = period;
        this.company = company;
        this.role = role;
        this.description = description;
    }

    public String getPeriod() { return period; }
    public void setPeriod(String period) { this.period = period; }
    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
