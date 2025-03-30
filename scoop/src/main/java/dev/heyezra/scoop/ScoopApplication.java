package dev.heyezra.scoop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import dev.heyezra.scoop.food.Restaurant;
import dev.heyezra.scoop.food.Location;
import java.time.LocalDateTime;

@SpringBootApplication
public class ScoopApplication {

	private static final Logger log = LoggerFactory.getLogger(ScoopApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ScoopApplication.class, args); 
		// how the main application runs
	}


	@Bean
	CommandLineRunner runner(){
		return args -> {
			Location location = new Location(40.7128, -74.0060); // example coordinates
			LocalDateTime openTime = LocalDateTime.of(2025, 3, 30, 9, 0); // 9:00 AM today
			LocalDateTime closingTime = LocalDateTime.of(2025, 3, 30, 21, 0); // 9:00 PM today
			
			Restaurant shop = new Restaurant(1, "Happy", location, openTime, closingTime);
			log.info("Shop Name: " + shop);
		};
	}

}
