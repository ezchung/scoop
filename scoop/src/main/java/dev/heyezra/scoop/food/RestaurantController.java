package dev.heyezra.scoop.food;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import jakarta.validation.Valid;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for handling Restaurant-related HTTP requests.
 *
 * This controller exposes RESTful endpoints for retrieving restaurant information.
 * It follows the Spring MVC pattern and provides JSON responses.
 */
// I am a class that responds to requests and returns responses
@RestController
@RequestMapping("/api/restaurants")
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
    @GetMapping("")
    List<Restaurant> findAll(){
        return restaurantRepo.findAll();
    }

    @GetMapping("/{id}")
    Restaurant findById(@PathVariable Integer id){
        Optional <Restaurant> restaurant = restaurantRepo.findById(id);
        if(restaurant.isEmpty()){
            throw new RestaurantNotFoundException();
        }
        return restaurant.get();
    }

    //post
    //Telling spring that this arg will be part of req body with @ReqBody
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    void create(@Valid @RequestBody Restaurant restaurant){
        restaurantRepo.create(restaurant);
    }

    //put
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    void update(@Valid @RequestBody Restaurant restaurant, @PathVariable Integer id){
        restaurantRepo.update(restaurant, id);
    }

    //delete
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id){
        restaurantRepo.delete(id);
    }
}