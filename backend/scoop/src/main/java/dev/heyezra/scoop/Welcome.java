package dev.heyezra.scoop;

import org.springframework.stereotype.Component;

@Component
public class Welcome {
    public String getWelcomeMessage() {
        return "Welcome Dude!!";
    }
}