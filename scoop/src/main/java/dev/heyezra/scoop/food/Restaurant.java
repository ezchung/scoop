package dev.heyezra.scoop.food;

import java.time.LocalDateTime;

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
    String title,
    Location location,
    LocalDateTime openTime,
    LocalDateTime closingTime
){}