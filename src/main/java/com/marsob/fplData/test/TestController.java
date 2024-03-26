package com.marsob.fplData.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TestController {
    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("appName", appName);
        return "test";
    }
}
