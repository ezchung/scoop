package dev.heyezra.scoop.food;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// I am a class that responds to requests and returns responses
@RestController
public class RestaurantController{

    @GetMapping("/restaurant")
    String sayHi(){
        return "Hello, big boy";
    }
}