package dev.heyezra.scoop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tab.Welcome;

@SpringBootApplication
public class ScoopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScoopApplication.class, args); 
		// how the main application runs

		var welcomeMsg = new Welcome();
		System.out.println(welcomeMsg.getWelcomeMessage());
	}

}
