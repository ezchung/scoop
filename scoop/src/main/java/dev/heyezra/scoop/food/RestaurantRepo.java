package dev.heyezra.scoop.food;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

@Repository
public class RestaurantRepo {
    private List<Restaurant> restaurants = new ArrayList<>();

    public List<Restaurant> findAll() {
        return restaurants;
    }

    @PostConstruct
    private void init() {
        Location location = new Location(64.7128, -24.0060); // example coordinates
        LocalDateTime openTime = LocalDateTime.of(2025, 2, 24, 9, 0); // 9:00 AM today
        LocalDateTime closingTime = LocalDateTime.of(2025, 2, 24, 21, 0); // 9:00 PM today
        restaurants.add(new Restaurant(2, "Bye", location, openTime, closingTime));
    }
}