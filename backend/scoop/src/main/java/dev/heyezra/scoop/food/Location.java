package dev.heyezra.scoop.food;

/**
 * Record representing geographic coordinates.
 *
 * This immutable data structure stores latitude and longitude values
 * to represent a physical location on Earth.
 *
 * @param latitude The north-south position (in degrees)
 * @param longitude The east-west position (in degrees)
 */
public record Location(double latitude, double longitude) {}