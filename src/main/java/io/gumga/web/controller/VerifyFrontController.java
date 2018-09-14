package io.gumga.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VerifyFrontController {
    @GetMapping("/verify")
    public String view() {
        return "verify";
    }
}
