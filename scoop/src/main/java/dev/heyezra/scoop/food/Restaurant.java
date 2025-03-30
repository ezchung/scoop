package dev.heyezra.scoop.food;

import java.time.LocalDateTime;

public record Restaurant(
    Integer id,
    String title,
    Location location,
    LocalDateTime openTime,
    LocalDateTime closingTime
){}