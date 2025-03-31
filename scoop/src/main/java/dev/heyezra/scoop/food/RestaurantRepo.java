package dev.heyezra.scoop.food;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

/**
 * Repository for managing Restaurant data.
 * 
 * This class implements an in-memory repository pattern for storing and retrieving
 * Restaurant objects. It initializes with sample data and provides methods to access
 * the restaurant collection.
 * 
 * Rather than using a database, this implementation stores restaurants in an ArrayList
 * for simplicity, making it suitable for prototyping and testing.
 */
@Repository
public class RestaurantRepo {
    private List<Restaurant> restaurants = new ArrayList<>();

    public List<Restaurant> findAll() {
        return restaurants;
    }

    Restaurant findById(Integer id){
        return restaurants.stream()
                            .filter(run -> run.id() == id)
                            .findFirst()
                            .get();
    }

    /**
     * Initializes the repository with sample restaurant data.
     * This method is called automatically after dependency injection.
     */
    @PostConstruct
    private void init() {
        Location location = new Location(64.7128, -24.0060); // example coordinates
        LocalDateTime openTime = LocalDateTime.of(2025, 2, 24, 9, 0); // 9:00 AM today
        LocalDateTime closingTime = LocalDateTime.of(2025, 2, 24, 21, 0); // 9:00 PM today
        restaurants.add(new Restaurant(2, "Bye", location, openTime, closingTime));
        Location location2 = new Location(14.7128, -24.0060); // example coordinates
        LocalDateTime openTime2 = LocalDateTime.of(2025, 2, 24, 9, 0); // 9:00 AM today
        LocalDateTime closingTime2 = LocalDateTime.of(2025, 2, 24, 21, 0); // 9:00 PM today
        restaurants.add(new Restaurant(1, "Hello", location2, openTime2, closingTime2));
    }
}