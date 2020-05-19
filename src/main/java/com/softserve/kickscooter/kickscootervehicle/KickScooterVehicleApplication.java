package com.softserve.kickscooter.kickscootervehicle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EnableJpaAuditing
public class KickScooterVehicleApplication extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(KickScooterVehicleApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(KickScooterVehicleApplication.class, args);
	}

}
