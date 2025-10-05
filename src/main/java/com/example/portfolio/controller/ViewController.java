package com.example.portfolio.controller;

import com.example.portfolio.model.Resume;
import com.example.portfolio.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @Autowired
    private ResumeRepository repository;

    @GetMapping("/")
    public String index(Model model) {
        Resume resume = repository.findAll().stream().findFirst().orElse(new Resume());
        model.addAttribute("resume", resume);
        return "index";
    }
}
