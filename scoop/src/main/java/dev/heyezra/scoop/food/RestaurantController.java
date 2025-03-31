package dev.heyezra.scoop.food;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * REST controller for handling Restaurant-related HTTP requests.
 *
 * This controller exposes RESTful endpoints for retrieving restaurant information.
 * It follows the Spring MVC pattern and provides JSON responses.
 */
// I am a class that responds to requests and returns responses
@RestController
public class RestaurantController{

    private final RestaurantRepo restaurantRepo;

    /**
     * Constructor-based dependency injection of RestaurantRepo.
     *
     * @param restaurantRepo The repository for accessing restaurant data
     */
    public RestaurantController(RestaurantRepo restaurantRepo){
        this.restaurantRepo = restaurantRepo;
    }

    /**
     * Retrieves all restaurants.
     *
     * @return A list of all Restaurant objects in the system
     */
    @GetMapping("/api/restaurants")
    List<Restaurant> findAll(){
        return restaurantRepo.findAll();
    }
}