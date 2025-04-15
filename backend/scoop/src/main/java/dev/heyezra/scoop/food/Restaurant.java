package dev.heyezra.scoop.food;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotEmpty;

/**
 * Record representing a restaurant entity.
 *
 * This immutable data structure contains essential information about a restaurant,
 * including its unique identifier, name, geographic location, and operating hours.
 *
 * @param id Unique identifier for the restaurant
 * @param title The name of the restaurant
 * @param location Geographic coordinates of the restaurant
 * @param openTime Daily opening time
 * @param closingTime Daily closing time
 */
public record Restaurant(
    Integer id,
    @NotEmpty
    String title,
    Location location,
    LocalDateTime openTime,
    LocalDateTime closingTime
){
    public Restaurant {
        if(!closingTime.isAfter(openTime)){
            throw new IllegalArgumentException("Closing Time must be after Open Time");
        }
    }
}