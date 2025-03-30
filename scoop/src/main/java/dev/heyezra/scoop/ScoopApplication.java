package dev.heyezra.scoop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ScoopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ScoopApplication.class, args); 
		// how the main application runs

		Welcome welcomeMsg = context.getBean(Welcome.class);
		System.out.println(welcomeMsg.getWelcomeMessage());
	}

}
