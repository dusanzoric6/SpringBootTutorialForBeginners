package app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import app.service.WelcomeService;

@RestController
public class WelcomeController {

    @Autowired
    WelcomeService welcomeService;

    @RequestMapping("/welcome")
    public String welcome() {
        return welcomeService.getWelcomeMessage();
    }
}


