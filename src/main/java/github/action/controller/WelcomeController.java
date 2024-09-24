package github.action.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class WelcomeController {

    @GetMapping("/welcome")
    public String getWelcome(){
        return "welcome";
    }
}
