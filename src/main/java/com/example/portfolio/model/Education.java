package com.example.portfolio.model;

public class Education {
    private String title;
    private String institute;
    private String period;
    private String grade;

    public Education() {}

    public Education(String title, String institute, String period, String grade) {
        this.title = title;
        this.institute = institute;
        this.period = period;
        this.grade = grade;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getInstitute() { return institute; }
    public void setInstitute(String institute) { this.institute = institute; }
    public String getPeriod() { return period; }
    public void setPeriod(String period) { this.period = period; }
    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
}
