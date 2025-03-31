package dev.heyezra.scoop.food;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

// I am a class that responds to requests and returns responses
@RestController
public class RestaurantController{

    private final RestaurantRepo restaurantRepo;

    public RestaurantController(RestaurantRepo restaurantRepo){
        this.restaurantRepo = restaurantRepo;
    }

    @GetMapping("/api/restaurants")
    List<Restaurant> findAll(){
        return restaurantRepo.findAll();
    }
}