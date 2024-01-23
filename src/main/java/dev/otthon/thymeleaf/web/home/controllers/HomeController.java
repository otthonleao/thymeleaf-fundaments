package dev.otthon.thymeleaf.web.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Map;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String index() {
        return "home/index";
    }

    @GetMapping("/format-data")
    public ModelAndView formatData() {
        var model = Map.of(
                "locale", Locale.US,
                "date", LocalDate.of(2024, 10, 10),
                "datetime", LocalDateTime.of(2024, 10, 10, 10, 10, 10),
                "currency", 1024.51,
                "percent", 51.0 / 100
        );
        return new ModelAndView("format-data", model);
    }
    
}
