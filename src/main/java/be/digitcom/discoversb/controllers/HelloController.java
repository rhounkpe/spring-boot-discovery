package be.digitcom.discoversb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Greetings from Elliot!";
    }


    @GetMapping("/error")
    public String errorPage() {
        return "My custom error page";
    }
}
