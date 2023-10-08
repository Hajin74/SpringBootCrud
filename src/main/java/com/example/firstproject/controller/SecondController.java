package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {

    @GetMapping("/random-quote")
    public String randomQuote(Model model) {
        String[] quotes = {
                "아마짱이다" + "-아마짱",
                "쭛토 " + "-센세"
        };
        int randInt = (int)(Math.random() * quotes.length);
        model.addAttribute("randomQuote", quotes[randInt]);
        return "quote";
    }
}
