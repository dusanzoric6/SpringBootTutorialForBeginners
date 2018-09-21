package app.service;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {
    public String getWelcomeMessage() {
        return "Hello from Service";
    }
}
