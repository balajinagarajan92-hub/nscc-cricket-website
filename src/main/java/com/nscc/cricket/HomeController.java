package com.nscc.cricket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Home Page
    @GetMapping("/")
    public String home() {
        return "index";
    }

    // Team Page
    @GetMapping("/team")
    public String team() {
        return "team";
    }

    // Gallery Page
    @GetMapping("/gallery")
    public String gallery() {
        return "gallery";
    }
}